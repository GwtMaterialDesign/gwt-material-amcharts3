package gwt.material.design.amcharts.client.ui.chart;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.amcharts.client.ui.Am4Charts;
import gwt.material.design.amcharts.client.ui.Am4Core;
import gwt.material.design.amcharts.client.ui.chart.axis.Axis;
import gwt.material.design.amcharts.client.ui.chart.base.Container;
import gwt.material.design.amcharts.client.ui.chart.base.List;
import gwt.material.design.amcharts.client.ui.chart.base.ListTemplate;
import gwt.material.design.amcharts.client.ui.chart.cursor.XYCursor;
import gwt.material.design.amcharts.client.ui.chart.resources.ChartClientBundle;
import gwt.material.design.amcharts.client.ui.chart.scrollbar.XYChartScrollbar;
import gwt.material.design.amcharts.client.ui.chart.series.XYSeries;
import gwt.material.design.client.MaterialDesignBase;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class XYChart extends SerialChart {


    //TODO: Find a way to inherit it from {@link Container}
    @JsOverlay
    public static final XYChart create(Widget container) {
        return (XYChart) Am4Core.create(container, Am4Charts.XYChart);
    }

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

    @JsProperty
    public XYCursor cursor;

    @JsProperty
    public Container plotContainer;
}
