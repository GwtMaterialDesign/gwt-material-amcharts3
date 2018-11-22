package gwt.material.design.amcharts.client.ui.chart;

import gwt.material.design.amcharts.client.ui.chart.base.Container;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class RadarChart extends XYChart {

    @JsProperty
    public Number endAngle;

    @JsProperty
    public Object innerRadius;

    @JsProperty
    public Number pixelInnerRadius;

    @JsProperty
    public Container radarContainer;

    @JsProperty
    public Object radius;

    @JsProperty
    public Number startAngle;
}
