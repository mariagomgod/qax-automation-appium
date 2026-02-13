package pages.apps_externas;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import io.appium.java_client.AppiumDriver;
import pages.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AndroidAppiumDemoPage extends BasePage {

    // 📍 Localizadores
    private final By enterSomeValueBtnLocator = By.xpath("//android.widget.Button[@content-desc='Btn1']");
    private final By someValueInputLocator = By.id("com.skill2lead.appiumdemo:id/Et1");
    private final By submitBtnLocator = By.id("com.skill2lead.appiumdemo:id/Btn1");
    private final By navigateUpLocator = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
    private final By txtValueLocator = By.id("com.skill2lead.appiumdemo:id/Tv1");

    public AndroidAppiumDemoPage(AppiumDriver driver) {
        super(driver);
    }

    // 🎬 Acciones
    public void enterSomeValue() {
        driver.findElement(enterSomeValueBtnLocator).click();

        WebElement someValueInput = wait.until(visibilityOfElementLocated(someValueInputLocator));
        someValueInput.sendKeys("Hola Mundo");

        driver.findElement(submitBtnLocator).click();
    }

    public void navigateUp() {
        driver.findElement(navigateUpLocator).click();
    }

    public String getTxt() {
        return driver.findElement(txtValueLocator).getText();
    }
}
