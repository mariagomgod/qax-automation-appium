package test;

import org.junit.Assert;
import org.junit.Test;

import pages.HomePage;
import pages.os.MorseCodePage;
import pages.os.OSPage;
import pages.os.RotationVectorPage;
import pages.os.SMSMessagingPage;
import pages.text.LinkifyPage;
import pages.text.LogTextBoxPage;
import pages.text.MarqueePage;
import pages.text.TextPage;
import pages.text.UnicodePage;

public class TextTests extends BaseTest {

    @Test
    public void browseFromApiDemosApp() {

        HomePage home = new HomePage(driver);

        // ==================== ACTIONS ====================
        TextPage textPage = home.goToText();

        Assert.assertTrue(textPage.isLinkifyDisplayed());
        Assert.assertTrue(textPage.isLogTextBoxDisplayed());
        Assert.assertTrue(textPage.isMarqueeDisplayed());
        Assert.assertTrue(textPage.isUnicodeDisplayed());

        LinkifyPage linkifyPage = textPage.goToLinkify();
        linkifyPage.goBack();
        LogTextBoxPage logTextBoxPage = textPage.goToLogTextBox();
        logTextBoxPage.goBack();
        MarqueePage marqueePage = textPage.goToMarquee();
        marqueePage.goBack();
        UnicodePage unicodePage = textPage.goToUnicode();
        unicodePage.goBack();
        textPage.goBack();
    }
}
