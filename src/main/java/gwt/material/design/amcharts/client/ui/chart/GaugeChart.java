package gwt.material.design.amcharts.client.ui.chart;

import gwt.material.design.amcharts.client.ui.chart.base.ClockHand;
import gwt.material.design.amcharts.client.ui.chart.base.ListTemplate;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class GaugeChart extends RadarChart {

    @JsProperty
    public ListTemplate<ClockHand> hands;
}
