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

import gwt.material.design.amcharts.client.ui.chart.base.constants.Position;
import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.*;

/**
 * DataSetSelector is a tool for selecting data set's as main and for comparing with main data set.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptstockchart/DataSetSelector">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class DataSetSelector {

    @JsProperty
    public String comboBoxSelectText;

    @JsProperty
    public String compareText;

    @JsProperty
    public Object[] listeners;

    @JsProperty
    public double listHeight;

    @JsProperty
    public String position;

    @JsProperty
    public String selectText;

    @JsProperty
    public double width;

    /**
     * Adds event listener to the object.
     */
    @JsMethod
    public native void addListener(String type, Functions.Func handler);

    /**
     * Removes event listener from the object.
     */
    @JsMethod
    public native void removeListener(String type, Functions.Func handler);

    @JsOverlay
    public final String getComboBoxSelectText() {
        return comboBoxSelectText;
    }

    /**
     * Text displayed in the "compare to" combobox (when position is "top" or "bottom"). Default to "Select..."
     */
    @JsOverlay
    public final void setComboBoxSelectText(String comboBoxSelectText) {
        this.comboBoxSelectText = comboBoxSelectText;
    }

    @JsOverlay
    public final String getCompareText() {
        return compareText;
    }

    /**
     * Text displayed near "compare to" list. Default to "Compare to:"
     */
    @JsOverlay
    public final void setCompareText(String compareText) {
        this.compareText = compareText;
    }

    @JsOverlay
    public final Object[] getListeners() {
        return listeners;
    }

    /**
     * You can add listeners of events using this property.
     * <p>
     * Example: listeners = [{"event":"dataSetCompared", "method":handleEvent}];
     */
    @JsOverlay
    public final void setListeners(Object[] listeners) {
        this.listeners = listeners;
    }

    @JsOverlay
    public final double getListHeight() {
        return listHeight;
    }

    /**
     * The maximum height of the Compare to field in pixels. Default to 150
     */
    @JsOverlay
    public final void setListHeight(double listHeight) {
        this.listHeight = listHeight;
    }

    @JsOverlay
    public final String getPosition() {
        return position;
    }

    /**
     * Possible values: "right", "left", "top", "bottom". "top" and "bottom" positions has a limitation - only one
     * data set can be selected for comparing.
     */
    @JsOverlay
    public final void setPosition(Position position) {
        this.position = position.getName();
    }

    @JsOverlay
    public final String getSelectText() {
        return selectText;
    }

    /**
     * Text displayed near "Select" dropDown. Default to "Select:"
     */
    @JsOverlay
    public final void setSelectText(String selectText) {
        this.selectText = selectText;
    }

    @JsOverlay
    public final double getWidth() {
        return width;
    }

    /**
     * Width of a Data set selector, when position is "left" or "right". Default to 180
     */
    @JsOverlay
    public final void setWidth(double width) {
        this.width = width;
    }

    // TODO Events
}
