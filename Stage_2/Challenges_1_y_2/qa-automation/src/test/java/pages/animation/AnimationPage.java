package pages.animation;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class AnimationPage extends BasePage {

    // ==================== LOCATORS ====================

    private final By bouncingBallsLocator = AppiumBy.accessibilityId("Bouncing Balls");
    private final By cloningLocator = AppiumBy.accessibilityId("Cloning");
    private final By customEvaluatorLocator = AppiumBy.accessibilityId("Custom Evaluator");
    private final By defaultLayoutAnimationsLocator = AppiumBy.accessibilityId("Default Layout Animations");
    private final By eventsLocator = AppiumBy.accessibilityId("Events");
    private final By hideShowAnimationsLocator = AppiumBy.accessibilityId("Hide-Show Animations");
    private final By layoutAnimationsLocator = AppiumBy.accessibilityId("Layout Animations");
    private final By loadingLocator = AppiumBy.accessibilityId("Loading");
    private final By multiplePropertiesLocator = AppiumBy.accessibilityId("Multiple Properties");
    private final By reversingLocator = AppiumBy.accessibilityId("Reversing");
    private final By seekingLocator = AppiumBy.accessibilityId("Seeking");
    private final By viewFlipLocator = AppiumBy.accessibilityId("View Flip");

    public AnimationPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public BouncingBallsPage goToBouncingBalls() {
        driver.findElement(bouncingBallsLocator).click();
        return new BouncingBallsPage(driver);
    }

    public CloningPage goToCloning() {
        driver.findElement(cloningLocator).click();
        return new CloningPage(driver);
    }

    public CustomEvaluatorPage goToCustomEvaluator() {
        driver.findElement(customEvaluatorLocator).click();
        return new CustomEvaluatorPage(driver);
    }

    public DefaultLayoutAnimationPage goToDefaultLayoutAnimations() {
        driver.findElement(defaultLayoutAnimationsLocator).click();
        return new DefaultLayoutAnimationPage(driver);
    }

    public EventsPage goToEvents() {
        driver.findElement(eventsLocator).click();
        return new EventsPage(driver);
    }

    public HideShowAnimationsPage goToHideShowAnimations() {
        driver.findElement(hideShowAnimationsLocator).click();
        return new HideShowAnimationsPage(driver);
    }

    public LayoutAnimationsPage goToLayoutAnimations() {
        driver.findElement(layoutAnimationsLocator).click();
        return new LayoutAnimationsPage(driver);
    }

    public LoadingPage goToLoading() {
        driver.findElement(loadingLocator).click();
        return new LoadingPage(driver);
    }

    public MultiplePropertiesPage goToMultipleProperties() {
        driver.findElement(multiplePropertiesLocator).click();
        return new MultiplePropertiesPage(driver);
    }

    public ReversingPage goToReversing() {
        driver.findElement(reversingLocator).click();
        return new ReversingPage(driver);
    }

    public SeekingPage goToSeeking() {
        driver.findElement(seekingLocator).click();
        return new SeekingPage(driver);
    }

    public ViewFlipPage goToViewFlip() {
        driver.findElement(viewFlipLocator).click();
        return new ViewFlipPage(driver);
    }

    // ==================== ASSERTIONS ===================

    public boolean isBouncingBallsDisplayed() {
        return driver.findElement(bouncingBallsLocator).isDisplayed();
    }

    public boolean isCloningDisplayed() {
        return driver.findElement(cloningLocator).isDisplayed();
    }

    public boolean isCustomEvaluatorDisplayed() {
        return driver.findElement(customEvaluatorLocator).isDisplayed();
    }

    public boolean isDefaultLayoutAnimationDisplayed() {
        return driver.findElement(defaultLayoutAnimationsLocator).isDisplayed();
    }

    public boolean isEventsDisplayed() {
        return driver.findElement(eventsLocator).isDisplayed();
    }

    public boolean isHideShowAnimationsDisplayed() {
        return driver.findElement(hideShowAnimationsLocator).isDisplayed();
    }

    public boolean isLayoutAnimationsDisplayed() {
        return driver.findElement(layoutAnimationsLocator).isDisplayed();
    }

    public boolean isLoadingDisplayed() {
        return driver.findElement(loadingLocator).isDisplayed();
    }

    public boolean isMultiplePropertiesDisplayed() {
        return driver.findElement(multiplePropertiesLocator).isDisplayed();
    }

    public boolean isReversingDisplayed() {
        return driver.findElement(reversingLocator).isDisplayed();
    }

    public boolean isSeekingDisplayed() {
        return driver.findElement(seekingLocator).isDisplayed();
    }

    public boolean isViewFlipDisplayed() {
        return driver.findElement(viewFlipLocator).isDisplayed();
    }
}
