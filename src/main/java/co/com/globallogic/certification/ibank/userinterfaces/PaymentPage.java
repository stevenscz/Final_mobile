package co.com.globallogic.certification.ibank.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaymentPage {

    public static final Target TXT_PHONE = Target.the("Campo de texto PHONE")
            .locatedForAndroid(By.id("com.experitest.ExperiBank:id/phoneTextField"))
            .locatedForIOS(By.xpath(""));

    public static final Target TXT_NAME = Target.the("Campo de texto NAME")
            .locatedForAndroid(By.id("com.experitest.ExperiBank:id/nameTextField"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_SELECT_COUNTRY = Target.the("Botón Select country")
            .locatedForAndroid(By.id("com.experitest.ExperiBank:id/countryButton"))
            .locatedForIOS(By.xpath(""));

    public static final Target COUNTRY_SELECTED = Target.the("Country selected USA")
            .locatedForAndroid(By.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\" and @text=\"USA\"]"))
            .locatedForIOS(By.xpath(""));

    public static final Target SLIDER_LOCATOR = Target.the("Slider")
            .locatedForAndroid(By.xpath("//android.widget.SeekBar[@resource-id=\"com.experitest.ExperiBank:id/amount\"]"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_SEND_PAYMENT = Target.the("Botón Send Payment")
            .locatedForAndroid(By.id("com.experitest.ExperiBank:id/sendPaymentButton"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_YES_SEND_PAYMENT = Target.the("Botón YES del popup")
            .locatedForAndroid(By.id("android:id/button1"))
            .locatedForIOS(By.xpath(""));

    public static final Target BTN_LOGOUT = Target.the("Botón Logout")
            .locatedForAndroid(By.id("com.experitest.ExperiBank:id/logoutButton"))
            .locatedForIOS(By.xpath(""));


}
