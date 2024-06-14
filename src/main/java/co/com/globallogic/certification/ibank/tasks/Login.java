package co.com.globallogic.certification.ibank.tasks;

import co.com.globallogic.certification.ibank.interactions.Slider;
import co.com.globallogic.certification.ibank.interactions.TapOnCoordinates;
import co.com.globallogic.certification.ibank.userinterfaces.LoginPage;
import co.com.globallogic.certification.ibank.userinterfaces.PaymentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Login implements Task {

    private String usuario;
    private String contrasena;

    public Login(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LoginPage.TXT_LOGIN, isEnabled()).forNoMoreThan(15).seconds(),
                Enter.theValue(usuario).into(LoginPage.TXT_LOGIN),
                WaitUntil.the(LoginPage.TXT_PASSWORD, isEnabled()).forNoMoreThan(15).seconds(),
                Enter.theValue(contrasena).into(LoginPage.TXT_PASSWORD),
                WaitUntil.the(LoginPage.BTN_LOGIN, isEnabled()).forNoMoreThan(15).seconds(),
                Click.on(LoginPage.BTN_LOGIN),
                WaitUntil.the(LoginPage.BTN_MAKE_PAYMENT, isEnabled()).forNoMoreThan(15).seconds(),
                Click.on(LoginPage.BTN_MAKE_PAYMENT),
                Enter.theValue("3452259966").into(PaymentPage.TXT_PHONE),
                Enter.theValue("Stevens Caicedo").into(PaymentPage.TXT_NAME),
                Click.on(PaymentPage.SLIDER_LOCATOR),
                Click.on(PaymentPage.BTN_SELECT_COUNTRY),
                Click.on(PaymentPage.COUNTRY_SELECTED),
                WaitUntil.the(PaymentPage.BTN_SEND_PAYMENT, isEnabled()).forNoMoreThan(15).seconds(),
                Click.on(PaymentPage.BTN_SEND_PAYMENT),
                Click.on(PaymentPage.BTN_YES_SEND_PAYMENT),
                Click.on(PaymentPage.BTN_LOGOUT)
                //WaitUntil.the(PaymentPage.SLIDER_LOCATOR, isEnabled()).forNoMoreThan(15).seconds(),
                //Slider.fromTo(String.valueOf(PaymentPage.SLIDER_LOCATOR), 0, 40)
                //TapOnCoordinates.at(635, 784)

        );
    }

    public static Login login(String usuario, String contrasena) {
        return Tasks.instrumented(Login.class, usuario, contrasena);
    }

}
