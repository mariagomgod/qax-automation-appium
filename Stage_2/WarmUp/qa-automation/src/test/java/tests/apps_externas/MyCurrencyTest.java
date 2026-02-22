package tests.apps_externas;

import static io.appium.java_client.remote.MobileCapabilityType.APP;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.BaseTest;
import pages.apps_externas.MyCurrencyPage;

public class MyCurrencyTest extends BaseTest {

    @Override
    protected void customize(DesiredCapabilities capabilities) {
        capabilities.setCapability(APP, AndroidAppiumDemoTest.class.getClassLoader().getResource("myCurrencyTest.apk").getPath());
    }

    @Test
    public void browseFromMyCurrencyApp() {

        MyCurrencyPage myCurrencyPage = new MyCurrencyPage(driver);

        myCurrencyPage.browseFromMyCurrencyPage();
    }
}
