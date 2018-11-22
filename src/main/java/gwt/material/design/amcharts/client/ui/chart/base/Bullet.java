package gwt.material.design.amcharts.client.ui.chart.base;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class Bullet extends Container {

    @JsProperty
    public boolean copyToLegendMarker;

    @JsProperty
    public boolean isDynamic;

    @JsProperty
    public Number locationX;

    @JsProperty
    public Number locationY;

    @JsProperty
    public String xField;

    @JsProperty
    public String yField;
}
