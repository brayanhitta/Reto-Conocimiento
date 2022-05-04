package co.com.choucair.certificate.reto.conocimiento.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LlenaDatoSesion extends PageObject {
    public static final Target USUARIO = Target.the("ingresa el usuario")
            .located(By.id("input-username"));
    public static final Target CONTRASENNA = Target.the("ingresa la contraseña")
            .located(By.id("input-password"));
    public static final Target BOTON = Target.the("da click en el boton login")
            .located(By.cssSelector("#content > div > div > div > div > div.panel-body > form > div.text-right > button"));
    public static final Target LABEL = Target.the("verifica la palabra dashboard")
            .located(By.cssSelector("#content > div.page-header > div > h1"));

}
