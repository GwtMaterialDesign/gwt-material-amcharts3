package gwt.material.design.amcharts.client.ui.chart.properties;

import gwt.material.design.amcharts.client.ui.chart.base.Color;
import jsinterop.annotations.JsProperty;

public class IGradientStop {

    @JsProperty
    public Color color;

    @JsProperty
    public Number offset;

    @JsProperty
    public Number opacity;
}
