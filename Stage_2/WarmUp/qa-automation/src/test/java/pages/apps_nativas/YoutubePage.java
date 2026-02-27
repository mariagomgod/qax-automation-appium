package pages.apps_nativas;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import pages.BasePage;

public class YoutubePage extends BasePage {

    public YoutubePage(WebDriver driver) {
        super(driver);
    }

    public static void main(String[] args) {
        try {

            UiAutomator2Options options = new UiAutomator2Options()
                    .setDeviceName("Pixel_9_Pro")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setAppPackage("com.google.android.youtube")
                    .setAppActivity(".app.honeycomb.Shell$HomeActivity");

            URL appiumServerUrl = new URL("http://localhost:4723/wd/hub");

            AppiumDriver driver = new AndroidDriver(appiumServerUrl, options);

            System.out.println("✅ Youtube inicializado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 📍 Localizadores

    private final By searchYoutubeLocator = By.xpath("//android.view.ViewGroup[@content-desc='Search YouTube']");
    private final By searchYoutubeInputLocator = By.id("com.google.android.youtube:id/search_edit_text");
    private final By firstOptionLocator = By.xpath("(//android.view.ViewGroup[@resource-id='com.google.android.youtube:id/linearLayout'])[1]");


    // 🎬 Acciones

    public void buscarUnVideo() {
        wait.until(visibilityOfElementLocated(searchYoutubeLocator)).click();
        wait.until(visibilityOfElementLocated(searchYoutubeInputLocator)).click();
        wait.until(visibilityOfElementLocated(searchYoutubeInputLocator)).sendKeys("David Bisbal mi princesa");
        wait.until(visibilityOfElementLocated(firstOptionLocator)).click();
    }

}
