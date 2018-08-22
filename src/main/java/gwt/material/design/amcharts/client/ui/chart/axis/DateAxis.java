package gwt.material.design.amcharts.client.ui.chart.axis;

import gwt.material.design.amcharts.client.ui.chart.datafields.IDateAxisDataFields;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class DateAxis extends ValueAxis {

    @JsProperty
    public IDateAxisDataFields dataFields;
}
