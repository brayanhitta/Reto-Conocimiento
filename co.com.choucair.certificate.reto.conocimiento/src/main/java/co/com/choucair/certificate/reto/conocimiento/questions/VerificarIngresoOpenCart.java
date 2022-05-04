package co.com.choucair.certificate.reto.conocimiento.questions;

import co.com.choucair.certificate.reto.conocimiento.userinterface.LlenaDatoSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class VerificarIngresoOpenCart implements Question {
    public static VerificarIngresoOpenCart sesion(){
        return new VerificarIngresoOpenCart();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(LlenaDatoSesion.LABEL).getText();
    }
}
