package pages.apps_externas;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class AndroidAppiumDemoPage {

    private final AppiumDriver driver;

    // 📍 Localizadores
    private final By enterSomeValueBtn = By.xpath("//android.widget.Button[@content-desc='Btn1']");
    private final By someValueInput = By.id("com.skill2lead.appiumdemo:id/Et1");
    private final By submitBtn = By.id("com.skill2lead.appiumdemo:id/Btn1");
    private final By navigateUp = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
    private final By txtValue = By.id("com.skill2lead.appiumdemo:id/Tv1");

    public AndroidAppiumDemoPage(AppiumDriver driver) {
        this.driver = driver;
    }

    // 🎬 Acciones
    public void enterSomeValue() throws Exception {
        driver.findElement(enterSomeValueBtn).click();
        Thread.sleep(200L);
        driver.findElement(someValueInput).sendKeys("Hola Mundo");
        driver.findElement(submitBtn).click();
    }

    public void navigateUp() {
        driver.findElement(navigateUp).click();
    }

    public String getTxt() {
        return driver.findElement(txtValue).getText();
    }
}
