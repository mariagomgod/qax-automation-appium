package test;

import org.junit.Assert;
import org.junit.Test;

import pages.HomePage;
import pages.app.ActionBarPage;
import pages.app.ActivityPage;
import pages.app.AlarmPage;
import pages.app.AlertDialogsPage;
import pages.app.AppPage;
import pages.app.DeviceAdminPage;
import pages.app.FragmentPage;
import pages.app.LauncherShortcutsPage;
import pages.app.LoaderPage;
import pages.app.MenuPage;
import pages.app.NotificationPage;
import pages.app.SearchPage;
import pages.app.ServicePage;
import pages.app.TextToSpeechPage;
import pages.app.VoiceRecognitionPage;

public class AppTests extends BaseTest {

    @Test
    public void browseFromApiDemosApp() {

        HomePage home = new HomePage(driver);

        // ==================== ACTIONS ====================
        AppPage appPage = home.goToApp();

        Assert.assertTrue(appPage.isActionBarDisplayed());
        Assert.assertTrue(appPage.isActivityDisplayed());
        Assert.assertTrue(appPage.isAlarmDisplayed());
        Assert.assertTrue(appPage.isAlertDialogsDisplayed());
        Assert.assertTrue(appPage.isDeviceAdminDisplayed());
        Assert.assertTrue(appPage.isFragmentDisplayed());
        Assert.assertTrue(appPage.isLauncherShortcutsDisplayed());
        Assert.assertTrue(appPage.isLoaderDisplayed());
        Assert.assertTrue(appPage.isMenuDisplayed());
        Assert.assertTrue(appPage.isNotificationDisplayed());
        Assert.assertTrue(appPage.isSearchDisplayed());
        Assert.assertTrue(appPage.isServiceDisplayed());
        Assert.assertTrue(appPage.isTextToSpeechDisplayed());
        Assert.assertTrue(appPage.isVoiceRecognitionDisplayed());

        ActionBarPage actionBarPage = appPage.goToActionBar();
        actionBarPage.goBack();
        ActivityPage activityPage = appPage.goToActivity();
        activityPage.goBack();
        AlarmPage alarmPage = appPage.goToAlarm();
        alarmPage.goBack();
        AlertDialogsPage alertDialogsPage = appPage.goToAlertDialogs();
        alertDialogsPage.goBack();
        DeviceAdminPage deviceAdminPage = appPage.goToDeviceAdmin();
        deviceAdminPage.goBack();
        FragmentPage fragmentPage = appPage.goToFragment();
        fragmentPage.goBack();
        LauncherShortcutsPage launcherShortcutsPage = appPage.goToLauncherShortcuts();
        launcherShortcutsPage.goBack();
        LoaderPage loaderPage = appPage.goToLoader();
        loaderPage.goBack();
        MenuPage menuPage = appPage.goToMenu();
        menuPage.goBack();
        NotificationPage notificationPage = appPage.goToNotification();
        notificationPage.goBack();
        SearchPage searchPage = appPage.goToSearch();
        searchPage.goBack();
        ServicePage servicePage = appPage.goToService();
        servicePage.goBack();
        TextToSpeechPage textToSpeechPage = appPage.goToTextToSpeech();
        textToSpeechPage.goBack();
        VoiceRecognitionPage voiceRecognitionPage = appPage.goToVoiceRecognition();
        voiceRecognitionPage.goBack();
        appPage.goBack();
    }
}
