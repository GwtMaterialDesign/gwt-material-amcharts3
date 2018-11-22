package gwt.material.design.amcharts.client.ui.chart.base;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Group extends AMElement {

    @JsProperty
    public String content;

    @JsMethod
    public native void add(AMElement element);

    @JsMethod
    public native void addToBack(AMElement element);

    @JsMethod
    public native void removeChildren();

    @JsMethod
    public native void removeElement(AMElement element);
}
