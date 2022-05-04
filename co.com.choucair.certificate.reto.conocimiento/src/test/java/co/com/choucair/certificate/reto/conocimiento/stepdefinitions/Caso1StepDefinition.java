package co.com.choucair.certificate.reto.conocimiento.stepdefinitions;

import co.com.choucair.certificate.reto.conocimiento.questions.Verificar;
import co.com.choucair.certificate.reto.conocimiento.tasks.AbrirPaginaLatam;
import co.com.choucair.certificate.reto.conocimiento.tasks.LlenarFormulario;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class Caso1StepDefinition {

    @Before
    public void iniciarPrueba(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que brayan se encuentra en la pagina latam airlines")
    public void queBrayanSeEncuentraEnLaPaginaLatamAirlines() {
        OnStage.theActorCalled("Brayan").wasAbleTo(AbrirPaginaLatam.vuelos());
    }

    @When("no ingresa ningun dato para la compra de un vuelo y selecciona buscar")
    public void noIngresaNingunDatoParaLaCompraDeUnVueloYSeleccionaBuscar() {
        OnStage.theActorInTheSpotlight().attemptsTo(LlenarFormulario.vuelos());
    }

    @Then("valida que los campos de informacion queden vacios")
    public void validaQueLosCamposDeInformacionQuedenVacios() {
        OnStage.theActorInTheSpotlight().should(seeThat("", Verificar.error(),
                Matchers.equalTo("Ingresa el origen de tu vuelo.")));
    }
}