package pages.apps_nativas;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.By;
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

    private final By startChatLocator = By.id("com.google.android.apps.messaging:id/start_chat_fab");
    private final By contactLocator = By.id("com.google.android.apps.messaging:id/swipeableContainer");
    private final By messageInputLocator = By.id("com.google.android.apps.messaging:id/compose_message_text");
    private final By sendBtnLocator = By.xpath("//android.view.View[@resource-id='Compose:Draft:Send']/android.widget.Button");


    // 🎬 Acciones

    public void enviarUnMensaje() {
        wait.until(visibilityOfElementLocated(startChatLocator)).click();
        wait.until(visibilityOfElementLocated(contactLocator)).click();
        wait.until(visibilityOfElementLocated(messageInputLocator)).sendKeys("espero que estés bien");
        wait.until(visibilityOfElementLocated(sendBtnLocator)).click();
    }
}
