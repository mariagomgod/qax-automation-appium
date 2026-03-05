package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.accessibility.AccesibilityPage;
import pages.animation.AnimationPage;
import pages.app.AppPage;
import pages.content.ContentPage;
import pages.graphics.GraphicsPage;
import pages.media.MediaPage;
import pages.nfc.NFCPage;
import pages.os.OSPage;
import pages.preference.PreferencePage;
import pages.text.TextPage;
import pages.views.ViewsPage;

import org.openqa.selenium.By;

public class HomePage extends BasePage {


    // ==================== LOCATORS ====================

    private final By appOptionLocator = AppiumBy.xpath("//android.widget.TextView[@text='App']");
    private final By accessibilityOptionLocator = AppiumBy.accessibilityId("Accessibility");
    private final By animationOptionLocator = AppiumBy.accessibilityId("Animation");
    private final By contentOptionLocator = AppiumBy.xpath("//android.widget.TextView[@text='Content']");
    private final By graphicsOptionLocator = AppiumBy.accessibilityId("Graphics");
    private final By mediaOptionLocator = AppiumBy.accessibilityId("Media");
    private final By nfcOptionLocator = AppiumBy.accessibilityId("NFC");
    private final By osOptionLocator = AppiumBy.accessibilityId("OS");
    private final By preferenceOptionLocator = AppiumBy.accessibilityId("Preference");
    private final By textOptionLocator = AppiumBy.accessibilityId("Text");
    private final By viewsOptionLocator = AppiumBy.accessibilityId("Views");

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public AppPage goToApp() {
        driver.findElement(appOptionLocator).click();
        return new AppPage(driver);
    }

    public AccesibilityPage goToAccessibility() {
        driver.findElement(accessibilityOptionLocator).click();
        return new AccesibilityPage(driver);
    }

    public AnimationPage goToAnimation() {
        driver.findElement(animationOptionLocator).click();
        return new AnimationPage(driver);
    }

    public ContentPage goToContent() {
        driver.findElement(contentOptionLocator).click();
        return new ContentPage(driver);
    }

    public GraphicsPage goToGraphics() {
        driver.findElement(graphicsOptionLocator).click();
        return new GraphicsPage(driver);
    }

    public MediaPage goToMedia() {
        driver.findElement(mediaOptionLocator).click();
        return new MediaPage(driver);
    }

    public NFCPage goToNfc() {
        driver.findElement(nfcOptionLocator).click();
        return new NFCPage(driver);
    }

    public OSPage goToOs() {
        driver.findElement(osOptionLocator).click();
        return new OSPage(driver);
    }

    public PreferencePage goToPreference() {
        driver.findElement(preferenceOptionLocator).click();
        return new PreferencePage(driver);
    }

    public TextPage goToText() {
        driver.findElement(textOptionLocator).click();
        return new TextPage(driver);
    }

    public ViewsPage goToViews() {
        driver.findElement(viewsOptionLocator).click();
        return new ViewsPage(driver);
    }
}
