package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.CheckoutPage.LOCATOR_CARD_NUMBER_INPUT;
import static ui.CheckoutPage.LOCATOR_EXPIRATION_DATE_INPUT;
import static ui.CheckoutPage.LOCATOR_FULL_NAME_CARD_INPUT;
import static ui.CheckoutPage.LOCATOR_PLACE_ORDER_BTN;
import static ui.CheckoutPage.LOCATOR_REVIEW_ORDER_BTN;
import static ui.CheckoutPage.LOCATOR_SECURITY_CODE_INPUT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

public class Pago implements Task {

    private final String fullName;
    private final String cardNumber;
    private final String expirationDate;
    private final String securityCode;

    public Pago(String fullName,
                String cardNumber,
                String expirationDate,
                String securityCode) {

        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
    }

    public static Pago ahora(String fullName,
                             String cardNumber,
                             String expirationDate,
                             String securityCode) {
        return instrumented(Pago.class, fullName, cardNumber, expirationDate, securityCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOCATOR_FULL_NAME_CARD_INPUT, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(fullName).into(LOCATOR_FULL_NAME_CARD_INPUT),
                WaitUntil.the(LOCATOR_CARD_NUMBER_INPUT, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(cardNumber).into(LOCATOR_CARD_NUMBER_INPUT),
                WaitUntil.the(LOCATOR_EXPIRATION_DATE_INPUT, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(expirationDate).into(LOCATOR_EXPIRATION_DATE_INPUT),
                WaitUntil.the(LOCATOR_SECURITY_CODE_INPUT, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(securityCode).into(LOCATOR_SECURITY_CODE_INPUT),
                WaitUntil.the(LOCATOR_REVIEW_ORDER_BTN, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(LOCATOR_REVIEW_ORDER_BTN),
                WaitUntil.the(LOCATOR_PLACE_ORDER_BTN, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(LOCATOR_PLACE_ORDER_BTN)
        );
    }
}
