package gwt.material.design.amcharts.client.ui.chart.properties;

import gwt.material.design.amcharts.client.ui.chart.base.Sprite;
import jsinterop.annotations.JsProperty;

public class IHeatRule {

    @JsProperty
    public String dataField;

    @JsProperty
    public Object max;

    @JsProperty
    public Number maxValue;

    @JsProperty
    public Object min;

    @JsProperty
    public Number minValue;

    @JsProperty
    public String property;

    @JsProperty
    public Sprite target;
}
