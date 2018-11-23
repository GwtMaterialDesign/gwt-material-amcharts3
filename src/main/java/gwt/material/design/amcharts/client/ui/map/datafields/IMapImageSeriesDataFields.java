package gwt.material.design.amcharts.client.ui.map.datafields;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class IMapImageSeriesDataFields extends IMapSeriesDataFields {

    @JsProperty
    public String geoPoint;

    @JsProperty
    public String multiGeoPoint;

    @JsProperty
    public String multiPoint;

    @JsProperty
    public String point;
}
