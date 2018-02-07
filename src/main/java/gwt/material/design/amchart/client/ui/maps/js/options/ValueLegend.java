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
package gwt.material.design.amchart.client.ui.maps.js.options;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * This class displays a color range used by areas (in case you set values for your areas).
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/ValueLegend">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ValueLegend {

    @JsProperty
    private double borderAlpha;

    @JsProperty
    private String borderColor;

    @JsProperty
    private double borderThickness;

    @JsProperty
    private double bottom;

    @JsProperty
    private String color;

    @JsProperty
    private boolean enabled;

    @JsProperty
    private double fontSize;

    @JsProperty
    private double height;

    @JsProperty
    private double left;

    @JsProperty
    private String maxValue;

    @JsProperty
    private String minValue;

    @JsProperty
    private double right;

    @JsProperty
    private boolean showAsGradient;

    @JsProperty
    private double top;

    @JsProperty
    private double width;

    @JsOverlay
    public final double getBorderAlpha() {
        return borderAlpha;
    }

    /**
     * Border opacity. Default to 1
     */
    @JsOverlay
    public final void setBorderAlpha(double borderAlpha) {
        this.borderAlpha = borderAlpha;
    }

    @JsOverlay
    public final String getBorderColor() {
        return borderColor;
    }

    /**
     * Border color. Default to #FFFFFF
     */
    @JsOverlay
    public final void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @JsOverlay
    public final double getBorderThickness() {
        return borderThickness;
    }

    /**
     * Border thickness. Default to 1
     */
    @JsOverlay
    public final void setBorderThickness(double borderThickness) {
        this.borderThickness = borderThickness;
    }

    @JsOverlay
    public final double getBottom() {
        return bottom;
    }

    /**
     * Distance from bottom of the map container to the value legend. Default to 10
     */
    @JsOverlay
    public final void setBottom(double bottom) {
        this.bottom = bottom;
    }

    @JsOverlay
    public final String getColor() {
        return color;
    }

    /**
     * Text color. Default to #000000
     */
    @JsOverlay
    public final void setColor(String color) {
        this.color = color;
    }

    @JsOverlay
    public final boolean isEnabled() {
        return enabled;
    }

    /**
     * Specifies if value legend is enabled. Default to true
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
     * Font size. Default to 11
     */
    @JsOverlay
    public final void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }

    @JsOverlay
    public final double getHeight() {
        return height;
    }

    /**
     * Height of value legend. Default to 12
     */
    @JsOverlay
    public final void setHeight(double height) {
        this.height = height;
    }

    @JsOverlay
    public final double getLeft() {
        return left;
    }

    /**
     * Distance from left of the map container to the value legend. Default to 10
     */
    @JsOverlay
    public final void setLeft(double left) {
        this.left = left;
    }

    @JsOverlay
    public final String getMaxValue() {
        return maxValue;
    }

    /**
     * Value, which will be displayed on the right of the legend (will display max value in case not set any).
     */
    @JsOverlay
    public final void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    @JsOverlay
    public final String getMinValue() {
        return minValue;
    }

    /**
     * Value which will be displayed on the left of a legend. Default to 0
     */
    @JsOverlay
    public final void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    @JsOverlay
    public final double getRight() {
        return right;
    }

    /**
     * Distance from right of the map container to the value legend.
     */
    @JsOverlay
    public final void setRight(double right) {
        this.right = right;
    }

    @JsOverlay
    public final boolean isShowAsGradient() {
        return showAsGradient;
    }

    /**
     * Specifies if color range should be displayed as a gradient or as a set of rectangles, each with different color.
     * Default to false
     */
    @JsOverlay
    public final void setShowAsGradient(boolean showAsGradient) {
        this.showAsGradient = showAsGradient;
    }

    @JsOverlay
    public final double getTop() {
        return top;
    }

    /**
     * Distance from top of the map container to the value legend.
     */
    @JsOverlay
    public final void setTop(double top) {
        this.top = top;
    }

    @JsOverlay
    public final double getWidth() {
        return width;
    }

    /**
     * Width of value legend. Default to 200
     */
    @JsOverlay
    public final void setWidth(double width) {
        this.width = width;
    }
}
