package stepdefinitions;

import static net.serenitybdd.screenplay.ensure.Ensure.that;

import static ui.AboutPage.LOCATOR_MENU_OPTION_ABOUT;
import static ui.AboutPage.VERSION_APP_TEXT;
import static ui.LoginPage.LOGIN_ERROR_MESSAGE;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Visibility;

import org.openqa.selenium.WebDriver;

import java.util.UUID;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tasks.IngresarCredencialesLogin;
import tasks.Logout;
import tasks.SeleccionarOpcionMenuHamburguesa;

public class LoginAndAboutViewStepDefinitions {

    @Managed
    WebDriver webDriver;

    private Actor actor;

    @Before
    public void setUp() {
        actor = Actor.named("Anderson Montoya");
        actor.can(BrowseTheWeb.with(webDriver));
    }

    @When("ingresa credenciales válidas")
    public void ingresarConCredencialesValidas() {

        String username = UUID.randomUUID().toString();
        String password = UUID.randomUUID().toString();

        actor.attemptsTo(
                IngresarCredencialesLogin.ahora(username, password)
        );
    }

    @Then("el sistema debe permitir el acceso a la aplicación")
    public void permitirAccesoALaApp() {
        actor.attemptsTo(
                Logout.ahora()
        );
    }

    @When("ingresa credenciales inválidas")
    public void ingresarConCredencialesInvalidas() {
        String username = "";
        String password = "";

        actor.attemptsTo(
                IngresarCredencialesLogin.ahora(username, password)
        );
    }

    @Then("el sistema debe mostrar un mensaje de error")
    public void mensajeDeError() {
        actor.attemptsTo(
                that(Visibility.of(LOGIN_ERROR_MESSAGE)).isTrue()
        );
    }

    @When("accede a la vista About")
    public void accederAVistaAbout() {
        actor.attemptsTo(
                SeleccionarOpcionMenuHamburguesa.ahora(LOCATOR_MENU_OPTION_ABOUT)
        );
    }

    @Then("debe visualizarse la versión actual de la aplicación")
    public void visualizarVersionActualApp() {
        actor.attemptsTo(
                that(Visibility.of(VERSION_APP_TEXT)).isTrue()
        );
    }
}
