package gwt.material.design.amcharts.client.ui.chart.base;

import gwt.material.design.amcharts.client.ui.chart.properties.IPoint;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class AMElement {

    @JsProperty
    public String content;

    @JsProperty
    public Object node;

    @JsProperty
    public Number rotation;

    @JsProperty
    public Number scale;

    @JsProperty
    public String textContent;

    @JsProperty
    public Number x;

    @JsProperty
    public Number y;

    @JsMethod
    public native void addClass(String name);

    @JsMethod
    public native AMElement addStyle(Object attributes);

    //TODO: ISVGAttributes attr()

    @JsMethod
    public native AMElement attrNS(String namespace, String attribute, String value);

    @JsMethod
    public native void dispose();

    @JsMethod
    public native String getAttr(String attribute);

    @JsMethod
    public native String getAttrNS(String namespace, String attribute);

    // TODO: IRectangle getBBox

    @JsMethod
    public native String getStyle(String attribute);

    @JsMethod
    public native boolean isDisposed();

    @JsMethod
    public native void moveTo(IPoint point);

    @JsMethod
    public native void removeAttr(String attribute);

    @JsMethod
    public native void removeChildNodes();

    @JsMethod
    public native void removeClass(String name);

    @JsMethod
    public native void removeNode();

    @JsMethod
    public native void removeStyle(String attribute);

    @JsMethod
    public native void setClass(String name);
}
