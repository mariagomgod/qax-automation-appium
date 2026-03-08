package test;

import org.junit.Assert;
import org.junit.Test;

import pages.HomePage;
import pages.media.MediaPage;
import pages.media.MediaPlayerPage;
import pages.media.VideoViewPage;

public class MediaTests extends BaseTest {

    @Test
    public void browseFromApiDemosApp() {

        HomePage home = new HomePage(driver);

        // ==================== ACTIONS ====================

        MediaPage mediaPage = home.goToMedia();

        Assert.assertTrue(mediaPage.isMediaPlayerDisplayed());
        Assert.assertTrue(mediaPage.isMediaPlayerDisplayed());

        MediaPlayerPage mediaPlayerPage = mediaPage.goToMediaPlayer();
        mediaPlayerPage.goBack();
        VideoViewPage videoViewPage = mediaPage.goToVideoView();
        videoViewPage.goBack();
        mediaPage.goBack();
    }
}
