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
    //Тест проверяет авторизацию при вводе корректных логина и пароля
    public void validUserLogin() throws Exception {
        steps.setUserLogin("tester@iskyweb.com","qwerty");
        steps.loginButtonClick();
    }

    @Test
    //тест проверяет что при авторизации выставляется чек бокс для запоминания лог/ пас пользователя
    public void rememberLogin() throws Exception {
        steps.setUserLogin("tester@iskyweb.com","qwerty");
        steps.checkBoxclick();
        steps.loginButtonClick();
    }

    @Test
    //тест проверяет что авторизация при пустом поле логина невозможно и проверяет текст сообщения об ошибке
    public void emptyFieldLogin() throws Exception {
        steps.setUserLogin(" ","qwerty");
        steps.loginButtonClick();
        steps.AllertPoupupGettext("Заполните все отмеченные поля");
    }

    @Test
    //тест проверяет сообщение об ошибке при неверно введенном пароле и существующем логине
    public void incorrectPassword() throws Exception {
        steps.setUserLogin("tester@iskyweb.com","asdfgh");
        steps.loginButtonClick();
        steps.AllertPoupupGettext("E-mail или пароль указаны некорректно");
    }

    @Test
    //тест проверяет сообщение об ошибке при введенных несуществующих логине и пароле
    public void incorrectLogPas() throws Exception {
        steps.setUserLogin("test","test");
        steps.loginButtonClick();
        steps.AllertPoupupGettext("Логин или пароль указаны некорректно");
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}

