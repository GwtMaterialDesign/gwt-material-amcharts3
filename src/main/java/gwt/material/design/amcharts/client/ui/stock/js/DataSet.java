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

import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * DataSet is objects which holds all information about data.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptstockchart/DataSet">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class DataSet {

    @JsProperty
    private String categoryField;

    @JsProperty
    private String color;

    @JsProperty
    private boolean compared;

    @JsProperty
    private Object[] dataProvider;

    @JsProperty
    private FieldMapping[] fieldMappings;

    @JsProperty
    private boolean showInCompare;

    @JsProperty
    private boolean showInSelect;

    @JsProperty
    private StockEvent[] stockEvents;

    @JsProperty
    private String title;

    @JsOverlay
    public final String getCategoryField() {
        return categoryField;
    }

    /**
     * Category field name in your dataProvider. It needs to contains a date/time value.
     * <p>
     * Note: we recommend using JavaScript timestamps to specify date/time. If you are specifying dates as strings
     * in your data, i.e. "2015-01-05", we strongly recommend setting dataDateFormat as well.
     */
    @JsOverlay
    public final void setCategoryField(String categoryField) {
        this.categoryField = categoryField;
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
     * Color of the data set. One of colors from AmStockChart.colors array will be used if not set.
     */
    @JsOverlay
    public final void setColor(String color) {
        this.color = color;
    }

    @JsOverlay
    public final boolean isCompared() {
        return compared;
    }

    /**
     * Whether this data set is selected for comparing. If you change this property, you should call
     * stockChart.validateData() method in order the changes to be applied. Default to false
     */
    @JsOverlay
    public final void setCompared(boolean compared) {
        this.compared = compared;
    }

    @JsOverlay
    public final Object[] getDataProvider() {
        return dataProvider;
    }

    /**
     * An array of data points to be used as data.
     * <p>
     * Important: the data points needs to come pre-ordered in ascending order. Data with incorrect order might result
     * in visual and functional glitches on the chart.
     */
    @JsOverlay
    public final void setDataProvider(Object[] dataProvider) {
        this.dataProvider = dataProvider;
    }

    @JsOverlay
    public final FieldMapping[] getFieldMappings() {
        return fieldMappings;
    }

    /**
     * Array of field mappings. Field mapping is an object with fromField and toField properties. fromField is a name
     * of your value field in dataProvider. toField might be chosen freely, it will be used to set
     * value/open/close/high/low fields for the AmStockGraph. Example: {fromField:"val1", toField:"value"}.
     */
    @JsOverlay
    public final void setFieldMappings(FieldMapping... fieldMappings) {
        this.fieldMappings = fieldMappings;
    }

    @JsOverlay
    public final boolean isShowInCompare() {
        return showInCompare;
    }

    /**
     * Specifies whether this data set should be visible in "compare to" list. Default to true
     */
    @JsOverlay
    public final void setShowInCompare(boolean showInCompare) {
        this.showInCompare = showInCompare;
    }

    @JsOverlay
    public final boolean isShowInSelect() {
        return showInSelect;
    }

    /**
     * Specifies whether this data set should be visible in "select" dropdown. Default to true
     */
    @JsOverlay
    public final void setShowInSelect(boolean showInSelect) {
        this.showInSelect = showInSelect;
    }

    @JsOverlay
    public final StockEvent[] getStockEvents() {
        return stockEvents;
    }

    /**
     * Array of StockEvent objects.
     */
    @JsOverlay
    public final void setStockEvents(StockEvent[] stockEvents) {
        this.stockEvents = stockEvents;
    }

    @JsOverlay
    public final String getTitle() {
        return title;
    }

    /**
     * DataSet title.
     */
    @JsOverlay
    public final void setTitle(String title) {
        this.title = title;
    }
}
