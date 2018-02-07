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
package gwt.material.design.amcharts.client.ui.maps.js.options;

import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Creates a small overview which indicates the current zoom level and position of the map.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/SmallMap">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SmallMap {

    @JsProperty
    private double backgroundAlpha;

    @JsProperty
    private String backgroundColor;

    @JsProperty
    private double borderAlpha;

    @JsProperty
    private String borderColor;

    @JsProperty
    private double borderThickness;

    @JsProperty
    private double bottom;

    @JsProperty
    private boolean enabled;

    @JsProperty
    private double left;

    @JsProperty
    private String mapColor;

    @JsProperty
    private double minimizeButtonWidth;

    @JsProperty
    private String rectangleColor;

    @JsProperty
    private double right;

    @JsProperty
    private double size;

    @JsProperty
    private double top;

    @JsOverlay
    public final double getBackgroundAlpha() {
        return backgroundAlpha;
    }

    /**
     * Background opacity. Default to 1
     */
    @JsOverlay
    public final void setBackgroundAlpha(double backgroundAlpha) {
        this.backgroundAlpha = backgroundAlpha;
    }

    @JsOverlay
    public final String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Background color. Default to #9A9A9A9A
     */
    @JsOverlay
    public final void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

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

    /**
     * Border color. Default #FFFFFF
     */
    @JsOverlay
    public final String getBorderColor() {
        return borderColor;
    }

    @JsOverlay
    public final void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    /**
     * Border thickness. Default to 3
     */
    @JsOverlay
    public final double getBorderThickness() {
        return borderThickness;
    }

    /**
     * Distance from bottom of map container to the small map. You should set property "top" to NaN in order this
     * property to work.
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
     * Specifies if SmallMap is enabled. Default to true
     */
    @JsOverlay
    public final void setBottom(double bottom) {
        this.bottom = bottom;
    }

    @JsOverlay
    public final boolean isEnabled() {
        return enabled;
    }

    /**
     * Color of a map of a small map control.
     */
    @JsOverlay
    public final void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @JsOverlay
    public final double getLeft() {
        return left;
    }

    /**
     * Distance from left side of map container to the small map. You should set property "right" to NaN in order this
     * property to work.
     */
    @JsOverlay
    public final void setLeft(double left) {
        this.left = left;
    }

    @JsOverlay
    public final String getMapColor() {
        return mapColor;
    }

    /**
     * Color of a map of a small map control. Default to #E6E6E6
     */
    @JsOverlay
    public final void setMapColor(String mapColor) {
        this.mapColor = mapColor;
    }

    @JsOverlay
    public final double getMinimizeButtonWidth() {
        return minimizeButtonWidth;
    }

    /**
     * Size of minimize button. You might need to change size of arrowUp.gif and arrowDown.gif if you change this
     * property. Default to 16
     */
    @JsOverlay
    public final void setMinimizeButtonWidth(double minimizeButtonWidth) {
        this.minimizeButtonWidth = minimizeButtonWidth;
    }

    @JsOverlay
    public final String getRectangleColor() {
        return rectangleColor;
    }

    @JsOverlay
    public final void setRectangleColor(Color rectangleColor) {
        setRectangleColor(ColorHelper.setupComputedBackgroundColor(rectangleColor));
    }

    /**
     * Color of rectangle, which indicates zoom level and position.
     */
    @JsOverlay
    public final void setRectangleColor(String rectangleColor) {
        this.rectangleColor = rectangleColor;
    }

    @JsOverlay
    public final double getRight() {
        return right;
    }

    /**
     * Distance from right side of map container to the small map. You should set property "left" to NaN in order this
     * property to work. Default to 10
     */
    @JsOverlay
    public final void setRight(double right) {
        this.right = right;
    }

    @JsOverlay
    public final double getSize() {
        return size;
    }

    /**
     * Size of small map relative to map container size. Default to 0.2
     */
    @JsOverlay
    public final void setSize(double size) {
        this.size = size;
    }

    @JsOverlay
    public final double getTop() {
        return top;
    }

    /**
     * Distance from top of map container to the small map. You should set property "bottom" to NaN in order this
     * property to work.
     */
    @JsOverlay
    public final void setTop(double top) {
        this.top = top;
    }
}
