package co.com.choucair.certificate.reto.conocimiento.tasks;


import co.com.choucair.certificate.reto.conocimiento.userinterface.PaginaLatam;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaLatam implements Task {
    private PaginaLatam paginaLatam;

    public static AbrirPaginaLatam vuelos() {
        return Tasks.instrumented(AbrirPaginaLatam.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaLatam));

    }
}
