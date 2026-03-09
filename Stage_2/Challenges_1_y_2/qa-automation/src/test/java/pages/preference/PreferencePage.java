package pages.preference;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;
import pages.os.MorseCodePage;

public class PreferencePage extends BasePage {

    // ==================== LOCATORS ====================

    private final By preferencesFromXMLLocator = AppiumBy.accessibilityId("1. Preferences from XML");
    private final By launchingPreferencesLocator = AppiumBy.accessibilityId("2. Launching preferences");
    private final By preferenceDependenciesLocator = AppiumBy.accessibilityId("3. Preference dependencies");
    private final By defaultValuesLocator = AppiumBy.accessibilityId("4. Default values");
    private final By preferencesFromCodeLocator = AppiumBy.accessibilityId("5. Preferences from code");
    private final By advancedPreferencesLocator = AppiumBy.accessibilityId("6. Advanced preferences");
    private final By fragmentLocator = AppiumBy.accessibilityId("7. Fragment");
    private final By headersLocator = AppiumBy.accessibilityId("8. Headers");
    private final By switchLocator = AppiumBy.accessibilityId("9. Switch");

    public PreferencePage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public PreferencesFromXMLPage goToPreferencesFromXML() {
        driver.findElement(preferencesFromXMLLocator).click();
        return new PreferencesFromXMLPage(driver);
    }

    public LaunchingPreferencesPage goToLaunchingPreferences() {
        driver.findElement(launchingPreferencesLocator).click();
        return new LaunchingPreferencesPage(driver);
    }

    public PreferenceDependenciesPage goToPreferenceDependencies() {
        driver.findElement(preferenceDependenciesLocator).click();
        return new PreferenceDependenciesPage(driver);
    }

    public DefaultValuesPage goToDefaultValues() {
        driver.findElement(defaultValuesLocator).click();
        return new DefaultValuesPage(driver);
    }

    public PreferencesFromCodePage goToPreferencesFromCode() {
        driver.findElement(preferencesFromCodeLocator).click();
        return new PreferencesFromCodePage(driver);
    }

    public AdvancedPreferencesPage goToAdvancedPreferences() {
        driver.findElement(advancedPreferencesLocator).click();
        return new AdvancedPreferencesPage(driver);
    }

    public FragmentPage goToFragment() {
        driver.findElement(fragmentLocator).click();
        return new FragmentPage(driver);
    }

    public HeadersPage goToHeaders() {
        driver.findElement(headersLocator).click();
        return new HeadersPage(driver);
    }

    public SwitchPage goToSwitch() {
        driver.findElement(switchLocator).click();
        return new SwitchPage(driver);
    }

    // ==================== ASSERTIONS ====================

    public boolean isPreferencesFromXMLDisplayed() {
        return driver.findElement(preferencesFromXMLLocator).isDisplayed();
    }

    public boolean isLaunchingPreferencesDisplayed() {
        return driver.findElement(launchingPreferencesLocator).isDisplayed();
    }

    public boolean isPreferenceDependenciesDisplayed() {
        return driver.findElement(preferenceDependenciesLocator).isDisplayed();
    }

    public boolean isDefaultValuesDisplayed() {
        return driver.findElement(defaultValuesLocator).isDisplayed();
    }

    public boolean isPreferencesFromCodeDisplayed() {
        return driver.findElement(preferencesFromCodeLocator).isDisplayed();
    }

    public boolean isAdvancedPreferencesDisplayed() {
        return driver.findElement(advancedPreferencesLocator).isDisplayed();
    }

    public boolean isFragmentDisplayed() {
        return driver.findElement(fragmentLocator).isDisplayed();
    }

    public boolean isHeadersDisplayed() {
        return driver.findElement(headersLocator).isDisplayed();
    }

    public boolean isSwitchDisplayed() {
        return driver.findElement(switchLocator).isDisplayed();
    }
}
