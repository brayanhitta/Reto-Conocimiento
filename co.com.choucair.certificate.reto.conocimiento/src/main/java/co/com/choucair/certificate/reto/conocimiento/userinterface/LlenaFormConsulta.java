package co.com.choucair.certificate.reto.conocimiento.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LlenaFormConsulta extends PageObject {
    public static final Target CODIGO_REF = Target.the("ingresa los datos")
            .located(By.id("code"));
    public static final Target APELLIDO = Target.the("ingresa el apellido")
            .located(By.id("lastname"));
    public static final Target ALERTA = Target.the("alerta de error")
            .located(By.cssSelector("#code-helper-text"));
}
