package co.com.choucair.certificate.reto.conocimiento.tasks;

import co.com.choucair.certificate.reto.conocimiento.userinterface.LlenaForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class LlenarFormulario implements Task {
    public static LlenarFormulario vuelos() {
        return Tasks.instrumented(LlenarFormulario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LlenaForm.BOTON_BUSCAR)
        );

    }
}
