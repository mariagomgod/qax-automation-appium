package pages.nfc;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class NFCPage extends BasePage {

    // ==================== LOCATORS ====================

    private final By foregroundDispatchLocator = AppiumBy.accessibilityId("ForegroundDispatch");
    private final By foregroundNdefPushLocator = AppiumBy.accessibilityId("ForegroundNdefPush");
    private final By techFilterLocator = AppiumBy.accessibilityId("TechFilter");

    public NFCPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public ForegroundDispatchPage goToForegroundDispatch() {
        driver.findElement(foregroundDispatchLocator).click();
        return new ForegroundDispatchPage(driver);
    }

    public ForegroundNdefPushPage goToForegroundNdefPush() {
        driver.findElement(foregroundNdefPushLocator).click();
        return new ForegroundNdefPushPage(driver);
    }

    public TechFilterPage goToTechFilter() {
        driver.findElement(techFilterLocator).click();
        return new TechFilterPage(driver);
    }

    // ==================== ASSERTIONS ====================

    public boolean isForegroundDispatchDisplayed() {
        return driver.findElement(foregroundDispatchLocator).isDisplayed();
    }

    public boolean isForegroundNdefPushDisplayed() {
        return driver.findElement(foregroundNdefPushLocator).isDisplayed();
    }

    public boolean isTechFilterDisplayed() {
        return driver.findElement(techFilterLocator).isDisplayed();
    }
}
