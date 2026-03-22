package stepdefinitions;

import static net.serenitybdd.screenplay.ensure.Ensure.that;
import static ui.Header.LOCATOR_BURGER_MENU_OPTION_WEBVIEW;
import static ui.WebviewPage.CONTENT_PAGE;
import static ui.WebviewPage.WORKSHOP_TEXT;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Visibility;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.Texto;
import tasks.IngresarUrl;
import tasks.SeleccionarOpcionMenuHamburguesa;

public class WebViewStepDefinitions {

    @Managed
    WebDriver webDriver;

    private Actor actor;

    @Before
    public void setUp() {
        actor = Actor.named("Anderson Montoya");
        actor.can(BrowseTheWeb.with(webDriver));
    }

    @When("accede al módulo WebView")
    public void accederAlModuloWebView() {
        actor.attemptsTo(
                SeleccionarOpcionMenuHamburguesa.ahora(LOCATOR_BURGER_MENU_OPTION_WEBVIEW)
        );
    }

    @When("ingresa la URL {string}")
    public void ingresarUrl(String url) {
        actor.attemptsTo(
                IngresarUrl.ahora(url)
        );
    }

    @Then("debe mostrarse el contenido de la página")
    public void mostrarContenidoDeLaPagina() {
        actor.attemptsTo(
                that(Visibility.of(CONTENT_PAGE)).isTrue()
        );
    }

    @Then("debe visualizarse la palabra {string}")
    public void visualizarPalabraWorkshop(String palabra) {
        actor.attemptsTo(
                that(Texto.en(WORKSHOP_TEXT)).containsIgnoringCase(palabra)
        );
    }
}
