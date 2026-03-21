package stepdefinitions;

import static net.serenitybdd.screenplay.ensure.Ensure.that;

import static ui.CatalogoProductosPage.PRODUCT_NAME_1;
import static ui.CatalogoProductosPage.PRODUCT_NAME_2;
import static ui.CatalogoProductosPage.PRODUCT_NAME_3;
import static ui.CatalogoProductosPage.PRODUCT_NAME_4;
import static ui.CatalogoProductosPage.PRODUCT_PRICE_1;
import static ui.CatalogoProductosPage.PRODUCT_PRICE_2;
import static ui.CatalogoProductosPage.PRODUCT_PRICE_3;
import static ui.CatalogoProductosPage.PRODUCT_PRICE_4;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import org.openqa.selenium.WebDriver;

import java.math.BigDecimal;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.Texto;
import tasks.Filtro;

public class CatalogFilterStepDefinitions {

    @Managed
    WebDriver webDriver;

    private Actor actor;

    @Before
    public void setUp() {
        actor = Actor.named("Anderson Montoya");
        actor.can(BrowseTheWeb.with(webDriver));
    }

    @When("aplica el filtro por {string} {string}")
    public void aplicaElFiltro(String criterio, String orden) {
        actor.attemptsTo(
                Filtro.porCriterioYOrden(criterio, orden)
        );
    }

    @Then("los productos deben mostrarse ordenados de A a Z")
    public void losProductosDebenMostrarseOrdenadosDeAAZ() {
        String nombreProducto1 = Texto.en(PRODUCT_NAME_1).answeredBy(actor);
        String nombreProducto2 = Texto.en(PRODUCT_NAME_2).answeredBy(actor);
        String nombreProducto3 = Texto.en(PRODUCT_NAME_3).answeredBy(actor);
        String nombreProducto4 = Texto.en(PRODUCT_NAME_4).answeredBy(actor);

        actor.attemptsTo(
                that(nombreProducto1.compareTo(nombreProducto2)).isLessThan(1),
                that(nombreProducto2.compareTo(nombreProducto3)).isLessThan(1),
                that(nombreProducto3.compareTo(nombreProducto4)).isLessThan(1)
        );
    }

    @Then("los productos deben mostrarse ordenados de Z a A")
    public void losProductosDebenMostrarseOrdenadosDeZAA() {
        String nombreProducto1 = Texto.en(PRODUCT_NAME_1).answeredBy(actor);
        String nombreProducto2 = Texto.en(PRODUCT_NAME_2).answeredBy(actor);
        String nombreProducto3 = Texto.en(PRODUCT_NAME_3).answeredBy(actor);
        String nombreProducto4 = Texto.en(PRODUCT_NAME_4).answeredBy(actor);

        actor.attemptsTo(
                that(nombreProducto1.compareTo(nombreProducto2)).isGreaterThan(-1),
                that(nombreProducto2.compareTo(nombreProducto3)).isGreaterThan(-1),
                that(nombreProducto3.compareTo(nombreProducto4)).isGreaterThan(-1)
        );
    }

    @Then("los productos deben mostrarse del menor al mayor precio")
    public void losProductosDebenMostrarseDelMenorAlMayorPrecio() {
        BigDecimal precioProducto1 = new BigDecimal(Texto.en(PRODUCT_PRICE_1).answeredBy(actor).replace("$ ", ""));
        BigDecimal precioProducto2 = new BigDecimal(Texto.en(PRODUCT_PRICE_2).answeredBy(actor).replace("$ ", ""));
        BigDecimal precioProducto3 = new BigDecimal(Texto.en(PRODUCT_PRICE_3).answeredBy(actor).replace("$ ", ""));
        BigDecimal precioProducto4 = new BigDecimal(Texto.en(PRODUCT_PRICE_4).answeredBy(actor).replace("$ ", ""));

        actor.attemptsTo(
                that(precioProducto1.compareTo(precioProducto2)).isLessThan(1),
                that(precioProducto2.compareTo(precioProducto3)).isLessThan(1),
                that(precioProducto3.compareTo(precioProducto4)).isLessThan(1)
        );
    }

    @Then("los productos deben mostrarse del mayor al menor precio")
    public void losProductosDebenMostrarseDelMayorAlMenorPrecio() {
        BigDecimal precioProducto1 = new BigDecimal(Texto.en(PRODUCT_PRICE_1).answeredBy(actor).replace("$ ", ""));
        BigDecimal precioProducto2 = new BigDecimal(Texto.en(PRODUCT_PRICE_2).answeredBy(actor).replace("$ ", ""));
        BigDecimal precioProducto3 = new BigDecimal(Texto.en(PRODUCT_PRICE_3).answeredBy(actor).replace("$ ", ""));
        BigDecimal precioProducto4 = new BigDecimal(Texto.en(PRODUCT_PRICE_4).answeredBy(actor).replace("$ ", ""));

        actor.attemptsTo(
                that(precioProducto1.compareTo(precioProducto2)).isGreaterThan(-1),
                that(precioProducto2.compareTo(precioProducto3)).isGreaterThan(-1),
                that(precioProducto3.compareTo(precioProducto4)).isGreaterThan(-1)
        );
    }
}
