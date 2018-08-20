package gwt.material.design.amcharts.client.ui.chart.axis;

import gwt.material.design.amcharts.client.ui.chart.datafields.ICategoryAxisDataFields;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class CategoryAxis extends Axis {

    @JsProperty
    public ICategoryAxisDataFields dataFields;
}
