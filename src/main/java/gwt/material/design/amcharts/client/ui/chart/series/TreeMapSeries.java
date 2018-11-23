package gwt.material.design.amcharts.client.ui.chart.series;

import gwt.material.design.amcharts.client.ui.chart.datafields.series.ITreeMapSeriesDataFields;
import gwt.material.design.amcharts.client.ui.chart.dataitem.TreeMapDataItem;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class TreeMapSeries extends LineSeries {

    @JsProperty
    public Number level;

    @JsProperty
    public TreeMapDataItem parentDataItem;

    @JsProperty
    public ITreeMapSeriesDataFields dataFields;
}
