package gwt.material.design.amcore.client.properties;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class HoverOptions {

    /**
     * @see gwt.material.design.amcore.client.constants.TouchOutBehavior
     */
    @JsProperty
    public String touchOutBehavior;

    @JsProperty
    public Number touchOutDelay;
}
