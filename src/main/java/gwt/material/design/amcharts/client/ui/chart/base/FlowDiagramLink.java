package gwt.material.design.amcharts.client.ui.chart.base;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class FlowDiagramLink extends Container {

    @JsProperty
    public ListTemplate<Bullet> bullets;

    @JsProperty
    public Container bulletsContainer;

    @JsProperty
    public Sprite bulletsMask;

    /**
     * @see gwt.material.design.amcharts.client.ui.chart.constants.ColorMode
     */
    @JsProperty
    public String colorMode;

    @JsProperty
    public Number endAngle;

    @JsProperty
    public LinearGradient gradient;

    @JsProperty
    public Sprite link;

    @JsProperty
    public boolean maskBullets;

    /**
     * Accepts {@link Line} or {@link PolyLine}
     */
    @JsProperty
    public Object middleLine;

    @JsProperty
    public Number startAngle;

    @JsProperty
    public Number tooltipLocation;

    @JsMethod
    public native void copyFrom(FlowDiagramLink source);
}
