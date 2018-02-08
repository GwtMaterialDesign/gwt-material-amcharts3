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

import gwt.material.design.amcharts.client.ui.stock.constants.BulletType;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.Date;

/**
 * StockEvent is an object which holds information about event (bullet). Values from StockEventsSettings will be used if
 * not set. Stock event bullet's size depends on it's graphs fontSize. When user rolls-over, clicks or rolls-out of the
 * event bullet, AmStockChart dispatches events.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/StockEvent">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class StockEvent {

    @JsProperty
    private double backgroundAlpha;

    @JsProperty
    private String backgroundColor;

    @JsProperty
    private double borderAlpha;

    @JsProperty
    private String borderColor;

    @JsProperty
    private String color;

    @JsProperty
    private Date date;

    @JsProperty
    private String description;

    @JsProperty
    private double fontSize;

    @JsProperty
    private AmStockGraph graph;

    @JsProperty
    private String rollOverColor;

    @JsProperty
    private String showAt;

    @JsProperty
    private boolean showBullet;

    @JsProperty
    private boolean showOnAxis;

    @JsProperty
    private String text;

    @JsProperty
    private String type;

    @JsProperty
    private String url;

    @JsProperty
    private String urlTarget;

    @JsProperty
    private double value;

    @JsOverlay
    public final double getBackgroundAlpha() {
        return backgroundAlpha;
    }

    /**
     * Opacity of bullet background. Default to 1
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
     * Color of bullet background. Default to #DADADA
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
     * Opacity of bullet border. Default to 1
     */
    @JsOverlay
    public final void setBorderAlpha(double borderAlpha) {
        this.borderAlpha = borderAlpha;
    }

    @JsOverlay
    public final String getBorderColor() {
        return borderColor;
    }

    @JsOverlay
    public final void setBorderColor(Color borderColor) {
        setBorderColor(ColorHelper.setupComputedBackgroundColor(borderColor));
    }

    /**
     * Bullet border color. Default to #888888
     */
    @JsOverlay
    public final void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
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
     * The color of the event text.
     */
    @JsOverlay
    public final void setColor(String color) {
        this.color = color;
    }

    @JsOverlay
    public final Date getDate() {
        return date;
    }

    /**
     * Date of an event. Can be a string of date (using chart.dataDateFormat format) or Date object.
     */
    @JsOverlay
    public final void setDate(Date date) {
        this.date = date;
    }

    @JsOverlay
    public final String getDescription() {
        return description;
    }

    /**
     * A description that will be shown in a balloon when user rolls over mouse cursor over event icon.
     */
    @JsOverlay
    public final void setDescription(String description) {
        this.description = description;
    }

    @JsOverlay
    public final double getFontSize() {
        return fontSize;
    }

    /**
     * Specifies font size of a event bullet. Will use graph's or chart font size if not set.
     */
    @JsOverlay
    public final void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }

    @JsOverlay
    public final AmStockGraph getGraph() {
        return graph;
    }

    /**
     * Graph on which event will be displayed. You can use a reference to the stock graph object or id of the graph.
     */
    @JsOverlay
    public final void setGraph(AmStockGraph graph) {
        this.graph = graph;
    }

    @JsOverlay
    public final String getRollOverColor() {
        return rollOverColor;
    }

    /**
     * Roll-over background color. Default to #CC0000
     */
    @JsOverlay
    public final void setRollOverColor(String rollOverColor) {
        this.rollOverColor = rollOverColor;
    }

    @JsOverlay
    public final String getShowAt() {
        return showAt;
    }

    /**
     * Allows placing event bullets at open/close/low/high values.
     */
    @JsOverlay
    public final void setShowAt(String showAt) {
        this.showAt = showAt;
    }

    @JsOverlay
    public final boolean isShowBullet() {
        return showBullet;
    }

    /**
     * If you set it to true, the data point will display both event and regular (if set) bullet. Default to false
     */
    @JsOverlay
    public final void setShowBullet(boolean showBullet) {
        this.showBullet = showBullet;
    }

    @JsOverlay
    public final boolean isShowOnAxis() {
        return showOnAxis;
    }

    /**
     * Specifies if the event should be displayed on category axis. Default to false
     */
    @JsOverlay
    public final void setShowOnAxis(boolean showOnAxis) {
        this.showOnAxis = showOnAxis;
    }

    @JsOverlay
    public final String getText() {
        return text;
    }

    /**
     * Letter which will be displayed on the event. Not all types can display letters. "text" type can display longer texts.
     */
    @JsOverlay
    public final void setText(String text) {
        this.text = text;
    }

    @JsOverlay
    public final String getType() {
        return type;
    }

    /**
     * Type of bullet. Possible values are: "flag", "sign", "pin", "triangleUp", "triangleDown", "triangleLeft",
     * "triangleRight", "text", "arrowUp", "arrowDown".
     */
    @JsOverlay
    public final void setType(BulletType type) {
        this.type = type.getName();
    }

    @JsOverlay
    public final String getUrl() {
        return url;
    }

    /**
     * A URL to go to when user clicks the event.
     */
    @JsOverlay
    public final void setUrl(String url) {
        this.url = url;
    }

    @JsOverlay
    public final String getUrlTarget() {
        return urlTarget;
    }

    /**
     * Target of url, "_blank" for example.
     */
    @JsOverlay
    public final void setUrlTarget(String urlTarget) {
        this.urlTarget = urlTarget;
    }

    @JsOverlay
    public final double getValue() {
        return value;
    }

    /**
     * Allows placing event bullets at specified value.
     */
    @JsOverlay
    public final void setValue(double value) {
        this.value = value;
    }
}
