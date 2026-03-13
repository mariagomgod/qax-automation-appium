package pages.views;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class LightThemePage extends BasePage {

    // ==================== LOCATORS ====================

    private final By textInputLocator = AppiumBy.id("io.appium.android.apis:id/edit");
    private final By firstCheckboxLocator = AppiumBy.accessibilityId("Checkbox 1");
    private final By firstRadioButtonLocator = AppiumBy.accessibilityId("RadioButton 1");

    public LightThemePage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public void fillTextField(String text) {
        enterText(textInputLocator, text);
    }

    public void selectFirstCheckbox() {
        clickElement(firstCheckboxLocator);
    }

    public void selectFirstRadioButton() {
        clickElement(firstRadioButtonLocator);
    }

    // ==================== ASSERTIONS ====================

    public String getTextFieldValue() {
        return getText(textInputLocator);
    }

    public boolean isFirstCheckboxChecked() {
        return isElementChecked(firstCheckboxLocator);
    }

    public boolean isFirstRadioButtonChecked() {
        return isElementChecked(firstRadioButtonLocator);
    }
}
