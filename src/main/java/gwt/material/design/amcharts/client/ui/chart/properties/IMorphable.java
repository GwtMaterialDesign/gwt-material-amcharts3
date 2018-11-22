package gwt.material.design.amcharts.client.ui.chart.properties;

import gwt.material.design.amcharts.client.ui.chart.animation.Morpher;
import jsinterop.annotations.JsProperty;

public class IMorphable {

    @JsProperty
    public IPoint[] currentPoints;

    @JsProperty
    public Morpher morpher;

    @JsProperty
    public IPoint[] points;
}
