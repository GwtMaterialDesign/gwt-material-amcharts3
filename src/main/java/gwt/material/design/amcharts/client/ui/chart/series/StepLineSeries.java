package gwt.material.design.amcharts.client.ui.chart.series;

import gwt.material.design.amcharts.client.ui.chart.datafields.series.IStepLineSeriesDataFields;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class StepLineSeries extends LineSeries {

    @JsProperty
    public Number endLocation;

    @JsProperty
    public boolean noRisers;

    @JsProperty
    public Number startLocation;

    @JsProperty
    public IStepLineSeriesDataFields dataFields;
}
