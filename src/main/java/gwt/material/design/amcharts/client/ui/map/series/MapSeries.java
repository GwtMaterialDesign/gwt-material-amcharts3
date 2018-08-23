package gwt.material.design.amcharts.client.ui.map.series;

import gwt.material.design.amcharts.client.ui.chart.series.Series;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true, namespace = "am4maps")
public class MapSeries extends Series {

    @JsProperty
    public boolean useGeodata;
}
