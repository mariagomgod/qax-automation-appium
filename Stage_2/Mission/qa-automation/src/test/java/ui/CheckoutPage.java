package ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class CheckoutPage {

    public static final By LOCATOR_PROCEED_TO_CHECKOUT_BTN = AppiumBy.accessibilityId("Confirms products for checkout");
    public static final By LOCATOR_FULL_NAME_INPUT = AppiumBy.id("com.saucelabs.mydemoapp.android:id/fullNameET");
    public static final By LOCATOR_ADDRESS_LINE_1_INPUT = AppiumBy.id("com.saucelabs.mydemoapp.android:id/address1ET");
    public static final By LOCATOR_CITY_INPUT = AppiumBy.id("com.saucelabs.mydemoapp.android:id/cityET");
    public static final By LOCATOR_ZIP_CODE_INPUT = AppiumBy.id("com.saucelabs.mydemoapp.android:id/zipET");
    public static final By LOCATOR_COUNTRY_INPUT = AppiumBy.id("com.saucelabs.mydemoapp.android:id/countryET");
    public static final By LOCATOR_TO_PAYMENT_BTN = AppiumBy.id("com.saucelabs.mydemoapp.android:id/paymentBtn");
    public static final By LOCATOR_FULL_NAME_CARD_INPUT = AppiumBy.id("com.saucelabs.mydemoapp.android:id/nameET");
    public static final By LOCATOR_CARD_NUMBER_INPUT = AppiumBy.id("com.saucelabs.mydemoapp.android:id/cardNumberET");
    public static final By LOCATOR_EXPIRATION_DATE_INPUT = AppiumBy.id("com.saucelabs.mydemoapp.android:id/expirationDateET");
    public static final By LOCATOR_SECURITY_CODE_INPUT = AppiumBy.id("com.saucelabs.mydemoapp.android:id/securityCodeET");
    public static final By LOCATOR_REVIEW_ORDER_BTN = AppiumBy.id("com.saucelabs.mydemoapp.android:id/paymentBtn");
    public static final By LOCATOR_PLACE_ORDER_BTN = AppiumBy.id("com.saucelabs.mydemoapp.android:id/paymentBtn");
    public static final Target CHECKOUT_COMPLETE_TEXT = Target.the("texto checkout completado").located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/completeTV"));
    public static final Target ORDER_CONFIRMATION_DISPATCH_MESSAGE = Target.the("mensaje confirmación orden").located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/orderTV"));
}
