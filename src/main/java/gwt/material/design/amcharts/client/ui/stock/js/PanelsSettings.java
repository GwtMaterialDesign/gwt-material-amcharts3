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

import gwt.material.design.amcharts.client.ui.stock.constants.CreditsPosition;
import gwt.material.design.amcharts.client.ui.stock.constants.RecalculateToPercents;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * PanelsSettings settings set's settings for all StockPanels. If you change a property after the chart is initialized,
 * you should call stockChart.validateNow() method in order for it to work. If there is no default value specified,
 * default value of AmStockPanel class will be used.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptstockchart/PanelsSettings">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, namespace = "AmCharts")
public class PanelsSettings {

    @JsProperty
    private double angle;

    @JsProperty
    private double backgroundAlpha;

    @JsProperty
    private String backgroundColor;

    @JsProperty
    private double columnSpacing;

    @JsProperty
    private double columnWidth;

    @JsProperty
    private String creditsPosition;

    @JsProperty
    private String decimalSeparator;

    @JsProperty
    private double depth3D;

    @JsProperty
    private String fontFamily;

    @JsProperty
    private String fontSize;

    @JsProperty
    private double marginBottom;

    @JsProperty
    private double marginLeft;

    @JsProperty
    private double marginRight;

    @JsProperty
    private double marginTop;

    @JsProperty
    private double maxSelectedTime;

    @JsProperty
    private double minSelectedTime;

    @JsProperty
    private double panelSpacing;

    @JsProperty
    private boolean panEventsEnabled;

    @JsProperty
    private double percentPrecision;

    @JsProperty
    private double plotAreaBorderAlpha;

    @JsProperty
    private String plotAreaBorderColor;

    @JsProperty
    private double plotAreaFillAlphas;

    @JsProperty
    private String[] plotAreaFillColors;

    @JsProperty
    private double precision;

    @JsProperty
    private Object[] prefixesOfBigNumbers;

    @JsProperty
    private Object[] prefixesOfSmallNumbers;

    @JsProperty
    private String recalculateToPercents;

    @JsProperty
    private boolean sequencedAnimation;

    @JsProperty
    private double startAlpha;

    @JsProperty
    private double startDuration;

    @JsProperty
    private String startEffect;

    @JsProperty
    private boolean svgIcons;

    @JsProperty
    private String thousandsSeparator;

    @JsProperty
    private boolean usePrefixes;

    @JsProperty
    private boolean zoomOutAxes;

    @JsOverlay
    public final double getAngle() {
        return angle;
    }

    /**
     * The angle of the 3D part of plot area. This creates a 3D effect (if the "depth3D" is > 0).
     */
    @JsOverlay
    public final void setAngle(double angle) {
        this.angle = angle;
    }

    @JsOverlay
    public final double getBackgroundAlpha() {
        return backgroundAlpha;
    }

    /**
     * Opacity of panel background. Possible values are 1 and 0. Values like 0.5 will not make it half-transparent.
     * Default to 0
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
     * Background color of panels. Set backgroundAlpha to > 0 value in order to make background visible.
     * Default to #FFFFFF
     */
    @JsOverlay
    public final void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @JsOverlay
    public final double getColumnSpacing() {
        return columnSpacing;
    }

    /**
     * The gap in pixels between two columns of the same category.
     */
    @JsOverlay
    public final void setColumnSpacing(double columnSpacing) {
        this.columnSpacing = columnSpacing;
    }

    @JsOverlay
    public final double getColumnWidth() {
        return columnWidth;
    }

    /**
     * Relative width of columns. Valid values 0 - 1.
     */
    @JsOverlay
    public final void setColumnWidth(double columnWidth) {
        this.columnWidth = columnWidth;
    }

    @JsOverlay
    public final String getCreditsPosition() {
        return creditsPosition;
    }

    /**
     * Position of amCharts link (free version only). Possible values are: top-left. top-right, bottom-left, bottom-right
     * You can adjust the position of amcharts link so that it would not overlap with contents of your chart.
     */
    @JsOverlay
    public final void setCreditsPosition(CreditsPosition creditsPosition) {
        this.creditsPosition = creditsPosition.getName();
    }

    @JsOverlay
    public final String getDecimalSeparator() {
        return decimalSeparator;
    }

    /**
     * Separator of decimal values.
     */
    @JsOverlay
    public final void setDecimalSeparator(String decimalSeparator) {
        this.decimalSeparator = decimalSeparator;
    }

    @JsOverlay
    public final double getDepth3D() {
        return depth3D;
    }

    /**
     * The depth of the 3D part of plot area. This creates a 3D effect (if the "angle" is > 0).
     */
    @JsOverlay
    public final void setDepth3D(double depth3D) {
        this.depth3D = depth3D;
    }

    @JsOverlay
    public final String getFontFamily() {
        return fontFamily;
    }

    /**
     * Font family.
     */
    @JsOverlay
    public final void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    @JsOverlay
    public final String getFontSize() {
        return fontSize;
    }

    /**
     * Font size.
     */
    @JsOverlay
    public final void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    @JsOverlay
    public final double getMarginBottom() {
        return marginBottom;
    }

    /**
     * Number of pixels between the container's bottom border and plot area. Default to 0
     */
    @JsOverlay
    public final void setMarginBottom(double marginBottom) {
        this.marginBottom = marginBottom;
    }

    @JsOverlay
    public final double getMarginLeft() {
        return marginLeft;
    }

    /**
     * Number of pixels between the container's left border and plot area. If your left valueAxis values ar not placed
     * inside the plot area, you should set marginLeft to 80 or some close value. Default to 0
     */
    @JsOverlay
    public final void setMarginLeft(double marginLeft) {
        this.marginLeft = marginLeft;
    }

    @JsOverlay
    public final double getMarginRight() {
        return marginRight;
    }

    /**
     * Number of pixels between the container's left border and plot area. If your right valueAxis values ar not placed
     * inside the plot area, you should set marginRight to 80 or some close value. Default to 0
     */
    @JsOverlay
    public final void setMarginRight(double marginRight) {
        this.marginRight = marginRight;
    }

    @JsOverlay
    public final double getMarginTop() {
        return marginTop;
    }

    /**
     * Number of pixels between the container's top border and plot area. Default to 0
     */
    @JsOverlay
    public final void setMarginTop(double marginTop) {
        this.marginTop = marginTop;
    }

    @JsOverlay
    public final double getMaxSelectedTime() {
        return maxSelectedTime;
    }

    /**
     * The longest time span allowed to select (in milliseconds) for example, 259200000 will limit selection to 3 days.
     * Works if equalSpacing is set to false (default).
     */
    @JsOverlay
    public final void setMaxSelectedTime(double maxSelectedTime) {
        this.maxSelectedTime = maxSelectedTime;
    }

    @JsOverlay
    public final double getMinSelectedTime() {
        return minSelectedTime;
    }

    /**
     * The shortest time span allowed to select (in milliseconds) for example, 1000 will limit selection to 1 second.
     * Works if equalSpacing is set to false (default). Default to 0
     */
    @JsOverlay
    public final void setMinSelectedTime(double minSelectedTime) {
        this.minSelectedTime = minSelectedTime;
    }

    @JsOverlay
    public final double getPanelSpacing() {
        return panelSpacing;
    }

    /**
     * Gap between panels. Default to 8
     */
    @JsOverlay
    public final void setPanelSpacing(double panelSpacing) {
        this.panelSpacing = panelSpacing;
    }

    @JsOverlay
    public final boolean isPanEventsEnabled() {
        return panEventsEnabled;
    }

    /**
     * This setting affects touch-screen devices only. If a chart is on a page, and panEventsEnabled are set to true,
     * the page won't move if the user touches the chart first. If a chart is big enough and occupies all the screen
     * of your touch device, the user won’t be able to move the page at all. That's why the default value is "false".
     * If you think that selecting or or panning the chart is a primary purpose of your chart users, you should set
     * panEventsEnabled to true. Default to false
     */
    @JsOverlay
    public final void setPanEventsEnabled(boolean panEventsEnabled) {
        this.panEventsEnabled = panEventsEnabled;
    }

    @JsOverlay
    public final double getPercentPrecision() {
        return percentPrecision;
    }

    /**
     * Precision of percent values.
     */
    @JsOverlay
    public final void setPercentPrecision(double percentPrecision) {
        this.percentPrecision = percentPrecision;
    }

    @JsOverlay
    public final double getPlotAreaBorderAlpha() {
        return plotAreaBorderAlpha;
    }

    /**
     * The opacity of plot area's border.
     */
    @JsOverlay
    public final void setPlotAreaBorderAlpha(double plotAreaBorderAlpha) {
        this.plotAreaBorderAlpha = plotAreaBorderAlpha;
    }

    @JsOverlay
    public final String getPlotAreaBorderColor() {
        return plotAreaBorderColor;
    }

    @JsOverlay
    public final void setPlotAreaBorderColor(Color plotAreaBorderColor) {
        setPlotAreaBorderColor(ColorHelper.setupComputedBackgroundColor(plotAreaBorderColor));
    }

    /**
     * The color of the plot area's border.
     */
    @JsOverlay
    public final void setPlotAreaBorderColor(String plotAreaBorderColor) {
        this.plotAreaBorderColor = plotAreaBorderColor;
    }

    @JsOverlay
    public final double getPlotAreaFillAlphas() {
        return plotAreaFillAlphas;
    }

    /**
     * Opacity of plot area fill.
     */
    @JsOverlay
    public final void setPlotAreaFillAlphas(double plotAreaFillAlphas) {
        this.plotAreaFillAlphas = plotAreaFillAlphas;
    }

    @JsOverlay
    public final String[] getPlotAreaFillColors() {
        return plotAreaFillColors;
    }

    @JsOverlay
    public final void setPlotAreaFillColors(Color[] plotAreaFillColors) {
        for (int i = 0; i < plotAreaFillColors.length; i++) {
            this.plotAreaFillColors[i] = ColorHelper.setupComputedBackgroundColor(plotAreaFillColors[i]);
        }
    }

    /**
     * Specifies the colors used to tint the background gradient fill of the plot area.
     */
    @JsOverlay
    public final void setPlotAreaFillColors(String[] plotAreaFillColors) {
        this.plotAreaFillColors = plotAreaFillColors;
    }

    @JsOverlay
    public final double getPrecision() {
        return precision;
    }

    /**
     * Precision of values. -1 means values will not be rounded and shown as they are.
     */
    @JsOverlay
    public final void setPrecision(double precision) {
        this.precision = precision;
    }

    @JsOverlay
    public final Object[] getPrefixesOfBigNumbers() {
        return prefixesOfBigNumbers;
    }

    /**
     * Prefixes which are used to make big numbers shorter: 2M instead of 2000000, etc. Prefixes are used on value axes
     * and in the legend. To enable prefixes, set usePrefixes property to true.
     * Default to [{number:1e+3,prefix:"k"},{number:1e+6,prefix:"M"},{number:1e+9,prefix:"G"},{number:1e+12,prefix:"T"},
     * {number:1e+15,prefix:"P"},{number:1e+18,prefix:"E"},{number:1e+21,prefix:"Z"},{number:1e+24,prefix:"Y"}]
     */
    @JsOverlay
    public final void setPrefixesOfBigNumbers(Object[] prefixesOfBigNumbers) {
        this.prefixesOfBigNumbers = prefixesOfBigNumbers;
    }

    @JsOverlay
    public final Object[] getPrefixesOfSmallNumbers() {
        return prefixesOfSmallNumbers;
    }

    /**
     * Prefixes which are used to make small numbers shorter: 2μ instead of 0.000002, etc. Prefixes are used on value
     * axes and in the legend. To enable prefixes, set usePrefixes property to true.
     * Default to [{number:1e-24, prefix:"y"},{number:1e-21, prefix:"z"},{number:1e-18, prefix:"a"},{number:1e-15,
     * prefix:"f"},{number:1e-12, prefix:"p"},{number:1e-9, prefix:"n"},{number:1e-6, prefix:"μ"},{number:1e-3, prefix:"m"}]
     */
    @JsOverlay
    public final void setPrefixesOfSmallNumbers(Object[] prefixesOfSmallNumbers) {
        this.prefixesOfSmallNumbers = prefixesOfSmallNumbers;
    }

    @JsOverlay
    public final String getRecalculateToPercents() {
        return recalculateToPercents;
    }

    /**
     * Specifies when values should be recalculated to percents. Possible values are: "never", "always", "whenComparing".
     */
    @JsOverlay
    public final void setRecalculateToPercents(RecalculateToPercents recalculateToPercents) {
        this.recalculateToPercents = recalculateToPercents.getName();
    }

    @JsOverlay
    public final boolean isSequencedAnimation() {
        return sequencedAnimation;
    }

    /**
     * Specifies whether the animation should be sequenced or all objects should appear at once.
     */
    @JsOverlay
    public final void setSequencedAnimation(boolean sequencedAnimation) {
        this.sequencedAnimation = sequencedAnimation;
    }

    @JsOverlay
    public final double getStartAlpha() {
        return startAlpha;
    }

    /**
     * The initial opacity of the column/line. If you set startDuration to a value higher than 0, the columns/lines will
     * fade in from startAlpha.
     */
    @JsOverlay
    public final void setStartAlpha(double startAlpha) {
        this.startAlpha = startAlpha;
    }

    @JsOverlay
    public final double getStartDuration() {
        return startDuration;
    }

    /**
     * Duration of the animation, in seconds.
     */
    @JsOverlay
    public final void setStartDuration(double startDuration) {
        this.startDuration = startDuration;
    }

    @JsOverlay
    public final String getStartEffect() {
        return startEffect;
    }

    /**
     * Possible values are: easeOutSine, easeInSine, elastic, bounce
     */
    @JsOverlay
    public final void setStartEffect(String startEffect) {
        this.startEffect = startEffect;
    }

    @JsOverlay
    public final boolean isSvgIcons() {
        return svgIcons;
    }

    /**
     * Specifies if panels and scrollbar should use svg icons instead of png. Default to true
     */
    @JsOverlay
    public final void setSvgIcons(boolean svgIcons) {
        this.svgIcons = svgIcons;
    }

    @JsOverlay
    public final String getThousandsSeparator() {
        return thousandsSeparator;
    }

    /**
     * Separator of thousand values.
     */
    @JsOverlay
    public final void setThousandsSeparator(String thousandsSeparator) {
        this.thousandsSeparator = thousandsSeparator;
    }

    @JsOverlay
    public final boolean isUsePrefixes() {
        return usePrefixes;
    }

    /**
     * If true, prefixes will be used for big and small numbers.
     */
    @JsOverlay
    public final void setUsePrefixes(boolean usePrefixes) {
        this.usePrefixes = usePrefixes;
    }

    @JsOverlay
    public final boolean isZoomOutAxes() {
        return zoomOutAxes;
    }

    /**
     * Specifies if zoomed-in value axes should be zoomed-out when user changes selected period with PeriodSelector.
     * Default to true
     */
    @JsOverlay
    public final void setZoomOutAxes(boolean zoomOutAxes) {
        this.zoomOutAxes = zoomOutAxes;
    }
}
