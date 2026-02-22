package tests.apps_externas;

import static io.appium.java_client.remote.MobileCapabilityType.APP;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.BaseTest;
import pages.apps_externas.GroceryDemoAppPage;

public class GroceryDemoAppTest extends BaseTest {

    @Override
    protected void customize(DesiredCapabilities capabilities) {
        capabilities.setCapability(APP, AndroidAppiumDemoTest.class.getClassLoader().getResource("Grocery_Demo_App_1.0.40_APKPure.apk").getPath());
    }

    @Test
    public void browseFromGroceryApp() {

        GroceryDemoAppPage groceryDemoAppPage = new GroceryDemoAppPage(driver);

        groceryDemoAppPage.browseFromGroceryDemoAppPage();

    }
}
