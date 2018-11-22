package gwt.material.design.amcharts.client.ui.chart.base;

import gwt.material.design.amcharts.client.ui.chart.animation.Morpher;
import gwt.material.design.amcharts.client.ui.chart.properties.IPoint;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Polygon extends Sprite {

    @JsProperty
    public IPoint centerPoint;

    @JsProperty
    public IPoint[] currentPoints;

    @JsProperty
    public Morpher morpher;

    @JsProperty
    public IPoint[] points;
}
