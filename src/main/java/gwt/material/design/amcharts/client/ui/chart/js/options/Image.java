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
package gwt.material.design.amcharts.client.ui.chart.js.options;

import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

//@formatter:off

/**
 * Image is used to add images to the end/start of trend lines. Allows you to display image anywhere on chart's plot area.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptcharts/Image">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Image {

    @JsProperty
    private String balloonColor;

    @JsProperty
    private String balloonText;

    @JsProperty
    private String color;

    @JsProperty
    private int height;

    @JsProperty
    private int offsetX;

    @JsProperty
    private int offsetY;

    @JsProperty
    private String outlineColor;

    @JsProperty
    private int rotation;

    @JsProperty
    private String svgPath;

    @JsProperty
    private String url;

    @JsProperty
    private int width;

    /**
     * Roll-over balloon color. Default to #000000
     */
    @JsOverlay
    public final void setBalloonColor(String balloonColor) {
        this.balloonColor = balloonColor;
    }

    /**
     * Color of an image. Works only if an image is generated using SVG path (using svgPath property on an Image).
     * Default to #000000
     */
    @JsOverlay
    public final void setColor(String color) {
        this.color = color;
    }

    /**
     * Color of image outline. Works only if an image is generated using SVG path (using svgPath property on an Image)
     */
    @JsOverlay
    public final void setOutlineColor(String outlineColor) {
        this.outlineColor = outlineColor;
    }

    @JsOverlay
    public final String getBalloonColor() {
        return balloonColor;
    }

    @JsOverlay
    public final void setBalloonColor(Color color) {
        setBalloonColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    @JsOverlay
    public final String getBalloonText() {
        return balloonText;
    }

    /**
     * Roll-over text.
     */
    @JsOverlay
    public final void setBalloonText(String balloonText) {
        this.balloonText = balloonText;
    }

    @JsOverlay
    public final String getColor() {
        return color;
    }

    @JsOverlay
    public final void setColor(Color color) {
        setColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    @JsOverlay
    public final int getHeight() {
        return height;
    }

    /**
     * Height of an image. Default to 20
     */
    @JsOverlay
    public final void setHeight(int height) {
        this.height = height;
    }

    @JsOverlay
    public final int getOffsetX() {
        return offsetX;
    }

    /**
     * Horizontal offset.Default to 0
     */
    @JsOverlay
    public final void setOffsetX(int offsetX) {
        this.offsetX = offsetX;
    }

    @JsOverlay
    public final int getOffsetY() {
        return offsetY;
    }

    /**
     * Vertical offset. Default to 0
     */
    @JsOverlay
    public final void setOffsetY(int offsetY) {
        this.offsetY = offsetY;
    }

    @JsOverlay
    public final String getOutlineColor() {
        return outlineColor;
    }

    @JsOverlay
    public final void setOutlineColor(Color color) {
        setOutlineColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    @JsOverlay
    public final int getRotation() {
        return rotation;
    }

    /**
     * Rotation of an image. Default to 0
     */
    @JsOverlay
    public final void setRotation(int rotation) {
        this.rotation = rotation;
    }

    @JsOverlay
    public final String getSvgPath() {
        return svgPath;
    }

    /**
     * Svg path of an image. Will not work with IE8.
     */
    @JsOverlay
    public final void setSvgPath(String svgPath) {
        this.svgPath = svgPath;
    }

    @JsOverlay
    public final String getUrl() {
        return url;
    }

    /**
     * Url of an image.
     */
    @JsOverlay
    public final void setUrl(String url) {
        this.url = url;
    }

    @JsOverlay
    public final int getWidth() {
        return width;
    }

    /**
     * Width on an image. Default to 20
     */
    @JsOverlay
    public final void setWidth(int width) {
        this.width = width;
    }
}
