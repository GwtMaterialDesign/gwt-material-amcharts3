package gwt.material.design.amcharts.client.ui.chart.axis;

import gwt.material.design.amcharts.client.ui.chart.datafields.axis.IDurationAxisDataFields;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class DurationAxis extends ValueAxis {

    @JsProperty
    public String axisDurationFormat;

    //TODO: TimeUnit baseUnit

    @JsProperty
    public String tooltipDurationFormat;

    @JsMethod
    public native void copyFrom(DurationAxis source);

    @JsMethod
    public native String formatLabel(Number value);

    @JsMethod
    public native String formatLabel(Number value, String format);

    @JsProperty
    public IDurationAxisDataFields dataFields;
}
