package pages.accessibility;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class AccesibilityPage extends BasePage {

    // ==================== LOCATORS ====================

    private final By accessibilityNodeProviderLocator = AppiumBy.accessibilityId("Accessibility Node Provider");
    private final By accessibilityNodeQueryingLocator = AppiumBy.accessibilityId("Accessibility Node Querying");
    private final By accessibilityServiceLocator = AppiumBy.accessibilityId("Accessibility Service");
    private final By customViewLocator = AppiumBy.accessibilityId("Custom View");

    public AccesibilityPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public AccessibilityNodeProviderPage goToAccessibilityNodeProvider() {
        driver.findElement(accessibilityNodeProviderLocator).click();
        return new AccessibilityNodeProviderPage(driver);
    }

    public AccessibilityNodeQueryingPage goToAccessibilityNodeQuerying() {
        driver.findElement(accessibilityNodeQueryingLocator).click();
        return new AccessibilityNodeQueryingPage(driver);
    }

    public AccessibilityServicePage goToAccessibilityService() {
        driver.findElement(accessibilityServiceLocator).click();
        return new AccessibilityServicePage(driver);
    }

    public CustomViewPage goToCustomView() {
        driver.findElement(customViewLocator).click();
        return new CustomViewPage(driver);
    }

    // ==================== ASSERTIONS ===================

    public boolean isAccessibilityNodeProviderOptionDisplayed() {
        return driver.findElement(accessibilityNodeProviderLocator).isDisplayed();
    }

    public boolean isAccessibilityNodeQueryingOptionDisplayed() {
        return driver.findElement(accessibilityNodeQueryingLocator).isDisplayed();
    }

    public boolean isAccessibilityServiceOptionDisplayed() {
        return driver.findElement(accessibilityServiceLocator).isDisplayed();
    }

    public boolean isCustomViewOptionDisplayed() {
        return driver.findElement(customViewLocator).isDisplayed();
    }
}
