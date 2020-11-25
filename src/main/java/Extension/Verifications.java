package Extension;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.testng.Assert.assertEquals;

public class Verifications extends CommonOps
{
    @Step("Verify text in elements")
    public static void TextInElements(WebElement elem, String expectedValue)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(),expectedValue);
    }
    @Step("Verify URL's")
    public static void UrlAddress(String URL)
    {
        URL = driver.getCurrentUrl();
        assertEquals(URL, "https://www.linkedin.com/company/herolo/");
    }

}
