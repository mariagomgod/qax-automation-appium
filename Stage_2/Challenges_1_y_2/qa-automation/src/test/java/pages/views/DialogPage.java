package pages.views;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class DialogPage extends BasePage {

    // ==================== LOCATORS ====================

    private final By changeTheDateLocator = AppiumBy.accessibilityId("change the date");
    private final By nextMonthLocator = AppiumBy.accessibilityId("Next month");
    private final By dateLocator = AppiumBy.xpath("//android.view.View[@text=\"1\"]");
    private final By submitDateLocator = AppiumBy.id("android:id/button1");
    private final By dateInformationLocator = AppiumBy.id("io.appium.android.apis:id/dateDisplay");

    public DialogPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public void clickOnChangeTheDate() {
        clickElement(changeTheDateLocator);
    }

    public void selectADate() {
        clickElementOnModal(nextMonthLocator);
        clickElementOnModal(dateLocator);
        clickElementOnModal(submitDateLocator);
    }

    // ==================== ASSERTIONS ====================

    public boolean isChangeTheDateClickable() {
        return isElementClickable(changeTheDateLocator);
    }

    public String getDateValue() {
        return getText(dateInformationLocator);
    }
}
