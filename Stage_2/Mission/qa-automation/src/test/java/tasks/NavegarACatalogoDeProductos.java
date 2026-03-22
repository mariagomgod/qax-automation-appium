package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static ui.CatalogoProductosPage.LOCATOR_PRODUCTS_CONTAINER;
import static ui.Header.LOCATOR_BURGER_MENU_OPTION_CATALOG;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

public class NavegarACatalogoDeProductos implements Task {

    public static NavegarACatalogoDeProductos ahora() {
        return instrumented(NavegarACatalogoDeProductos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarOpcionMenuHamburguesa.ahora(LOCATOR_BURGER_MENU_OPTION_CATALOG),
                WaitUntil.the(LOCATOR_PRODUCTS_CONTAINER, isVisible()).forNoMoreThan(Duration.ofSeconds(10))
        );
    }
}
