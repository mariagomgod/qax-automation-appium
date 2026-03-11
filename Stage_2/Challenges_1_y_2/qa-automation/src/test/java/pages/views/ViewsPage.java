package pages.views;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class ViewsPage extends BasePage {

    // ==================== LOCATORS ====================

    private final By controlsLocator = AppiumBy.accessibilityId("Controls");

    public ViewsPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public ControlsPage goToControls() {
        driver.findElement(controlsLocator).click();
        return new ControlsPage(driver);
    }

    // ==================== ASSERTIONS ====================

    public boolean isControlsDisplayed() {
        return driver.findElement(controlsLocator).isDisplayed();
    }
}
