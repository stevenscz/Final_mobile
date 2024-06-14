package co.com.globallogic.certification.ibank.stepdefinitions;

import co.com.globallogic.certification.ibank.interactions.Slider;
import co.com.globallogic.certification.ibank.tasks.Login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;
import java.util.Map;

public class LoginSteps {

    @Cuando("El usuario ingresa el usuario y la contrasena")
    public void elUsuarioIngresaElUsuarioYLaContrasena(DataTable dataTable) {
        List<Map<String, String>> filas = dataTable.asMaps(String.class, String.class);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.login(filas.get(0).get("Usuario"),filas.get(0).get("Contrasena")));
    }

    @Entonces("Deberia iniciar sesion correctamente")
    public void deberiaIniciarSesionCorrectamente() {
    }
}
