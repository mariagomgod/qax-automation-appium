package base;

import config.CapabilitiesConfig;
import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BaseTest {

    protected AppiumDriver driver;

    @Before
    public void setUp() throws Exception {
        DesiredCapabilities desiredCapabilities = CapabilitiesConfig.getCapabilities();
        customize(desiredCapabilities);
        driver = new AppiumDriver(
                new URL("http://localhost:4723/wd/hub"),
                desiredCapabilities
        );
    }

    protected void customize(DesiredCapabilities desiredCapabilities) {
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
