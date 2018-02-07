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
package gwt.material.design.amchart.client.ui.stock.js;

//@formatter:off

import gwt.material.design.amchart.client.ui.chart.base.constants.Position;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * PeriodSelector displays date input fields and predefined period buttons.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptstockchart/PeriodSelector">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class PeriodSelector {

    @JsProperty
    private String dateFormat;

    @JsProperty
    private String fromText;

    @JsProperty
    private boolean hideOutOfScopePeriods;

    @JsProperty
    private boolean inputFieldsEnabled;

    @JsProperty
    private double inputFieldWidth;

    @JsProperty
    private Object[] listeners;

    @JsProperty
    private Object[] periods;

    @JsProperty
    private String periodsText;

    @JsProperty
    private String position;

    @JsProperty
    private boolean selectFromStart;

    @JsProperty
    private String toText;

    @JsProperty
    private double width;

    @JsOverlay
    public final String getDateFormat() {
        return dateFormat;
    }

    /**
     * Date format of date input fields. Check this page for possible codes. Note, only numeric date formats are allowed,
     * so don't use MMM or MMMM month format.
     * <p>
     * Please note that two-digit years (YY) is NOT supported in this setting.
     * <p>
     * Default to DD-MM-YYYY
     */
    @JsOverlay
    public final void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    @JsOverlay
    public final String getFromText() {
        return fromText;
    }

    /**
     * Text displayed next to "from" date input field. Default to "From:"
     */
    @JsOverlay
    public final void setFromText(String fromText) {
        this.fromText = fromText;
    }

    @JsOverlay
    public final boolean isHideOutOfScopePeriods() {
        return hideOutOfScopePeriods;
    }

    /**
     * Specifies if period buttons with date range bigger than available data should be hidden. Default to true
     */
    @JsOverlay
    public final void setHideOutOfScopePeriods(boolean hideOutOfScopePeriods) {
        this.hideOutOfScopePeriods = hideOutOfScopePeriods;
    }

    @JsOverlay
    public final boolean isInputFieldsEnabled() {
        return inputFieldsEnabled;
    }

    /**
     * Specifies whether period selector displays "from" and "to" date input fields. Default to true
     */
    @JsOverlay
    public final void setInputFieldsEnabled(boolean inputFieldsEnabled) {
        this.inputFieldsEnabled = inputFieldsEnabled;
    }

    @JsOverlay
    public final double getInputFieldWidth() {
        return inputFieldWidth;
    }

    /**
     * Width of date input fields, in pixels. Works only if period selector is horizontal.
     *
     * @param inputFieldWidth
     */
    @JsOverlay
    public final void setInputFieldWidth(double inputFieldWidth) {
        this.inputFieldWidth = inputFieldWidth;
    }

    @JsOverlay
    public final Object[] getListeners() {
        return listeners;
    }

    /**
     * You can add listeners of events using this property. Example: listeners = [{"event":"changed", "method":handleEvent}];
     */
    @JsOverlay
    public final void setListeners(Object[] listeners) {
        this.listeners = listeners;
    }

    @JsOverlay
    public final Object[] getPeriods() {
        return periods;
    }

    /**
     * Array of predefined period objects. Period object has 4 properties - period, count, label and selected. Possible
     * period values are: "ss" - seconds, "mm" - minutes, "hh" - hours, "DD" - days, "MM" - months and "YYYY" - years.
     * property "count" specifies how many periods this button will select. "label" will be displayed on a button and
     * "selected" is a boolean which specifies if this button is selected when chart is initialized or not.
     * Example: {period:"DD", count:10, label:"10 days", selected:false}.
     */
    @JsOverlay
    public final void setPeriods(Object[] periods) {
        this.periods = periods;
    }

    @JsOverlay
    public final String getPeriodsText() {
        return periodsText;
    }

    /**
     * Text displayed next to predefined period buttons. Default to "Zoom:"
     */
    @JsOverlay
    public final void setPeriodsText(String periodsText) {
        this.periodsText = periodsText;
    }

    @JsOverlay
    public final String getPosition() {
        return position;
    }

    /**
     * Possible values: "right", "left", "top", "bottom". Default to "bottom"
     */
    @JsOverlay
    public final void setPosition(Position position) {
        this.position = position.getName();
    }

    @JsOverlay
    public final boolean isSelectFromStart() {
        return selectFromStart;
    }

    /**
     * Specifies whether predefined period buttons should select a period from the beginning or the end of the data.
     * Default to false
     */
    @JsOverlay
    public final void setSelectFromStart(boolean selectFromStart) {
        this.selectFromStart = selectFromStart;
    }

    @JsOverlay
    public final String getToText() {
        return toText;
    }

    /**
     * Text displayed next to "to" date input field. Default to "To:"
     */
    @JsOverlay
    public final void setToText(String toText) {
        this.toText = toText;
    }

    @JsOverlay
    public final double getWidth() {
        return width;
    }

    /**
     * Width of a period selector, when position is "left" or "right". Default to 180
     */
    @JsOverlay
    public final void setWidth(double width) {
        this.width = width;
    }
}
