package co.com.choucair.certificate.reto.conocimiento.tasks;

import co.com.choucair.certificate.reto.conocimiento.userinterface.ConsulViaje;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ConsultarViaje implements Task {
    public static ConsultarViaje vuelos() {
        return Tasks.instrumented(ConsultarViaje.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ConsulViaje.MIS_VIAJES),
                Click.on(ConsulViaje.ADMIN_VIAJES),
                Click.on(ConsulViaje.INGRESA_DATOS)
        );

    }
}
