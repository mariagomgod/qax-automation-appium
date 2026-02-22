package pages.apps_externas;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.BasePage;

public class AptoidePage extends BasePage {

    // 📍 Localizadores

    private final By installBtnFirstGameLocator = By.id("cm.aptoide.pt:id/action_button");
    private final By readMoreBtnLocator = By.id("cm.aptoide.pt:id/description_see_more");
    private final By navigateUpLocator = By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']");
    private final By editorialTabLocator = By.id("cm.aptoide.pt:id/action_curation");
    private final By searchTabLocator = By.id("cm.aptoide.pt:id/action_search");
    private final By searchInputLocator = By.id("cm.aptoide.pt:id/search_src_text");
    private final By selectFirstOptionFromSearchLocator = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='cm.aptoide.pt:id/suggestions_list']/android.widget.LinearLayout[1]");
    private final By homeTabLocator = By.id("cm.aptoide.pt:id/action_home");


    public AptoidePage(WebDriver driver) {
        super(driver);
    }

    // 🎬 Acciones
    public void clickOnInstallBtnFromFirstGame() {
        wait.until(elementToBeClickable(installBtnFirstGameLocator)).click();
    }

    public void clickOnReadMore() {
        wait.until(elementToBeClickable(readMoreBtnLocator)).click();
    }

    public void clickOnEditorialTab() {
        wait.until(elementToBeClickable(editorialTabLocator)).click();
    }

    public void clickOnSearchTab() {
        wait.until(elementToBeClickable(searchTabLocator)).click();
    }

    public void clickOnHomeTab() {
        wait.until(elementToBeClickable(homeTabLocator)).click();
    }

    public void navigateUp() {
        wait.until(elementToBeClickable(navigateUpLocator)).click();
    }

    public void enterSomeValueInSearchInputAndSelect() {
        WebElement someValueInput = wait.until(visibilityOfElementLocated(searchInputLocator));
        someValueInput.sendKeys("Parking");

        wait.until(elementToBeClickable(selectFirstOptionFromSearchLocator)).click();
    }
}
