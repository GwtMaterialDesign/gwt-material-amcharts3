package gwt.material.design.amcharts.client.ui.chart.base;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class List<T extends Object> {

    @JsMethod
    public native T push(T object);
}
