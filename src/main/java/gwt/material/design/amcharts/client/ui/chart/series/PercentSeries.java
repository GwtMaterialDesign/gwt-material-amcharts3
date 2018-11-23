package gwt.material.design.amcharts.client.ui.chart.series;

import gwt.material.design.amcharts.client.ui.chart.base.*;
import gwt.material.design.amcharts.client.ui.chart.datafields.series.IPercentSeriesDataFields;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class PercentSeries extends Series {

    @JsProperty
    public boolean alignLabels;

    @JsProperty
    public ColorSet colors;

    @JsProperty
    public ListTemplate<Label> labels;

    @JsProperty
    public ListTemplate<FunnelSlice> slices;

    @JsProperty
    public ListTemplate<FunnelTick> ticks;

    @JsProperty
    public IPercentSeriesDataFields dataFields;

    @JsMethod
    public native void copyFrom(PercentSeries source);
}
