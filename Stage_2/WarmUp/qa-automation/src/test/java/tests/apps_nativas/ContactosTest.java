package tests.apps_nativas;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.BaseTest;
import pages.apps_nativas.ContactosPage;

public class ContactosTest extends BaseTest {

    @Override
    protected void customize(DesiredCapabilities capabilities) {
        capabilities.setCapability("appPackage", "com.google.android.contacts");
        capabilities.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
    }

    @Test
    public void sendAMessageFromContactosApp() {

        ContactosPage contactosPage = new ContactosPage(driver);

        contactosPage.enviarMensajeAUnContacto();
    }
}
