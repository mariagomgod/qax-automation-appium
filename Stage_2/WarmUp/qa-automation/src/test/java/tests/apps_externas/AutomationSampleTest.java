package tests.apps_externas;

import static io.appium.java_client.remote.MobileCapabilityType.APP;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.BaseTest;
import pages.apps_externas.AutomationSamplePage;

public class AutomationSampleTest extends BaseTest {

    @Override
    protected void customize(DesiredCapabilities capabilities) {
        capabilities.setCapability(APP, AndroidAppiumDemoTest.class.getClassLoader().getResource("Automation_Sample_1.0_APKPure.apk").getPath());
    }

    @Test
    public void loginIntoAutomationSampleApp() {

        AutomationSamplePage automationSamplePage = new AutomationSamplePage(driver);

        // Acciones
        automationSamplePage.login();
        Assert.assertEquals("Wrong username or password", automationSamplePage.getTxt());
    }
}
