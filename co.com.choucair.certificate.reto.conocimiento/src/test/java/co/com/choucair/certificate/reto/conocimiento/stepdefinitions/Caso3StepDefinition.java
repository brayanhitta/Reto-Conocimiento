package co.com.choucair.certificate.reto.conocimiento.stepdefinitions;

import co.com.choucair.certificate.reto.conocimiento.questions.VerificarConsulta;
import co.com.choucair.certificate.reto.conocimiento.questions.VerificarIngresoOpenCart;
import co.com.choucair.certificate.reto.conocimiento.tasks.AbrirPaginaOpenCart;
import co.com.choucair.certificate.reto.conocimiento.tasks.IngresarCredenciales;
import co.com.choucair.certificate.reto.conocimiento.tasks.IngresarDatos;
import co.com.choucair.certificate.reto.conocimiento.tasks.Presionar;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class Caso3StepDefinition {

    @Before
    public void iniciarTest() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Se encuentra dentro de la pagina y logeado")
    public void seEncuentraDentroDeLaPaginaYLogeado() {
        OnStage.theActorCalled("Brayan").wasAbleTo(AbrirPaginaOpenCart.enSitio());
    }

    @When("ingresa los datos de usuario y contrasenna")
    public void ingresaLosDatosDeUsuarioYContrasenna(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        List<List<String>> rowsWithoutHead = rows.subList(1, rows.size());
        for (List<String> data : rowsWithoutHead) {
            OnStage.theActorInTheSpotlight().attemptsTo(IngresarCredenciales.openCart(
                    data.get(0), data.get(1)));
        }
    }

    @And("da clic en el boton login")
    public void daClicEnElBotonLogin() {
        OnStage.theActorInTheSpotlight().attemptsTo(Presionar.Boton());
    }

    @Then("valida que este en la home de la pagina")
    public void validaQueEsteEnLaHomeDeLaPagina() {
        OnStage.theActorInTheSpotlight().should(seeThat("", VerificarIngresoOpenCart.sesion(),
                Matchers.equalTo("Dashboard")));
    }
}

