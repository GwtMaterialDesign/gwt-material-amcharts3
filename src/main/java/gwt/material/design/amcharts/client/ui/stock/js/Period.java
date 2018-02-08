package gwt.material.design.amcharts.client.ui.stock.js;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Period {

    @JsProperty
    private String period;

    @JsProperty
    private int count;

    @JsProperty
    private String label;

    @JsProperty
    private boolean selected;

    @JsOverlay
    public final String getPeriod() {
        return period;
    }

    @JsOverlay
    public final void setPeriod(String period) {
        this.period = period;
    }

    @JsOverlay
    public final int getCount() {
        return count;
    }

    @JsOverlay
    public final void setCount(int count) {
        this.count = count;
    }

    @JsOverlay
    public final String getLabel() {
        return label;
    }

    @JsOverlay
    public final void setLabel(String label) {
        this.label = label;
    }

    @JsOverlay
    public final boolean isSelected() {
        return selected;
    }

    @JsOverlay
    public final void setSelected(boolean selected) {
        this.selected = selected;
    }
}
