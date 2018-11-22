package gwt.material.design.amcharts.client.ui.chart.base;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Image extends Sprite {

    @JsProperty
    public Number heightRatio;

    @JsProperty
    public String href;

    @JsProperty
    public Number widthRatio;
}
