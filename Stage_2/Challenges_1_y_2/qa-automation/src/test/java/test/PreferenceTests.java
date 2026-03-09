package test;

import org.junit.Assert;
import org.junit.Test;

import pages.HomePage;

import pages.preference.AdvancedPreferencesPage;
import pages.preference.DefaultValuesPage;
import pages.preference.FragmentPage;
import pages.preference.HeadersPage;
import pages.preference.LaunchingPreferencesPage;
import pages.preference.PreferenceDependenciesPage;
import pages.preference.PreferencePage;
import pages.preference.PreferencesFromCodePage;
import pages.preference.PreferencesFromXMLPage;
import pages.preference.SwitchPage;

public class PreferenceTests extends BaseTest {

    @Test
    public void browseFromApiDemosApp() {

        HomePage home = new HomePage(driver);

        // ==================== ACTIONS ====================
        PreferencePage preferencePage = home.goToPreference();

        Assert.assertTrue(preferencePage.isPreferencesFromXMLDisplayed());
        Assert.assertTrue(preferencePage.isLaunchingPreferencesDisplayed());
        Assert.assertTrue(preferencePage.isPreferenceDependenciesDisplayed());
        Assert.assertTrue(preferencePage.isDefaultValuesDisplayed());
        Assert.assertTrue(preferencePage.isPreferencesFromCodeDisplayed());
        Assert.assertTrue(preferencePage.isAdvancedPreferencesDisplayed());
        Assert.assertTrue(preferencePage.isFragmentDisplayed());
        Assert.assertTrue(preferencePage.isHeadersDisplayed());
        Assert.assertTrue(preferencePage.isSwitchDisplayed());

        PreferencesFromXMLPage preferencesFromXMLPage = preferencePage.goToPreferencesFromXML();
        preferencesFromXMLPage.goBack();
        LaunchingPreferencesPage launchingPreferencesPage = preferencePage.goToLaunchingPreferences();
        launchingPreferencesPage.goBack();
        PreferenceDependenciesPage preferenceDependenciesPage = preferencePage.goToPreferenceDependencies();
        preferenceDependenciesPage.goBack();
        DefaultValuesPage defaultValuesPage = preferencePage.goToDefaultValues();
        defaultValuesPage.goBack();
        PreferencesFromCodePage preferencesFromCodePage = preferencePage.goToPreferencesFromCode();
        preferencesFromCodePage.goBack();
        AdvancedPreferencesPage advancedPreferencesPage = preferencePage.goToAdvancedPreferences();
        advancedPreferencesPage.goBack();
        FragmentPage fragmentPage = preferencePage.goToFragment();
        fragmentPage.goBack();
        HeadersPage headersPage = preferencePage.goToHeaders();
        headersPage.goBack();
        SwitchPage switchPage = preferencePage.goToSwitch();
        switchPage.goBack();
        preferencePage.goBack();
    }
}
