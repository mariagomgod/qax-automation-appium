package pages.apps_nativas;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import pages.BasePage;

import java.net.URL;

public class MensajesPage extends BasePage {

    public MensajesPage(WebDriver driver) {
        super(driver);
    }

    public static void main(String[] args) {
        try {

            UiAutomator2Options options = new UiAutomator2Options()
                    .setDeviceName("Pixel_9_Pro")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setAppPackage("com.google.android.apps.messaging")
                    .setAppActivity(".ui.ConversationListActivity");

            URL appiumServerUrl = new URL("http://localhost:4723/wd/hub");

            AppiumDriver driver = new AndroidDriver(appiumServerUrl, options);

            System.out.println("✅ Mensajes inicializados correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 📍 Localizadores


    // 🎬 Acciones
}
