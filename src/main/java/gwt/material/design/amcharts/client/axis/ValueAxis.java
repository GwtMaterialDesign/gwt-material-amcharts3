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
package gwt.material.design.amcharts.client.axis;

import gwt.material.design.amcharts.client.SerialChart;
import gwt.material.design.amcharts.client.base.List;
import gwt.material.design.amcharts.client.datafields.axis.IValueAxisDataFields;
import gwt.material.design.amcharts.client.properties.IOrientationPoint;
import gwt.material.design.amcharts.client.properties.IPoint;
import gwt.material.design.amcharts.client.series.XYSeries;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class ValueAxis extends Axis {

    @JsProperty
    public Number baseValue;

    @JsProperty
    public boolean calculateTotals;

    @JsProperty
    public SerialChart chart;

    @JsProperty
    public Number extraMax;

    @JsProperty
    public Number extraMin;

    @JsProperty
    public boolean logarithmic;

    @JsProperty
    public Number max;

    @JsProperty
    public Number maxPrecision;

    @JsProperty
    public Number maxZoomed;

    @JsProperty
    public Number min;

    @JsProperty
    public Number minZoomed;

    @JsProperty
    public List<XYSeries> series;

    @JsProperty
    public Number step;

    @JsProperty
    public boolean strictMinMax;

    @JsMethod
    public native IOrientationPoint anyToPoint(Number value);

    @JsMethod
    public native Number anyToPosition(Number value);

    @JsMethod
    public native void copyFrom(ValueAxis source);

    //TODO: ValueAxisDataItem fillRUle

    @JsProperty
    public IValueAxisDataFields dataFields;

    @JsMethod
    public native String formatLabel(Number value);

    @JsMethod
    public native String getPositionLabel(Number position);

    @JsMethod
    public native Number pointToPosition(IPoint point);

    @JsMethod
    public native Number positionToValue(Number position);

    @JsMethod
    public native void showTooltipAt(Number value);

    @JsMethod
    public native IOrientationPoint valueToPoint(Number value);

    @JsMethod
    public native Number valueToPosition(Number value);

    @JsMethod
    public native Number xToValue(Number x);

    @JsMethod
    public native Number yToValue(Number y);

    @JsMethod
    public native void zoomToValues(Number start, Number end);

    @JsMethod
    public native void zoomToValues(Number start, Number end, boolean skipRangeEvent, boolean instantly);
}
