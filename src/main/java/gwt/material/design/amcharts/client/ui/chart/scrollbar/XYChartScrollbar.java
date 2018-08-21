package gwt.material.design.amcharts.client.ui.chart.scrollbar;

import gwt.material.design.amcharts.client.ui.chart.XYChart;
import gwt.material.design.amcharts.client.ui.chart.base.List;
import gwt.material.design.amcharts.client.ui.chart.series.XYSeries;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class XYChartScrollbar {

    @JsProperty
    public List<XYSeries> series;

    @JsProperty
    public XYChart scrollbarChart;
}
