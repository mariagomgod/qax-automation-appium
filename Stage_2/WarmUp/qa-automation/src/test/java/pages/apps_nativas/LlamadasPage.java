package pages.apps_nativas;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import pages.BasePage;

public class LlamadasPage extends BasePage {

    public LlamadasPage(WebDriver driver) {
        super(driver);
    }

    public static void main(String[] args) {
        try {

            UiAutomator2Options options = new UiAutomator2Options()
                    .setDeviceName("Pixel_9_Pro")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setAppPackage("com.google.android.dialer")
                    .setAppActivity(".extensions.GoogleDialtactsActivity");

            URL appiumServerUrl = new URL("http://localhost:4723/wd/hub");

            AppiumDriver driver = new AndroidDriver(appiumServerUrl, options);

            System.out.println("✅ Llamadas inicializadas correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 📍 Localizadores

    private final By contactsIconLocator = By.id("com.google.android.dialer:id/tab_contacts");
    private final By firstContactLocator = By.id("com.google.android.dialer:id/click_target");
    private final By callIconLocator = By.xpath("//android.view.View[@content-desc='Call']");
    private final By endCallBtnLocator = By.xpath("//android.view.View[@resource-id='end_call_fab_test_tag']/android.widget.Button");


    // 🎬 Acciones

    public void llamarAUnContacto() {
        wait.until(visibilityOfElementLocated(contactsIconLocator)).click();
        wait.until(visibilityOfElementLocated(firstContactLocator)).click();
        wait.until(visibilityOfElementLocated(callIconLocator)).click();
        wait.until(visibilityOfElementLocated(endCallBtnLocator)).click();
    }
}
