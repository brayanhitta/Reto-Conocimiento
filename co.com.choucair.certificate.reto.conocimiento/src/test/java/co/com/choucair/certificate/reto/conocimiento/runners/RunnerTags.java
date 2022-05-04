package co.com.choucair.certificate.reto.conocimiento.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@Caso3",
        glue = "co.com.choucair.certificate.reto.conocimiento.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RunnerTags {
}
