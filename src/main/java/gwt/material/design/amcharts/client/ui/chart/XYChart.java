package gwt.material.design.amcharts.client.ui.chart;

import gwt.material.design.amcharts.client.ui.chart.axis.Axis;
import gwt.material.design.amcharts.client.ui.chart.base.List;
import gwt.material.design.amcharts.client.ui.chart.base.ListTemplate;
import gwt.material.design.amcharts.client.ui.chart.scrollbar.XYChartScrollbar;
import gwt.material.design.amcharts.client.ui.chart.series.XYSeries;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class XYChart extends SerialChart {

    @JsProperty
    public ListTemplate<XYSeries> series;

    @JsProperty
    public List<Axis> xAxes;

    @JsProperty
    public List<Axis> yAxes;

    @JsProperty
    public XYChartScrollbar scrollbarX;

    @JsProperty
    public XYChartScrollbar scrollbarY;
}
