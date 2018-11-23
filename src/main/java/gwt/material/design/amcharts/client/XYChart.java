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
package gwt.material.design.amcharts.client;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.amcharts.client.axis.Axis;
import gwt.material.design.amcharts.client.base.Button;
import gwt.material.design.amcharts.client.base.Container;
import gwt.material.design.amcharts.client.base.List;
import gwt.material.design.amcharts.client.base.ListTemplate;
import gwt.material.design.amcharts.client.constants.MouseWheelBehavior;
import gwt.material.design.amcharts.client.cursor.XYCursor;
import gwt.material.design.amcharts.client.datafields.chart.IXYChartDataFields;
import gwt.material.design.amcharts.client.properties.IRange;
import gwt.material.design.amcharts.client.scrollbar.XYChartScrollbar;
import gwt.material.design.amcharts.client.series.XYSeries;
import jsinterop.annotations.*;

@JsType(isNative = true, namespace = "am4charts")
public class XYChart extends SerialChart {


    //TODO: Find a way to inherit it from {@link Container}
    @JsOverlay
    public static final XYChart create(Widget container) {
        return (XYChart) Am4Core.create(container, Am4Charts.XYChart);
    }

    @JsProperty
    public XYCursor cursor;

    @JsProperty
    public boolean maskBullets;

    /**
     * @see MouseWheelBehavior
     */
    @JsProperty
    public String mouseWheelBehavior;

    @JsProperty
    public Container plotContainer;

    @JsProperty
    public XYChartScrollbar scrollbarX;

    @JsProperty
    public XYChartScrollbar scrollbarY;

    @JsProperty
    public List<Axis> xAxes;

    @JsProperty
    public List<Axis> yAxes;

    @JsProperty
    public Button zoomOutButton;

    @JsProperty
    public IXYChartDataFields dataFields;

    @JsProperty
    public ListTemplate<XYSeries> series;

    @JsMethod
    public native void addData(Object[] rawDataItem);

    @JsMethod
    public native void addData(Object[] rawDataItem, Number removeCount);

    @JsMethod
    public native void copyFrom(XYChart source);

    @JsMethod
    public native IRange getUpdatedRange(Axis axis, IRange range);
}
