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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

//@formatter:off

/**
 * Creates a label on the chart which can be placed anywhere, multiple can be assigned.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptcharts/Label">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Label {

    @JsProperty
    private String align;

    @JsProperty
    private int alpha;

    @JsProperty
    private boolean bold;

    @JsProperty
    private String color;

    @JsProperty
    private String id;

    @JsProperty
    private int rotation;

    @JsProperty
    private int size;

    @JsProperty
    private int tabIndex;

    @JsProperty
    private String text;

    @JsProperty
    private String url;

    @JsProperty
    private String x;

    @JsProperty
    private String y;

    @JsOverlay
    public final String getAlign() {
        return align;
    }

    /**
     * Aligment of the label
     */
    @JsOverlay
    public final void setAlign(String align) {
        this.align = align;
    }

    @JsOverlay
    public final int getAlpha() {
        return alpha;
    }

    /**
     * Opacity of the label
     */
    @JsOverlay
    public final void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    @JsOverlay
    public final boolean isBold() {
        return bold;
    }

    /**
     * Specifies if label is bold or not.
     */
    @JsOverlay
    public final void setBold(boolean bold) {
        this.bold = bold;
    }

    @JsOverlay
    public final String getColor() {
        return color;
    }

    /**
     * Color of a label.
     */
    @JsOverlay
    public final void setColor(String color) {
        this.color = color;
    }

    @JsOverlay
    public final String getId() {
        return id;
    }

    /**
     * Unique id of a Label. You don't need to set it, unless you want to.
     */
    @JsOverlay
    public final void setId(String id) {
        this.id = id;
    }

    @JsOverlay
    public final int getRotation() {
        return rotation;
    }

    /**
     * Rotation angle. Default to 0
     */
    @JsOverlay
    public final void setRotation(int rotation) {
        this.rotation = rotation;
    }

    @JsOverlay
    public final int getSize() {
        return size;
    }

    /**
     * Text size.
     */
    @JsOverlay
    public final void setSize(int size) {
        this.size = size;
    }

    @JsOverlay
    public final int getTabIndex() {
        return tabIndex;
    }

    /**
     * In case you set it to some number, the chart will set focus on the label when user clicks tab key. When a focus
     * is set, screen readers like NVDA Screen reader will read the title. Note, not all browsers and readers support this.
     */
    @JsOverlay
    public final void setTabIndex(int tabIndex) {
        this.tabIndex = tabIndex;
    }

    @JsOverlay
    public final String getText() {
        return text;
    }

    /**
     * Text of a label.
     */
    @JsOverlay
    public final void setText(String text) {
        this.text = text;
    }

    @JsOverlay
    public final String getUrl() {
        return url;
    }

    /**
     * URL which will be access if user clicks on a label.
     */
    @JsOverlay
    public final void setUrl(String url) {
        this.url = url;
    }

    @JsOverlay
    public final String getX() {
        return x;
    }

    /**
     * X position of a label.
     */
    @JsOverlay
    public final void setX(String x) {
        this.x = x;
    }

    @JsOverlay
    public final String getY() {
        return y;
    }

    /**
     * y position of a label.
     */
    @JsOverlay
    public final void setY(String y) {
        this.y = y;
    }
}
