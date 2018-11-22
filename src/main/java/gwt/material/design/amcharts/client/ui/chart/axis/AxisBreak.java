package gwt.material.design.amcharts.client.ui.chart.axis;

import gwt.material.design.amcharts.client.ui.chart.axis.Axis;
import gwt.material.design.amcharts.client.ui.chart.base.Container;
import gwt.material.design.amcharts.client.ui.chart.base.List;
import gwt.material.design.amcharts.client.ui.chart.dataitem.DataItem;
import gwt.material.design.amcharts.client.ui.chart.properties.IPoint;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class AxisBreak extends Container {

    //TODO: adapter

    @JsProperty
    public Number adjustedEndValue;

    @JsProperty
    public Number adjustedStartValue;

    @JsProperty
    public Axis axis;

    @JsProperty
    public Number breakSize;

    @JsProperty
    public List<DataItem> dataItems;

    //TODO: endLine

    @JsProperty
    public IPoint endPoint;

    @JsProperty
    public Number endPosition;

    @JsProperty
    public Number endValue;

    //TODO: fillShape

    //TODO: startLine

    @JsProperty
    public IPoint startPoint;

    @JsProperty
    public Number startPosition;

    @JsProperty
    public Number startValue;

    @JsMethod
    public native void dispose();
}
