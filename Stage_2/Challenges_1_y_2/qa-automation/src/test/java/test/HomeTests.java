package test;

import org.junit.Test;

import pages.accessibility.AccessibilityPage;
import pages.animation.AnimationPage;
import pages.app.AppPage;
import pages.content.ContentPage;
import pages.graphics.GraphicsPage;
import pages.HomePage;
import pages.media.MediaPage;
import pages.nfc.NFCPage;
import pages.os.OSPage;
import pages.preference.PreferencePage;
import pages.text.TextPage;
import pages.views.ViewsPage;

public class HomeTests extends BaseTest {

    @Test
    public void browseFromApiDemosApp() {

        HomePage home = new HomePage(driver);

        // ==================== ACTIONS ====================

        AccessibilityPage accessibilityPage = home.goToAccessibility();
        accessibilityPage.goBack();

        AnimationPage animationPage = home.goToAnimation();
        animationPage.goBack();

        AppPage appPage = home.goToApp();
        appPage.goBack();

        ContentPage contentPage = home.goToContent();
        contentPage.goBack();

        GraphicsPage graphicsPage = home.goToGraphics();
        graphicsPage.goBack();

        MediaPage mediaPage = home.goToMedia();
        mediaPage.goBack();

        NFCPage nfcPage = home.goToNfc();
        nfcPage.goBack();

        OSPage osPage = home.goToOs();
        osPage.goBack();

        PreferencePage preferencePage = home.goToPreference();
        preferencePage.goBack();

        TextPage textPage = home.goToText();
        textPage.goBack();

        ViewsPage viewsPage = home.goToViews();
        viewsPage.goBack();
    }
}
