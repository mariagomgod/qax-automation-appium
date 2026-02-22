package pages.apps_externas;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import pages.BasePage;

public class GroceryDemoAppPage extends BasePage {

    // 📍 Localizadores

    private final By offerLocator = By.xpath("//android.widget.Image[@text='ekP27hIOcl4QutqLU7zi.png?GoogleAccessId=firebase-adminsdk-1fxta%40grocery-demo-9df72.iam.gserviceaccount']");
    private final By addMoreThanOneUnitOfProductLocator = By.xpath("//android.widget.Image[@content-desc='add']");
    private final By addToCartBtnLocator = By.xpath("//android.view.View[@resource-id='content1']/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View");
    private final By closeIconLocator = By.xpath("//android.widget.Image[@content-desc='close']");
    private final By navigateUpLocator = By.xpath("//android.widget.Button[@text='arrow back']");


    public GroceryDemoAppPage(AppiumDriver driver) {
        super(driver);
    }

    // 🎬 Acciones

    public void browseFromGroceryDemoAppPage() {
        wait.until(visibilityOfElementLocated(offerLocator)).click();
        wait.until(visibilityOfElementLocated(addMoreThanOneUnitOfProductLocator)).click();
        wait.until(visibilityOfElementLocated(addToCartBtnLocator)).click();
        wait.until(visibilityOfElementLocated(closeIconLocator)).click();
        wait.until(visibilityOfElementLocated(navigateUpLocator)).click();
    }
}
