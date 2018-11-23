package gwt.material.design.amcharts.client.ui.map.datafields;

import gwt.material.design.amcharts.client.ui.chart.datafields.series.ISeriesDataFields;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class IMapSeriesDataFields extends ISeriesDataFields {

    @JsProperty
    public String value;
}
