package gwt.material.design.amcharts.client.ui.chart.series;

import gwt.material.design.amcharts.client.ui.chart.datafields.series.IPyramidSeriesDataFields;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class PyramidSeries extends FunnelSeries {

    /**
     * Accepts {@link Number} or {@link gwt.material.design.amcharts.client.ui.chart.base.Percent}
     */
    @JsProperty
    public Object bottomWidth;

    /**
     * Accepts {@link Number} or {@link gwt.material.design.amcharts.client.ui.chart.base.Percent}
     */
    @JsProperty
    public Object pyramidHeight;

    /**
     * Accepts {@link Number} or {@link gwt.material.design.amcharts.client.ui.chart.base.Percent}
     */
    @JsProperty
    public Object topWidth;

    /**
     * @see gwt.material.design.amcharts.client.ui.chart.constants.PyramidValues
     */
    @JsProperty
    public String values;

    @JsProperty
    public IPyramidSeriesDataFields dataFields;
}
