package gwt.material.design.amcharts.client.ui.chart.base.button;

import gwt.material.design.amcharts.client.ui.chart.base.Container;
import gwt.material.design.amcharts.client.ui.chart.base.Label;
import gwt.material.design.amcharts.client.ui.chart.base.Sprite;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Button class is capable of drawing a simple rectangular button with optionally rounded corners and an icon in it.
 *
 * @author kevzlou7979
 */
@JsType(isNative = true)
public class Button extends Container {

    /**
     * A {@link Sprite} to be used as an icon on button.
     */
    @JsProperty
    public Sprite icon;

    /**
     * Icon position: "left" or "right".
     */
    @JsProperty
    public String iconPosition;

    /**
     * {@link Label} element to be used for text.
     */
    @JsProperty
    public Label label;

    @JsMethod
    public native Button constructor();
}
