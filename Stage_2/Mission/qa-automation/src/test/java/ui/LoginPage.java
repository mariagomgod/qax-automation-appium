package ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class LoginPage {

    public static final By LOCATOR_USERNAME_INPUT = AppiumBy.id("com.saucelabs.mydemoapp.android:id/nameET");
    public static final By LOCATOR_PASSWORD_INPUT = AppiumBy.id("com.saucelabs.mydemoapp.android:id/passwordET");
    public static final By LOCATOR_LOGIN_BTN = AppiumBy.id("com.saucelabs.mydemoapp.android:id/loginBtn");
    public static final Target LOGIN_ERROR_MESSAGE = Target.the("mensaje de error de login").locatedBy("//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/nameErrorTV']");
}
