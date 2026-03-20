package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static ui.CatalogoProductosPage.LOCATOR_PRODUCTS_CONTAINER;
import static ui.CatalogoProductosPage.LOCATOR_PRODUCTS_ORDER;
import static ui.CatalogoProductosPage.LOCATOR_PRODUCTS_ORDER_NAME_ASCENDING;
import static ui.CatalogoProductosPage.LOCATOR_PRODUCTS_ORDER_NAME_DESCENDING;
import static ui.CatalogoProductosPage.LOCATOR_PRODUCTS_ORDER_PRICE_ASCENDING;
import static ui.CatalogoProductosPage.LOCATOR_PRODUCTS_ORDER_PRICE_DESCENDING;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import org.openqa.selenium.By;

import java.time.Duration;

public class Filtro implements Task {

    private final String criterio;
    private final String orden;

    public Filtro(String criterio, String orden) {
        this.criterio = criterio;
        this.orden = orden;
    }

    public static Filtro porCriterioYOrden(String criterio, String orden) {
        return instrumented(Filtro.class, criterio, orden);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        By locator = calcularLocatorParaOrdenacion();
        actor.attemptsTo(
                WaitUntil.the(LOCATOR_PRODUCTS_ORDER, isClickable()).forNoMoreThan(Duration.ofSeconds(5)),
                Click.on(LOCATOR_PRODUCTS_ORDER),
                WaitUntil.the(locator, isClickable()).forNoMoreThan(Duration.ofSeconds(5)),
                Click.on(locator),
                WaitUntil.the(LOCATOR_PRODUCTS_CONTAINER, isVisible()).forNoMoreThan(Duration.ofSeconds(10))
        );
    }

    private By calcularLocatorParaOrdenacion() {
        By locator;

        if (criterio.equals("nombre") && orden.equals("ascendente")) {
            locator = LOCATOR_PRODUCTS_ORDER_NAME_ASCENDING;
        } else if (criterio.equals("nombre") && orden.equals("descendente")) {
            locator = LOCATOR_PRODUCTS_ORDER_NAME_DESCENDING;
        } else if (criterio.equals("precio") && orden.equals("ascendente")) {
            locator = LOCATOR_PRODUCTS_ORDER_PRICE_ASCENDING;
        } else {
            locator = LOCATOR_PRODUCTS_ORDER_PRICE_DESCENDING;
        }
        return locator;
    }
}
