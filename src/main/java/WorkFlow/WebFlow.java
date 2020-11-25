package WorkFlow;

import Extension.GuiAction;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class WebFlow extends CommonOps
{
    @Step ("Insert value to th fields")
    public static void insertValues(String user, String Email ,String phone)
    {
        GuiAction.UpdateText(HelpBar.txt_UserName,user);
        GuiAction.UpdateText(HelpBar.txt_Email,Email);
        GuiAction.UpdateText(HelpBar.txt_Phone,phone);
        GuiAction.click(HelpBar.btn_Send);
    }
}
