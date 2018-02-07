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

import gwt.material.design.amchart.client.ui.chart.base.constants.UnitPosition;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * ValueAxesSettings settings set's settings for all ValueAxes. If you change a property after the chart is initialized,
 * you should call stockChart.validateNow() method in order for it to work. If there is no default value specified,
 * default value of ValueAxis class will be used.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptstockchart/ValueAxesSettings">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ValueAxesSettings {

    @JsProperty
    private boolean autoGridCount;

    @JsProperty
    private double axisAlpha;

    @JsProperty
    private String axisColor;

    @JsProperty
    private double axisThickness;

    @JsProperty
    private String color;


    @JsProperty
    private double dashLength;

    @JsProperty
    private double fillAlpha;

    @JsProperty
    private String fillColor;

    @JsProperty
    private double gridAlpha;

    @JsProperty
    private String gridColor;

    @JsProperty
    private int gridCount;

    @JsProperty
    private double gridThickness;

    @JsProperty
    private boolean includeGuidesInMinMax;

    @JsProperty
    private boolean includeHidden;

    @JsProperty
    private boolean inside;

    @JsProperty
    private boolean integersOnly;

    @JsProperty
    private double labelFrequency;

    @JsProperty
    private double labelOffset;

    @JsProperty
    private boolean labelsEnabled;

    @JsProperty
    private boolean logarithmic;

    @JsProperty
    private double maximum;

    @JsProperty
    private double minimum;

    @JsProperty
    private double minMaxMultiplier;

    @JsProperty
    private double minorGridAlpha;

    @JsProperty
    private boolean minorGridEnabled;

    @JsProperty
    private double minVerticalGap;

    @JsProperty
    private double offset;

    @JsProperty
    private String position;

    @JsProperty
    private double precision;

    @JsProperty
    private boolean reversed;

    @JsProperty
    private boolean showFirstLabel;

    @JsProperty
    private boolean showLastLabel;

    @JsProperty
    private String stackType;

    @JsProperty
    private boolean strictMinMax;

    @JsProperty
    private double tickLength;

    @JsProperty
    private String unit;

    @JsProperty
    private String unitPosition;

    @JsOverlay
    public final boolean isAutoGridCount() {
        return autoGridCount;
    }

    /**
     * Specifies whether number for gridCount is specified automatically, according to the axis size. Default to true
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
    public final String getColor() {
        return color;
    }

    @JsOverlay
    public final void setColor(Color color) {
        setColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * {@link gwt.material.design.amchart.client.ui.chart.js.options.Label} color.
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
     * Length of a dash. By default, the grid line is not dashed.
     */
    @JsOverlay
    public final void setDashLength(double dashLength) {
        this.dashLength = dashLength;
    }

    @JsOverlay
    public final double getFillAlpha() {
        return fillAlpha;
    }

    /**
     * Fill opacity. Every second space between grid lines can be filled with color.
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
        setColor(ColorHelper.setupComputedBackgroundColor(fillColor));
    }

    /**
     * Fill color. Every second space between grid lines can be filled with color. Set fillAlpha to a value greater than
     * 0 to see the fills.
     */
    @JsOverlay
    public final void setFillColor(String fillColor) {
        this.fillColor = fillColor;
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

    @JsOverlay
    public final void setGridColor(Color gridColor) {
        setGridColor(ColorHelper.setupComputedBackgroundColor(gridColor));
    }

    /**
     * Color of grid lines.
     */
    @JsOverlay
    public final void setGridColor(String gridColor) {
        this.gridColor = gridColor;
    }

    /**
     * Approximate number of grid lines. autoGridCount should be set to false, otherwise this property will be ignored.
     */
    @JsOverlay
    public final int getGridCount() {
        return gridCount;
    }

    @JsOverlay
    public final void setGridCount(int gridCount) {
        this.gridCount = gridCount;
    }

    /**
     * Thickness of grid lines.
     */
    @JsOverlay
    public final double getGridThickness() {
        return gridThickness;
    }

    @JsOverlay
    public final void setGridThickness(double gridThickness) {
        this.gridThickness = gridThickness;
    }

    @JsOverlay
    public final boolean isIncludeGuidesInMinMax() {
        return includeGuidesInMinMax;
    }

    /**
     * Specifies whether guide values should be included when calculating min and max of the axis.
     */
    @JsOverlay
    public final void setIncludeGuidesInMinMax(boolean includeGuidesInMinMax) {
        this.includeGuidesInMinMax = includeGuidesInMinMax;
    }

    @JsOverlay
    public final boolean isIncludeHidden() {
        return includeHidden;
    }

    /**
     * If true, the axis will include hidden graphs when calculating min and max values.
     */
    @JsOverlay
    public final void setIncludeHidden(boolean includeHidden) {
        this.includeHidden = includeHidden;
    }

    @JsOverlay
    public final boolean isInside() {
        return inside;
    }

    /**
     * Specifies whether values should be placed inside or outside plot area. In case you set this to false, you'll have
     * to adjust marginLeft or marginRight in [[PanelsSettings]] in order labels to be visible.
     * <p>
     * Note, if you set this property to false, you might also consider setting showLastLabel to true.
     */
    @JsOverlay
    public final void setInside(boolean inside) {
        this.inside = inside;
    }

    @JsOverlay
    public final boolean isIntegersOnly() {
        return integersOnly;
    }

    /**
     * Specifies whether values on axis can only be integers or both integers and doubles.
     */
    @JsOverlay
    public final void setIntegersOnly(boolean integersOnly) {
        this.integersOnly = integersOnly;
    }

    @JsOverlay
    public final double getLabelFrequency() {
        return labelFrequency;
    }

    /**
     * Frequency at which labels should be placed.
     */
    @JsOverlay
    public final void setLabelFrequency(double labelFrequency) {
        this.labelFrequency = labelFrequency;
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
    public final boolean isLabelsEnabled() {
        return labelsEnabled;
    }

    /**
     * Specifies whether value labels are displayed.
     */
    @JsOverlay
    public final void setLabelsEnabled(boolean labelsEnabled) {
        this.labelsEnabled = labelsEnabled;
    }

    @JsOverlay
    public final boolean isLogarithmic() {
        return logarithmic;
    }

    /**
     * Set to true if value axis is logarithmic, false otherwise.
     */
    @JsOverlay
    public final void setLogarithmic(boolean logarithmic) {
        this.logarithmic = logarithmic;
    }

    @JsOverlay
    public final double getMaximum() {
        return maximum;
    }

    /**
     * If you don't want max value to be calculated by the chart, set it using this property. This value might still be
     * adjusted so that it would be possible to draw grid at rounded intervals.
     */
    @JsOverlay
    public final void setMaximum(double maximum) {
        this.maximum = maximum;
    }

    @JsOverlay
    public final double getMinimum() {
        return minimum;
    }

    /**
     * If you don't want min value to be calculated by the chart, set it using this property. This value might still be
     * adjusted so that it would be possible to draw grid at rounded intervals.
     */
    @JsOverlay
    public final void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    @JsOverlay
    public final double getMinMaxMultiplier() {
        return minMaxMultiplier;
    }

    /**
     * If set value axis scale (min and max numbers) will be multiplied by it. I.e. if set to 1.2 the scope of values
     * will increase by 20%.
     */
    @JsOverlay
    public final void setMinMaxMultiplier(double minMaxMultiplier) {
        this.minMaxMultiplier = minMaxMultiplier;
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
    public final double getMinVerticalGap() {
        return minVerticalGap;
    }

    /**
     * This property is used when calculating grid count (when autoGridCount is true). It specifies minimum cell height
     * required for one span between grid lines.
     */
    @JsOverlay
    public final void setMinVerticalGap(double minVerticalGap) {
        this.minVerticalGap = minVerticalGap;
    }

    @JsOverlay
    public final double getOffset() {
        return offset;
    }

    /**
     * The distance of the axis to the plot area, in pixels. Useful if you have more then one axis on the same side.
     */
    @JsOverlay
    public final void setOffset(double offset) {
        this.offset = offset;
    }

    @JsOverlay
    public final String getPosition() {
        return position;
    }

    /**
     * Position of the value axis. Possible values are "left" and "right".
     */
    @JsOverlay
    public final void setPosition(String position) {
        this.position = position;
    }

    @JsOverlay
    public final double getPrecision() {
        return precision;
    }

    /**
     * Precision (number of decimals) of values.
     */
    @JsOverlay
    public final void setPrecision(double precision) {
        this.precision = precision;
    }

    @JsOverlay
    public final boolean isReversed() {
        return reversed;
    }

    /**
     * Set to true if value axis is reversed (smaller values on top), false otherwise.
     */
    @JsOverlay
    public final void setReversed(boolean reversed) {
        this.reversed = reversed;
    }

    @JsOverlay
    public final boolean isShowFirstLabel() {
        return showFirstLabel;
    }

    /**
     * Specifies if first label of value axis should be displayed. Default to true
     */
    @JsOverlay
    public final void setShowFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
    }

    @JsOverlay
    public final boolean isShowLastLabel() {
        return showLastLabel;
    }

    /**
     * Specifies if last label of value axis should be displayed. Default to false
     */
    @JsOverlay
    public final void setShowLastLabel(boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
    }

    @JsOverlay
    public final String getStackType() {
        return stackType;
    }

    /**
     * Stacking mode of the axis. Possible values are: "none", "regular", "100%", "3d".
     */
    @JsOverlay
    public final void setStackType(String stackType) {
        this.stackType = stackType;
    }

    @JsOverlay
    public final boolean isStrictMinMax() {
        return strictMinMax;
    }

    /**
     * If you set minimum and maximum for your axis, chart adjusts them so that grid would start and end on the beginning
     * and end of plot area and grid would be at equal intervals. If you set strictMinMax to true, the chart will not
     * adjust minimum and maximum of value axis.
     */
    @JsOverlay
    public final void setStrictMinMax(boolean strictMinMax) {
        this.strictMinMax = strictMinMax;
    }

    @JsOverlay
    public final double getTickLength() {
        return tickLength;
    }

    /**
     * Tick length.
     */
    @JsOverlay
    public final void setTickLength(double tickLength) {
        this.tickLength = tickLength;
    }

    @JsOverlay
    public final String getUnit() {
        return unit;
    }

    /**
     * Unit which will be added to the value label.
     */
    @JsOverlay
    public final void setUnit(String unit) {
        this.unit = unit;
    }

    @JsOverlay
    public final String getUnitPosition() {
        return unitPosition;
    }

    /**
     * Position of the unit. Possible values are "left" or "right".
     */
    @JsOverlay
    public final void setUnitPosition(UnitPosition unitPosition) {
        this.unitPosition = unitPosition.getName();
    }
}
