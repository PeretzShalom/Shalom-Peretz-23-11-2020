package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HowToHelpBar
{
    @FindBy (how = How.CSS, using = "input[lang='he'][placeholder='שם...']")
    public WebElement txt_UserName;

    @FindBy (how = How.CSS, using = "input[lang='he'][placeholder='דואר אלקטרוני...']")
    public WebElement txt_Email;

    @FindBy (how = How.CSS, using = "input[lang='he'][placeholder='טלפון...']")
    public WebElement txt_Phone;

    @FindBy (how = How.CSS, using = "button[class='Footer__Button-sc-159s1ql-7 kOOAFW']")
    public WebElement btn_Send;

    @FindBy (how = How.XPATH, using = "//h1[@class='thankYou__title-avz2fr-5 gsaDIh']/span")
    public WebElement text_tanks;

    @FindBy (how = How.XPATH, using = "//a[@class='thankYou__backLink-avz2fr-10 bBzcJF']/span")
    public WebElement text_returned;

}
