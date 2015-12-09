package pages;

import java.util.concurrent.TimeUnit;

import static pages.WebdriverHolder.*;


/**
 * Created by emachines on 16.11.2015.
 */
public class WaitingUtils {

    public static void setImplicitWaits (long time,  TimeUnit unit){
        getDriver().manage().timeouts().implicitlyWait(time, unit);
    }
}
