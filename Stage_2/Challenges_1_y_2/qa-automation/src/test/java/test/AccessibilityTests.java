package test;

import org.junit.Assert;
import org.junit.Test;

import pages.accessibility.AccessibilityPage;
import pages.accessibility.AccessibilityNodeProviderPage;
import pages.accessibility.AccessibilityNodeQueryingPage;
import pages.accessibility.AccessibilityServicePage;
import pages.accessibility.CustomViewPage;
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
    }
}
