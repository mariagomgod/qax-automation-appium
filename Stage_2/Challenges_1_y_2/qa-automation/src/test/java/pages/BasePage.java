package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Collections;

public class BasePage {

    protected AndroidDriver driver;
    protected WebDriverWait wait;

    public BasePage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // ========== WAITS ==========
    protected WebElement waitForElement(By locator) {
        scrollToElement(locator);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected WebElement waitForElementToBeClickable(By locator) {
        return waitForElementToBeClickable(locator, true);
    }

    protected WebElement waitForElementToBeClickable(By locator, boolean shouldScroll) {
        if (shouldScroll) {
            scrollToElement(locator);
        }
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected void waitForElementToDisappear(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    // ========== ACCIONES COMUNES ==========
    protected boolean isElementDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    protected boolean isElementChecked(By locator) {
        String checked = driver.findElement(locator).getAttribute("checked");
        return Boolean.parseBoolean(checked);
    }

    protected boolean isElementClickable(By locator) {
        String clicked = driver.findElement(locator).getAttribute("clickable");
        return Boolean.parseBoolean(clicked);
    }

    protected void clickElement(By locator) {
        waitForElementToBeClickable(locator).click();
    }

    protected void clickElementOnModal(By locator) {
        waitForElementToBeClickable(locator, false).click();
    }

    protected void enterText(By locator, String text) {
        WebElement element = waitForElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(By locator) {
        return waitForElement(locator).getText();
    }

    public void goBack() {
        driver.navigate().back();
    }

    public void scrollToElement(By locator) {

        int maxScrolls = 5;

        for (int i = 0; i < maxScrolls; i++) {

            try {
                WebElement element = driver.findElement(locator);
                if (element.isDisplayed()) {
                    return;
                }
            } catch (Exception ignored) {}

            Dimension size = driver.manage().window().getSize();

            int startX = (int) (size.width * 0.8);
            int startY = (int) (size.height * 0.8);
            int endY = (int) (size.height * 0.2);

            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
            Sequence swipe = new Sequence(finger, 1);

            //Simula un dedo deslizado hacia arriba, que provoca scroll hacia abajo
            swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), startX, endY));
            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            // Ejecuta el swipe (La pantalla se mueve)
            driver.perform(Collections.singletonList(swipe));
        }
        // Si después de 5 scrolls el elemento no aparece, lanza un error diciendo que el elemento no se encontró
        throw new NoSuchElementException("Element not found after scrolling: " + locator);
    }

    public void scrollToTop() {
        for (int i = 0; i < 2; i++) {
            Dimension size = driver.manage().window().getSize();

            int startX = size.width / 2;
            int startY = (int) (size.height * 0.2);
            int endY = (int) (size.height * 0.8);

            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
            Sequence swipe = new Sequence(finger, 1);

            //Simula un dedo deslizado hacia abajo, que provoca scroll hacia arriba
            swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), startX, endY));
            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            // Ejecuta el swipe (La pantalla se mueve)
            driver.perform(Collections.singletonList(swipe));
        }
    }
}
