package co.com.choucair.certificate.reto.conocimiento.questions;

import co.com.choucair.certificate.reto.conocimiento.userinterface.LlenaForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Verificar implements Question {
    public static Verificar error(){
        return new Verificar();
    }
    @Override
    public Object answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(LlenaForm.CAMPO_VACIO).getText();
    }
}
