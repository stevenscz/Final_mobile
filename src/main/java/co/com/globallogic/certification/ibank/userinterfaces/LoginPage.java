package co.com.globallogic.certification.ibank.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target TXT_LOGIN = Target.the("Campo de texto Login")
            .locatedForAndroid(By.id("com.experitest.ExperiBank:id/usernameTextField"))
            .locatedForIOS(By.xpath(""));

    public static final Target TXT_PASSWORD = Target.the("Campo de texto Password")
            .locatedForAndroid(By.id("com.experitest.ExperiBank:id/passwordTextField"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_LOGIN = Target.the("Botón Login")
            .locatedForAndroid(By.id("com.experitest.ExperiBank:id/loginButton"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_MAKE_PAYMENT = Target.the("Botón Make Payment")
            .locatedForAndroid(By.id("com.experitest.ExperiBank:id/makePaymentButton"))
            .locatedForIOS(By.xpath(""));

}
