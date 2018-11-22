package gwt.material.design.amcharts.client.ui.chart.dataitem;

import gwt.material.design.amcharts.client.ui.chart.axis.*;
import gwt.material.design.amcharts.client.ui.chart.base.Container;
import gwt.material.design.amcharts.client.ui.chart.properties.IPoint;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class AxisDataItem extends DataItem {

    @JsProperty
    public AxisBreak axisBreak;

    @JsProperty
    public AxisFill axisFill;

    @JsProperty
    public Container contents;

    @JsProperty
    public Grid grid;

    @JsProperty
    public AxisLabel label;

    @JsProperty
    public AxisFill mask;

    @JsProperty
    public IPoint point;

    @JsProperty
    public Number position;

    @JsProperty
    public Number value;

    @JsProperty
    public Number startValue;

    @JsProperty
    public Number endValue;

    @JsProperty
    public String text;

    @JsProperty
    public AxisTick tick;
}
