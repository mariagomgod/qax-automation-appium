package pages.views;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class ControlsPage extends BasePage {

    // ==================== LOCATORS ====================

    private final By lightThemeLocator = AppiumBy.accessibilityId("1. Light Theme");
    public ControlsPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public LightThemePage goToLightTheme() {
        driver.findElement(lightThemeLocator).click();
        return new LightThemePage(driver);
    }

    // ==================== ASSERTIONS ====================

    public boolean isLightThemeDisplayed() {
        return driver.findElement(lightThemeLocator).isDisplayed();
    }
}
