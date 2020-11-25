package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ButtonsFunctions
{
    @FindBy(how = How.XPATH, using = "//a[@class='socialMediaBar__ImgSocial-sc-1ry1db0-2 gcUHBk']")
    public WebElement btn_linkedin;

    @FindBy(how = How.XPATH, using = "//a[@class='socialMediaBar__ImgSocial-sc-1ry1db0-2 jOgeKm']")
    public WebElement btn_WhatsApp;

    @FindBy(how = How.XPATH, using = "//a[@class='socialMediaBar__ImgSocial-sc-1ry1db0-2 eufMcD']")
    public WebElement btn_Facebook;

    @FindBy(how = How.XPATH, using = "//a[@class='socialMediaBar__ImgSocial-sc-1ry1db0-2 bXWGqN']")
    public WebElement btn_heroloSite;
}
