package co.com.choucair.certificate.reto.conocimiento.questions;

import co.com.choucair.certificate.reto.conocimiento.userinterface.LlenaForm;
import co.com.choucair.certificate.reto.conocimiento.userinterface.LlenaFormConsulta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class VerificarConsulta implements Question {
    public static VerificarConsulta alerta(){
        return new VerificarConsulta();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(LlenaFormConsulta.ALERTA).getText();
    }
}
