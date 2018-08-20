package gwt.material.design.amcharts.client.ui.chart.datafields;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class IPieSeriesDataFields {

    @JsProperty
    public String category;

    @JsProperty
    public String data;

    @JsProperty
    public boolean hiddenInLegend;

    @JsProperty
    public String value;

    @JsProperty
    public boolean visible;
}
