package pages.content;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class ContentPage extends BasePage {

    // ==================== LOCATORS ====================

    private final By assetsLocator = AppiumBy.accessibilityId("Assets");
    private final By clipboardLocator = AppiumBy.accessibilityId("Clipboard");
    private final By packagesLocator = AppiumBy.accessibilityId("Packages");
    private final By providerLocator = AppiumBy.accessibilityId("Provider");
    private final By resourcesLocator = AppiumBy.accessibilityId("Resources");
    private final By storageLocator = AppiumBy.accessibilityId("Storage");

    public ContentPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public AssetsPage goToAssets() {
        driver.findElement(assetsLocator).click();
        return new AssetsPage(driver);
    }

    public ClipboardPage goToClipboard() {
        driver.findElement(clipboardLocator).click();
        return new ClipboardPage(driver);
    }

    public PackagesPage goToPackages() {
        driver.findElement(packagesLocator).click();
        return new PackagesPage(driver);
    }

    public ProviderPage goToProvider() {
        driver.findElement(providerLocator).click();
        return new ProviderPage(driver);
    }

    public ResourcesPage goToResources() {
        driver.findElement(resourcesLocator).click();
        return new ResourcesPage(driver);
    }

    public StoragePage goToStorage() {
        driver.findElement(storageLocator).click();
        return new StoragePage(driver);
    }

    // ==================== ASSERTIONS ===================

    public boolean isAssetsDisplayed() {
        return driver.findElement(assetsLocator).isDisplayed();
    }

    public boolean isClipboardDisplayed() {
        return driver.findElement(clipboardLocator).isDisplayed();
    }

    public boolean isPackagesDisplayed() {
        return driver.findElement(packagesLocator).isDisplayed();
    }

    public boolean isProviderDisplayed() {
        return driver.findElement(providerLocator).isDisplayed();
    }

    public boolean isResourcesDisplayed() {
        return driver.findElement(resourcesLocator).isDisplayed();
    }

    public boolean isStorageDisplayed() {
        return driver.findElement(storageLocator).isDisplayed();
    }
}
