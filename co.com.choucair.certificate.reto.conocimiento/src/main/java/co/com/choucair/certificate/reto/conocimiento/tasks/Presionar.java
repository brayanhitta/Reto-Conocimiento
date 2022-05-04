package co.com.choucair.certificate.reto.conocimiento.tasks;

import co.com.choucair.certificate.reto.conocimiento.userinterface.LlenaDatoSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Presionar implements Task {
    public static Presionar Boton() {
        return Tasks.instrumented(Presionar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LlenaDatoSesion.BOTON)
        );

    }
}
