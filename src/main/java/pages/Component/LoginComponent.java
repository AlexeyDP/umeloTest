package pages.Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static pages.UiUtils.$;
import static pages.UiUtils.goTo;
import static pages.UiUtils.maximizeWindow;

/**
 * Created by QA on 03.12.2015.
 */
public class LoginComponent {
    public void open(String url){
        goTo(url);
        maximizeWindow();
    }
    public WebElement getLoginInput(){
        return $(By.cssSelector("#j-u-login-email"));
    }
    public WebElement getPasswordInput(){
        return $(By.cssSelector("#j-u-login-pass"));
    }
    public WebElement getLoginButton(){return $(By.cssSelector("#j-u-login-form > div:nth-child(5) > div > button"));}
    public WebElement getLoginCheckBox(){return $(By.cssSelector(".checkbox>label>input"));}
    public WebElement getAlertPoupup(){return $(By.xpath("/html/body/div[1]/div/div"));}

}
