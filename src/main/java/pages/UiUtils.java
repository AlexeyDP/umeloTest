package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

/**
 * Created by emachines on 16.11.2015.
 */
public class UiUtils {

    public static WebElement $(By by) {
        return WebdriverHolder.getDriver().findElement(by);
    }

    public static void maximizeWindow() {
        WebdriverHolder.getDriver().manage().window().maximize();
    }

    public static void goTo(String url) {

        WebdriverHolder.getDriver().get(url);
    }

    public static void selectRegion(String selectLocator, String value){
        Select select = new Select($(By.xpath(selectLocator)));
        select.selectByValue(value);
    }




}


