package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by emachines on 16.11.2015.
 */
public class WebdriverHolder {                           // ����� ��� ���� ����� �� ��������� � ������ ������ �����������

   private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        WebdriverHolder.driver = driver;
    }
}
