package co.com.choucair.certificate.reto.conocimiento.tasks;

import co.com.choucair.certificate.reto.conocimiento.userinterface.LlenaFormConsulta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarDatos implements Task {

    private String codigoReserva;
    private String apellidoPasj;

    public IngresarDatos(String codigoReserva, String apellidoPasj) {
        this.codigoReserva = codigoReserva;
        this.apellidoPasj = apellidoPasj;
    }

    public static IngresarDatos Consulta(String codigoReserva, String apellidoPasj) {
        return Tasks.instrumented(IngresarDatos.class, codigoReserva, apellidoPasj);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(codigoReserva).into(LlenaFormConsulta.CODIGO_REF),
                Enter.theValue(apellidoPasj).into(LlenaFormConsulta.APELLIDO)
        );

    }
}
