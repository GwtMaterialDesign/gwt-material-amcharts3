package gwt.material.design.amcharts.client.ui.chart.dataitem;

import gwt.material.design.amcharts.client.ui.chart.base.Column;
import gwt.material.design.amcharts.client.ui.chart.dictionary.Dictionary;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class XYSeriesDataItem {

    @JsProperty
    public Column column;

    @JsProperty
    public boolean droppedFromOpen;

    @JsProperty
    public boolean droppedFromPrevious;

    @JsProperty
    public Dictionary<Column> rangesColumns;
}
