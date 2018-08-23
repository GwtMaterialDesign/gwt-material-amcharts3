package gwt.material.design.amcharts.client.ui.map.series;

import gwt.material.design.amcharts.client.ui.chart.base.ListTemplate;
import gwt.material.design.amcharts.client.ui.map.base.MapPolygon;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4maps")
public class MapPolygonSeries extends MapSeries {

    @JsProperty
    public ListTemplate<MapPolygon> mapPolygons;
}
