package test;

import org.junit.Test;

import pages.AccesibilityPage;
import pages.AnimationPage;
import pages.AppPage;
import pages.ContentPage;
import pages.GraphicsPage;
import pages.HomePage;
import pages.MediaPage;
import pages.NFCPage;
import pages.OSPage;
import pages.PreferencePage;
import pages.TextPage;
import pages.ViewsPage;

public class HomeTests extends BaseTest {

    @Test
    public void browseFromApiDemosApp() {

        HomePage home = new HomePage(driver);

        // ==================== ACTIONS ====================
        AccesibilityPage accesibilityPage = home.goToAccessibility();
        accesibilityPage.goBack();

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
