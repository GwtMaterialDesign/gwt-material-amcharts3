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

import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.*;

/**
 * Extension for {@link MapObject} to define individual settings for each line. it overwrites the settings obtained from
 * {@link LinesSettings}.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/MapLine">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class MapLine extends MapObject {

    @JsProperty
    private double arc;

    @JsProperty
    private String arrow;

    @JsProperty
    private double arrowAlpha;

    @JsProperty
    private String arrowColor;

    @JsProperty
    private double arrowSize;

    @JsProperty
    private double dashLength;

    @JsProperty
    private float[] latitudes;

    @JsProperty
    private float[] longitudes;

    @JsProperty
    private double thickness;

    @JsProperty
    private float x;

    @JsProperty
    private float y;

    /**
     * Deletes the line.
     */
    @JsMethod
    public native void deleteObject();

    /**
     * Fixes the line to the map instead of the stage. To do this, x and y coordinates are changed to longitudes and
     * latitudes.
     */
    @JsMethod
    public native void fixToMap();

    /**
     * Fixes the line to the stage instead of the map. To do this, longitudes and latitudes are changed to x and y
     * coordinates.
     */
    @JsMethod
    public native void fixToStage();

    /**
     * Redraws the line.
     */
    @JsMethod
    public native void validate();

    @JsOverlay
    public final double getArc() {
        return arc;
    }

    /**
     * Using this setting you can make lines to be curved, or actually to make them look like arcs. Note, there is one
     * limitation - this works well with two-point lines only.
     */
    @JsOverlay
    public final void setArc(double arc) {
        this.arc = arc;
    }

    @JsOverlay
    public final String getArrow() {
        return arrow;
    }

    /**
     * Arrow position. Allowed values are: start, end, middle, both, none.
     */
    @JsOverlay
    public final void setArrow(String arrow) {
        this.arrow = arrow;
    }

    @JsOverlay
    public final double getArrowAlpha() {
        return arrowAlpha;
    }

    /**
     * Opacity of an arrow.
     */
    @JsOverlay
    public final void setArrowAlpha(double arrowAlpha) {
        this.arrowAlpha = arrowAlpha;
    }

    @JsOverlay
    public final String getArrowColor() {
        return arrowColor;
    }

    @JsOverlay
    public final void setArrowColor(Color arrowColor) {
        setArrowColor(ColorHelper.setupComputedBackgroundColor(arrowColor));
    }

    /**
     * Color of an arrow.
     */
    @JsOverlay
    public final void setArrowColor(String arrowColor) {
        this.arrowColor = arrowColor;
    }

    @JsOverlay
    public final double getArrowSize() {
        return arrowSize;
    }

    /**
     * Size of an arrow.
     */
    @JsOverlay
    public final void setArrowSize(double arrowSize) {
        this.arrowSize = arrowSize;
    }

    @JsOverlay
    public final double getDashLength() {
        return dashLength;
    }

    /**
     * Dash length.
     */
    @JsOverlay
    public final void setDashLength(double dashLength) {
        this.dashLength = dashLength;
    }

    @JsOverlay
    public final float[] getLatitudes() {
        return latitudes;
    }

    /**
     * Array of latitudes. If you set array of latitudes and longitudes, line move with the map. In case you want the
     * line to be in a fixed position, set x and y arrays instead.
     */
    @JsOverlay
    public final void setLatitudes(float[] latitudes) {
        this.latitudes = latitudes;
    }

    @JsOverlay
    public final float[] getLongitudes() {
        return longitudes;
    }

    /**
     * Array of longitudes. If you set array of latitudes and longitudes, line move with the map. In case you want the
     * line to be in a fixed position, set x and y arrays instead.
     */
    @JsOverlay
    public final void setLongitudes(float[] longitudes) {
        this.longitudes = longitudes;
    }

    @JsOverlay
    public final double getThickness() {
        return thickness;
    }

    /**
     * Line thickness.
     */
    @JsOverlay
    public final void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @JsOverlay
    public final float getX() {
        return x;
    }

    /**
     * Array of x coordinates. If you set array of x and y coordinates, line will not move with the map. In case you
     * want the line to be bounded to the map, set latitudes and longitudes instead.
     */
    @JsOverlay
    public final void setX(float x) {
        this.x = x;
    }

    @JsOverlay
    public final float getY() {
        return y;
    }

    /**
     * Array of y coordinates. If you set array of x and y coordinates, line will not move with the map. In case you
     * want the line to be bounded to the map, set latitudes and longitudes instead.
     */
    @JsOverlay
    public final void setY(float y) {
        this.y = y;
    }
}
