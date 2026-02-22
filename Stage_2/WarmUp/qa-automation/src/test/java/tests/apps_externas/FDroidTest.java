package tests.apps_externas;

import static io.appium.java_client.remote.MobileCapabilityType.APP;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.BaseTest;
import pages.apps_externas.FDroidPage;

public class FDroidTest extends BaseTest {

    @Override
    protected void customize(DesiredCapabilities capabilities) {
        capabilities.setCapability(APP, AndroidAppiumDemoTest.class.getClassLoader().getResource("F-Droid.apk").getPath());
    }

    @Test
    public void browseFromFDroidApp() {

        FDroidPage fDroidPage = new FDroidPage(driver);

        fDroidPage.browseFromLissenApp();
    }
}
