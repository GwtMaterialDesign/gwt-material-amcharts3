package gwt.material.design.amcharts.client.ui.chart.series;

import gwt.material.design.amcharts.client.ui.chart.base.FunnelSlice;
import gwt.material.design.amcharts.client.ui.chart.base.ListTemplate;
import gwt.material.design.amcharts.client.ui.chart.datafields.series.IFunnelSeriesDataFields;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class FunnelSeries extends PercentSeries {

    @JsProperty
    public Number bottomRatio;

    /**
     * @see gwt.material.design.amcharts.client.ui.chart.constants.Orientation
     */
    @JsProperty
    public String orientation;

    @JsProperty
    public ListTemplate<FunnelSlice> sliceLinks;

    @JsProperty
    public IFunnelSeriesDataFields dataFields;
}
