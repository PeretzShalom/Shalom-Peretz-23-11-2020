package Utilities;

import PageObjects.ButtonsFunctions;
import PageObjects.ScrollToElements;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base
{
    public static void init()
    {
        HelpBar = PageFactory.initElements(driver,PageObjects.HowToHelpBar.class);
        mainPage = PageFactory.initElements(driver, ScrollToElements.class);
        Buttons =PageFactory.initElements(driver, ButtonsFunctions.class);


    }
}
