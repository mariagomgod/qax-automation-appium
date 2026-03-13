package test;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import pages.HomePage;
import pages.views.ControlsPage;
import pages.views.DateWidgetsPage;
import pages.views.DialogPage;
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

        // Generamos un texto aleatorio
        String randomText = UUID.randomUUID().toString();
        lightThemePage.fillTextField(randomText);
        Assert.assertEquals(randomText, lightThemePage.getTextFieldValue());

        lightThemePage.selectFirstCheckbox();
        Assert.assertTrue(lightThemePage.isFirstCheckboxChecked());

        lightThemePage.selectFirstRadioButton();
        Assert.assertTrue(lightThemePage.isFirstRadioButtonChecked());
    }

    @Test
    public void browseFromDateWidgetsApiDemosAppSubmenu() {

        HomePage home = new HomePage(driver);

        // ==================== ACTIONS ====================

        ViewsPage viewsPage = home.goToViews();

        Assert.assertTrue(viewsPage.isDateWidgetsDisplayed());

        DateWidgetsPage dateWidgetsPage = viewsPage.goToDateWidgets();

        Assert.assertTrue(dateWidgetsPage.isDialogDisplayed());

        DialogPage dialogPage = dateWidgetsPage.goToDialog();

        Assert.assertTrue(dialogPage.isChangeTheDateClickable());
        dialogPage.clickOnChangeTheDate();

        dialogPage.selectADate();

        // Calculamos de una forma dinámica el primer día del mes siguiente
        String firstDayOfNextMonth = LocalDate.now()
                .plusMonths(1)
                .withDayOfMonth(1)
                .format(DateTimeFormatter.ofPattern("M-d-yyyy"));
        Assert.assertTrue(dialogPage.getDateValue().startsWith(firstDayOfNextMonth));
    }
}
