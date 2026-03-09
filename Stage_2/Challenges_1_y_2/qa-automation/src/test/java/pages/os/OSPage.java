package pages.os;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class OSPage extends BasePage {

    // ==================== LOCATORS ====================

    private final By morseCodeLocator = AppiumBy.accessibilityId("Morse Code");
    private final By rotationVectorLocator = AppiumBy.accessibilityId("Rotation Vector");
    private final By smsMessagingLocator = AppiumBy.accessibilityId("SMS Messaging");

    public OSPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public MorseCodePage goToMorseCode() {
        driver.findElement(morseCodeLocator).click();
        return new MorseCodePage(driver);
    }

    public RotationVectorPage goToRotationVector() {
        driver.findElement(rotationVectorLocator).click();
        return new RotationVectorPage(driver);
    }

    public SMSMessagingPage goToSMSMessaging() {
        driver.findElement(smsMessagingLocator).click();
        return new SMSMessagingPage(driver);
    }

    // ==================== ASSERTIONS ====================

    public boolean isMorseCodeDisplayed() {
        return driver.findElement(morseCodeLocator).isDisplayed();
    }

    public boolean isRotationVectorDisplayed() {
        return driver.findElement(rotationVectorLocator).isDisplayed();
    }

    public boolean isSmsMessagingDisplayed() {
        return driver.findElement(smsMessagingLocator).isDisplayed();
    }
}
