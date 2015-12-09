package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by emachines on 16.11.2015.
 */
public class WebdriverHolder {                           // метод для того чтобы не создавать в каждом классе конструктор

   private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        WebdriverHolder.driver = driver;
    }
}
