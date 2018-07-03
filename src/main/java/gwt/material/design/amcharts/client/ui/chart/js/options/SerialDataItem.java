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
 * SerialDataItem holds all the information about each series. When working with a chart, you do not create SerialDataItem
 * objects or change it's properties directly. Consider properties of a SerialDataItem read-only - change values in chart's
 * data provider if you need to. When serial chart parses dataProvider, it generates "chartData" array. Objects of this array
 * are SerialDataItem objects.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptcharts/SerialDataItem">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class SerialDataItem {

    @JsProperty
    private Object axes;

    @JsProperty
    private String category;

    @JsProperty
    private Object dataContext;

    @JsProperty
    private int time;

    @JsProperty
    private int x;

    @JsOverlay
    public final Object getAxes() {
        return axes;
    }

    @JsOverlay
    public final void setAxes(Object axes) {
        this.axes = axes;
    }

    @JsOverlay
    public final String getCategory() {
        return category;
    }

    @JsOverlay
    public final void setCategory(String category) {
        this.category = category;
    }

    @JsOverlay
    public final Object getDataContext() {
        return dataContext;
    }

    @JsOverlay
    public final void setDataContext(Object dataContext) {
        this.dataContext = dataContext;
    }

    @JsOverlay
    public final int getTime() {
        return time;
    }

    @JsOverlay
    public final void setTime(int time) {
        this.time = time;
    }

    @JsOverlay
    public final int getX() {
        return x;
    }

    @JsOverlay
    public final void setX(int x) {
        this.x = x;
    }
}
