package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ScrollToElements
{
    @FindBy(how = How.XPATH, using = "//a[@class='callUsWhatsapp__BtnWhatsapp-rkzbui-0 cjunrQ']")
    public WebElement btn_Whatsapp;

    @FindBy(how = How.XPATH, using = "//a[@class='commun__Button-zi6nvq-0 commun__ButtonContact-zi6nvq-1 form__ButtonContact-y0ft28-1 llCdxe']/span")
    public WebElement TalkUs;

    @FindBy(how = How.CSS,using = "a[id='action-button']")
    public WebElement btn_ContinuetoChat;

}
