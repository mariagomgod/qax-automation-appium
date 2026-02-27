package tests.apps_nativas;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.BaseTest;
import pages.apps_nativas.YoutubePage;

public class YoutubeTest extends BaseTest {

    @Override
    protected void customize(DesiredCapabilities capabilities) {
        capabilities.setCapability("appPackage", "com.google.android.youtube");
        capabilities.setCapability("appActivity", ".app.honeycomb.Shell$HomeActivity");
    }

    @Test
    public void browseFromYoutubeApp() {

        YoutubePage youtubePage = new YoutubePage(driver);

        youtubePage.buscarUnVideo();
    }
}
