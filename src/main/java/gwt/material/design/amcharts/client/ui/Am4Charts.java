package gwt.material.design.amcharts.client.ui;

import gwt.material.design.amcharts.client.ui.chart.PieChart;
import gwt.material.design.amcharts.client.ui.chart.XYChart;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "am4charts", namespace = JsPackage.GLOBAL)
public class Am4Charts {

    @JsProperty(name = "PieChart")
    public static PieChart PieChart;

    @JsProperty(name = "XYChart")
    public static XYChart XYChart;
}
