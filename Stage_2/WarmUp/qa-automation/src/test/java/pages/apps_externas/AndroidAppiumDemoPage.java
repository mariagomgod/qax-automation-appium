package pages.apps_externas;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

import org.openqa.selenium.By;

public class AndroidAppiumDemoPage extends BasePage {

    // 📍 Localizadores
    private final By enterSomeValueBtnLocator = By.xpath("//android.widget.Button[@content-desc='Btn1']");
    private final By someValueInputLocator = By.id("com.skill2lead.appiumdemo:id/Et1");
    private final By submitBtnLocator = By.id("com.skill2lead.appiumdemo:id/Btn1");
    private final By navigateUpLocator = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
    private final By txtValueLocator = By.id("com.skill2lead.appiumdemo:id/Tv1");

    public AndroidAppiumDemoPage(WebDriver driver) {
        super(driver);
    }

    // 🎬 Acciones
    public void enterSomeValue() {
        wait.until(visibilityOfElementLocated(enterSomeValueBtnLocator)).click();
        wait.until(visibilityOfElementLocated(someValueInputLocator)).sendKeys("Hola Mundo");
        wait.until(visibilityOfElementLocated(submitBtnLocator)).click();
    }

    public void navigateUp() {
        wait.until(visibilityOfElementLocated(navigateUpLocator)).click();
    }

    public String getTxt() {
        return wait.until(visibilityOfElementLocated(txtValueLocator)).getText();
    }
}
