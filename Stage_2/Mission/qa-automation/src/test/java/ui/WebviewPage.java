package ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class WebviewPage {

    public static final By LOCATOR_URL_INPUT = AppiumBy.id("com.saucelabs.mydemoapp.android:id/urlET");
    public static final By LOCATOR_GO_TO_SITE_BTN = AppiumBy.id("com.saucelabs.mydemoapp.android:id/goBtn");
    public static final Target CONTENT_PAGE = Target.the("contenido de la página").locatedBy("//android.widget.FrameLayout[@content-desc='Container for fragments']");
    public static final Target WORKSHOP_TEXT = Target.the("palabra Workshop").locatedBy("//android.widget.FrameLayout[@content-desc='Container for fragments']//android.webkit.WebView/android.webkit.WebView");
}
