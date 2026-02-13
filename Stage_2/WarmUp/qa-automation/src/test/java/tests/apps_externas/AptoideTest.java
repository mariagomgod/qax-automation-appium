package tests.apps_externas;

import static io.appium.java_client.remote.MobileCapabilityType.APP;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.BaseTest;
import pages.apps_externas.AptoidePage;

public class AptoideTest extends BaseTest {

    @Override
    protected void customize(DesiredCapabilities capabilities) {
        capabilities.setCapability(APP, AndroidAppiumDemoTest.class.getClassLoader().getResource("aptoide-testing.apk").getPath());
    }

    @Test
    public void browseFromAptoideTestApp() {

        AptoidePage aptoidePage = new AptoidePage(driver);

        // Acciones
        aptoidePage.clickOnInstallBtnFromFirstGame();
        aptoidePage.clickOnReadMore();
        aptoidePage.navigateUp();
        aptoidePage.clickOnEditorialTab();
        aptoidePage.clickOnSearchTab();
        aptoidePage.enterSomeValueInSearchInputAndSelect();
        aptoidePage.clickOnHomeTab();
    }
}