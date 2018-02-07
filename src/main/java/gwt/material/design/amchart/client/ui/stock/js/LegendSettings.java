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

import gwt.material.design.amchart.client.ui.chart.base.constants.LegendPosition;
import gwt.material.design.amchart.client.ui.stock.constants.MarkerType;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Common settings of legends. If you change a property after the chart is initialized, you should call
 * stockChart.validateNow() method in order for it to work. If there is no default value specified, default value of
 * StockLegend class will be used.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptstockchart/LegendSettings">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class LegendSettings {

    @JsProperty
    private String align;

    @JsProperty
    private boolean equalWidths;

    @JsProperty
    private double horizontalGap;

    @JsProperty
    private String labelText;

    @JsProperty
    private double marginBottom;

    @JsProperty
    private double marginTop;

    @JsProperty
    private double markerBorderAlpha;

    @JsProperty
    private String markerBorderColor;

    @JsProperty
    private double markerBorderThickness;

    @JsProperty
    private String markerDisabledColor;

    @JsProperty
    private double markerLabelGap;

    @JsProperty
    private double markerSize;

    @JsProperty
    private String markerType;

    @JsProperty
    private String position;

    @JsProperty
    private boolean reversedOrder;

    @JsProperty
    private String rollOverColor;

    @JsProperty
    private double rollOverGraphAlpha;

    @JsProperty
    private boolean switchable;

    @JsProperty
    private String switchColor;

    @JsProperty
    private String switchType;

    @JsProperty
    private boolean textClickEnabled;

    @JsProperty
    private boolean useMarkerColorForLabels;

    @JsProperty
    private String valueTextComparing;

    @JsProperty
    private String valueTextRegular;

    @JsProperty
    private double valueWidth;

    @JsProperty
    private double verticalGap;

    @JsOverlay
    public final String getAlign() {
        return align;
    }

    /**
     * Alignment of legend entries. Possible values are: "left", "right" and "center".
     */
    @JsOverlay
    public final void setAlign(LegendPosition align) {
        this.align = align.getName();
    }

    @JsOverlay
    public final boolean isEqualWidths() {
        return equalWidths;
    }

    /**
     * Specifies if each legend entry should take the same space as the longest legend entry. Default to false
     */
    @JsOverlay
    public final void setEqualWidths(boolean equalWidths) {
        this.equalWidths = equalWidths;
    }

    @JsOverlay
    public final double getHorizontalGap() {
        return horizontalGap;
    }

    /**
     * Horizontal space between legend item and left/right border.
     */
    @JsOverlay
    public final void setHorizontalGap(double horizontalGap) {
        this.horizontalGap = horizontalGap;
    }

    @JsOverlay
    public final String getLabelText() {
        return labelText;
    }

    /**
     * The text which will be displayed in the legend. Tag [[title]] will be replaced with the title of the graph.
     */
    @JsOverlay
    public final void setLabelText(String labelText) {
        this.labelText = labelText;
    }

    @JsOverlay
    public final double getMarginBottom() {
        return marginBottom;
    }

    /**
     * Space below the last row of the legend, in pixels. Default to 0
     */
    @JsOverlay
    public final void setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
    }

    @JsOverlay
    public final double getMarginTop() {
        return marginTop;
    }

    /**
     * Space above the first row of the legend, in pixels. Default to 0
     */
    @JsOverlay
    public final void setMarginTop(double marginTop) {
        this.marginTop = marginTop;
    }

    @JsOverlay
    public final double getMarkerBorderAlpha() {
        return markerBorderAlpha;
    }

    /**
     * Opacity of marker border.
     */
    @JsOverlay
    public final void setMarkerBorderAlpha(double markerBorderAlpha) {
        this.markerBorderAlpha = markerBorderAlpha;
    }

    @JsOverlay
    public final String getMarkerBorderColor() {
        return markerBorderColor;
    }

    @JsOverlay
    public final void setMarkerBorderColor(Color markerBorderColor) {
        setMarkerBorderColor(ColorHelper.setupComputedBackgroundColor(markerBorderColor));
    }

    /**
     * Marker border color.
     */
    @JsOverlay
    public final void setMarkerBorderColor(String markerBorderColor) {
        this.markerBorderColor = markerBorderColor;
    }

    @JsOverlay
    public final double getMarkerBorderThickness() {
        return markerBorderThickness;
    }

    /**
     * Thickness of the legend border.
     */
    @JsOverlay
    public final void setMarkerBorderThickness(double markerBorderThickness) {
        this.markerBorderThickness = markerBorderThickness;
    }

    @JsOverlay
    public final String getMarkerDisabledColor() {
        return markerDisabledColor;
    }

    @JsOverlay
    public final void setMarkerDisabledColor(Color markerDisabledColor) {
        setMarkerDisabledColor(ColorHelper.setupComputedBackgroundColor(markerDisabledColor));
    }

    /**
     * The color of the disabled marker (when the graph is hidden).
     */
    @JsOverlay
    public final void setMarkerDisabledColor(String markerDisabledColor) {
        this.markerDisabledColor = markerDisabledColor;
    }

    @JsOverlay
    public final double getMarkerLabelGap() {
        return markerLabelGap;
    }

    /**
     * Space between legend marker and legend text, in pixels.
     */
    @JsOverlay
    public final void setMarkerLabelGap(double markerLabelGap) {
        this.markerLabelGap = markerLabelGap;
    }

    @JsOverlay
    public final double getMarkerSize() {
        return markerSize;
    }

    /**
     * Size of the legend marker (key).
     */
    @JsOverlay
    public final void setMarkerSize(double markerSize) {
        this.markerSize = markerSize;
    }

    @JsOverlay
    public final String getMarkerType() {
        return markerType;
    }

    /**
     * Shape of the legend marker (key). Possible values are: square, circle, diamond, triangleUp, triangleDown,
     * triangleLeft, triangleDown, bubble, none
     */
    @JsOverlay
    public final void setMarkerType(MarkerType markerType) {
        this.markerType = markerType.getName();
    }

    @JsOverlay
    public final String getPosition() {
        return position;
    }

    /**
     * Position of legend in panels. Possible values are: "bottom" and "top".
     */
    @JsOverlay
    public final void setPosition(LegendPosition position) {
        this.position = position.getName();
    }

    @JsOverlay
    public final boolean isReversedOrder() {
        return reversedOrder;
    }

    /**
     * Specifies whether legend entries should be placed in reversed order.
     */
    @JsOverlay
    public final void setReversedOrder(boolean reversedOrder) {
        this.reversedOrder = reversedOrder;
    }

    @JsOverlay
    public final String getRollOverColor() {
        return rollOverColor;
    }

    @JsOverlay
    public final void setRollOverColor(Color rollOverColor) {
        setRollOverColor(ColorHelper.setupComputedBackgroundColor(rollOverColor));
    }

    /**
     * Legend item text color on roll-over.
     */
    @JsOverlay
    public final void setRollOverColor(String rollOverColor) {
        this.rollOverColor = rollOverColor;
    }

    @JsOverlay
    public final double getRollOverGraphAlpha() {
        return rollOverGraphAlpha;
    }

    /**
     * When you roll-over the legend entry, all other graphs can reduce their opacity, so that the graph you rolled-over
     * would be distinguished. This property specifies the opacity of the graphs.
     */
    @JsOverlay
    public final void setRollOverGraphAlpha(double rollOverGraphAlpha) {
        this.rollOverGraphAlpha = rollOverGraphAlpha;
    }

    @JsOverlay
    public final boolean isSwitchable() {
        return switchable;
    }

    /**
     * Whether showing/hiding of graphs by clicking on the legend marker is enabled or not.
     */
    @JsOverlay
    public final void setSwitchable(boolean switchable) {
        this.switchable = switchable;
    }

    @JsOverlay
    public final String getSwitchColor() {
        return switchColor;
    }

    @JsOverlay
    public final void setSwitchColor(Color switchColor) {
        setSwitchColor(ColorHelper.setupComputedBackgroundColor(switchColor));
    }

    /**
     * Legend switch color.
     */
    @JsOverlay
    public final void setSwitchColor(String switchColor) {
        this.switchColor = switchColor;
    }

    @JsOverlay
    public final String getSwitchType() {
        return switchType;
    }

    /**
     * Legend switch type (in case the legend is switchable). Possible values are: "x" and "v".
     */
    @JsOverlay
    public final void setSwitchType(String switchType) {
        this.switchType = switchType;
    }

    @JsOverlay
    public final boolean isTextClickEnabled() {
        return textClickEnabled;
    }

    /**
     * Specifies whether the legend text is clickable or not. Clicking on legend text can show/hide value balloons
     * if they are enabled. Default to false
     */
    @JsOverlay
    public final void setTextClickEnabled(boolean textClickEnabled) {
        this.textClickEnabled = textClickEnabled;
    }

    @JsOverlay
    public final boolean isUseMarkerColorForLabels() {
        return useMarkerColorForLabels;
    }

    /**
     * Specifies if legend labels should be use same color as corresponding markers.
     */
    @JsOverlay
    public final void setUseMarkerColorForLabels(boolean useMarkerColorForLabels) {
        this.useMarkerColorForLabels = useMarkerColorForLabels;
    }

    @JsOverlay
    public final String getValueTextComparing() {
        return valueTextComparing;
    }

    /**
     * The text which will be displayed in the value portion of the legend when graph is comparable and at least one
     * dataSet is selected for comparing. You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]],
     * [[percents]], [[description]].
     */
    @JsOverlay
    public final void setValueTextComparing(String valueTextComparing) {
        this.valueTextComparing = valueTextComparing;
    }

    @JsOverlay
    public final String getValueTextRegular() {
        return valueTextRegular;
    }

    /**
     * The text which will be displayed in the value portion of the legend. You can use tags like [[value]], [[open]],
     * [[high]], [[low]], [[close]], [[percents]], [[description]].
     */
    @JsOverlay
    public final void setValueTextRegular(String valueTextRegular) {
        this.valueTextRegular = valueTextRegular;
    }

    @JsOverlay
    public final double getValueWidth() {
        return valueWidth;
    }

    /**
     * Width of the value text. Increase this value if your values do not fit in the allocated space.
     */
    @JsOverlay
    public final void setValueWidth(double valueWidth) {
        this.valueWidth = valueWidth;
    }

    @JsOverlay
    public final double getVerticalGap() {
        return verticalGap;
    }

    /**
     * Vertical space between legend items, in pixels.
     */
    @JsOverlay
    public final void setVerticalGap(double verticalGap) {
        this.verticalGap = verticalGap;
    }
}
