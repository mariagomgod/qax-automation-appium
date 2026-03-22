package ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;

public class AboutPage {

    public static final By LOCATOR_MENU_OPTION_ABOUT = AppiumBy.xpath("//android.widget.TextView[@text='About']");
    public static final Target VERSION_APP_TEXT = Target.the("versión app").located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/versionTV"));
}
