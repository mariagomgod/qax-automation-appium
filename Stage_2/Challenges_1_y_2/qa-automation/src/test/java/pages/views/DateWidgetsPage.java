package pages.views;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class DateWidgetsPage extends BasePage {

    // ==================== LOCATORS ====================

    private final By dialogLocator = AppiumBy.accessibilityId("1. Dialog");
    public DateWidgetsPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public DialogPage goToDialog() {
        driver.findElement(dialogLocator).click();
        return new DialogPage(driver);
    }

    // ==================== ASSERTIONS ====================

    public boolean isDialogDisplayed() {
        return driver.findElement(dialogLocator).isDisplayed();
    }
}
