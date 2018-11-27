package gwt.material.design.amcore.client.properties;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class HitOptions extends SpriteProperties {

    @JsProperty
    public Number doubleHitTime;

    @JsProperty
    public Number hitTolerance;

    @JsProperty
    public boolean noFocus;
}
