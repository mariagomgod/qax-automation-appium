package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static ui.Header.LOCATOR_BURGER_MENU;
import static ui.Header.LOCATOR_BURGER_MENU_OPTION_WEBVIEW;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

public class NavegarAWebview implements Task {

    public static NavegarAWebview ahora() {
        return instrumented(NavegarAWebview.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOCATOR_BURGER_MENU, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(LOCATOR_BURGER_MENU),
                WaitUntil.the(LOCATOR_BURGER_MENU_OPTION_WEBVIEW, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(LOCATOR_BURGER_MENU_OPTION_WEBVIEW)
        );
    }
}
