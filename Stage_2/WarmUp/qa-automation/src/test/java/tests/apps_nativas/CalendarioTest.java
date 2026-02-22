package tests.apps_nativas;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.BaseTest;

public class CalendarioTest extends BaseTest {

    @Override
    protected void customize(DesiredCapabilities capabilities) {
        capabilities.setCapability("appPackage", "com.google.android.calendar");
        capabilities.setCapability("appActivity", "com.android.calendar.AllInOneActivity");
    }

    @Test
    public void calendarioApp() {
        // No se puede ejecutar el test dado que no tiene acceso a internet y no tiene una cuenta de google asociada
    }
}
