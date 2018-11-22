package gwt.material.design.amcharts.client.ui.chart.axis;

import gwt.material.design.amcharts.client.ui.chart.base.Sprite;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class AxisTick extends Sprite {

    @JsProperty
    public Axis axis;

    @JsProperty
    public boolean inside;

    //TODO: AxisItemLocation
}
