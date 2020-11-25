package SanityTest;

import Extension.GuiAction;
import Extension.Verifications;
import Utilities.CommonOps;
import WorkFlow.WebFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class functionality extends CommonOps
{
    @Test(description = "Test01:insert data and verify")
    @Description ("Test Description:Click on help bar and insert value send it and verify success")
    public void test01_HelpBar()
    {
        WebFlow.insertValues(getData("user"),getData("email"),getData("phone"));
        Verifications.TextInElements(HelpBar.text_tanks,getData("text_tanks"));
        GuiAction.click(HelpBar.text_returned);
    }

    @Test(description = "Test02:Click WhatsApp Icon")
    @Description ("Test Description:Click WhatsApp Icon and verify button in the new windows")
    public void test02_WhatsappIcone()
    {
        GuiAction.click(mainPage.btn_Whatsapp);
        ArrayList tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(String.valueOf(tabs.get(1)));
        Verifications.TextInElements(mainPage.btn_ContinuetoChat,getData("btn_ContinuetoChat"));
    }
    @Test(description = "Test03:Scroll down and click on the linkedin button")
    @Description ("Test Description:Scroll down & Click linkedin button")
    public void test03_Buttonlinkedin()
    {

        GuiAction.ScrollDownTillTheEnd(Buttons.btn_linkedin);
        Verifications.TextInElements(mainPage.TalkUs,getData("TalkUs"));
        GuiAction.click(Buttons.btn_linkedin);
        ArrayList tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(String.valueOf(tabs.get(1)));


    }

}
