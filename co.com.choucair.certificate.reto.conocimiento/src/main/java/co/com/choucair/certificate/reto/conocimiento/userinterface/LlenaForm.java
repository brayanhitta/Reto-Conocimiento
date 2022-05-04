package co.com.choucair.certificate.reto.conocimiento.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LlenaForm extends PageObject {
    public static final Target BOTON_BUSCAR = Target.the("da click en el boton buscar")
            .located(By.id("btnSearchCTA"));
    public static final Target CAMPO_VACIO = Target.the("se muestra el campo vacio")
            .located(By.cssSelector("#txtInputOrigin > label"));
}
