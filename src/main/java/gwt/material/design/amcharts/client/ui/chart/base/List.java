package gwt.material.design.amcharts.client.ui.chart.base;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class List<T extends Object> {

    @JsMethod
    public native T push(T object);

    @JsMethod
    public native T getIndex(int index);
}
