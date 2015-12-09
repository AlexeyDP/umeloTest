package net.Umelo.Test;

import org.junit.*;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.WebdriverHolder;
import pages.Steps.LoginSteps;

import java.util.Collection;


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
    public void sucsessLogin() throws Exception {

        steps.noCheckBoxLogin("tester@iskyweb.com","qwerty");
    }

    @Test
    public void emptyFieldMail() throws Exception {
        steps.noCheckBoxLogin(" ","qwerty");
    }



    @Test
    public void chekedLogin() throws Exception {
        steps.checkBoxLogin("tester@iskyweb.com","qwerty");

    }

    @After
    public void tearDown() throws Exception {
        driver.close();

    }
}

