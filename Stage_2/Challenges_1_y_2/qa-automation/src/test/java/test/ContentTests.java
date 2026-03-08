package test;

import org.junit.Assert;
import org.junit.Test;

import pages.HomePage;
import pages.content.AssetsPage;
import pages.content.ClipboardPage;
import pages.content.ContentPage;
import pages.content.PackagesPage;
import pages.content.ProviderPage;
import pages.content.ResourcesPage;
import pages.content.StoragePage;

public class ContentTests extends BaseTest {

    @Test
    public void browseFromApiDemosApp() {

        HomePage home = new HomePage(driver);

        // ==================== ACTIONS ====================

        ContentPage contentPage = home.goToContent();

        Assert.assertTrue(contentPage.isAssetsDisplayed());
        Assert.assertTrue(contentPage.isClipboardDisplayed());
        Assert.assertTrue(contentPage.isPackagesDisplayed());
        Assert.assertTrue(contentPage.isProviderDisplayed());
        Assert.assertTrue(contentPage.isResourcesDisplayed());
        Assert.assertTrue(contentPage.isStorageDisplayed());

        AssetsPage assetsPage = contentPage.goToAssets();
        assetsPage.goBack();
        ClipboardPage clipboardPage = contentPage.goToClipboard();
        clipboardPage.goBack();
        PackagesPage packagesPage = contentPage.goToPackages();
        packagesPage.goBack();
        ProviderPage providerPage = contentPage.goToProvider();
        providerPage.goBack();
        ResourcesPage resourcesPage = contentPage.goToResources();
        resourcesPage.goBack();
        StoragePage storagePage = contentPage.goToStorage();
        storagePage.goBack();
        contentPage.goBack();
    }
}
