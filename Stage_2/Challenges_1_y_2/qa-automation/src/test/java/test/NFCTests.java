package test;

import org.junit.Assert;
import org.junit.Test;

import pages.HomePage;
import pages.nfc.ForegroundDispatchPage;
import pages.nfc.ForegroundNdefPushPage;
import pages.nfc.NFCPage;
import pages.nfc.TechFilterPage;

public class NFCTests extends BaseTest {

    @Test
    public void browseFromApiDemosApp() {

        HomePage home = new HomePage(driver);

        // ==================== ACTIONS ====================
        NFCPage nfcPage = home.goToNfc();

        Assert.assertTrue(nfcPage.isForegroundDispatchDisplayed());
        Assert.assertTrue(nfcPage.isForegroundNdefPushDisplayed());
        Assert.assertTrue(nfcPage.isTechFilterDisplayed());

        ForegroundDispatchPage foregroundDispatchPage = nfcPage.goToForegroundDispatch();
        foregroundDispatchPage.goBack();
        ForegroundNdefPushPage foregroundNdefPushPage = nfcPage.goToForegroundNdefPush();
        foregroundNdefPushPage.goBack();
        TechFilterPage techFilterPage = nfcPage.goToTechFilter();
        techFilterPage.goBack();
        nfcPage.goBack();
    }
}
