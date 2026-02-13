package config;

import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

import static io.appium.java_client.remote.MobileCapabilityType.AUTOMATION_NAME;
import static io.appium.java_client.remote.MobileCapabilityType.DEVICE_NAME;
import static io.appium.java_client.remote.MobileCapabilityType.NO_RESET;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesConfig {

    public static DesiredCapabilities getCapabilities() {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(PLATFORM_NAME, "Android");
        caps.setCapability(DEVICE_NAME, "Pixel_9_Pro");
        caps.setCapability(AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(NO_RESET, true);

        return caps;
    }
}
