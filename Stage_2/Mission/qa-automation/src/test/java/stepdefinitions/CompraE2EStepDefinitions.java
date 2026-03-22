package stepdefinitions;

import static ui.CatalogoProductosPage.LOCATOR_PRODUCT_1;
import static ui.CatalogoProductosPage.LOCATOR_PRODUCT_3;
import static ui.CatalogoProductosPage.LOCATOR_PRODUCT_4;
import static ui.CatalogoProductosPage.LOCATOR_PRODUCT_5;
import static ui.CatalogoProductosPage.LOCATOR_PRODUCT_6;
import static ui.Header.LOCATOR_BURGER_MENU_OPTION_LOGIN;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Iterate;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Browser;

import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.UUID;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tasks.AgregarProductosAlCarrito;
import tasks.Filtro;
import tasks.IngresarCredencialesLogin;
import tasks.SeleccionarOpcionMenuHamburguesa;

public class CompraE2EStepDefinitions {

    @Managed
    WebDriver webDriver;

    private Actor actor;

    @Before
    public void setUp() {
        actor = Actor.named("Anderson Montoya");
        actor.can(BrowseTheWeb.with(webDriver));
    }

    @When("aplica un filtro de productos")
    public void aplicarFiltroDeProductos() {

        String username = UUID.randomUUID().toString();
        String password = UUID.randomUUID().toString();

        String criterio = "nombre";
        String orden = "descendente";

        actor.attemptsTo(
                SeleccionarOpcionMenuHamburguesa.ahora(LOCATOR_BURGER_MENU_OPTION_LOGIN),
                IngresarCredencialesLogin.ahora(username, password),
                Filtro.porCriterioYOrden(criterio, orden)
        );
    }

    @When("selecciona 5 productos diferentes")
    public void seleccionarProductos() {
        actor.attemptsTo(
                // Implemento este step en el step "agrega los productos al carrito" dado que no tiene sentido la división propuesta.
                // No podemos hacer todas las modificaciones de golpe en todos los artículos sin antes haberlos añadido al carrito.
                // Aparte, las modificaciones que hagas en un producto se pierden cuando pasas a interactuar con el siguiente producto.
        );
    }

    @When("agrega 3 unidades de cada producto")
    public void agregarUnidadesDeCadaProducto() {
        actor.attemptsTo(
                // Implemento este step en el step "agrega los productos al carrito" dado que no tiene sentido la división propuesta.
                // No podemos hacer todas las modificaciones de golpe en todos los artículos sin antes haberlos añadido al carrito.
                // Aparte, las modificaciones que hagas en un producto se pierden cuando pasas a interactuar con el siguiente producto.
        );
    }

    @When("cambia el color de los productos cuando esté disponible")
    public void cambiarColorProductosSiEstaDisponible() {
        actor.attemptsTo(
                // Implemento este step en el step "agrega los productos al carrito" dado que no tiene sentido la división propuesta.
                // No podemos hacer todas las modificaciones de golpe en todos los artículos sin antes haberlos añadido al carrito.
                // Aparte, las modificaciones que hagas en un producto se pierden cuando pasas a interactuar con el siguiente producto.
        );
    }

    @When("agrega los productos al carrito")
    public void agregarProductosAlCarrito() {
        Iterate.over(List.of(LOCATOR_PRODUCT_1, LOCATOR_PRODUCT_3, LOCATOR_PRODUCT_4, LOCATOR_PRODUCT_5, LOCATOR_PRODUCT_6))
                .forEach((actor, locator) -> actor.attemptsTo(AgregarProductosAlCarrito.ahora(locator)))
                .performAs(actor);
    }

    @When("procede al checkout")
    public void checkout() {
        actor.attemptsTo(
        );
    }

    @When("realiza el pago correctamente")
    public void pagar() {
        actor.attemptsTo(
        );
    }

    @Then("la compra debe completarse exitosamente")
    public void compraExitosa() {
        actor.attemptsTo(
        );
    }

    @Then("debe mostrarse una confirmación de la orden")
    public void confirmacionDeLaOrden() {
        actor.attemptsTo(
        );
    }
}
