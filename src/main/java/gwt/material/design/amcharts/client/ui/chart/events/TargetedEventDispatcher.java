package gwt.material.design.amcharts.client.ui.chart.events;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class TargetedEventDispatcher extends EventDispatcher {

    @JsMethod
    public native void copyFrom(Object source);
}
