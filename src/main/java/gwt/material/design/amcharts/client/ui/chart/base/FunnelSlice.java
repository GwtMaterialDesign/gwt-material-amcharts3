package gwt.material.design.amcharts.client.ui.chart.base;

import gwt.material.design.amcharts.client.ui.chart.properties.IPoint;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class FunnelSlice extends Container {

    //TODO Adapter

    /**
     * Accepts {@link Number} or {@link Percent}
     */
    @JsProperty
    public Object bottomWidth;

    @JsProperty
    public Number expandDistance;

    /**
     * @see gwt.material.design.amcharts.client.ui.chart.constants.Orientation
     */
    @JsProperty
    public String orientation;

    @JsProperty
    public Sprite slice;

    /**
     * Accepts {@link Number} or {@link Percent}
     */
    @JsProperty
    public Object topWidth;

    @JsMethod
    public native void copyFrom(FunnelSlice source);

    @JsMethod
    public native IPoint getPoint(Number locationX, Number locationY);
}