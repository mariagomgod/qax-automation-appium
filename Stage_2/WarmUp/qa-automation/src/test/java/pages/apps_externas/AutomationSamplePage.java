package pages.apps_externas;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import pages.BasePage;

public class AutomationSamplePage extends BasePage {

    // 📍 Localizadores

    private final By usernameInputLocator = By.id("com.dgotlieb.automationsample:id/userName");
    private final By passwordInputLocator = By.id("com.dgotlieb.automationsample:id/userPassword");
    private final By loginBtnLocator = By.id("com.dgotlieb.automationsample:id/loginButton");
    private final By errorMsgLogin = By.id("com.dgotlieb.automationsample:id/errorTV");
    public AutomationSamplePage(AppiumDriver driver) {
        super(driver);
    }

    // 🎬 Acciones
    public void login() {
        wait.until(visibilityOfElementLocated(usernameInputLocator)).sendKeys("Test");
        wait.until(visibilityOfElementLocated(passwordInputLocator)).sendKeys("Test1234");
        wait.until(visibilityOfElementLocated(loginBtnLocator)).click();
    }

    public String getTxt() {
        return wait.until(visibilityOfElementLocated(errorMsgLogin)).getText();
    }
}
