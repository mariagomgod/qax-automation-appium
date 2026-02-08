package tests;

import static io.appium.java_client.remote.MobileCapabilityType.APP;

import org.openqa.selenium.remote.DesiredCapabilities;

import base.BaseTest;
import config.CapabilitiesConfig;

public class AndroidAppiumDemoTest extends BaseTest {

    @Override
    protected DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = CapabilitiesConfig.getCapabilities();
        capabilities.setCapability(APP, AndroidAppiumDemoTest.class.getClassLoader().getResource("Android_Appium_Demo.apk").getPath());
        return capabilities;
    }
}
