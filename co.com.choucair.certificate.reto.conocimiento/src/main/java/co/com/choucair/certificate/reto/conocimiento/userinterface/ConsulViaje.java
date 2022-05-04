package co.com.choucair.certificate.reto.conocimiento.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConsulViaje {
    public static final Target MIS_VIAJES = Target.the("selecciona la casilla mis viajes")
            .located(By.cssSelector("#header__navbar__trips-dropdown > button"));
    public static final Target ADMIN_VIAJES = Target.the("selecciona administrar tus viajes")
            .located(By.id("header__navbar__lnk-my-trips"));
    public static final Target INGRESA_DATOS = Target.the("selecciona ingresa con los datos del viaje")
            .located(By.id("tab_search_order"));
}
