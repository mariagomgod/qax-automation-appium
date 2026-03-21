package ui;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class Header {

    public static final By LOCATOR_BURGER_MENU = AppiumBy.accessibilityId("View menu");
    public static final By LOCATOR_BURGER_MENU_OPTION_CATALOG = AppiumBy.xpath("//android.widget.TextView[@text='Catalog']");
    public static final By LOCATOR_BURGER_MENU_OPTION_WEBVIEW = AppiumBy.xpath("//android.widget.TextView[@text='WebView']");
}
