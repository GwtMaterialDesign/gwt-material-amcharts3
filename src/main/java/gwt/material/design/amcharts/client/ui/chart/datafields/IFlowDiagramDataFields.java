package gwt.material.design.amcharts.client.ui.chart.datafields;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class IFlowDiagramDataFields extends IChartDataFields {

    @JsProperty
    public String color;

    @JsProperty
    public String fromName;

    @JsProperty
    public String toName;

    @JsProperty
    public String value;

    @JsProperty
    public String  visible;
}
