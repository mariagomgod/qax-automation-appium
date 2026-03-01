package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class AppPage extends BasePage {

    // ==================== LOCATORS ====================
    private final By activityOption = By.xpath("//android.widget.TextView[@text='Activity']");

    public AppPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public boolean isActivityVisible() {
        return driver.findElement(activityOption).isDisplayed();
    }

}
