package gwt.material.design.amcharts.client.ui.chart.base;

import gwt.material.design.amcharts.client.ui.chart.axis.Axis;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class ClockHand extends Container {

    @JsProperty
    public Axis axis;

    @JsProperty
    public Number endWidth;

    @JsProperty
    public Trapezoid hand;

    /**
     * Accepts {@link Number} or {@link Percent}
     */
    @JsProperty
    public Object innerRadius;

    @JsProperty
    public Circle pin;

    /**
     * Accepts {@link Number} or {@link Percent}
     */
    @JsProperty
    public Object radius;

    /**
     * @see gwt.material.design.amcharts.client.ui.chart.constants.RotationDirection
     */
    @JsProperty
    public String rotationDirection;

    @JsProperty
    public Number startWidth;

    @JsProperty
    public Object value;

    @JsMethod
    public native void showValue(Object value);

    @JsMethod
    public native void showValue(Object value, Number duration, Object easing);
}
