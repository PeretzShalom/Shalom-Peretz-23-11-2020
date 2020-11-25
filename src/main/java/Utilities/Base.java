package Utilities;

import PageObjects.ScrollToElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class Base
{
    public  static WebDriver driver;
    public static PageObjects.HowToHelpBar HelpBar;
    public static PageObjects.ButtonsFunctions Buttons;
    public static WebDriverWait wait;
    public static ScrollToElements mainPage;
    public  static Actions action;
    public  static Screenshot imageScreenShot;
    public  static ImageDiffer imgDiff = new ImageDiffer();
    public  static ImageDiff Diff;


}
