package gwt.material.design.amcharts.client.ui.chart.base;

import gwt.material.design.amcharts.client.ui.chart.axis.Axis;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class Grid extends Sprite {

    @JsProperty
    public Axis axis;

    @JsProperty
    public Object location;
}
