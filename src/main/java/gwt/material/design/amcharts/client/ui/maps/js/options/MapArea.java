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
import jsinterop.annotations.*;

/**
 * Extension for {@link MapObject} to define individual settings for each area defined in the SVG map. It overwrites the settings
 * obtained from {@link AreasSettings}.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/MapArea">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class MapArea extends MapObject {

    @JsProperty
    private boolean autoZoom;

    @JsProperty
    private boolean outline;

    @JsProperty
    private double outlineAlpha;

    @JsProperty
    private String outlineColor;

    @JsProperty
    private double outlineThickness;

    @JsProperty
    private Object pattern;

    @JsProperty
    private String rollOverOutlineColor;

    @JsProperty
    private double value;

    @JsMethod
    public native void validate();

    @JsOverlay
    public final boolean isAutoZoom() {
        return autoZoom;
    }

    /**
     * Specifies if the area should be zoomed-in when user clicks on it, even if zoom properties are not set.
     * Default to false
     */
    @JsOverlay
    public final void setAutoZoom(boolean autoZoom) {
        this.autoZoom = autoZoom;
    }

    @JsOverlay
    public final boolean isOutline() {
        return outline;
    }

    /**
     * Some areas can serve only as outlines. If you set this property to true, this area will not be filled, will not
     * receive mouse events and will always stay above all other areas. Default to false
     */
    @JsOverlay
    public final void setOutline(boolean outline) {
        this.outline = outline;
    }

    @JsOverlay
    public final double getOutlineAlpha() {
        return outlineAlpha;
    }

    /**
     * Opacity of area's outline.
     */
    @JsOverlay
    public final void setOutlineAlpha(double outlineAlpha) {
        this.outlineAlpha = outlineAlpha;
    }

    @JsOverlay
    public final String getOutlineColor() {
        return outlineColor;
    }

    @JsOverlay
    public final void setOutlineColor(Color outlineColor) {
        setOutlineColor(ColorHelper.setupComputedBackgroundColor(outlineColor));
    }

    /**
     * Color of area's outline.
     */
    @JsOverlay
    public final void setOutlineColor(String outlineColor) {
        this.outlineColor = outlineColor;
    }

    @JsOverlay
    public final double getOutlineThickness() {
        return outlineThickness;
    }

    /**
     * Thickness of area's outline.
     */
    @JsOverlay
    public final void setOutlineThickness(double outlineThickness) {
        this.outlineThickness = outlineThickness;
    }

    @JsOverlay
    public final Object getPattern() {
        return pattern;
    }

    /**
     * Value of pattern should be object with url, width, height of an image, optionally it might have x, y, randomX
     * and randomY values. For example: {"url":"../amcharts/patterns/black/pattern1.png", "width":4, "height":4}.
     * Check ammap/patterns folder for some patterns. You can create your own patterns and use them.
     */
    @JsOverlay
    public final void setPattern(Object pattern) {
        this.pattern = pattern;
    }

    @JsOverlay
    public final String getRollOverOutlineColor() {
        return rollOverOutlineColor;
    }

    @JsOverlay
    public final void setRollOverOutlineColor(Color rollOverOutlineColor) {
        setRollOverOutlineColor(ColorHelper.setupComputedBackgroundColor(rollOverOutlineColor));
    }

    /**
     * Color of area's outline when user rolls-over it.
     */
    @JsOverlay
    public final void setRollOverOutlineColor(String rollOverOutlineColor) {
        this.rollOverOutlineColor = rollOverOutlineColor;
    }

    @JsOverlay
    public final double getValue() {
        return value;
    }

    /**
     * Value of the area. Areas will be filled with color range from {@link AreasSettings#color} to
     * {@link AreasSettings#colorSolid}, depending on the value.
     */
    @JsOverlay
    public final void setValue(double value) {
        this.value = value;
    }
}
