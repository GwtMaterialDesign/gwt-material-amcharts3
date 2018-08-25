package gwt.material.design.amcharts.client.ui.chart.scrollbar;

import gwt.material.design.amcharts.client.ui.chart.base.Container;
import gwt.material.design.amcharts.client.ui.chart.base.button.Button;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Scrollbar is a generic control allowing to select a range of values or pan the selection.
 *
 * @author kevzlou7979
 */
@JsType(isNative = true, namespace = "am4charts")
public class Scrollbar extends Container {

    /**
     * Duration in milliseconds of scrollbar animation (happens when user clicks on a background of a scrollbar)
     */
    @JsProperty
    public int animationDuration;

    /**
     * Animation easing function.
     */
    @JsProperty
    public int animationEasing;

    /**
     * Relative position (0-1) of the end grip.
     */
    @JsProperty
    public int end;

    @JsProperty
    public boolean updateWhileMoving;

    @JsProperty
    public Button thumb;
}
