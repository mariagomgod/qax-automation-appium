package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.WebviewPage.LOCATOR_GO_TO_SITE_BTN;
import static ui.WebviewPage.LOCATOR_URL_INPUT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

public class IngresarUrl implements Task {

    private final String url;

    public IngresarUrl(String url) {
        this.url = url;
    }

    public static IngresarUrl ahora(String url) {
        return instrumented(IngresarUrl.class, url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOCATOR_URL_INPUT, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(url).into(LOCATOR_URL_INPUT),
                WaitUntil.the(LOCATOR_GO_TO_SITE_BTN, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(LOCATOR_GO_TO_SITE_BTN)
        );
    }
}
