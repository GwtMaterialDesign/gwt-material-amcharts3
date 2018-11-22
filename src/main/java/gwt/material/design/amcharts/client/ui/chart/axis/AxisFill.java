package gwt.material.design.amcharts.client.ui.chart.axis;

import gwt.material.design.amcharts.client.ui.chart.axis.Axis;
import gwt.material.design.amcharts.client.ui.chart.base.Sprite;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class AxisFill extends Sprite {

    @JsProperty
    public Axis axis;

    @JsProperty
    public Number endPosition;

    @JsProperty
    public Object location;

    @JsProperty
    public Number startPosition;
}
