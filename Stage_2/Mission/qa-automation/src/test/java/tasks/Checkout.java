package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.CheckoutPage.LOCATOR_ADDRESS_LINE_1_INPUT;
import static ui.CheckoutPage.LOCATOR_CITY_INPUT;
import static ui.CheckoutPage.LOCATOR_COUNTRY_INPUT;
import static ui.CheckoutPage.LOCATOR_FULL_NAME_INPUT;
import static ui.CheckoutPage.LOCATOR_PROCEED_TO_CHECKOUT_BTN;
import static ui.CheckoutPage.LOCATOR_TO_PAYMENT_BTN;
import static ui.CheckoutPage.LOCATOR_ZIP_CODE_INPUT;
import static ui.Header.LOCATOR_CART;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

public class Checkout implements Task {

    private final String fullName;
    private final String address;
    private final String city;
    private final String zipCode;
    private final String country;

    public Checkout(String fullName,
                    String address,
                    String city,
                    String zipCode,
                    String country) {

        this.fullName = fullName;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    public static Checkout ahora(String fullName,
                                 String address,
                                 String city,
                                 String zipCode,
                                 String country) {
        return instrumented(Checkout.class, fullName, address, city, zipCode, country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LOCATOR_CART, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(LOCATOR_CART),
                WaitUntil.the(LOCATOR_PROCEED_TO_CHECKOUT_BTN, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(LOCATOR_PROCEED_TO_CHECKOUT_BTN),
                WaitUntil.the(LOCATOR_FULL_NAME_INPUT, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(fullName).into(LOCATOR_FULL_NAME_INPUT),
                WaitUntil.the(LOCATOR_ADDRESS_LINE_1_INPUT, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(address).into(LOCATOR_ADDRESS_LINE_1_INPUT),
                WaitUntil.the(LOCATOR_CITY_INPUT, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(city).into(LOCATOR_CITY_INPUT),
                WaitUntil.the(LOCATOR_ZIP_CODE_INPUT, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(zipCode).into(LOCATOR_ZIP_CODE_INPUT),
                WaitUntil.the(LOCATOR_COUNTRY_INPUT, isVisible()).forNoMoreThan(Duration.ofSeconds(10)),
                Enter.theValue(country).into(LOCATOR_COUNTRY_INPUT),
                WaitUntil.the(LOCATOR_TO_PAYMENT_BTN, isClickable()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(LOCATOR_TO_PAYMENT_BTN)
        );
    }
}
