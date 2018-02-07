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

import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * CategoryAxesSettings settings set's settings common for all CategoryAxes of StockPanels. If you change a property
 * after the chart is initialized, you should call stockChart.validateNow() method in order for it to work. If there
 * is no default value specified, default value of CategoryAxis class will be used.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptstockchart/CategoryAxesSettings">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class CategoryAxesSettings {

    @JsProperty
    private boolean alwaysGroup;

    @JsProperty
    private boolean autoGridCount;

    @JsProperty
    private double axisAlpha;

    @JsProperty
    private String axisColor;

    @JsProperty
    private double axisHeight;

    @JsProperty
    private double axisThickness;

    @JsProperty
    private boolean boldLabels;

    @JsProperty
    private boolean boldPeriodBeginning;

    @JsProperty
    private String color;

    @JsProperty
    private double dashLength;

    @JsProperty
    private Object[] dateFormats;

    @JsProperty
    private boolean equalSpacing;

    @JsProperty
    private double fillAlpha;

    @JsProperty
    private String fillColor;

    @JsProperty
    private double fontSize;

    @JsProperty
    private double gridAlpha;

    @JsProperty
    private String gridColor;

    @JsProperty
    private int gridCount;

    @JsProperty
    private double gridThickness;

    @JsProperty
    private String[] groupToPeriods;

    @JsProperty
    private boolean inside;

    @JsProperty
    private double labelOffset;

    @JsProperty
    private double labelRotation;

    @JsProperty
    private boolean labelsEnabled;

    @JsProperty
    private boolean markPeriodChange;

    @JsProperty
    private int maxSeries;

    @JsProperty
    private int minHorizontalGap;

    @JsProperty
    private double minorGridAlpha;

    @JsProperty
    private boolean minorGridEnabled;

    @JsProperty
    private String minPeriod;

    @JsProperty
    private String position;

    @JsProperty
    private boolean startOnAxis;

    @JsProperty
    private int tickLength;

    @JsProperty
    private boolean twoLineMode;

    public boolean isAlwaysGroup() {
        return alwaysGroup;
    }

    /**
     * If this is set to true and groupToPeriods doesn't have CategoryAxesSettings.minPeriod value included, chart will
     * always group values to the first period available. Default to false
     */
    @JsOverlay
    public final void setAlwaysGroup(boolean alwaysGroup) {
        this.alwaysGroup = alwaysGroup;
    }

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
    public final double getAxisAlpha() {
        return axisAlpha;
    }

    /**
     * Axis opacity. Default to 0
     */
    @JsOverlay
    public final void setAxisAlpha(double axisAlpha) {
        this.axisAlpha = axisAlpha;
    }

    @JsOverlay
    public final String getAxisColor() {
        return axisColor;
    }

    /**
     * Axis color.
     */
    @JsOverlay
    public final void setAxisColor(String axisColor) {
        this.axisColor = axisColor;
    }

    @JsOverlay
    public final double getAxisHeight() {
        return axisHeight;
    }

    /**
     * Height of category axes. Set it to 0 if you set inside property to true. Default to 28
     */
    @JsOverlay
    public final void setAxisHeight(double axisHeight) {
        this.axisHeight = axisHeight;
    }

    @JsOverlay
    public final double getAxisThickness() {
        return axisThickness;
    }

    /**
     * Thickness of the axis.
     */
    @JsOverlay
    public final void setAxisThickness(double axisThickness) {
        this.axisThickness = axisThickness;
    }

    @JsOverlay
    public final boolean isBoldLabels() {
        return boldLabels;
    }

    /**
     * Specifies if axis labels should be bold or not.
     */
    @JsOverlay
    public final void setBoldLabels(boolean boldLabels) {
        this.boldLabels = boldLabels;
    }

    @JsOverlay
    public final boolean isBoldPeriodBeginning() {
        return boldPeriodBeginning;
    }

    /**
     * When parse dates is on for the category axis, the chart will try to highlight the beginning of the periods,
     * like month, in bold. Set this to false to disable the functionality. Default to true
     */
    @JsOverlay
    public final void setBoldPeriodBeginning(boolean boldPeriodBeginning) {
        this.boldPeriodBeginning = boldPeriodBeginning;
    }

    @JsOverlay
    public final String getColor() {
        return color;
    }

    /**
     * Text color.
     */
    @JsOverlay
    public final void setColor(String color) {
        this.color = color;
    }

    @JsOverlay
    public final double getDashLength() {
        return dashLength;
    }

    /**
     * Length of a dash.
     */
    @JsOverlay
    public final void setDashLength(double dashLength) {
        this.dashLength = dashLength;
    }

    @JsOverlay
    public final Object[] getDateFormats() {
        return dateFormats;
    }

    /**
     * Date formats of different periods. Possible period values: fff - milliseconds, ss - seconds, mm - minutes,
     * hh - hours, DD - days, MM - months, WW - weeks, YYYY - years. Check this page for date formatting strings.
     */
    @JsOverlay
    public final void setDateFormats(Object[] dateFormats) {
        this.dateFormats = dateFormats;
    }

    @JsOverlay
    public final boolean isEqualSpacing() {
        return equalSpacing;
    }

    /**
     * If you want data points to be placed at equal intervals (omiting dates with no data), set equalSpacing to true.
     * Default to false
     */
    @JsOverlay
    public final void setEqualSpacing(boolean equalSpacing) {
        this.equalSpacing = equalSpacing;
    }

    @JsOverlay
    public final double getFillAlpha() {
        return fillAlpha;
    }

    /**
     * Fill opacity. Every second space between grid lines can be filled with fillColor.
     */
    @JsOverlay
    public final void setFillAlpha(double fillAlpha) {
        this.fillAlpha = fillAlpha;
    }

    @JsOverlay
    public final String getFillColor() {
        return fillColor;
    }

    @JsOverlay
    public final void setFillColor(Color fillColor) {
        setFillColor(ColorHelper.setupComputedBackgroundColor(fillColor));
    }

    /**
     * Fill color. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater
     * than 0 to see the fills.
     */
    @JsOverlay
    public final void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    @JsOverlay
    public final double getFontSize() {
        return fontSize;
    }

    /**
     * Text size.
     */
    @JsOverlay
    public final void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }

    @JsOverlay
    public final double getGridAlpha() {
        return gridAlpha;
    }

    /**
     * Opacity of grid lines.
     */
    @JsOverlay
    public final void setGridAlpha(double gridAlpha) {
        this.gridAlpha = gridAlpha;
    }

    @JsOverlay
    public final String getGridColor() {
        return gridColor;
    }

    /**
     * Color of grid lines.
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
     * Approximate number of grid lines. You should set autoGridCount to false in order this property not to be ignored.
     * Default to 10
     */
    @JsOverlay
    public final void setGridCount(int gridCount) {
        this.gridCount = gridCount;
    }

    @JsOverlay
    public final double getGridThickness() {
        return gridThickness;
    }

    /**
     * Thickness of grid lines.
     */
    @JsOverlay
    public final void setGridThickness(double gridThickness) {
        this.gridThickness = gridThickness;
    }

    @JsOverlay
    public final String[] getGroupToPeriods() {
        return groupToPeriods;
    }

    /**
     * Periods to which data will be grouped in case there are more data items in the selected period than specified
     * in maxSeries property. Default to ["ss", "10ss", "30ss", "mm", "10mm", "30mm", "hh", "DD", "WW", "MM", "YYYY"]
     */
    @JsOverlay
    public final void setGroupToPeriods(String[] groupToPeriods) {
        this.groupToPeriods = groupToPeriods;
    }

    @JsOverlay
    public final boolean isInside() {
        return inside;
    }

    /**
     * Specifies whether values should be placed inside or outside of plot area. Default to false
     */
    @JsOverlay
    public final void setInside(boolean inside) {
        this.inside = inside;
    }

    @JsOverlay
    public final double getLabelOffset() {
        return labelOffset;
    }

    /**
     * You can use it to adjust position of axis labels. Default to 0
     */
    @JsOverlay
    public final void setLabelOffset(double labelOffset) {
        this.labelOffset = labelOffset;
    }

    @JsOverlay
    public final double getLabelRotation() {
        return labelRotation;
    }

    /**
     * Rotation angle of a label.
     */
    @JsOverlay
    public final void setLabelRotation(double labelRotation) {
        this.labelRotation = labelRotation;
    }

    @JsOverlay
    public final boolean isLabelsEnabled() {
        return labelsEnabled;
    }

    /**
     * Specifies whether axis displays category axis' labels and value axis' values. Default to true
     */
    @JsOverlay
    public final void setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
    }

    @JsOverlay
    public final boolean isMarkPeriodChange() {
        return markPeriodChange;
    }

    /**
     * Specifies if period period should be marked with a different date format. Default to true
     */
    @JsOverlay
    public final void setMarkPeriodChange(boolean markPeriodChange) {
        this.markPeriodChange = markPeriodChange;
    }

    @JsOverlay
    public final int getMaxSeries() {
        return maxSeries;
    }

    /**
     * Maximum series shown at a time. In case there are more data points in the selection than maxSeries, the chart will
     * group data to longer periods, for example - you have 250 days in the selection, and maxSeries is 150 - the chart
     * will group data to weeks. Default to 150
     */
    @JsOverlay
    public final void setMaxSeries(int maxSeries) {
        this.maxSeries = maxSeries;
    }

    @JsOverlay
    public final int getMinHorizontalGap() {
        return minHorizontalGap;
    }

    /**
     * This property is used when calculating grid count. It specifies minimum cell width required for one span between
     * grid lines. Default to 75
     */
    @JsOverlay
    public final void setMinHorizontalGap(int minHorizontalGap) {
        this.minHorizontalGap = minHorizontalGap;
    }

    @JsOverlay
    public final double getMinorGridAlpha() {
        return minorGridAlpha;
    }

    /**
     * Opacity of minor grid. In order minor to be visible, you should set minorGridEnabled to true.
     */
    @JsOverlay
    public final void setMinorGridAlpha(double minorGridAlpha) {
        this.minorGridAlpha = minorGridAlpha;
    }

    @JsOverlay
    public final boolean isMinorGridEnabled() {
        return minorGridEnabled;
    }

    /**
     * Specifies if minor grid should be displayed.
     * <p>
     * NOTE: If equalSpacing is set to true, this setting will be ignored.
     */
    @JsOverlay
    public final void setMinorGridEnabled(boolean minorGridEnabled) {
        this.minorGridEnabled = minorGridEnabled;
    }

    @JsOverlay
    public final String getMinPeriod() {
        return minPeriod;
    }

    /**
     * Specifies the shortest period of your data. fff - millisecond, ss - second, mm - minute, hh - hour, DD - day,
     * MM - month, YYYY - year.
     * <p>
     * It's also possible to supply a number for increments, i.e. "15mm" which will instruct the chart that your data
     * is supplied in 15 minute increments.
     */
    @JsOverlay
    public final void setMinPeriod(String minPeriod) {
        this.minPeriod = minPeriod;
    }

    @JsOverlay
    public final String getPosition() {
        return position;
    }

    /**
     * "top" or "bottom".
     */
    @JsOverlay
    public final void setPosition(String position) {
        this.position = position;
    }

    @JsOverlay
    public final boolean isStartOnAxis() {
        return startOnAxis;
    }

    /**
     * Specifies whether the graph should start on axis or not. In case you display columns, it is recommended to set
     * this to false. startOnAxis can be set to true only if equalSpacing is set to true.
     */
    @JsOverlay
    public final void setStartOnAxis(boolean startOnAxis) {
        this.startOnAxis = startOnAxis;
    }

    @JsOverlay
    public final int getTickLength() {
        return tickLength;
    }

    /**
     * Tick length. Default to 0
     */
    @JsOverlay
    public final void setTickLength(int tickLength) {
        this.tickLength = tickLength;
    }

    @JsOverlay
    public final boolean isTwoLineMode() {
        return twoLineMode;
    }

    /**
     * Works only when parseDates is set to true and equalSpacing is false. If you set it to true, at the position
     * where bigger period changes, category axis will display date strings of bot small and big period, in two rows.
     * Default to false
     */
    @JsOverlay
    public final void setTwoLineMode(boolean twoLineMode) {
        this.twoLineMode = twoLineMode;
    }
}
