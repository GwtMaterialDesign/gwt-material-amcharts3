package gwt.material.design.amcore.client.properties;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class CursorOptions {

    @JsProperty
    public StyleProperty[] defaultStyle;

    @JsProperty
    public StyleProperty[] downStyle;

    @JsProperty
    public StyleProperty[] overStyle;
}
