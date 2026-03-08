package pages.graphics;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import pages.BasePage;

public class GraphicsPage extends BasePage {

    // ==================== LOCATORS ====================

    private final By alphaBitMapLocator = AppiumBy.accessibilityId("AlphaBitmap");
    private final By animateDrawablesLocator = AppiumBy.accessibilityId("AnimateDrawables");
    private final By arcsLocator = AppiumBy.accessibilityId("Arcs");
    private final By bitmapMeshLocator = AppiumBy.accessibilityId("BitmapMesh");
    private final By colorFiltersLocator = AppiumBy.accessibilityId("ColorFilters");
    private final By colorMatrixLocator = AppiumBy.accessibilityId("ColorMatrix");
    private final By compassLocator = AppiumBy.accessibilityId("Compass");
    private final By createBitmapLocator = AppiumBy.accessibilityId("CreateBitmap");
    private final By densityLocator = AppiumBy.accessibilityId("Density");
    private final By drawableLocator = AppiumBy.accessibilityId("Drawable");
    private final By fingerPaintLocator = AppiumBy.accessibilityId("FingerPaint");
    private final By layersLocator = AppiumBy.accessibilityId("Layers");
    private final By measureTextLocator = AppiumBy.accessibilityId("MeasureText");
    private final By openGLESLocator = AppiumBy.accessibilityId("OpenGL ES");
    private final By pathEffectsLocator = AppiumBy.accessibilityId("PathEffects");
    private final By pathFillTypesLocator = AppiumBy.accessibilityId("PathFillTypes");
    private final By patternsLocator = AppiumBy.accessibilityId("Patterns");
    private final By pointsLocator = AppiumBy.accessibilityId("Points");
    private final By polyToPolyLocator = AppiumBy.accessibilityId("PolyToPoly");
    private final By purgeableBitmapLocator = AppiumBy.accessibilityId("PurgeableBitmap");
    private final By regionsLocator = AppiumBy.accessibilityId("Regions");
    private final By roundRectsLocator = AppiumBy.accessibilityId("RoundRects");
    private final By scaleToFitLocator = AppiumBy.accessibilityId("ScaleToFit");
    private final By surfaceWindowLocator = AppiumBy.accessibilityId("Surface Window");
    private final By surfaceViewOverlayLocator = AppiumBy.accessibilityId("SurfaceView Overlay");
    private final By sweepLocator = AppiumBy.accessibilityId("Sweep");
    private final By textAlignLocator = AppiumBy.accessibilityId("Text Align");
    private final By touchPaintLocator = AppiumBy.accessibilityId("Touch Paint");
    private final By unicodeChartLocator = AppiumBy.accessibilityId("UnicodeChart");
    private final By verticesLocator = AppiumBy.accessibilityId("Vertices");
    private final By xfermodesLocator = AppiumBy.accessibilityId("Xfermodes");

    public GraphicsPage(AndroidDriver driver) {
        super(driver);
    }

    // ==================== ACTIONS ====================

    public AlphaBitmapPage goToAlphaBitmap() {
        waitForElementToBeClickable(alphaBitMapLocator).click();
        return new AlphaBitmapPage(driver);
    }

    public AnimateDrawablesPage goToAnimateDrawables() {
        waitForElementToBeClickable(animateDrawablesLocator).click();
        return new AnimateDrawablesPage(driver);
    }

    public ArcsPage goToArcs() {
        waitForElementToBeClickable(arcsLocator).click();
        return new ArcsPage(driver);
    }

    public BitmapMeshPage goToBitmapMesh() {
        waitForElementToBeClickable(bitmapMeshLocator).click();
        return new BitmapMeshPage(driver);
    }

    public ColorFiltersPage goToColorFilters() {
        waitForElementToBeClickable(colorFiltersLocator).click();
        return new ColorFiltersPage(driver);
    }

    public ColorMatrixPage goToColorMatrix() {
        waitForElementToBeClickable(colorMatrixLocator).click();
        return new ColorMatrixPage(driver);
    }

    public CompassPage goToCompass() {
        waitForElementToBeClickable(compassLocator).click();
        return new CompassPage(driver);
    }

    public CreateBitmapPage goToCreateBitmap() {
        waitForElementToBeClickable(createBitmapLocator).click();
        return new CreateBitmapPage(driver);
    }

    public DensityPage goToDensity() {
        waitForElementToBeClickable(densityLocator).click();
        return new DensityPage(driver);
    }

    public DrawablePage goToDrawable() {
        waitForElementToBeClickable(drawableLocator).click();
        return new DrawablePage(driver);
    }

    public FingerPaintPage goToFingerPaint() {
        waitForElementToBeClickable(fingerPaintLocator).click();
        return new FingerPaintPage(driver);
    }

    public LayersPage goToLayers() {
        waitForElementToBeClickable(layersLocator).click();
        return new LayersPage(driver);
    }

    public MeasureTextPage goToMeasureText() {
        waitForElementToBeClickable(measureTextLocator).click();
        return new MeasureTextPage(driver);
    }

    public OpenGLESPage goToOpenGLES() {
        waitForElementToBeClickable(openGLESLocator).click();
        return new OpenGLESPage(driver);
    }

    public PathEffectsPage goToPathEffects() {
        waitForElementToBeClickable(pathEffectsLocator).click();
        return new PathEffectsPage(driver);
    }

    public PathFillTypesPage goToPathFillTypes() {
        waitForElementToBeClickable(pathFillTypesLocator).click();
        return new PathFillTypesPage(driver);
    }

    public PatternsPage goToPatterns() {
        waitForElementToBeClickable(patternsLocator).click();
        return new PatternsPage(driver);
    }

    public PointsPage goToPoints() {
        waitForElementToBeClickable(pointsLocator).click();
        return new PointsPage(driver);
    }

    public PolyToPolyPage goToPolyToPoly() {
        waitForElementToBeClickable(polyToPolyLocator).click();
        return new PolyToPolyPage(driver);
    }

    public PurgeableBitmapPage goToPurgeableBitmap() {
        waitForElementToBeClickable(purgeableBitmapLocator).click();
        return new PurgeableBitmapPage(driver);
    }

    public RegionsPage goToRegions() {
        waitForElementToBeClickable(regionsLocator).click();
        return new RegionsPage(driver);
    }

    public RoundRectsPage goToRoundRects() {
        waitForElementToBeClickable(roundRectsLocator).click();
        return new RoundRectsPage(driver);
    }

    public ScaleToFitPage goToScaleToFit() {
        waitForElementToBeClickable(scaleToFitLocator).click();
        return new ScaleToFitPage(driver);
    }

    public SurfaceViewOverlayPage goToSurfaceViewOverlay() {
        waitForElementToBeClickable(surfaceViewOverlayLocator).click();
        return new SurfaceViewOverlayPage(driver);
    }

    public SurfaceWindowPage goToSurfaceWindow() {
        waitForElementToBeClickable(surfaceWindowLocator).click();
        return new SurfaceWindowPage(driver);
    }

    public SweepPage goToSweep() {
        waitForElementToBeClickable(sweepLocator).click();
        return new SweepPage(driver);
    }

    public TextAlignPage goToTextAlign() {
        waitForElementToBeClickable(textAlignLocator).click();
        return new TextAlignPage(driver);
    }

    public TouchPaintPage goToTouchPaint() {
        waitForElementToBeClickable(touchPaintLocator).click();
        return new TouchPaintPage(driver);
    }

    public UnicodeChartPage goToUnicodeChart() {
        waitForElementToBeClickable(unicodeChartLocator).click();
        return new UnicodeChartPage(driver);
    }

    public VerticesPage goToVertices() {
        waitForElementToBeClickable(verticesLocator).click();
        return new VerticesPage(driver);
    }

    public XfermodesPage goToXfermodes() {
        waitForElementToBeClickable(xfermodesLocator).click();
        return new XfermodesPage(driver);
    }

    // ==================== ASSERTIONS ====================

    public boolean isAlphaBitMapDisplayed() {
        return waitForElement(alphaBitMapLocator).isDisplayed();
    }

    public boolean isAnimateDrawablesDisplayed() {
        return waitForElement(animateDrawablesLocator).isDisplayed();
    }

    public boolean isArcsDisplayed() {
        return waitForElement(arcsLocator).isDisplayed();
    }

    public boolean isBitmapMeshDisplayed() {
        return waitForElement(bitmapMeshLocator).isDisplayed();
    }

    public boolean isColorFiltersDisplayed() {
        return waitForElement(colorFiltersLocator).isDisplayed();
    }

    public boolean isColorMatrixDisplayed() {
        return waitForElement(colorMatrixLocator).isDisplayed();
    }

    public boolean isCompassDisplayed() {
        return waitForElement(compassLocator).isDisplayed();
    }

    public boolean isCreateBitmapDisplayed() {
        return waitForElement(createBitmapLocator).isDisplayed();
    }

    public boolean isDensityDisplayed() {
        return waitForElement(densityLocator).isDisplayed();
    }

    public boolean isDrawableDisplayed() {
        return waitForElement(drawableLocator).isDisplayed();
    }

    public boolean isFingerPaintDisplayed() {
        return waitForElement(fingerPaintLocator).isDisplayed();
    }

    public boolean isLayersDisplayed() {
        return waitForElement(layersLocator).isDisplayed();
    }

    public boolean isMeasureTextDisplayed() {
        return waitForElement(measureTextLocator).isDisplayed();
    }

    public boolean isOpenGLESDisplayed() {
        return waitForElement(openGLESLocator).isDisplayed();
    }

    public boolean isPathEffectsDisplayed() {
        return waitForElement(pathEffectsLocator).isDisplayed();
    }

    public boolean isPathFillTypesDisplayed() {
        return waitForElement(pathFillTypesLocator).isDisplayed();
    }

    public boolean isPatternsDisplayed() {
        return waitForElement(patternsLocator).isDisplayed();
    }

    public boolean isPointsDisplayed() {
        return waitForElement(pointsLocator).isDisplayed();
    }

    public boolean isPolyToPolyDisplayed() {
        return waitForElement(polyToPolyLocator).isDisplayed();
    }

    public boolean isPurgeableBitmapDisplayed() {
        return waitForElement(purgeableBitmapLocator).isDisplayed();
    }

    public boolean isRegionsDisplayed() {
        return waitForElement(regionsLocator).isDisplayed();
    }

    public boolean isRoundRectsDisplayed() {
        return waitForElement(roundRectsLocator).isDisplayed();
    }

    public boolean isScaleToFitDisplayed() {
        return waitForElement(scaleToFitLocator).isDisplayed();
    }

    public boolean isSurfaceViewOverlayDisplayed() {
        return waitForElement(surfaceViewOverlayLocator).isDisplayed();
    }

    public boolean isSurfaceWindowDisplayed() {
        return waitForElement(surfaceWindowLocator).isDisplayed();
    }

    public boolean isSweepDisplayed() {
        return waitForElement(sweepLocator).isDisplayed();
    }

    public boolean isTextAlignDisplayed() {
        return waitForElement(textAlignLocator).isDisplayed();
    }

    public boolean isTouchPaintDisplayed() {
        return waitForElement(touchPaintLocator).isDisplayed();
    }

    public boolean isUnicodeChartDisplayed() {
        return waitForElement(unicodeChartLocator).isDisplayed();
    }

    public boolean isVerticesDisplayed() {
        return waitForElement(verticesLocator).isDisplayed();
    }

    public boolean isXfermodesDisplayed() {
        return waitForElement(xfermodesLocator).isDisplayed();
    }
}
