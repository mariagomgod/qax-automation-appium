package pages.views;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class ViewsPage extends BasePage {

    // ==================== LOCATORS ====================

    private final By controlsLocator = AppiumBy.accessibilityId("Controls");
    private final By dateWidgetsLocator = AppiumBy.accessibilityId("Date Widgets");

    public ViewsPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public ControlsPage goToControls() {
        driver.findElement(controlsLocator).click();
        return new ControlsPage(driver);
    }

    public DateWidgetsPage goToDateWidgets() {
        driver.findElement(dateWidgetsLocator).click();
        return new DateWidgetsPage(driver);
    }

    // ==================== ASSERTIONS ====================

    public boolean isControlsDisplayed() {
        return driver.findElement(controlsLocator).isDisplayed();
    }

    public boolean isDateWidgetsDisplayed() {
        return driver.findElement(dateWidgetsLocator).isDisplayed();
    }
}
