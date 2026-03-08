package pages.media;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class MediaPage extends BasePage {

    // ==================== LOCATORS ====================

    private final By mediaPlayerLocator = AppiumBy.accessibilityId("MediaPlayer");
    private final By videoViewLocator = AppiumBy.accessibilityId("VideoView");

    public MediaPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public MediaPlayerPage goToMediaPlayer() {
        driver.findElement(mediaPlayerLocator).click();
        return new MediaPlayerPage(driver);
    }

    public VideoViewPage goToVideoView() {
        driver.findElement(videoViewLocator).click();
        return new VideoViewPage(driver);
    }

    // ==================== ASSERTIONS ====================

    public boolean isMediaPlayerDisplayed() {
        return driver.findElement(mediaPlayerLocator).isDisplayed();
    }

    public boolean isVideoViewDisplayed() {
        return driver.findElement(videoViewLocator).isDisplayed();
    }
}
