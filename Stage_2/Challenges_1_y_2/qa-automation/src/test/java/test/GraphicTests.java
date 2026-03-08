package test;

import org.junit.Assert;
import org.junit.Test;

import pages.HomePage;
import pages.graphics.AlphaBitmapPage;
import pages.graphics.AnimateDrawablesPage;
import pages.graphics.ArcsPage;
import pages.graphics.BitmapMeshPage;
import pages.graphics.ColorFiltersPage;
import pages.graphics.ColorMatrixPage;
import pages.graphics.CompassPage;
import pages.graphics.CreateBitmapPage;
import pages.graphics.DensityPage;
import pages.graphics.DrawablePage;
import pages.graphics.FingerPaintPage;
import pages.graphics.GraphicsPage;
import pages.graphics.LayersPage;
import pages.graphics.MeasureTextPage;
import pages.graphics.OpenGLESPage;
import pages.graphics.PathEffectsPage;
import pages.graphics.PathFillTypesPage;
import pages.graphics.PatternsPage;
import pages.graphics.PointsPage;
import pages.graphics.PolyToPolyPage;
import pages.graphics.PurgeableBitmapPage;
import pages.graphics.RegionsPage;
import pages.graphics.RoundRectsPage;
import pages.graphics.ScaleToFitPage;
import pages.graphics.SurfaceViewOverlayPage;
import pages.graphics.SurfaceWindowPage;
import pages.graphics.SweepPage;
import pages.graphics.TextAlignPage;
import pages.graphics.TouchPaintPage;
import pages.graphics.UnicodeChartPage;
import pages.graphics.VerticesPage;
import pages.graphics.XfermodesPage;

public class GraphicTests extends BaseTest {

    @Test
    public void browseFromApiDemosApp() {

        HomePage home = new HomePage(driver);

        // ==================== ACTIONS ====================

        GraphicsPage graphicsPage = home.goToGraphics();

        Assert.assertTrue(graphicsPage.isAlphaBitMapDisplayed());
        Assert.assertTrue(graphicsPage.isAnimateDrawablesDisplayed());
        Assert.assertTrue(graphicsPage.isArcsDisplayed());
        Assert.assertTrue(graphicsPage.isBitmapMeshDisplayed());
        Assert.assertTrue(graphicsPage.isColorFiltersDisplayed());
        Assert.assertTrue(graphicsPage.isColorMatrixDisplayed());
        Assert.assertTrue(graphicsPage.isCompassDisplayed());
        Assert.assertTrue(graphicsPage.isCreateBitmapDisplayed());
        Assert.assertTrue(graphicsPage.isDensityDisplayed());
        Assert.assertTrue(graphicsPage.isDrawableDisplayed());
        Assert.assertTrue(graphicsPage.isFingerPaintDisplayed());
        Assert.assertTrue(graphicsPage.isLayersDisplayed());
        Assert.assertTrue(graphicsPage.isMeasureTextDisplayed());
        Assert.assertTrue(graphicsPage.isOpenGLESDisplayed());
        Assert.assertTrue(graphicsPage.isPathEffectsDisplayed());
        Assert.assertTrue(graphicsPage.isPathFillTypesDisplayed());
        Assert.assertTrue(graphicsPage.isPatternsDisplayed());
        Assert.assertTrue(graphicsPage.isPointsDisplayed());
        Assert.assertTrue(graphicsPage.isPolyToPolyDisplayed());
        Assert.assertTrue(graphicsPage.isPurgeableBitmapDisplayed());
        Assert.assertTrue(graphicsPage.isRegionsDisplayed());
        Assert.assertTrue(graphicsPage.isRoundRectsDisplayed());
        Assert.assertTrue(graphicsPage.isScaleToFitDisplayed());
        Assert.assertTrue(graphicsPage.isSurfaceViewOverlayDisplayed());
        Assert.assertTrue(graphicsPage.isSurfaceWindowDisplayed());
        Assert.assertTrue(graphicsPage.isSweepDisplayed());
        Assert.assertTrue(graphicsPage.isTextAlignDisplayed());
        Assert.assertTrue(graphicsPage.isTouchPaintDisplayed());
        Assert.assertTrue(graphicsPage.isUnicodeChartDisplayed());
        Assert.assertTrue(graphicsPage.isVerticesDisplayed());
        Assert.assertTrue(graphicsPage.isXfermodesDisplayed());

        graphicsPage.scrollToTop();

        AlphaBitmapPage alphaBitmapPage = graphicsPage.goToAlphaBitmap();
        alphaBitmapPage.goBack();
        AnimateDrawablesPage animateDrawablesPage = graphicsPage.goToAnimateDrawables();
        animateDrawablesPage.goBack();
        ArcsPage arcsPage = graphicsPage.goToArcs();
        arcsPage.goBack();
        BitmapMeshPage bitmapMeshPage = graphicsPage.goToBitmapMesh();
        bitmapMeshPage.goBack();
        ColorFiltersPage colorFiltersPage = graphicsPage.goToColorFilters();
        colorFiltersPage.goBack();
        ColorMatrixPage colorMatrixPage = graphicsPage.goToColorMatrix();
        colorMatrixPage.goBack();
        CompassPage compassPage = graphicsPage.goToCompass();
        compassPage.goBack();
        CreateBitmapPage createBitmapPage = graphicsPage.goToCreateBitmap();
        createBitmapPage.goBack();
        DensityPage densityPage = graphicsPage.goToDensity();
        densityPage.goBack();
        DrawablePage drawablePage = graphicsPage.goToDrawable();
        drawablePage.goBack();
        FingerPaintPage fingerPaintPage = graphicsPage.goToFingerPaint();
        fingerPaintPage.goBack();
        LayersPage layersPage = graphicsPage.goToLayers();
        layersPage.goBack();
        MeasureTextPage measureTextPage = graphicsPage.goToMeasureText();
        measureTextPage.goBack();
        OpenGLESPage openGLESPage = graphicsPage.goToOpenGLES();
        openGLESPage.goBack();
        PathEffectsPage pathEffectsPage = graphicsPage.goToPathEffects();
        pathEffectsPage.goBack();
        PathFillTypesPage pathFillTypesPage = graphicsPage.goToPathFillTypes();
        pathFillTypesPage.goBack();
        PatternsPage patternsPage = graphicsPage.goToPatterns();
        patternsPage.goBack();
        PointsPage pointsPage = graphicsPage.goToPoints();
        pointsPage.goBack();
        PolyToPolyPage polyToPolyPage = graphicsPage.goToPolyToPoly();
        polyToPolyPage.goBack();
        PurgeableBitmapPage purgeableBitmapPage = graphicsPage.goToPurgeableBitmap();
        purgeableBitmapPage.goBack();
        RegionsPage regionsPage = graphicsPage.goToRegions();
        regionsPage.goBack();
        RoundRectsPage roundRectsPage = graphicsPage.goToRoundRects();
        roundRectsPage.goBack();
        ScaleToFitPage scaleToFitPage = graphicsPage.goToScaleToFit();
        scaleToFitPage.goBack();
        SurfaceViewOverlayPage surfaceViewOverlayPage = graphicsPage.goToSurfaceViewOverlay();
        surfaceViewOverlayPage.goBack();
        SurfaceWindowPage surfaceWindowPage = graphicsPage.goToSurfaceWindow();
        surfaceWindowPage.goBack();
        SweepPage sweepPage = graphicsPage.goToSweep();
        sweepPage.goBack();
        TextAlignPage textAlignPage = graphicsPage.goToTextAlign();
        textAlignPage.goBack();
        TouchPaintPage touchPaintPage = graphicsPage.goToTouchPaint();
        touchPaintPage.goBack();
        UnicodeChartPage unicodeChartPage = graphicsPage.goToUnicodeChart();
        unicodeChartPage.goBack();
        VerticesPage verticesPage = graphicsPage.goToVertices();
        verticesPage.goBack();
        XfermodesPage xfermodesPage = graphicsPage.goToXfermodes();
        xfermodesPage.goBack();

        graphicsPage.goBack();
    }
}
