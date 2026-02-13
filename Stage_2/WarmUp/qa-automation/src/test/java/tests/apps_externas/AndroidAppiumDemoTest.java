package tests.apps_externas;

import static io.appium.java_client.remote.MobileCapabilityType.APP;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.BaseTest;
import pages.apps_externas.AndroidAppiumDemoPage;

public class AndroidAppiumDemoTest extends BaseTest {
    @Override
    protected void customize(DesiredCapabilities capabilities) {
        capabilities.setCapability(APP, AndroidAppiumDemoTest.class.getClassLoader().getResource("Android_Appium_Demo.apk").getPath());
    }

    @Test
    public void openAndroidAppiumDemoTest() {

        AndroidAppiumDemoPage appiumDemoPage = new AndroidAppiumDemoPage(driver);

        // Acciones
        appiumDemoPage.enterSomeValue();
        Assert.assertEquals("Hola Mundo", appiumDemoPage.getTxt());

        appiumDemoPage.navigateUp();
    }
}
