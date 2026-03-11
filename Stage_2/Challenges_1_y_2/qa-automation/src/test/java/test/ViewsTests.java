package test;

import org.junit.Assert;
import org.junit.Test;

import pages.HomePage;
import pages.views.ControlsPage;
import pages.views.LightThemePage;
import pages.views.ViewsPage;

public class ViewsTests extends BaseTest {

    @Test
    public void browseFromControlsApiDemosAppSubmenu() {

        HomePage home = new HomePage(driver);

        // ==================== ACTIONS ====================
        ViewsPage viewsPage = home.goToViews();

        Assert.assertTrue(viewsPage.isControlsDisplayed());

        ControlsPage controlsPage = viewsPage.goToControls();

        Assert.assertTrue(controlsPage.isLightThemeDisplayed());

        LightThemePage lightThemePage = controlsPage.goToLightTheme();

        lightThemePage.fillTextField();
        Assert.assertEquals("hola", lightThemePage.getTextFieldValue());

        lightThemePage.selectFirstCheckbox();
        Assert.assertTrue(lightThemePage.isFirstCheckboxChecked());

        lightThemePage.selectFirstRadioButton();
        Assert.assertTrue(lightThemePage.isFirstRadioButtonChecked());
    }
}
