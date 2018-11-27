package gwt.material.design.amcore.client.properties;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ContainerProperties extends SpriteProperties{

    /**
     * @see gwt.material.design.amcore.client.constants.Align
     */
    @JsProperty
    public String contentAlign;

    @JsProperty
    public String fontFamily;

    @JsProperty
    public Number fontSize;

    /**
     * @see gwt.material.design.amcore.client.constants.FontWeight
     */
    @JsProperty
    public String fontWeight;

    /**
     * @see gwt.material.design.amcore.client.constants.ContainerLayout
     */
    @JsProperty
    public String layout;

    /**
     * @see gwt.material.design.amcore.client.constants.TextDecoration
     */
    @JsProperty
    public String textDecoration;
}
