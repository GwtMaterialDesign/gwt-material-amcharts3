package gwt.material.design.amcharts.client.ui.chart.events;

import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class EventDispatcher {

    @JsMethod
    public native void copyFrom(Object source);

    @JsMethod
    public native void disable();

    @JsMethod
    public native void disableType(String key, int amount);

    @JsMethod
    public native void dispatchImmediately(String key, Object event);

    @JsMethod
    public native void dispose();

    @JsMethod
    public native void enable();

    @JsMethod
    public native void enableType(String type);

    @JsMethod
    public native boolean has(String key, Functions.Func1<Object> callback, Object context);

    @JsMethod
    public native boolean hasListeners();

    @JsMethod
    public native boolean isDisposed();

    @JsMethod
    public native boolean isEnabled(String key);

    @JsMethod
    public native void off(String key, Functions.Func1<Object> callback, Object context);

    @JsMethod
    public native void on(String event, Functions.Func1<Object> callback, Object source);

    @JsMethod
    public native void onAll(Functions.Func1<Object> callback, Object source);

    @JsMethod
    public native void once(String event, Functions.Func1<Object> callback, Object source);

}
