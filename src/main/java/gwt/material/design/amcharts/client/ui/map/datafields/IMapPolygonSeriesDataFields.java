package gwt.material.design.amcharts.client.ui.map.datafields;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class IMapPolygonSeriesDataFields extends IMapSeriesDataFields {

    @JsProperty
    public String geoPolygon;

    @JsProperty
    public String multiGeoPolygon;

    @JsProperty
    public String multiPolygon;

    @JsProperty
    public String polygon;
}
