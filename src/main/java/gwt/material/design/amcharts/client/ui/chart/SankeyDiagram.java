package gwt.material.design.amcharts.client.ui.chart;

import gwt.material.design.amcharts.client.ui.chart.datafields.ISankeyDiagramDataFields;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class SankeyDiagram extends FlowDiagram {

    /**
     * @see gwt.material.design.amcharts.client.ui.chart.constants.NodeAlign
     */
    @JsProperty
    public String nodeAlign;

    @JsProperty
    public ISankeyDiagramDataFields dataFields;

    /**
     * @see gwt.material.design.amcharts.client.ui.chart.constants.Orientation
     */
    @JsProperty
    public String orientation;

    @JsProperty
    public Number valueHeight;
}
