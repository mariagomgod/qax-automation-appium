package pages.apps_externas;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.BasePage;

public class MyCurrencyPage extends BasePage {

    // 📍 Localizadores

    private final By amountInputLocator = By.id("com.sharmadhiraj.mycurrencyexchange:id/editTextAmount");
    private final By currencyInputLocator = By.id("android:id/text1");
    private final By australianDollarLocator = By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='(AUD) Australian Dollar']");

    public MyCurrencyPage(WebDriver driver) {
        super(driver);
    }

    // 🎬 Acciones

    public void browseFromMyCurrencyPage() {
        wait.until(visibilityOfElementLocated(amountInputLocator)).sendKeys("40");
        wait.until(visibilityOfElementLocated(amountInputLocator)).click();
        wait.until(visibilityOfElementLocated(currencyInputLocator)).click();
        wait.until(visibilityOfElementLocated(australianDollarLocator)).click();
    }
}
