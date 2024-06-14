package co.com.globallogic.certification.ibank.interactions;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Slider implements Task {
    private final String sliderLocator;
    private final int startPercentage;
    private final int endPercentage;

    public Slider(String sliderLocator, int startPercentage, int endPercentage) {
        this.sliderLocator = sliderLocator;
        this.startPercentage = startPercentage;
        this.endPercentage = endPercentage;
    }

    public static Performable fromTo(String sliderLocator, int startPercentage, int endPercentage) {
        return instrumented(Slider.class, sliderLocator, startPercentage, endPercentage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement slider = BrowseTheWeb.as(actor).getDriver().findElement(By.id(sliderLocator));
        int width = slider.getSize().getWidth();
        int startX = (int) (width * (startPercentage / 100.0));
        int endX = (int) (width * (endPercentage / 100.0));
        int y = slider.getLocation().getY() + (slider.getSize().getHeight() / 2);

        TouchAction<?> action = new TouchAction<>((PerformsTouchActions) BrowseTheWeb.as(actor).getDriver());
        action.press(PointOption.point(startX, y))
                .waitAction()
                .moveTo(PointOption.point(endX, y))
                .release()
                .perform();
    }

}
