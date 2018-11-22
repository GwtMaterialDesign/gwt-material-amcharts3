package gwt.material.design.amcharts.client.ui.chart.base;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class PointedShape extends Sprite {

    @JsProperty
    public Number pointerBaseWidth;

    @JsProperty
    public Number pointerLength;

    @JsProperty
    public Number pointerX;

    @JsProperty
    public Number pointerY;
}
