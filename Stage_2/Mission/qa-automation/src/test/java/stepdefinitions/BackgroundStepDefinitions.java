package stepdefinitions;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import tasks.NavegarACatalogoDeProductos;

public class BackgroundStepDefinitions {

    @Managed
    WebDriver webDriver;

    private Actor actor;

    @Before
    public void setUp() {
        actor = Actor.named("Anderson Montoya");
        actor.can(BrowseTheWeb.with(webDriver));
    }

    @Given("que el usuario se encuentra en el catálogo de productos")
    public void elUsuarioSeEncuentraEnElCatalogoDeProductos() {
        actor.attemptsTo(
                NavegarACatalogoDeProductos.ahora()
        );
    }
}
