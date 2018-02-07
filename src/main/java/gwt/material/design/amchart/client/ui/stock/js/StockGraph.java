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
package gwt.material.design.amchart.client.ui.stock.js;

//@formatter:off

import gwt.material.design.amchart.client.ui.chart.base.constants.GraphType;
import gwt.material.design.amchart.client.ui.chart.js.AmGraph;
import gwt.material.design.amchart.client.ui.stock.constants.PeriodValue;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

//TODO Migrate to EventBus class

/**
 * StockGraph displays graphs on StockPanel.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptstockchart/StockGraph">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class StockGraph extends AmGraph {

    @JsProperty
    private boolean comparable;

    @JsProperty
    private String compareField;

    @JsProperty
    private boolean compareFromStart;

    @JsProperty
    private AmGraph compareGraph;

    @JsProperty
    private String compareGraphBalloonColor;

    @JsProperty
    private Functions.Func compareGraphBalloonFunction;

    @JsProperty
    private String compareGraphBalloonText;

    @JsProperty
    private String compareGraphBullet;

    @JsProperty
    private double compareGraphBulletBorderAlpha;

    @JsProperty
    private String compareGraphBulletBorderColor;

    @JsProperty
    private double compareGraphBulletBorderThickness;

    @JsProperty
    private String compareGraphBulletColor;

    @JsProperty
    private double compareGraphBulletSize;

    @JsProperty
    private double compareGraphCornerRadiusTop;

    @JsProperty
    private double compareGraphDashLength;

    @JsProperty
    private double compareGraphFillAlphas;

    @JsProperty
    private String compareGraphFillColors;

    @JsProperty
    private double compareGraphLineAlpha;

    @JsProperty
    private String compareGraphLineColor;

    @JsProperty
    private double compareGraphLineThickness;

    @JsProperty
    private String compareGraphType;

    @JsProperty
    private boolean compareGraphVisibleInLegend;

    @JsProperty
    private String periodValue;

    @JsProperty
    private Object recalculateValue;

    @JsProperty
    private boolean showEventsOnComparedGraphs;

    @JsProperty
    private boolean useDataSetColors;

    @JsOverlay
    public final boolean isComparable() {
        return comparable;
    }

    /**
     * Specifies whether this graph will be compared if some data set is selected for comparing. Default to false
     */
    @JsOverlay
    public final void setComparable(boolean comparable) {
        this.comparable = comparable;
    }

    @JsOverlay
    public final String getCompareField() {
        return compareField;
    }

    /**
     * Specifies a field to be used to generate comparing graph. Note, this field is not the one used in your
     * dataProvider, but toField from FieldMapping object.
     */
    @JsOverlay
    public final void setCompareField(String compareField) {
        this.compareField = compareField;
    }

    @JsOverlay
    public final boolean isCompareFromStart() {
        return compareFromStart;
    }

    /**
     * If you set it to true, when data sets are compared, the graphs will use first value as a base value instead of
     * using the first value of selected period. Default to false
     */
    @JsOverlay
    public final void setCompareFromStart(boolean compareFromStart) {
        this.compareFromStart = compareFromStart;
    }

    @JsOverlay
    public final AmGraph getCompareGraph() {
        return compareGraph;
    }

    /**
     * You can use this property to set config of compared graphs. This allows you to set any of AmGraph properties on
     * compared graphs instead of using old-style properties like compareGraphBulletBorderThickness. For example:
     * stockGraph.compareGraph = {“bulletBorderThickness”:2, “lineAlpha”:0.4}.
     */
    @JsOverlay
    public final void setCompareGraph(AmGraph compareGraph) {
        this.compareGraph = compareGraph;
    }

    @JsOverlay
    public final String getCompareGraphBalloonColor() {
        return compareGraphBalloonColor;
    }

    @JsOverlay
    public final void setCompareGraphBalloonColor(Color compareGraphBalloonColor) {
        setCompareGraphBalloonColor(ColorHelper.setupComputedBackgroundColor(compareGraphBalloonColor));
    }

    /**
     * Balloon color of comparing graph.
     */
    @JsOverlay
    public final void setCompareGraphBalloonColor(String compareGraphBalloonColor) {
        this.compareGraphBalloonColor = compareGraphBalloonColor;
    }

    @JsOverlay
    public final Functions.Func getCompareGraphBalloonFunction() {
        return compareGraphBalloonFunction;
    }

    /**
     * If you set some function, the graph will call it and pass GraphDataItem and AmGraph object to it. This function
     * should return a string which will be displayed in a balloon. This will be used for graphs from compared data
     * sets only. Use balloonFunction for main data set's graphs.
     */
    @JsOverlay
    public final void setCompareGraphBalloonFunction(Functions.Func compareGraphBalloonFunction) {
        this.compareGraphBalloonFunction = compareGraphBalloonFunction;
    }

    @JsOverlay
    public final String getCompareGraphBalloonText() {
        return compareGraphBalloonText;
    }

    /**
     * Balloon text of comparing graph.
     */
    @JsOverlay
    public final void setCompareGraphBalloonText(String compareGraphBalloonText) {
        this.compareGraphBalloonText = compareGraphBalloonText;
    }

    @JsOverlay
    public final String getCompareGraphBullet() {
        return compareGraphBullet;
    }

    /**
     * Bullet of comparing graph. Possible values are: round, square, diamond, triangleUp, triangleDown, triangleLeft,
     * triangleRight, bubble
     */
    @JsOverlay
    public final void setCompareGraphBullet(String compareGraphBullet) {
        this.compareGraphBullet = compareGraphBullet;
    }

    @JsOverlay
    public final double getCompareGraphBulletBorderAlpha() {
        return compareGraphBulletBorderAlpha;
    }

    /**
     * Opacity of bullet border of comparing graph.
     */
    @JsOverlay
    public final void setCompareGraphBulletBorderAlpha(double compareGraphBulletBorderAlpha) {
        this.compareGraphBulletBorderAlpha = compareGraphBulletBorderAlpha;
    }

    @JsOverlay
    public final String getCompareGraphBulletBorderColor() {
        return compareGraphBulletBorderColor;
    }

    @JsOverlay
    public final void setCompareGraphBulletBorderColor(Color compareGraphBulletBorderColor) {
        setCompareGraphBulletBorderColor(ColorHelper.setupComputedBackgroundColor(compareGraphBulletBorderColor));
    }

    /**
     * Color of bullet border of comparing graph.
     */
    @JsOverlay
    public final void setCompareGraphBulletBorderColor(String compareGraphBulletBorderColor) {
        this.compareGraphBulletBorderColor = compareGraphBulletBorderColor;
    }

    @JsOverlay
    public final double getCompareGraphBulletBorderThickness() {
        return compareGraphBulletBorderThickness;
    }

    /**
     * Thickness of bullet border of comparing graph.
     */
    @JsOverlay
    public final void setCompareGraphBulletBorderThickness(double compareGraphBulletBorderThickness) {
        this.compareGraphBulletBorderThickness = compareGraphBulletBorderThickness;
    }

    @JsOverlay
    public final String getCompareGraphBulletColor() {
        return compareGraphBulletColor;
    }

    @JsOverlay
    public final void setCompareGraphBulletColor(Color compareGraphBulletColor) {
        setCompareGraphBulletColor(ColorHelper.setupComputedBackgroundColor(compareGraphBulletColor));
    }

    /**
     * Color of compared graphs' bullets.
     */
    @JsOverlay
    public final void setCompareGraphBulletColor(String compareGraphBulletColor) {
        this.compareGraphBulletColor = compareGraphBulletColor;
    }

    @JsOverlay
    public final double getCompareGraphBulletSize() {
        return compareGraphBulletSize;
    }

    /**
     * Bullet size of comparing graph.
     */
    @JsOverlay
    public final void setCompareGraphBulletSize(double compareGraphBulletSize) {
        this.compareGraphBulletSize = compareGraphBulletSize;
    }

    @JsOverlay
    public final double getCompareGraphCornerRadiusTop() {
        return compareGraphCornerRadiusTop;
    }

    /**
     * Corner radius of comparing graph (if type is "column").
     */
    @JsOverlay
    public final void setCompareGraphCornerRadiusTop(double compareGraphCornerRadiusTop) {
        this.compareGraphCornerRadiusTop = compareGraphCornerRadiusTop;
    }

    @JsOverlay
    public final double getCompareGraphDashLength() {
        return compareGraphDashLength;
    }

    /**
     * Dash length of compare graph.
     */
    @JsOverlay
    public final void setCompareGraphDashLength(double compareGraphDashLength) {
        this.compareGraphDashLength = compareGraphDashLength;
    }

    @JsOverlay
    public final double getCompareGraphFillAlphas() {
        return compareGraphFillAlphas;
    }

    /**
     * Fill alpha of comparing graph.
     */
    @JsOverlay
    public final void setCompareGraphFillAlphas(double compareGraphFillAlphas) {
        this.compareGraphFillAlphas = compareGraphFillAlphas;
    }

    @JsOverlay
    public final String getCompareGraphFillColors() {
        return compareGraphFillColors;
    }

    @JsOverlay
    public final void setCompareGraphFillColors(Color compareGraphFillColors) {
        setCompareGraphFillColors(ColorHelper.setupComputedBackgroundColor(compareGraphFillColors));
    }

    /**
     * Fill color of comparing graph.
     */
    @JsOverlay
    public final void setCompareGraphFillColors(String compareGraphFillColors) {
        this.compareGraphFillColors = compareGraphFillColors;
    }

    @JsOverlay
    public final double getCompareGraphLineAlpha() {
        return compareGraphLineAlpha;
    }

    /**
     * Opacity of comparing graph line.
     */
    @JsOverlay
    public final void setCompareGraphLineAlpha(double compareGraphLineAlpha) {
        this.compareGraphLineAlpha = compareGraphLineAlpha;
    }

    @JsOverlay
    public final String getCompareGraphLineColor() {
        return compareGraphLineColor;
    }

    @JsOverlay
    public final void setCompareGraphLineColor(Color compareGraphLineColor) {
        setCompareGraphLineColor(ColorHelper.setupComputedBackgroundColor(compareGraphLineColor));
    }

    /**
     * Color of compare graph (by default data set color is used)
     */
    @JsOverlay
    public final void setCompareGraphLineColor(String compareGraphLineColor) {
        this.compareGraphLineColor = compareGraphLineColor;
    }

    @JsOverlay
    public final double getCompareGraphLineThickness() {
        return compareGraphLineThickness;
    }

    /**
     * Thickness of compare graph.
     */
    @JsOverlay
    public final void setCompareGraphLineThickness(double compareGraphLineThickness) {
        this.compareGraphLineThickness = compareGraphLineThickness;
    }

    @JsOverlay
    public final String getCompareGraphType() {
        return compareGraphType;
    }

    /**
     * Type of comparing graph. Possible values are: "line", "column", "step", "smoothedLine." Default to "line"
     */
    @JsOverlay
    public final void setCompareGraphType(GraphType compareGraphType) {
        this.compareGraphType = compareGraphType.getName();
    }

    @JsOverlay
    public final boolean isCompareGraphVisibleInLegend() {
        return compareGraphVisibleInLegend;
    }

    /**
     * Specifies if compare graph is visible in legend. Default to true
     */
    @JsOverlay
    public final void setCompareGraphVisibleInLegend(boolean compareGraphVisibleInLegend) {
        this.compareGraphVisibleInLegend = compareGraphVisibleInLegend;
    }

    @JsOverlay
    public final String getPeriodValue() {
        return periodValue;
    }

    /**
     * When data is grouped to periods, the graph must know which period value should be used.
     * Possible values are: "Open", "Low", "High", "Close", "Average" and "Sum". Default to "Close"
     */
    @JsOverlay
    public final void setPeriodValue(PeriodValue periodValue) {
        this.periodValue = periodValue.getName();
    }

    @JsOverlay
    public final Object getRecalculateValue() {
        return recalculateValue;
    }

    /**
     * Possible values are Open, Close, High, Low, Average and Sum. There is no default value set – graph uses it’s
     * periodValue when calculating changes. For example, the graph’s periodValue is Close. This means that when data
     * is grouped to longer periods (months for example) when recalculating, the graph will use Close value of the
     * first period of the selection as base value and will compare each months Close value to it. If you set
     * recalculateValue to Open, the first value of a month will be used as base value.
     */
    @JsOverlay
    public final void setRecalculateValue(Object recalculateValue) {
        this.recalculateValue = recalculateValue;
    }

    @JsOverlay
    public final boolean isShowEventsOnComparedGraphs() {
        return showEventsOnComparedGraphs;
    }

    /**
     * Specifies if events of compared graphs should be shown. Default to false
     */
    @JsOverlay
    public final void setShowEventsOnComparedGraphs(boolean showEventsOnComparedGraphs) {
        this.showEventsOnComparedGraphs = showEventsOnComparedGraphs;
    }

    @JsOverlay
    public final boolean isUseDataSetColors() {
        return useDataSetColors;
    }

    /**
     * Specifies whether data set color should be used as this graph's lineColor. By default all graphs from the same
     * data set will have a color from its relative DataSet (either auto-assigned by chart or set by color parameter).
     * The graph's color properties will be ignored.
     * <p>
     * To disable this behavior, set "useDataSetColors" to false. This way the chart will use graph's own color settings,
     * such as "lineColor" or auto-assign the color if those are not set.
     */
    @JsOverlay
    public final void setUseDataSetColors(boolean useDataSetColors) {
        this.useDataSetColors = useDataSetColors;
    }
}
