package gwt.material.design.amcharts.client.ui.map.datafields;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class IMapLineSeriesDataFields extends IMapSeriesDataFields {

    @JsProperty
    public String geoLine;

    @JsProperty
    public String line;

    @JsProperty
    public String multiGeoLine;

    @JsProperty
    public String multiLine;
}
