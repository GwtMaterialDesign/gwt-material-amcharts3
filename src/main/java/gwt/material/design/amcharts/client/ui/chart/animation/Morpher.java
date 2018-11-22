package gwt.material.design.amcharts.client.ui.chart.animation;

import gwt.material.design.amcharts.client.ui.chart.base.BaseObject;
import gwt.material.design.amcharts.client.ui.chart.properties.IMorphable;
import gwt.material.design.amcharts.client.ui.chart.properties.IPoint;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Morpher extends BaseObject {

    @JsProperty
    public Animation[] animations;

    @JsProperty
    public Number morphDuration;

    @JsProperty
    public Object morphEasing;

    @JsProperty
    public Number morphProgress;

    @JsProperty
    public boolean morphToSingle;

    @JsProperty
    public IMorphable morphable;

    @JsProperty
    public Number scaleRatio;

    @JsMethod
    public native Animation morphBack(Number duration, Object easing);

    @JsMethod
    public native Animation morphToCircle(Number radius, Number duration, Object easing);

    @JsMethod
    public native Animation morphToPolygon(IPoint[] points, Number duration, Object easing);

    @JsMethod
    public native Animation morphToRectangle(Number width, Number height, Number duration, Object easing);
}
