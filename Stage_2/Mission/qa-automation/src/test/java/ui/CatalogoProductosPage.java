package ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class CatalogoProductosPage {

    public static final By LOCATOR_PRODUCTS_CONTAINER = AppiumBy.accessibilityId("Displays all products of catalog");
    public static final By LOCATOR_PRODUCTS_ORDER = AppiumBy.id("com.saucelabs.mydemoapp.android:id/sortIV");
    public static final By LOCATOR_PRODUCTS_ORDER_NAME_ASCENDING = AppiumBy.id("com.saucelabs.mydemoapp.android:id/nameAscCL");
    public static final By LOCATOR_PRODUCTS_ORDER_NAME_DESCENDING = AppiumBy.id("com.saucelabs.mydemoapp.android:id/nameDesCL");
    public static final By LOCATOR_PRODUCTS_ORDER_PRICE_ASCENDING = AppiumBy.id("com.saucelabs.mydemoapp.android:id/priceAscCL");
    public static final By LOCATOR_PRODUCTS_ORDER_PRICE_DESCENDING = AppiumBy.id("com.saucelabs.mydemoapp.android:id/priceDesCL");
    public static final By LOCATOR_PRODUCT_1 = AppiumBy.xpath("(//android.widget.ImageView[@content-desc='Product Image'])[1]");
    public static final By LOCATOR_PRODUCT_3 = AppiumBy.xpath("(//android.widget.ImageView[@content-desc='Product Image'])[3]");
    public static final By LOCATOR_PRODUCT_4 = AppiumBy.xpath("(//android.widget.ImageView[@content-desc='Product Image'])[4]");
    public static final By LOCATOR_PRODUCT_5 = AppiumBy.xpath("(//android.widget.ImageView[@content-desc='Product Image'])[5]");
    public static final By LOCATOR_PRODUCT_6 = AppiumBy.xpath("(//android.widget.ImageView[@content-desc='Product Image'])[6]");
    public static final Target PRODUCT_NAME_1 = Target.the("nombre del producto 1").locatedBy("//androidx.recyclerview.widget.RecyclerView[@content-desc='Displays all products of catalog']/android.view.ViewGroup[1]/android.widget.TextView[@content-desc='Product Title']");
    public static final Target PRODUCT_PRICE_1 = Target.the("precio del producto 1").locatedBy("//androidx.recyclerview.widget.RecyclerView[@content-desc='Displays all products of catalog']/android.view.ViewGroup[1]/android.widget.TextView[@content-desc='Product Price']");
    public static final Target PRODUCT_NAME_2 = Target.the("nombre del producto 2").locatedBy("//androidx.recyclerview.widget.RecyclerView[@content-desc='Displays all products of catalog']/android.view.ViewGroup[2]/android.widget.TextView[@content-desc='Product Title']");
    public static final Target PRODUCT_PRICE_2 = Target.the("precio del producto 2").locatedBy("//androidx.recyclerview.widget.RecyclerView[@content-desc='Displays all products of catalog']/android.view.ViewGroup[2]/android.widget.TextView[@content-desc='Product Price']");
    public static final Target PRODUCT_NAME_3 = Target.the("nombre del producto 3").locatedBy("//androidx.recyclerview.widget.RecyclerView[@content-desc='Displays all products of catalog']/android.view.ViewGroup[3]/android.widget.TextView[@content-desc='Product Title']");
    public static final Target PRODUCT_PRICE_3 = Target.the("precio del producto 3").locatedBy("//androidx.recyclerview.widget.RecyclerView[@content-desc='Displays all products of catalog']/android.view.ViewGroup[3]/android.widget.TextView[@content-desc='Product Price']");
    public static final Target PRODUCT_NAME_4 = Target.the("nombre del producto 4").locatedBy("//androidx.recyclerview.widget.RecyclerView[@content-desc='Displays all products of catalog']/android.view.ViewGroup[4]/android.widget.TextView[@content-desc='Product Title']");
    public static final Target PRODUCT_PRICE_4 = Target.the("precio del producto 4").locatedBy("//androidx.recyclerview.widget.RecyclerView[@content-desc='Displays all products of catalog']/android.view.ViewGroup[4]/android.widget.TextView[@content-desc='Product Price']");
}
