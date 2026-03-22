package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static ui.AboutPage.LOCATOR_MENU_OPTION_ABOUT;
import static ui.Header.LOCATOR_BURGER_MENU;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import org.openqa.selenium.By;

import java.time.Duration;

public class SeleccionarOpcionMenuHamburguesa implements Task {

    private final By locator;

    public SeleccionarOpcionMenuHamburguesa(By locator) {
        this.locator = locator;
    }

    public static SeleccionarOpcionMenuHamburguesa ahora(By locator) {
        return instrumented(SeleccionarOpcionMenuHamburguesa.class, locator);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOCATOR_BURGER_MENU, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(LOCATOR_BURGER_MENU),
                WaitUntil.the(locator, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(locator)
        );
    }
}
