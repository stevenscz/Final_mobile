package co.com.globallogic.certification.ibank.setup;

import co.com.globallogic.certification.ibank.utils.AppiumDriver;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

import java.net.MalformedURLException;

public class InitialSetup {

    @Before(order = 0)
    public static void setUp() throws MalformedURLException {

        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Stevens");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(AppiumDriver.app()));

    }
}
