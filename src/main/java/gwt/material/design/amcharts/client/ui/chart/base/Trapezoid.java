package gwt.material.design.amcharts.client.ui.chart.base;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Trapezoid extends Sprite {

    @JsProperty
    public Object bottomSide;

    @JsProperty
    public Percent horizontalNeck;

    @JsProperty
    public Object leftSide;

    @JsProperty
    public Object rightSide;

    @JsProperty
    public Object topSide;

    @JsProperty
    public Percent verticalNeck;
}
