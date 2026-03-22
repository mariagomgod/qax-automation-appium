package ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class LogoutPopUpPage {

    public static final Target LOGOUT_POPUP_TITLE = Target.the("mensaje de error de login").locatedBy("com.saucelabs.mydemoapp.android:id/alertTitle");
    public static final By LOCATOR_LOGOUT_POPUP_BTN = AppiumBy.id("android:id/button1");
}
