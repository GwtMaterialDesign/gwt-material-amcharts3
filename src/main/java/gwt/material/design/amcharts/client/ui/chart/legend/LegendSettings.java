package gwt.material.design.amcharts.client.ui.chart.legend;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class LegendSettings {

    @JsProperty
    public boolean createMarker;

    @JsProperty
    public String itemLabelText;

    @JsProperty
    public String itemValueText;

    @JsProperty
    public String labelText;

    @JsProperty
    public String valueText;
}
