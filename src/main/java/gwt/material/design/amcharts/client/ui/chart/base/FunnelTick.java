package gwt.material.design.amcharts.client.ui.chart.base;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class FunnelTick extends Tick {

    @JsProperty
    public Label label;

    @JsProperty
    public Number locationX;

    @JsProperty
    public Number locationY;

    @JsProperty
    public FunnelSlice slice;
}