package net.Umelo.Test;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.WebdriverHolder;
import pages.Steps.LoginSteps;





/**
 * Created by emachines on 20.11.2015.
 */
public class autorizationTest {

     WebDriver driver;
    LoginSteps steps;

    @Before
    public  void setUp() throws Exception {
        driver = new FirefoxDriver();
        WebdriverHolder.setDriver(driver);
        steps = new LoginSteps();
    }

    @Test
    public void correctUserLogin() throws Exception {

        steps.setUserLogin("tester@iskyweb.com","qwerty");
        steps.loginButtonClick();
        //вставить ассерт с проверкой страницы
    }

    @Test
    public void emptyFieldMail() throws Exception {
        steps.setUserLogin(" ","qwerty");
        //вызываем метод всплывающего окна и сравниваем текст
    }



    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}

