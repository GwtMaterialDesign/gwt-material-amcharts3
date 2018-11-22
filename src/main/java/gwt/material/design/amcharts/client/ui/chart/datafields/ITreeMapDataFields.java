package gwt.material.design.amcharts.client.ui.chart.datafields;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class ITreeMapDataFields extends IComponentDataFields {

    @JsProperty
    public String children;

    @JsProperty
    public String color;

    @JsProperty
    public String name;

    @JsProperty
    public String value;
}
