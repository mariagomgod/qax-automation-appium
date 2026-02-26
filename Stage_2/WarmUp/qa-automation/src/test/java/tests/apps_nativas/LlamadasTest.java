package tests.apps_nativas;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.BaseTest;
import pages.apps_nativas.LlamadasPage;

public class LlamadasTest extends BaseTest {

    @Override
    protected void customize(DesiredCapabilities capabilities) {
        capabilities.setCapability("appPackage", "com.google.android.dialer");
        capabilities.setCapability("appActivity", ".extensions.GoogleDialtactsActivity");
    }

    @Test
    public void doACallFromLlamadasApp() {

        LlamadasPage llamadasPage = new LlamadasPage(driver);

        llamadasPage.llamarAUnContacto();
    }
}
