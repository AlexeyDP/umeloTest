package pages.Steps;

import org.openqa.selenium.support.PageFactory;
import pages.WebdriverHolder;
import pages.Component.LoginComponent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by QA on 03.12.2015.
 */
public class LoginSteps {
    LoginComponent loginComponent;
    public LoginSteps(){
        this.loginComponent = PageFactory.initElements(WebdriverHolder.getDriver(),LoginComponent.class);
        loginComponent.open("http://umelo.net/user/login");

    }

    //корректная регистрация без выставленея чек бокса
    public void setUserLogin(String mail, String pass){
        loginComponent.getLoginInput().sendKeys(mail);
        loginComponent.getPasswordInput().sendKeys(pass);

    }
    public void loginButtonClick(){
        loginComponent.getLoginButton().click();
    }

    public void checkBoxclick(){
        loginComponent.getLoginCheckBox().click();
        loginComponent.getLoginCheckBox().isSelected();
    }

    public void AllertPoupupGettext(String text){
        //впихнуть проверку что это страница логина именно
        assertEquals(loginComponent.getAlertPoupup().getText(),text);
    }









}
