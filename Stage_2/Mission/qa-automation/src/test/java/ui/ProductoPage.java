package ui;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class ProductoPage {

    public static final By LOCATOR_PRODUCT_COLOR = AppiumBy.id("com.saucelabs.mydemoapp.android:id/colorIV");
    public static final By LOCATOR_ADD_PRODUCT = AppiumBy.id("com.saucelabs.mydemoapp.android:id/plusIV");
    public static final By LOCATOR_ADD_TO_CART_BTN = AppiumBy.id("com.saucelabs.mydemoapp.android:id/cartBt");
}
