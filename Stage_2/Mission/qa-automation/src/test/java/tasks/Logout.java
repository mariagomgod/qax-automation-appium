package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.Header.LOCATOR_BURGER_MENU;
import static ui.Header.LOCATOR_BURGER_MENU_OPTION_LOGOUT;
import static ui.LogoutPopUpPage.LOCATOR_LOGOUT_POPUP_BTN;
import static ui.LogoutPopUpPage.LOGOUT_POPUP_TITLE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

public class Logout implements Task {

    public static Logout ahora() {
        return instrumented(Logout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOCATOR_BURGER_MENU, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(LOCATOR_BURGER_MENU),
                WaitUntil.the(LOCATOR_BURGER_MENU_OPTION_LOGOUT, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(LOCATOR_BURGER_MENU_OPTION_LOGOUT),
                WaitUntil.the(LOGOUT_POPUP_TITLE, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                WaitUntil.the(LOCATOR_LOGOUT_POPUP_BTN, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(LOCATOR_LOGOUT_POPUP_BTN)
        );
    }
}
