package co.com.globallogic.certification.ibank.interactions;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Performable;

public class TapOnCoordinates implements Task {

    private final int x;
    private final int y;

    public TapOnCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Performable at(int x, int y) {
        return instrumented(TapOnCoordinates.class, x, y);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        if (driver instanceof PerformsTouchActions) {
            new TouchAction<>((PerformsTouchActions) driver)
                    .tap(TapOptions.tapOptions().withPosition(PointOption.point(x, y)))
                    .perform();
        } else {
            throw new IllegalStateException("Driver does not implement PerformsTouchActions");
        }
    }
}
