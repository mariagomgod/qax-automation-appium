package pages.apps_nativas;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import pages.BasePage;

import java.net.URL;

public class ContactosPage extends BasePage {

    public ContactosPage(WebDriver driver) {
        super(driver);
    }

    public static void main(String[] args) {
        try {

            UiAutomator2Options options = new UiAutomator2Options()
                    .setDeviceName("Pixel_9_Pro")
                    .setPlatformName("Android")
                    .setAutomationName("UiAutomator2")
                    .setAppPackage("com.google.android.contacts")
                    .setAppActivity("com.android.contacts.activities.PeopleActivity");

            URL appiumServerUrl = new URL("http://localhost:4723/wd/hub");

            AppiumDriver driver = new AndroidDriver(appiumServerUrl, options);

            System.out.println("✅ Contactos inicializado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 📍 Localizadores

    private final By firstContactLocator = By.xpath("//androidx.compose.ui.platform.ComposeView[@resource-id='com.google.android.contacts:id/contact_list_compose_view']/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View");
    private final By messageIconLocator = By.xpath("//android.view.View[@content-desc='Message']");
    private final By txtMessageInputLocator = By.id("com.google.android.apps.messaging:id/compose_message_text");
    private final By sendSmsBtnLocator = By.xpath("//android.view.View[@resource-id='Compose:Draft:Send']/android.widget.Button");


    // 🎬 Acciones

    public void enviarMensajeAUnContacto() {
        wait.until(visibilityOfElementLocated(firstContactLocator)).click();
        wait.until(visibilityOfElementLocated(messageIconLocator)).click();
        wait.until(visibilityOfElementLocated(txtMessageInputLocator)).sendKeys("hola como te encuentras");
        wait.until(visibilityOfElementLocated(sendSmsBtnLocator)).click();
    }
}
