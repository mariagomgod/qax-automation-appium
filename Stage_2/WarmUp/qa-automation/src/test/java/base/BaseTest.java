package base;

import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BaseTest {

    protected AppiumDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new AppiumDriver(
                new URL("http://localhost:4723/wd/hub"),
                getCapabilities()
        );
    }

    protected DesiredCapabilities getCapabilities() {
        throw new UnsupportedOperationException("No implementado!");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
