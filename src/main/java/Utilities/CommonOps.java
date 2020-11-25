package Utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.w3c.dom.Document;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.concurrent.TimeUnit;


public class CommonOps extends  Base
{
    public static  String getData (String nodeName)
    {
        File fXmlfile;
        DocumentBuilderFactory dbFactory;
        DocumentBuilder dBuilder;
        Document doc = null;
        try
        {
            fXmlfile = new File("A:/Herolo/.idea/Configurations/DataConfig.xml");
            dbFactory = DocumentBuilderFactory.newInstance();
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlfile);
            doc.getDocumentElement().normalize();
        } catch (Exception e)
        {
            System.out.println("Error Reading XML file : " + e);

        }finally
        {
            return doc.getElementsByTagName(nodeName).item(0).getTextContent();
        }
    }
    public static void initBrowser(String browserType)
    {
        if(browserType.equalsIgnoreCase("Chrome"))
            driver= initChromeDriver();
        else if(browserType.equalsIgnoreCase("FireFox"))
            driver= initFFDriver();
        else if(browserType.equalsIgnoreCase("ie"))
            driver= initIEDriver();
        else
            throw new RuntimeException("invalid platform name");
        driver.manage().window().maximize();
        driver.get(getData("Url"));
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.MILLISECONDS);
        wait = new WebDriverWait(driver,Long.parseLong(getData("TimeOut")));
        action = new Actions(driver);
    }


    public static WebDriver initChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }
    public static WebDriver initFFDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        return driver;

    }

    public static WebDriver initIEDriver()
    {
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;

    }

    @BeforeClass
    public void StartSession()
    {

        if(getData("platformName").equalsIgnoreCase("web"))
            initBrowser(getData("BrowserName"));
            else
                throw new RuntimeException("invalid platform name");
            ManagePages.init();

    }

    @AfterMethod

    public void fterMethod()
    {
        driver.get(getData("Url"));

    }

    @AfterClass
    public void ClosedSession()
    {
        driver.quit();
    }
}
