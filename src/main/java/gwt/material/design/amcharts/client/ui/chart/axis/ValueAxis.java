package gwt.material.design.amcharts.client.ui.chart.axis;

import gwt.material.design.amcharts.client.ui.chart.datafields.IValueAxisDataFields;
import gwt.material.design.amcharts.client.ui.chart.formatter.NumberFormatter;
import gwt.material.design.amcharts.client.ui.chart.renderer.AxisRenderer;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class ValueAxis extends Axis {

    @JsProperty
    public IValueAxisDataFields dataFields;

    @JsProperty
    public NumberFormatter numberFormatter;

    @JsProperty
    public AxisRenderer renderer;
}
