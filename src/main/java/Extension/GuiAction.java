package Extension;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GuiAction extends CommonOps
{
    @Step ("Clicking on elements")
    public static void click(WebElement elem)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.click();
    }
    @Step ("Send values to elements")
    public static void UpdateText(WebElement elem,String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }
    @Step ("Navigate to the end of the WebPage")
    public static void ScrollDownTillTheEnd(WebElement Element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //This will scroll the page till the element is found
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);", Element);
    }


}

