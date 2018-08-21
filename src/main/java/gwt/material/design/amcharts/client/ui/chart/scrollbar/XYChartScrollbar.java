package gwt.material.design.amcharts.client.ui.chart.scrollbar;

import gwt.material.design.amcharts.client.ui.chart.XYChart;
import gwt.material.design.amcharts.client.ui.chart.base.List;
import gwt.material.design.amcharts.client.ui.chart.series.XYSeries;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * A special version of the Scrollbar that has an XY chart in it.
 * <p>
 * Used mainly as an advanced scrollbar with a preview for other XY charts.
 * <p>
 * However, can be used as standalone element.
 *
 * @author kevzlou7979
 */
@JsType(isNative = true, namespace = "am4charts")
public class XYChartScrollbar {

    /**
     * A chart that Scrollbar belongs to.
     */
    @JsProperty
    public XYChart chart;

    /**
     * A chart element that is used to display graphs in the Scrollbar.
     * <p>
     * This is not the same as chart. It's a totally independent instance of XYChart with separate config, series, etc.
     * <p>
     * It can be configured just like any other XYChart.
     */
    @JsProperty
    public XYChart scrollbarChart;

    /**
     * A list of series that are used to draw graph(s) on the scrollbar.
     */
    @JsProperty
    public List<XYSeries> series;

    @JsMethod
    public native XYChartScrollbar constructor();

}
