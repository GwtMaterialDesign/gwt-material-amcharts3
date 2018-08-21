package gwt.material.design.amcharts.client.ui.chart.base;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Represents a relative value. (percent)
 *
 * @author kevzlou7979
 */
@JsType(isNative = true, namespace = "am4core", name = "percent")
public class Percent {

    @JsConstructor
    public Percent(int percent) {}

    /**
     * Value in percent.
     */
    @JsProperty
    public int percent;

    /**
     * Relative value.
     * <p>
     * E.g. 100% is 1, 50% is 0.5, etc.
     * <p>
     * This is useful to apply transformations to other values. E.g.:
     */
    @JsProperty
    public int value;
}
