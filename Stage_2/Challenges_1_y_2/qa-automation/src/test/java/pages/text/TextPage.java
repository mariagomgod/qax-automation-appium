package pages.text;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class TextPage extends BasePage {

    // ==================== LOCATORS ====================

    private final By linkifyLocator = AppiumBy.accessibilityId("Linkify");
    private final By logTextBoxLocator = AppiumBy.accessibilityId("LogTextBox");
    private final By marqueeLocator = AppiumBy.accessibilityId("Marquee");
    private final By unicodeLocator = AppiumBy.accessibilityId("Unicode");

    public TextPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public LinkifyPage goToLinkify() {
        driver.findElement(linkifyLocator).click();
        return new LinkifyPage(driver);
    }

    public LogTextBoxPage goToLogTextBox() {
        driver.findElement(logTextBoxLocator).click();
        return new LogTextBoxPage(driver);
    }

    public MarqueePage goToMarquee() {
        driver.findElement(marqueeLocator).click();
        return new MarqueePage(driver);
    }

    public UnicodePage goToUnicode() {
        driver.findElement(unicodeLocator).click();
        return new UnicodePage(driver);
    }

    // ==================== ASSERTIONS =====================

    public boolean isLinkifyDisplayed() {
        return driver.findElement(linkifyLocator).isDisplayed();
    }

    public boolean isLogTextBoxDisplayed() {
        return driver.findElement(logTextBoxLocator).isDisplayed();
    }

    public boolean isMarqueeDisplayed() {
        return driver.findElement(marqueeLocator).isDisplayed();
    }

    public boolean isUnicodeDisplayed() {
        return driver.findElement(unicodeLocator).isDisplayed();
    }
}
