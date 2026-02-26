package tests.apps_nativas;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.BaseTest;
import pages.apps_nativas.CamaraPage;

public class CamaraTest extends BaseTest {

    @Override
    protected void customize(DesiredCapabilities capabilities) {
        capabilities.setCapability("appPackage", "com.android.camera2");
        capabilities.setCapability("appActivity", "com.android.camera.CameraLauncher");
    }

    @Test
    public void takeAPhotoAndDeleteFromCamaraApp() {

        CamaraPage camaraPage = new CamaraPage(driver);

        camaraPage.takeAPhotoAndDelete();
    }
}
