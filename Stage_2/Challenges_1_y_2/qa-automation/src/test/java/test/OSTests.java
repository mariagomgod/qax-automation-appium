package test;

import org.junit.Assert;
import org.junit.Test;

import pages.HomePage;
import pages.os.MorseCodePage;
import pages.os.OSPage;
import pages.os.RotationVectorPage;
import pages.os.SMSMessagingPage;

public class OSTests extends BaseTest {

    @Test
    public void browseFromApiDemosApp() {

        HomePage home = new HomePage(driver);

        // ==================== ACTIONS ====================
        OSPage osPage = home.goToOs();

        Assert.assertTrue(osPage.isMorseCodeDisplayed());
        Assert.assertTrue(osPage.isRotationVectorDisplayed());
        Assert.assertTrue(osPage.isSmsMessagingDisplayed());

        MorseCodePage morseCodePage = osPage.goToMorseCode();
        morseCodePage.goBack();
        RotationVectorPage rotationVectorPage = osPage.goToRotationVector();
        rotationVectorPage.goBack();
        SMSMessagingPage smsMessagingPage = osPage.goToSMSMessaging();
        smsMessagingPage.goBack();
        osPage.goBack();
    }
}
