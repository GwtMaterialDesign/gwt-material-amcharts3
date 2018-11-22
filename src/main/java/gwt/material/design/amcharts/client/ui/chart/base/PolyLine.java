package gwt.material.design.amcharts.client.ui.chart.base;

import gwt.material.design.amcharts.client.ui.chart.properties.IOrientationPoint;
import gwt.material.design.amcharts.client.ui.chart.properties.IPoint;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class PolyLine extends Sprite {

    @JsProperty
    public Number distance;

    @JsProperty
    public IPoint[] segments;

    @JsMethod
    public native IOrientationPoint positionToPoint(Number number);
}
