package pages.apps_nativas;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import pages.BasePage;

import java.net.URL;

public class CamaraPage extends BasePage {

    public CamaraPage(WebDriver driver) {
        super(driver);
    }

    public static void main(String[] args) {
        try {

            UiAutomator2Options options = new UiAutomator2Options()
                    .setDeviceName("Pixel_9_Pro")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setAppPackage("com.android.camera2")
                    .setAppActivity("com.android.camera.CameraLauncher")
                    .setNoReset(true);

            URL appiumServerUrl = new URL("http://localhost:4723/wd/hub");

            AppiumDriver driver = new AndroidDriver(appiumServerUrl, options);

            System.out.println("✅ Cámara inicializada correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 📍 Localizadores

   private final By cameraOverlayLocator = By.id("com.android.camera2:id/mode_options_overlay");
    private final By cameraShutterLocator = By.id("com.android.camera2:id/shutter_button");
    private final By thumbnailViewLocator = By.id("com.android.camera2:id/rounded_thumbnail_view");
    private final By deleteIconLocator = By.id("com.android.camera2:id/filmstrip_bottom_control_delete");

    // 🎬 Acciones

    public void takeAPhotoAndDelete() {
        wait.until(visibilityOfElementLocated(cameraOverlayLocator)).click();
        wait.until(visibilityOfElementLocated(cameraShutterLocator)).click();
        wait.until(visibilityOfElementLocated(thumbnailViewLocator)).click();
        wait.until(visibilityOfElementLocated(deleteIconLocator)).click();
    }
}
