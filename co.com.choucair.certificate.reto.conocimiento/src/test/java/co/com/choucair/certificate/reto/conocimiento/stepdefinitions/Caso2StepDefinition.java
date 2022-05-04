package co.com.choucair.certificate.reto.conocimiento.stepdefinitions;

import co.com.choucair.certificate.reto.conocimiento.questions.Verificar;
import co.com.choucair.certificate.reto.conocimiento.questions.VerificarConsulta;
import co.com.choucair.certificate.reto.conocimiento.tasks.ConsultarViaje;
import co.com.choucair.certificate.reto.conocimiento.tasks.IngresarDatos;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class Caso2StepDefinition {
    @When("ingresa a la casilla mis viajes selecciona adminisitrar mis viajes y selecciona ingresa con los datos de tu viaje")
    public void ingresaALaCasillaMisViajes() {
        OnStage.theActorInTheSpotlight().attemptsTo(ConsultarViaje.vuelos());
    }

    @And("ingresa datos de compra que no son reales")
    public void ingresaDatosDeCompraQueNoSonReales(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        List<List<String>> rowsWithoutHead = rows.subList(1, rows.size());
        for (List<String> data : rowsWithoutHead) {
            OnStage.theActorInTheSpotlight().attemptsTo(IngresarDatos.Consulta(
                    data.get(0), data.get(1)));
        }
    }

    @Then("valida que se muestre una alerta por no tener los datos requeridos")
    public void validaQueSeMuestreUnaAlertaPorNoTenerLosDatosRequeridos() {
        OnStage.theActorInTheSpotlight().should(seeThat("", VerificarConsulta.alerta(),
                Matchers.equalTo("Ingresa un formato válido")));
    }



}
