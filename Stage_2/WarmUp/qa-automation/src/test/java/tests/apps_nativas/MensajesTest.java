package tests.apps_nativas;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.BaseTest;
import pages.apps_nativas.MensajesPage;

public class MensajesTest extends BaseTest {

    @Override
    protected void customize(DesiredCapabilities capabilities) {
        capabilities.setCapability("appPackage", "com.google.android.apps.messaging");
        capabilities.setCapability("appActivity", ".ui.ConversationListActivity");
    }

    @Test
    public void sendAMessageFromMensajesApp() {

        MensajesPage mensajesPage = new MensajesPage(driver);

    }
}
