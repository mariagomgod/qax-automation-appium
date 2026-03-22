package stepdefinitions;

import static ui.Header.LOCATOR_BURGER_MENU_OPTION_LOGIN;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Given.Givens;
import tasks.NavegarACatalogoDeProductos;
import tasks.SeleccionarOpcionMenuHamburguesa;

public class BackgroundStepDefinitions {

    @Managed
    WebDriver webDriver;

    private Actor actor;

    @Before
    public void setUp() {
        actor = Actor.named("Anderson Montoya");
        actor.can(BrowseTheWeb.with(webDriver));
    }

    @Givens({
            @Given("que el usuario se encuentra en el catálogo de productos"),
            @Given("que el usuario se encuentra en el menú principal")
    })
    public void elUsuarioSeEncuentraEnElCatalogoDeProductos() {
        actor.attemptsTo(
                NavegarACatalogoDeProductos.ahora()
        );
    }

    @Given("que el usuario se encuentra en la pantalla de login")
    public void navegarALogin() {
        actor.attemptsTo(
                SeleccionarOpcionMenuHamburguesa.ahora(LOCATOR_BURGER_MENU_OPTION_LOGIN)
        );
    }
}
