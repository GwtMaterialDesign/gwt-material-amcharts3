package gwt.material.design.amcharts.client.ui.chart.base;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class ListTemplate<T extends Object> extends List<T> {

    @JsProperty
    public T template;

    @JsMethod
    public native T getIndex(int index);
}
