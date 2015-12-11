package pages.Steps;

import org.openqa.selenium.support.PageFactory;
import pages.WebdriverHolder;
import pages.Component.LoginComponent;
import java.util.regex.Pattern;
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
    public void noCheckBoxLogin(String mail, String pass){
        loginComponent.getLoginInput().sendKeys(mail);
        loginComponent.getPasswordInput().sendKeys(pass);
        loginComponent.getLoginButton().click();
    }
    //корректная регистрация с выставлением чек бокса
    public void checkBoxLogin(String mail,String pass){
        loginComponent.getLoginInput().sendKeys(mail);
        loginComponent.getPasswordInput().sendKeys(pass);
        loginComponent.getLoginCheckBox().click();
        assertTrue(loginComponent.getLoginCheckBox().isSelected());
        loginComponent.getLoginButton().click();
    }

}
