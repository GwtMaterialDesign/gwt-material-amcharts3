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

import gwt.material.design.amchart.client.ui.chart.base.constants.ChartScrollbarPosition;
import gwt.material.design.amchart.client.ui.chart.base.constants.GraphType;
import gwt.material.design.amchart.client.ui.chart.js.AmGraph;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * ChartScrollbarSettings settings set's settings for chart scrollbar. If you change a property after the chart is
 * initialized, you should call stockChart.validateNow() method in order for it to work. If there is no default value
 * specified, default value of ChartScrollbar class will be used.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptstockchart/ChartScrollbarSettings">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ChartScrollbarSettings {

    @JsProperty
    private boolean autoGridCount;

    @JsProperty
    private double backgroundAlpha;

    @JsProperty
    private String backgroundColor;

    @JsProperty
    private String color;

    @JsProperty
    private double dragIconHeight;

    @JsProperty
    private double dragIconWidth;

    @JsProperty
    private boolean enabled;

    @JsProperty
    private double fontSize;

    @JsProperty
    private AmGraph graph;

    @JsProperty
    private double graphFillAlpha;

    @JsProperty
    private String graphFillColor;

    @JsProperty
    private double graphLineAlpha;

    @JsProperty
    private String graphLineColor;

    @JsProperty
    private String graphType;

    @JsProperty
    private double gridAlpha;

    @JsProperty
    private String gridColor;

    @JsProperty
    private int gridCount;

    @JsProperty
    private double height;

    @JsProperty
    private boolean hideResizeGrips;

    @JsProperty
    private boolean markPeriodChange;

    @JsProperty
    private String position;

    @JsProperty
    private boolean resizeEnabled;

    @JsProperty
    private double scrollDuration;

    @JsProperty
    private double selectedBackgroundAlpha;

    @JsProperty
    private String selectedBackgroundColor;

    @JsProperty
    private double selectedGraphFillAlpha;

    @JsProperty
    private String selectedGraphFillColor;

    @JsProperty
    private double selectedGraphLineAlpha;

    @JsProperty
    private String selectedGraphLineColor;

    @JsProperty
    private boolean updateOnReleaseOnly;

    @JsProperty
    private String usePeriod;

    @JsOverlay
    public final boolean isAutoGridCount() {
        return autoGridCount;
    }

    /**
     * Specifies whether number of gridCount is specified automatically, according to the axis size. Default to true
     */
    @JsOverlay
    public final void setAutoGridCount(boolean autoGridCount) {
        this.autoGridCount = autoGridCount;
    }

    @JsOverlay
    public final double getBackgroundAlpha() {
        return backgroundAlpha;
    }

    /**
     * Background opacity.
     */
    @JsOverlay
    public final void setBackgroundAlpha(double backgroundAlpha) {
        this.backgroundAlpha = backgroundAlpha;
    }

    @JsOverlay
    public final String getBackgroundColor() {
        return backgroundColor;
    }

    @JsOverlay
    public final void setBackgroundColor(Color backgroundColor) {
        setBackgroundColor(ColorHelper.setupComputedBackgroundColor(backgroundColor));
    }

    /**
     * Background color of the scrollbar.
     */
    @JsOverlay
    public final void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @JsOverlay
    public final String getColor() {
        return color;
    }

    @JsOverlay
    public final void setColor(Color color) {
        setColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * Text color.
     */
    @JsOverlay
    public final void setColor(String color) {
        this.color = color;
    }

    @JsOverlay
    public final double getDragIconHeight() {
        return dragIconHeight;
    }

    /**
     * Height of resize grip image. Note, you should also update the image in amcharts/images folder if you don't
     * want it to be distorted because of resizing. Default to 18
     */
    @JsOverlay
    public final void setDragIconHeight(double dragIconHeight) {
        this.dragIconHeight = dragIconHeight;
    }

    @JsOverlay
    public final double getDragIconWidth() {
        return dragIconWidth;
    }

    /**
     * Width of resize grip image. Note, you should also update the image in amcharts/images folder if you don't want
     * it to be distorted because of resizing. Default to 11
     */
    @JsOverlay
    public final void setDragIconWidth(double dragIconWidth) {
        this.dragIconWidth = dragIconWidth;
    }

    @JsOverlay
    public final boolean isEnabled() {
        return enabled;
    }

    /**
     * Set false if you don't need scrollbar. Default to true
     */
    @JsOverlay
    public final void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @JsOverlay
    public final double getFontSize() {
        return fontSize;
    }

    /**
     * Font size.
     */
    @JsOverlay
    public final void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }

    @JsOverlay
    public final AmGraph getGraph() {
        return graph;
    }

    /**
     * Specifies which graph will be displayed in the scrollbar.
     */
    @JsOverlay
    public final void setGraph(AmGraph graph) {
        this.graph = graph;
    }

    @JsOverlay
    public final double getGraphFillAlpha() {
        return graphFillAlpha;
    }

    /**
     * Graph fill opacity.
     */
    @JsOverlay
    public final void setGraphFillAlpha(double graphFillAlpha) {
        this.graphFillAlpha = graphFillAlpha;
    }

    @JsOverlay
    public final String getGraphFillColor() {
        return graphFillColor;
    }

    @JsOverlay
    public final void setGraphFillColor(Color graphFillColor) {
        setGraphFillColor(ColorHelper.setupComputedBackgroundColor(graphFillColor));
    }

    /**
     * Graph fill color.
     */
    @JsOverlay
    public final void setGraphFillColor(String graphFillColor) {
        this.graphFillColor = graphFillColor;
    }

    @JsOverlay
    public final double getGraphLineAlpha() {
        return graphLineAlpha;
    }

    /**
     * Graph line opacity.
     */
    @JsOverlay
    public final void setGraphLineAlpha(double graphLineAlpha) {
        this.graphLineAlpha = graphLineAlpha;
    }

    @JsOverlay
    public final String getGraphLineColor() {
        return graphLineColor;
    }

    @JsOverlay
    public final void setGraphLineColor(Color graphLineColor) {
        setGraphLineColor(ColorHelper.setupComputedBackgroundColor(graphLineColor));
    }

    /**
     * Graph line color.
     */
    @JsOverlay
    public final void setGraphLineColor(String graphLineColor) {
        this.graphLineColor = graphLineColor;
    }

    @JsOverlay
    public final String getGraphType() {
        return graphType;
    }

    /**
     * Type of chart scrollbar's graph. By default the graph type is the same as the original graph's type, however in
     * case of candlestick or ohlc you might want to show line graph in the scrollbar. Possible values are: line, column,
     * step, smoothedLine, candlestick, ohlc.
     */
    @JsOverlay
    public final void setGraphType(GraphType graphType) {
        this.graphType = graphType.getName();
    }

    @JsOverlay
    public final double getGridAlpha() {
        return gridAlpha;
    }

    /**
     * Grid opacity.
     */
    @JsOverlay
    public final void setGridAlpha(double gridAlpha) {
        this.gridAlpha = gridAlpha;
    }

    @JsOverlay
    public final String getGridColor() {
        return gridColor;
    }

    @JsOverlay
    public final void setGridColor(Color gridColor) {
        setGridColor(ColorHelper.setupComputedBackgroundColor(gridColor));
    }

    /**
     * Grid color.
     */
    @JsOverlay
    public final void setGridColor(String gridColor) {
        this.gridColor = gridColor;
    }

    @JsOverlay
    public final int getGridCount() {
        return gridCount;
    }

    /**
     * Grid count. You should set autoGridCount to false in order this property to work.
     */
    @JsOverlay
    public final void setGridCount(int gridCount) {
        this.gridCount = gridCount;
    }

    @JsOverlay
    public final double getHeight() {
        return height;
    }

    /**
     * Height of scrollbar, in pixels. Default to 40
     */
    @JsOverlay
    public final void setHeight(double height) {
        this.height = height;
    }

    @JsOverlay
    public final boolean isHideResizeGrips() {
        return hideResizeGrips;
    }

    /**
     * Specifies whether resize grips are hidden when mouse is away from the scrollbar. Default to false
     */
    @JsOverlay
    public final void setHideResizeGrips(boolean hideResizeGrips) {
        this.hideResizeGrips = hideResizeGrips;
    }

    @JsOverlay
    public final boolean isMarkPeriodChange() {
        return markPeriodChange;
    }

    /**
     * Specifies if category axis of scrollbar should mark period change with a different date format.
     */
    @JsOverlay
    public final void setMarkPeriodChange(boolean markPeriodChange) {
        this.markPeriodChange = markPeriodChange;
    }

    @JsOverlay
    public final String getPosition() {
        return position;
    }

    /**
     * Position of a scrollbar. Possible values are "top" and "bottom". Default to bottom
     */
    @JsOverlay
    public final void setPosition(ChartScrollbarPosition position) {
        this.position = position.getName();
    }

    @JsOverlay
    public final boolean isResizeEnabled() {
        return resizeEnabled;
    }

    /**
     * Specifies whether scrollbar has a resize feature. Default to true
     */
    @JsOverlay
    public final void setResizeEnabled(boolean resizeEnabled) {
        this.resizeEnabled = resizeEnabled;
    }

    @JsOverlay
    public final double getScrollDuration() {
        return scrollDuration;
    }

    /**
     * Duration of scrolling, when the user clicks on scrollbar's background, in seconds. Note, updateOnReleaseOnly
     * should be set to false in order animation to happen.
     */
    @JsOverlay
    public final void setScrollDuration(double scrollDuration) {
        this.scrollDuration = scrollDuration;
    }

    @JsOverlay
    public final double getSelectedBackgroundAlpha() {
        return selectedBackgroundAlpha;
    }

    /**
     * Selected background opacity.
     */
    @JsOverlay
    public final void setSelectedBackgroundAlpha(double selectedBackgroundAlpha) {
        this.selectedBackgroundAlpha = selectedBackgroundAlpha;
    }

    @JsOverlay
    public final String getSelectedBackgroundColor() {
        return selectedBackgroundColor;
    }

    @JsOverlay
    public final void setSelectedBackgroundColor(Color selectedBackgroundColor) {
        setSelectedBackgroundColor(ColorHelper.setupComputedBackgroundColor(selectedBackgroundColor));
    }

    /**
     * Selected background color.
     */
    @JsOverlay
    public final void setSelectedBackgroundColor(String selectedBackgroundColor) {
        this.selectedBackgroundColor = selectedBackgroundColor;
    }

    @JsOverlay
    public final double getSelectedGraphFillAlpha() {
        return selectedGraphFillAlpha;
    }

    /**
     * Selected graph'sfill opacity.
     */
    @JsOverlay
    public final void setSelectedGraphFillAlpha(double selectedGraphFillAlpha) {
        this.selectedGraphFillAlpha = selectedGraphFillAlpha;
    }

    @JsOverlay
    public final String getSelectedGraphFillColor() {
        return selectedGraphFillColor;
    }

    @JsOverlay
    public final void setSelectedGraphFillColor(Color selectedGraphFillColor) {
        setSelectedGraphFillColor(ColorHelper.setupComputedBackgroundColor(selectedGraphFillColor));
    }

    /**
     * Selected graph'sfill color.
     */
    @JsOverlay
    public final void setSelectedGraphFillColor(String selectedGraphFillColor) {
        this.selectedGraphFillColor = selectedGraphFillColor;
    }

    @JsOverlay
    public final double getSelectedGraphLineAlpha() {
        return selectedGraphLineAlpha;
    }

    /**
     * Selected graph'sline opacity.
     */
    @JsOverlay
    public final void setSelectedGraphLineAlpha(double selectedGraphLineAlpha) {
        this.selectedGraphLineAlpha = selectedGraphLineAlpha;
    }

    @JsOverlay
    public final String getSelectedGraphLineColor() {
        return selectedGraphLineColor;
    }

    @JsOverlay
    public final void setSelectedGraphLineColor(Color selectedGraphLineColor) {
        setSelectedGraphLineColor(ColorHelper.setupComputedBackgroundColor(selectedGraphLineColor));
    }

    /**
     * Selected graph's line color.
     */

    @JsOverlay
    public final void setSelectedGraphLineColor(String selectedGraphLineColor) {
        this.selectedGraphLineColor = selectedGraphLineColor;
    }

    @JsOverlay
    public final boolean isUpdateOnReleaseOnly() {
        return updateOnReleaseOnly;
    }

    /**
     * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment when user
     * releases mouse button. Usefull when working with large data sets. Default to true
     */
    @JsOverlay
    public final void setUpdateOnReleaseOnly(boolean updateOnReleaseOnly) {
        this.updateOnReleaseOnly = updateOnReleaseOnly;
    }

    @JsOverlay
    public final String getUsePeriod() {
        return usePeriod;
    }

    /**
     * This is very important feature for those, who work with large data sets. You can tell ChartScrollbar what period
     * it should use for it's graph and save a lot of time for rendering of this graph. For example, if your minPeriod
     * is "DD" (days), set usePeriod = "WW" (weeks) and you will have 7 times less data points in scrollbar's graph.
     * Note, the period you specify here should be set in CategoryAxesSettings.groupToPeriods.
     */
    @JsOverlay
    public final void setUsePeriod(String usePeriod) {
        this.usePeriod = usePeriod;
    }
}
