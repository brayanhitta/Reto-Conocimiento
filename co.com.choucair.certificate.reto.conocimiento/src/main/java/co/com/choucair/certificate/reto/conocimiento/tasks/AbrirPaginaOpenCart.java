package co.com.choucair.certificate.reto.conocimiento.tasks;

import co.com.choucair.certificate.reto.conocimiento.userinterface.PaginaOpenCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaOpenCart implements Task {
    private PaginaOpenCart paginaOpenCart;

    public static AbrirPaginaOpenCart enSitio() {
        return Tasks.instrumented(AbrirPaginaOpenCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaOpenCart));

    }
}
