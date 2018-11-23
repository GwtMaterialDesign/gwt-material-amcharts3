package gwt.material.design.amcharts.client.ui.chart;

import gwt.material.design.amcharts.client.ui.chart.base.ListTemplate;
import gwt.material.design.amcharts.client.ui.chart.datafields.chart.ISlicedChartDataFields;
import gwt.material.design.amcharts.client.ui.chart.series.FunnelSeries;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class SlicedChart extends PercentChart {

    @JsProperty
    public ISlicedChartDataFields dataFields;

    @JsProperty
    public ListTemplate<FunnelSeries> series;
}
