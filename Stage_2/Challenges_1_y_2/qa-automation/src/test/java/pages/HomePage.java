package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage extends BasePage {


    // ==================== LOCATORS ====================
    private final By appOption = AppiumBy.xpath("//android.widget.TextView[@text='App']");
    private final By accessibilityOption = AppiumBy.accessibilityId("Accessibility");
    private final By animationOption = AppiumBy.accessibilityId("Animation");
    private final By contentOption = AppiumBy.xpath("//android.widget.TextView[@text='Content']");
    private final By graphicsOption = AppiumBy.accessibilityId("Graphics");
    private final By mediaOption = AppiumBy.accessibilityId("Media");
    private final By nfcOption = AppiumBy.accessibilityId("NFC");
    private final By osOption = AppiumBy.accessibilityId("OS");
    private final By preferenceOption = AppiumBy.accessibilityId("Preference");
    private final By textOption = AppiumBy.accessibilityId("Text");
    private final By viewsOption = AppiumBy.accessibilityId("Views");

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================
    public AppPage goToApp() {
        driver.findElement(appOption).click();
        return new AppPage(driver);
    }

    public AccesibilityPage goToAccessibility() {
        driver.findElement(accessibilityOption).click();
        return new AccesibilityPage(driver);
    }

    public AnimationPage goToAnimation() {
        driver.findElement(animationOption).click();
        return new AnimationPage(driver);
    }

    public ContentPage goToContent() {
        driver.findElement(contentOption).click();
        return new ContentPage(driver);
    }

    public GraphicsPage goToGraphics() {
        driver.findElement(graphicsOption).click();
        return new GraphicsPage(driver);
    }

    public MediaPage goToMedia() {
        driver.findElement(mediaOption).click();
        return new MediaPage(driver);
    }

    public NFCPage goToNfc() {
        driver.findElement(nfcOption).click();
        return new NFCPage(driver);
    }

    public OSPage goToOs() {
        driver.findElement(osOption).click();
        return new OSPage(driver);
    }

    public PreferencePage goToPreference() {
        driver.findElement(preferenceOption).click();
        return new PreferencePage(driver);
    }

    public TextPage goToText() {
        driver.findElement(textOption).click();
        return new TextPage(driver);
    }

    public ViewsPage goToViews() {
        driver.findElement(viewsOption).click();
        return new ViewsPage(driver);
    }

    // ==================== ASSERTIONS ===================
    public boolean isAppOptionVisible() {
        return driver.findElement(appOption).isDisplayed();
    }
}
