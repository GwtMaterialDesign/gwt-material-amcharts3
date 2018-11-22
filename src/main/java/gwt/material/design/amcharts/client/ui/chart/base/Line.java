package gwt.material.design.amcharts.client.ui.chart.base;

import gwt.material.design.amcharts.client.ui.chart.properties.IOrientationPoint;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Line extends Sprite {

    @JsProperty
    public Number x1;

    @JsProperty
    public Number x2;

    @JsProperty
    public Number y1;

    @JsProperty
    public Number y2;

    @JsMethod
    public native IOrientationPoint positionToPoint(Number point);
}
