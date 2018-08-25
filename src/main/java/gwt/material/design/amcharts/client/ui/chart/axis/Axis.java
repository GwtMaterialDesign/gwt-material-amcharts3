package gwt.material.design.amcharts.client.ui.chart.axis;

import gwt.material.design.amcharts.client.ui.chart.base.Label;
import gwt.material.design.amcharts.client.ui.chart.base.Sprite;
import gwt.material.design.amcharts.client.ui.chart.datafields.IAxisDataFields;
import gwt.material.design.amcharts.client.ui.chart.renderer.AxisRenderer;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class Axis extends Sprite {

    @JsProperty
    public Label title;

    @JsProperty
    public AxisRenderer renderer;

    @JsProperty
    public IAxisDataFields dataFields;
}
