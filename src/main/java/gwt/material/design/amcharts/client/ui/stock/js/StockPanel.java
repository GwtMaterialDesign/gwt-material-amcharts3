/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.amcharts.client.ui.stock.js;

//@formatter:off

import gwt.material.design.amcharts.client.ui.chart.js.options.AmValueAxis;
import gwt.material.design.amcharts.client.ui.stock.constants.RecalculateToPercents;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.*;

import java.util.Date;

/**
 * AreasSettings is a class which defines the default settings for all MapArea objects.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/AreasSettings">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class StockPanel {

    @JsProperty
    public double percentHeight;
    @JsProperty
    private boolean allowTurningOff;
    @JsProperty
    private boolean drawingIconsEnabled;
    @JsProperty
    private AmValueAxis drawOnAxis;
    @JsProperty
    private boolean eraseAll;
    @JsProperty
    private int iconSize;
    @JsProperty
    private Date recalculateFromDate;

    @JsProperty
    private String recalculateToPercents;

    @JsProperty
    private boolean showCategoryAxis;

    @JsProperty
    private boolean showComparedOnTop;

    @JsProperty
    private StockGraph[] stockGraphs;

    @JsProperty
    private StockLegend stockLegend;

    @JsProperty
    private String title;

    @JsProperty
    private double trendLineAlpha;

    @JsProperty
    private String trendLineColor;

    @JsProperty
    private double trendLineDashLength;

    @JsProperty
    private double trendLineThickness;

    @JsOverlay
    public final boolean isAllowTurningOff() {
        return allowTurningOff;
    }

    /**
     * Specifies whether x button will be displayed near the panel. This button allows turning panel off.
     * Default to false
     */
    @JsOverlay
    public final void setAllowTurningOff(boolean allowTurningOff) {
        this.allowTurningOff = allowTurningOff;
    }

    /**
     * Adds a graph to the panel.
     */
    @JsMethod
    public native void addStockGraph(StockGraph graph);

    /**
     * Toggles trend line eraser mode. Same as clicking on an eraser icon.
     */
    @JsMethod
    public native void handleEraserClick();

    /**
     * Toggles between regular and drawing of trend lines mode.
     */
    @JsMethod
    public native void handlePencilClick();

    /**
     * Removes graph from the panel.
     */
    @JsMethod
    public native void removeStockGraph(StockGraph graph);

    @JsOverlay
    public final boolean isDrawingIconsEnabled() {
        return drawingIconsEnabled;
    }

    /**
     * If true, drawing icons will be displayed in top-right corner.
     * Default to false
     */
    @JsOverlay
    public final void setDrawingIconsEnabled(boolean drawingIconsEnabled) {
        this.drawingIconsEnabled = drawingIconsEnabled;
    }

    @JsOverlay
    public final AmValueAxis getDrawOnAxis() {
        return drawOnAxis;
    }

    /**
     * Specifies on which value axis user can draw trend lines. Set drawingIconsEnabled to true if you want drawing icons
     * to be visible. First value axis will be used if not set here. You can use a reference to the value axis object
     * or id of value axis.
     */
    @JsOverlay
    public final void setDrawOnAxis(AmValueAxis drawOnAxis) {
        this.drawOnAxis = drawOnAxis;
    }

    @JsOverlay
    public final boolean isEraseAll() {
        return eraseAll;
    }

    /**
     * Specifies if all trend lines should be erased when erase button is clicked. If false, trend lines can be erased
     * one by one. Default to false
     */
    @JsOverlay
    public final void setEraseAll(boolean eraseAll) {
        this.eraseAll = eraseAll;
    }

    @JsOverlay
    public final int getIconSize() {
        return iconSize;
    }

    /**
     * Size of trend line drawing icons. If you change this size, you should update icon images if you want them to
     * look properly. Default to 18
     */
    @JsOverlay
    public final void setIconSize(int iconSize) {
        this.iconSize = iconSize;
    }

    public double getPercentHeight() {
        return percentHeight;
    }

    /**
     * Relative height of panel. Possible values 0 - 100.
     */
    public void setPercentHeight(double percentHeight) {
        this.percentHeight = percentHeight;
    }

    @JsOverlay
    public final Date getRecalculateFromDate() {
        return recalculateFromDate;
    }

    /**
     * Specifies from which date's value should be used as base when recalculating values to percent.
     */
    @JsOverlay
    public final void setRecalculateFromDate(Date recalculateFromDate) {
        this.recalculateFromDate = recalculateFromDate;
    }

    @JsOverlay
    public final String getRecalculateToPercents() {
        return recalculateToPercents;
    }

    /**
     * Specifies when values should be recalculated to percents. Possible values are: "never", "always", "whenComparing".
     * Default to "whenComparing"
     */
    @JsOverlay
    public final void setRecalculateToPercents(RecalculateToPercents recalculateToPercents) {
        this.recalculateToPercents = recalculateToPercents.getName();
    }

    @JsOverlay
    public final boolean isShowCategoryAxis() {
        return showCategoryAxis;
    }

    /**
     * Specifies whether this panel will show category axis. Default to true
     */
    @JsOverlay
    public final void setShowCategoryAxis(boolean showCategoryAxis) {
        this.showCategoryAxis = showCategoryAxis;
    }

    @JsOverlay
    public final boolean isShowComparedOnTop() {
        return showComparedOnTop;
    }

    /**
     * Specifies if compared graphs should be shown above or behind the main graph. Default to true
     */
    @JsOverlay
    public final void setShowComparedOnTop(boolean showComparedOnTop) {
        this.showComparedOnTop = showComparedOnTop;
    }

    @JsOverlay
    public final StockGraph[] getStockGraphs() {
        return stockGraphs;
    }

    /**
     * Array of stock graphs.
     */
    @JsOverlay
    public final void setStockGraphs(StockGraph[] stockGraphs) {
        this.stockGraphs = stockGraphs;
    }

    @JsOverlay
    public final StockLegend getStockLegend() {
        return stockLegend;
    }

    /**
     * Stock chart legend.
     */
    @JsOverlay
    public final void setStockLegend(StockLegend stockLegend) {
        this.stockLegend = stockLegend;
    }

    @JsOverlay
    public final String getTitle() {
        return title;
    }

    /**
     * A title of a panel. Note, StockLegend should be added in order title to be displayed.
     */
    @JsOverlay
    public final void setTitle(String title) {
        this.title = title;
    }

    @JsOverlay
    public final double getTrendLineAlpha() {
        return trendLineAlpha;
    }

    /**
     * Trend line opacity. Default to 1
     */
    @JsOverlay
    public final void setTrendLineAlpha(double trendLineAlpha) {
        this.trendLineAlpha = trendLineAlpha;
    }

    @JsOverlay
    public final String getTrendLineColor() {
        return trendLineColor;
    }

    @JsOverlay
    public final void setTrendLineColor(Color trendLineColor) {
        setTrendLineColor(ColorHelper.setupComputedBackgroundColor(trendLineColor));
    }

    /**
     * Trend line color. Default to #00CC00
     */
    @JsOverlay
    public final void setTrendLineColor(String trendLineColor) {
        this.trendLineColor = trendLineColor;
    }

    @JsOverlay
    public final double getTrendLineDashLength() {
        return trendLineDashLength;
    }

    /**
     * Trend line dash length. Default to 0
     */
    @JsOverlay
    public final void setTrendLineDashLength(double trendLineDashLength) {
        this.trendLineDashLength = trendLineDashLength;
    }

    @JsOverlay
    public final double getTrendLineThickness() {
        return trendLineThickness;
    }

    /**
     * Trend line thickness. Default to 2
     */
    @JsOverlay
    public final void setTrendLineThickness(double trendLineThickness) {
        this.trendLineThickness = trendLineThickness;
    }
}
