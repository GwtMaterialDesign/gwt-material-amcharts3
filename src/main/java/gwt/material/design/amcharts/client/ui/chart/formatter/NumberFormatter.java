package gwt.material.design.amcharts.client.ui.chart.formatter;

import gwt.material.design.amcharts.client.ui.chart.base.BaseObject;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class NumberFormatter extends BaseObject {

    @JsProperty
    public String numberFormat;
}
