package pages.apps_externas;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import pages.BasePage;

public class FDroidPage extends BasePage {

    // 📍 Localizadores

    private final By lissenAppLocator = By.xpath("//android.widget.GridView[@resource-id='org.fdroid.fdroid:id/app_list']/androidx.cardview.widget.CardView[2]/android.view.ViewGroup");
    private final By moreBtnLocator = By.id("org.fdroid.fdroid:id/description_more");
    private final By burgerMenuLocator = By.xpath("//android.widget.ImageView[@content-desc='More options']");
    private final By ignoreAllUpdatesCheckboxLocator = By.xpath("//android.widget.CheckBox[@resource-id='org.fdroid.fdroid:id/checkbox'][1]");
    private final By navigateUpLocator = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");


    public FDroidPage(AppiumDriver driver) {
        super(driver);
    }

    // 🎬 Acciones

    public void browseFromLissenApp() {
        wait.until(visibilityOfElementLocated(lissenAppLocator)).click();
        wait.until(visibilityOfElementLocated(moreBtnLocator)).click();
        wait.until(visibilityOfElementLocated(burgerMenuLocator)).click();
        wait.until(visibilityOfElementLocated(ignoreAllUpdatesCheckboxLocator)).click();
        wait.until(visibilityOfElementLocated(navigateUpLocator)).click();
    }
}
