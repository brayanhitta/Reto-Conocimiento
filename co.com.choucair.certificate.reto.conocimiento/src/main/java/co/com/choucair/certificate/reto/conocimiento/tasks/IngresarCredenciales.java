package co.com.choucair.certificate.reto.conocimiento.tasks;

import co.com.choucair.certificate.reto.conocimiento.userinterface.LlenaDatoSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarCredenciales implements Task {

    private String usuario;
    private String contrasenna;

    public IngresarCredenciales(String usuario, String contrasenna) {
        this.usuario = usuario;
        this.contrasenna = contrasenna;
    }

    public static IngresarCredenciales openCart(String usuario, String contrasenna) {
        return Tasks.instrumented(IngresarCredenciales.class, usuario, contrasenna);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Clear.field(LlenaDatoSesion.USUARIO),
                Enter.theValue(usuario).into(LlenaDatoSesion.USUARIO),
                Clear.field(LlenaDatoSesion.CONTRASENNA),
                Enter.theValue(contrasenna).into(LlenaDatoSesion.CONTRASENNA)
        );
    }
}
