package gwt.material.design.amcharts.client.ui.chart.filter;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class DesaturateFilter extends Filter {

    @JsProperty
    public int saturation;
}
