package gwt.material.design.amcharts.client.ui;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Am4Core {

    @JsMethod(namespace = "am4core")
    public static native Object create(String div, Object chartObject);

    @JsMethod(namespace = "am4core")
    public static native void useTheme(Object object);
}
