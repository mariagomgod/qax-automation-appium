package pages.app;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

import org.openqa.selenium.By;

public class AppPage extends BasePage {

    // ==================== LOCATORS ====================
    private final By actionBarLocator = AppiumBy.accessibilityId("Action Bar");
    private final By activityLocator = AppiumBy.accessibilityId("Activity");
    private final By alarmLocator = AppiumBy.accessibilityId("Alarm");
    private final By alertDialogsLocator = AppiumBy.accessibilityId("Alert Dialogs");
    private final By deviceAdminLocator = AppiumBy.accessibilityId("Device Admin");
    private final By fragmentLocator = AppiumBy.accessibilityId("Fragment");
    private final By launcherShortcutsLocator = AppiumBy.accessibilityId("Launcher Shortcuts");
    private final By loaderLocator = AppiumBy.accessibilityId("Loader");
    private final By menuLocator = AppiumBy.accessibilityId("Menu");
    private final By notificationLocator = AppiumBy.accessibilityId("Notification");
    private final By searchLocator = AppiumBy.accessibilityId("Search");
    private final By serviceLocator = AppiumBy.accessibilityId("Service");
    private final By textToSpeechLocator = AppiumBy.accessibilityId("Text-To-Speech");
    private final By voiceRecognitionLocator = AppiumBy.accessibilityId("Voice Recognition");

    public AppPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public ActionBarPage goToActionBar() {
        driver.findElement(actionBarLocator).click();
        return new ActionBarPage(driver);
    }

    public ActivityPage goToActivity() {
        driver.findElement(activityLocator).click();
        return new ActivityPage(driver);
    }

    public AlarmPage goToAlarm() {
        driver.findElement(alarmLocator).click();
        return new AlarmPage(driver);
    }

    public AlertDialogsPage goToAlertDialogs() {
        driver.findElement(alertDialogsLocator).click();
        return new AlertDialogsPage(driver);
    }

    public DeviceAdminPage goToDeviceAdmin() {
        driver.findElement(deviceAdminLocator).click();
        return new DeviceAdminPage(driver);
    }

    public FragmentPage goToFragment() {
        driver.findElement(fragmentLocator).click();
        return new FragmentPage(driver);
    }

    public LauncherShortcutsPage goToLauncherShortcuts() {
        driver.findElement(launcherShortcutsLocator).click();
        return new LauncherShortcutsPage(driver);
    }

    public LoaderPage goToLoader() {
        driver.findElement(loaderLocator).click();
        return new LoaderPage(driver);
    }

    public MenuPage goToMenu() {
        driver.findElement(menuLocator).click();
        return new MenuPage(driver);
    }

    public NotificationPage goToNotification() {
        driver.findElement(notificationLocator).click();
        return new NotificationPage(driver);
    }

    public SearchPage goToSearch() {
        driver.findElement(searchLocator).click();
        return new SearchPage(driver);
    }

    public ServicePage goToService() {
        driver.findElement(serviceLocator).click();
        return new ServicePage(driver);
    }

    public TextToSpeechPage goToTextToSpeech() {
        driver.findElement(textToSpeechLocator).click();
        return new TextToSpeechPage(driver);
    }

    public VoiceRecognitionPage goToVoiceRecognition() {
        driver.findElement(voiceRecognitionLocator).click();
        return new VoiceRecognitionPage(driver);
    }

    // ==================== ASSERTIONS ===================

    public boolean isActionBarDisplayed() {
        return driver.findElement(actionBarLocator).isDisplayed();
    }

    public boolean isActivityDisplayed() {
        return driver.findElement(activityLocator).isDisplayed();
    }

    public boolean isAlarmDisplayed() {
        return driver.findElement(alarmLocator).isDisplayed();
    }

    public boolean isAlertDialogsDisplayed() {
        return driver.findElement(alertDialogsLocator).isDisplayed();
    }

    public boolean isDeviceAdminDisplayed() {
        return driver.findElement(deviceAdminLocator).isDisplayed();
    }

    public boolean isFragmentDisplayed() {
        return driver.findElement(fragmentLocator).isDisplayed();
    }

    public boolean isLauncherShortcutsDisplayed() {
        return driver.findElement(launcherShortcutsLocator).isDisplayed();
    }

    public boolean isLoaderDisplayed() {
        return driver.findElement(loaderLocator).isDisplayed();
    }

    public boolean isMenuDisplayed() {
        return driver.findElement(menuLocator).isDisplayed();
    }

    public boolean isNotificationDisplayed() {
        return driver.findElement(notificationLocator).isDisplayed();
    }

    public boolean isSearchDisplayed() {
        return driver.findElement(searchLocator).isDisplayed();
    }

    public boolean isServiceDisplayed() {
        return driver.findElement(serviceLocator).isDisplayed();
    }

    public boolean isTextToSpeechDisplayed() {
        return driver.findElement(textToSpeechLocator).isDisplayed();
    }

    public boolean isVoiceRecognitionDisplayed() {
        return driver.findElement(voiceRecognitionLocator).isDisplayed();
    }
}
