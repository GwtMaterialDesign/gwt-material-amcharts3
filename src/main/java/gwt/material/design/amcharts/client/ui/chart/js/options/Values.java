package gwt.material.design.amcharts.client.ui.chart.js.options;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

//@formatter:off

/**
 * Used by {@link GraphDataItem#setValues(Values)}
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptcharts/Title">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Values {

    @JsProperty
    private Object value;

    @JsProperty
    private Object open;

    @JsProperty
    private Object close;

    @JsProperty
    private Object low;

    @JsProperty
    private Object high;

    @JsOverlay
    public final Object getValue() {
        return value;
    }

    @JsOverlay
    public final void setValue(Object value) {
        this.value = value;
    }

    @JsOverlay
    public final Object getOpen() {
        return open;
    }

    @JsOverlay
    public final void setOpen(Object open) {
        this.open = open;
    }

    @JsOverlay
    public final Object getClose() {
        return close;
    }

    @JsOverlay
    public final void setClose(Object close) {
        this.close = close;
    }

    @JsOverlay
    public final Object getLow() {
        return low;
    }

    @JsOverlay
    public final void setLow(Object low) {
        this.low = low;
    }

    @JsOverlay
    public final Object getHigh() {
        return high;
    }

    @JsOverlay
    public final void setHigh(Object high) {
        this.high = high;
    }
}
