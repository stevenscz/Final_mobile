package co.com.globallogic.certification.ibank.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/login.feature"},
        glue = {"co/com/globallogic/certification/ibank/stepdefinitions",
                "co/com/globallogic/certification/ibank/setup"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RealizarCompra {
}
