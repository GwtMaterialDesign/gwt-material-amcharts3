package gwt.material.design.amcharts.client.ui.chart.series;

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
}
