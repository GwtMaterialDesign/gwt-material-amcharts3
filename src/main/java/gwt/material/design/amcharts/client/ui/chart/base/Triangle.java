package gwt.material.design.amcharts.client.ui.chart.base;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Triangle extends Sprite {

    /**
     * @see gwt.material.design.amcharts.client.ui.chart.constants.Direction
     */
    @JsProperty
    public String direction;
}
