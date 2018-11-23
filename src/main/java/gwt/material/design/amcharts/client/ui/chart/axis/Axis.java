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
package gwt.material.design.amcharts.client.ui.chart.axis;

import gwt.material.design.amcharts.client.ui.chart.Chart;
import gwt.material.design.amcharts.client.ui.chart.base.Label;
import gwt.material.design.amcharts.client.ui.chart.base.List;
import gwt.material.design.amcharts.client.ui.chart.base.ListTemplate;
import gwt.material.design.amcharts.client.ui.chart.base.Sprite;
import gwt.material.design.amcharts.client.ui.chart.datafields.axis.IAxisDataFields;
import gwt.material.design.amcharts.client.ui.chart.dataitem.AxisDataItem;
import gwt.material.design.amcharts.client.ui.chart.properties.IOrientationPoint;
import gwt.material.design.amcharts.client.ui.chart.properties.IPoint;
import gwt.material.design.amcharts.client.ui.chart.renderer.AxisRenderer;
import gwt.material.design.amcharts.client.ui.chart.series.XYSeries;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class Axis extends Sprite {

    @JsProperty
    public boolean autoDispose;

    //TODO: SortedListTemplate axisBreaks

    @JsProperty
    public Number axisFullLength;

    @JsProperty
    public Number axisLength;

    @JsProperty
    public ListTemplate<AxisDataItem> axisRanges;

    @JsProperty
    public Chart chart;

    @JsProperty
    public boolean cursorTooltipEnabled;

    @JsProperty
    public Number endLocation;

    @JsProperty
    public AxisLabel ghostLabel;

    @JsProperty
    public AxisRenderer renderer;

    @JsProperty
    public List<XYSeries> series;

    @JsProperty
    public Number startLocation;

    @JsProperty
    public Label title;

    @JsMethod
    public native IOrientationPoint anyToPoint(Number value);

    @JsMethod
    public native Number anyToPosition(Number value);

    /* TODO:
    @JsMethod
    public native void appendDataItem(AxisDataItem dataItem);*/

    @JsMethod
    public native void copyFrom(Axis axis);

    // TODO: createSeriesRange

    // TODO: fillRule

    @JsProperty
    public IAxisDataFields dataFields;

    @JsMethod
    public native String getPositionLabel(Number position);

    @JsMethod
    public native void invalidateSeries();

    @JsMethod
    public native Number pointToPosition(IPoint point);

    @JsMethod
    public native Number positionToAngle(Number position);

    @JsMethod
    public native void showTooltipAtPosition(Number position);

    @JsMethod
    public native void toAxisPosition(Number position);
}
