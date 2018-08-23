package gwt.material.design.amcharts.client.ui;

import gwt.material.design.amcharts.client.ui.map.MapChart;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "am4maps", namespace = JsPackage.GLOBAL)
public class Am4Maps {

    @JsProperty(name = "MapChart")
    public static MapChart MapChart;
}
