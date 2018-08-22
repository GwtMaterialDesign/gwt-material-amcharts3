package gwt.material.design.amcharts.client.ui.chart.base;

import gwt.material.design.amcharts.client.ui.chart.data.DataSource;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Component extends Container {

    @JsProperty
    public DataSource dataSource;

    @JsMethod
    public native void zoomToIndexes(int startIndex, int endIndex, boolean skipRangeEvent, boolean instantly);

    @JsMethod
    public native void zoomToIndexes(int startIndex, int endIndex);
}
