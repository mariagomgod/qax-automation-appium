package test;

import org.junit.Assert;
import org.junit.Test;

import pages.HomePage;
import pages.animation.AnimationPage;
import pages.animation.BouncingBallsPage;
import pages.animation.CloningPage;
import pages.animation.CustomEvaluatorPage;
import pages.animation.DefaultLayoutAnimationPage;
import pages.animation.EventsPage;
import pages.animation.HideShowAnimationsPage;
import pages.animation.LayoutAnimationsPage;
import pages.animation.LoadingPage;
import pages.animation.MultiplePropertiesPage;
import pages.animation.ReversingPage;
import pages.animation.SeekingPage;
import pages.animation.ViewFlipPage;

public class AnimationTests extends BaseTest{

    @Test
    public void browseFromApiDemosApp() {

        HomePage home = new HomePage(driver);

        // ==================== ACTIONS ====================
        AnimationPage animationPage = home.goToAnimation();

        Assert.assertTrue(animationPage.isBouncingBallsDisplayed());
        Assert.assertTrue(animationPage.isCloningDisplayed());
        Assert.assertTrue(animationPage.isCustomEvaluatorDisplayed());
        Assert.assertTrue(animationPage.isDefaultLayoutAnimationDisplayed());
        Assert.assertTrue(animationPage.isEventsDisplayed());
        Assert.assertTrue(animationPage.isHideShowAnimationsDisplayed());
        Assert.assertTrue(animationPage.isLayoutAnimationsDisplayed());
        Assert.assertTrue(animationPage.isLoadingDisplayed());
        Assert.assertTrue(animationPage.isMultiplePropertiesDisplayed());
        Assert.assertTrue(animationPage.isReversingDisplayed());
        Assert.assertTrue(animationPage.isSeekingDisplayed());
        Assert.assertTrue(animationPage.isViewFlipDisplayed());

        BouncingBallsPage bouncingBallsPage = animationPage.goToBouncingBalls();
        bouncingBallsPage.goBack();
        CloningPage cloningPage = animationPage.goToCloning();
        cloningPage.goBack();
        CustomEvaluatorPage customEvaluatorPage = animationPage.goToCustomEvaluator();
        customEvaluatorPage.goBack();
        DefaultLayoutAnimationPage defaultLayoutAnimationPage = animationPage.goToDefaultLayoutAnimations();
        defaultLayoutAnimationPage.goBack();
        EventsPage eventsPage = animationPage.goToEvents();
        eventsPage.goBack();
        HideShowAnimationsPage hideShowAnimationsPage = animationPage.goToHideShowAnimations();
        hideShowAnimationsPage.goBack();
        LayoutAnimationsPage layoutAnimationsPage = animationPage.goToLayoutAnimations();
        layoutAnimationsPage.goBack();
        LoadingPage loadingPage = animationPage.goToLoading();
        loadingPage.goBack();
        MultiplePropertiesPage multiplePropertiesPage = animationPage.goToMultipleProperties();
        multiplePropertiesPage.goBack();
        ReversingPage reversingPage = animationPage.goToReversing();
        reversingPage.goBack();
        SeekingPage seekingPage = animationPage.goToSeeking();
        seekingPage.goBack();
        ViewFlipPage viewFlipPage = animationPage.goToViewFlip();
        viewFlipPage.goBack();
        animationPage.goBack();
    }
}
