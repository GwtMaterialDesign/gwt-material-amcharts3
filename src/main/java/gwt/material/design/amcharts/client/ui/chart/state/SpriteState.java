package gwt.material.design.amcharts.client.ui.chart.state;

import gwt.material.design.amcharts.client.ui.chart.properties.ISpriteProperties;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class SpriteState {

    @JsProperty
    public ISpriteProperties properties;
}
