package gwt.material.design.amcharts.client.ui.chart;

import gwt.material.design.amcharts.client.ui.chart.base.ListTemplate;
import gwt.material.design.amcharts.client.ui.chart.datafields.chart.IPercentChartDataFields;
import gwt.material.design.amcharts.client.ui.chart.series.PercentSeries;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class PercentChart extends SerialChart {

    @JsProperty
    public IPercentChartDataFields dataFields;

    @JsProperty
    public ListTemplate<PercentSeries> series;
}
