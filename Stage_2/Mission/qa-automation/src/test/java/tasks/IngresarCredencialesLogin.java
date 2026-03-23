package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.CheckoutPage.LOCATOR_FULL_NAME_INPUT;
import static ui.LoginPage.LOCATOR_LOGIN_BTN;
import static ui.LoginPage.LOCATOR_PASSWORD_INPUT;
import static ui.LoginPage.LOCATOR_USERNAME_INPUT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

public class IngresarCredencialesLogin implements Task {

    private final String username;
    private final String password;

    public IngresarCredencialesLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static IngresarCredencialesLogin ahora(String username, String password) {
        return instrumented(IngresarCredencialesLogin.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOCATOR_USERNAME_INPUT, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(username).into(LOCATOR_USERNAME_INPUT),
                WaitUntil.the(LOCATOR_PASSWORD_INPUT, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(password).into(LOCATOR_PASSWORD_INPUT),
                WaitUntil.the(LOCATOR_LOGIN_BTN, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(LOCATOR_LOGIN_BTN)
        );
    }
}
