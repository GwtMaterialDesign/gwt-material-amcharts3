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

//@formatter:off

import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * GraphDataItem holds all the information about the graph's data item. When working with a chart, you do not create
 * GraphDataItem objects or change it's properties directly. GraphDataItem is passed to you by events when user interacts
 * with data item on the chart. The list of properties below will help you to extract data item's value/coordinate/etc.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptcharts/GraphDataItem">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class GraphDataItem {

    @JsProperty
    private double alpha;

    @JsProperty
    private String bullet;

    @JsProperty
    private int bulletSize;

    @JsProperty
    private String category;

    @JsProperty
    private String color;

    @JsProperty
    private String customBullet;

    @JsProperty
    private Object dataContext;

    @JsProperty
    private String description;

    @JsProperty
    private String[] fillColors;

    @JsProperty
    private Object percents;

    @JsProperty
    private SerialDataItem serialDataItem;

    @JsProperty
    private String url;

    @JsProperty
    private Values values;

    @JsProperty
    private int x;

    @JsProperty
    private int y;

    @JsOverlay
    public final double getAlpha() {
        return alpha;
    }

    /**
     * Opacity of the data item.
     */
    @JsOverlay
    public final void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    @JsOverlay
    public final String getBullet() {
        return bullet;
    }

    /**
     * Bullet type.
     */
    @JsOverlay
    public final void setBullet(String bullet) {
        this.bullet = bullet;
    }

    @JsOverlay
    public final int getBulletSize() {
        return bulletSize;
    }

    /**
     * Bullet size.
     */
    @JsOverlay
    public final void setBulletSize(int bulletSize) {
        this.bulletSize = bulletSize;
    }

    @JsOverlay
    public final String getCategory() {
        return category;
    }

    /**
     * Category value.
     */
    @JsOverlay
    public final void setCategory(String category) {
        this.category = category;
    }

    @JsOverlay
    public final String getColor() {
        return color;
    }

    /**
     * Color of the data item.
     */
    @JsOverlay
    public final void setColor(String color) {
        this.color = color;
    }

    @JsOverlay
    public final void setColor(Color color) {
        setColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    @JsOverlay
    public final String getCustomBullet() {
        return customBullet;
    }

    /**
     * Custom bullet (path to file name).
     */
    @JsOverlay
    public final void setCustomBullet(String customBullet) {
        this.customBullet = customBullet;
    }

    @JsOverlay
    public final Object getDataContext() {
        return dataContext;
    }

    /**
     * Original object from data provider.
     */
    @JsOverlay
    public final void setDataContext(Object dataContext) {
        this.dataContext = dataContext;
    }

    @JsOverlay
    public final String getDescription() {
        return description;
    }

    /**
     * Description.
     */
    @JsOverlay
    public final void setDescription(String description) {
        this.description = description;
    }

    @JsOverlay
    public final String[] getFillColors() {
        return fillColors;
    }

    /**
     * Array of colors of the data item, used by column and candlestick chart only.
     */
    @JsOverlay
    public final void setFillColors(String[] fillColors) {
        this.fillColors = fillColors;
    }

    @JsOverlay
    public final void setFillColors(Color... colors) {
        for (int i = 0; i < colors.length; i++) {
            this.fillColors[i] = ColorHelper.setupComputedBackgroundColor(colors[i]);
        }
    }

    @JsOverlay
    public final Object getPercents() {
        return percents;
    }

    /**
     * Object which holds percents when recalculateToPercents is set to true.
     */
    @JsOverlay
    public final void setPercents(Object percents) {
        this.percents = percents;
    }

    @JsOverlay
    public final SerialDataItem getSerialDataItem() {
        return serialDataItem;
    }

    @JsOverlay
    public final void setSerialDataItem(SerialDataItem serialDataItem) {
        this.serialDataItem = serialDataItem;
    }

    @JsOverlay
    public final String getUrl() {
        return url;
    }

    /**
     * url
     */
    @JsOverlay
    public final void setUrl(String url) {
        this.url = url;
    }

    @JsOverlay
    public final Values getValues() {
        return values;
    }

    /**
     * Object which holds values of the data item (value, open, close, low, high).
     */
    @JsOverlay
    public final void setValues(Values values) {
        this.values = values;
    }

    @JsOverlay
    public final int getX() {
        return x;
    }

    /**
     * x coordinate of the data item.
     */
    @JsOverlay
    public final void setX(int x) {
        this.x = x;
    }

    @JsOverlay
    public final int getY() {
        return y;
    }

    /**
     * y coordinate of the data item.
     */
    @JsOverlay
    public final void setY(int y) {
        this.y = y;
    }
}
