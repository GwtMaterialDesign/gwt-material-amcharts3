package gwt.material.design.amcharts.client.ui.chart.adapter;

import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Adapter {

    @JsMethod
    public native void add(String key, Functions.FuncRet1<Object> callback);
}
