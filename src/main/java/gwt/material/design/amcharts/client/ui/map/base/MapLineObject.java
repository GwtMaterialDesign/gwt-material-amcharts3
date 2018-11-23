package gwt.material.design.amcharts.client.ui.map.base;

import gwt.material.design.amcharts.client.ui.chart.base.Container;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4maps")
public class MapLineObject extends Container {

    @JsProperty
    public boolean adjustRotation;

    @JsProperty
    public MapLine mapLine;

    @JsProperty
    public Number position;
}
