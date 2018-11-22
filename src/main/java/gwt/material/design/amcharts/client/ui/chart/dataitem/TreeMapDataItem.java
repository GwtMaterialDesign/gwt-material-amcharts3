package gwt.material.design.amcharts.client.ui.chart.dataitem;

import gwt.material.design.amcharts.client.ui.chart.base.Color;
import gwt.material.design.amcharts.client.ui.chart.base.Container;
import gwt.material.design.amcharts.client.ui.chart.series.TreeMapSeries;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class TreeMapDataItem extends DataItem {

    //TODO: children

    @JsProperty
    public Color color;

    @JsProperty
    public Number level;

    @JsProperty
    public String name;

    @JsProperty
    public Number percent;

    @JsProperty
    public TreeMapSeries series;

    //TODO: seriesDataItem

    @JsProperty
    public Number value;
}
