package gwt.material.design.amcharts.client.ui.chart.base;

import gwt.material.design.amcharts.client.ui.chart.properties.IGradientStop;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class LinearGradient extends BaseObject {

    @JsProperty
    public Group element;

    @JsProperty
    public Number rotation;

    @JsProperty
    public IGradientStop stops;

    @JsMethod
    public native void addColor(Color color);

    @JsMethod
    public native void addColor(Color color, Number opacity, Number offset);

    @JsMethod
    public native void copyFrom(LinearGradient source);
}
