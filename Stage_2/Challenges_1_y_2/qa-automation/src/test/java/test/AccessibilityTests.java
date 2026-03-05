package test;

import org.junit.Assert;
import org.junit.Test;

import pages.accessibility.AccessibilityPage;
import pages.accessibility.AccessibilityNodeProviderPage;
import pages.accessibility.AccessibilityNodeQueryingPage;
import pages.accessibility.AccessibilityServicePage;
import pages.accessibility.CustomViewPage;
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

public class AccessibilityTests extends BaseTest {

    @Test
    public void browseFromApiDemosApp() {

        HomePage home = new HomePage(driver);

        // ==================== ACTIONS ====================
        AccessibilityPage accessibilityPage = home.goToAccessibility();
        Assert.assertTrue(accessibilityPage.isAccessibilityNodeProviderOptionDisplayed());
        Assert.assertTrue(accessibilityPage.isAccessibilityNodeQueryingOptionDisplayed());
        Assert.assertTrue(accessibilityPage.isAccessibilityServiceOptionDisplayed());
        Assert.assertTrue(accessibilityPage.isCustomViewOptionDisplayed());
        AccessibilityNodeProviderPage accessibilityNodeProviderPage = accessibilityPage.goToAccessibilityNodeProvider();
        accessibilityNodeProviderPage.goBack();
        AccessibilityNodeQueryingPage accessibilityNodeQueryingPage = accessibilityPage.goToAccessibilityNodeQuerying();
        accessibilityNodeQueryingPage.goBack();
        AccessibilityServicePage accessibilityServicePage = accessibilityPage.goToAccessibilityService();
        accessibilityServicePage.goBack();
        CustomViewPage customViewPage = accessibilityPage.goToCustomView();
        customViewPage.goBack();
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
