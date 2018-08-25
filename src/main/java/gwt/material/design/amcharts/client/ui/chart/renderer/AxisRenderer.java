package gwt.material.design.amcharts.client.ui.chart.renderer;

import gwt.material.design.amcharts.client.ui.chart.axis.AxisLabel;
import gwt.material.design.amcharts.client.ui.chart.axis.Grid;
import gwt.material.design.amcharts.client.ui.chart.base.Container;
import gwt.material.design.amcharts.client.ui.chart.base.ListTemplate;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class AxisRenderer extends Container {

    @JsProperty
    public ListTemplate<Grid> grid;

    @JsProperty
    public ListTemplate<AxisLabel> labels;
}
