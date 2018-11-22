package gwt.material.design.amcharts.client.ui.chart;

import gwt.material.design.amcharts.client.ui.chart.base.ColorSet;
import gwt.material.design.amcharts.client.ui.chart.base.Container;
import gwt.material.design.amcharts.client.ui.chart.base.FlowDiagramLink;
import gwt.material.design.amcharts.client.ui.chart.base.ListTemplate;
import gwt.material.design.amcharts.client.ui.chart.datafields.IFlowDiagramDataFields;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class FlowDiagram extends Chart {

    @JsProperty
    public ColorSet colors;

    @JsProperty
    public ListTemplate<FlowDiagramLink> links;

    @JsProperty
    public IFlowDiagramDataFields dataFields;

    @JsProperty
    public Container linksContainer;

    @JsProperty
    public Number minNodeSize;

    @JsProperty
    public Number nodePadding;

    //TODO: FlowDiagramNode nodes

    @JsProperty
    public Container nodesContainer;

    /**
     * @see gwt.material.design.amcharts.client.ui.chart.constants.FlowDiagramSortBy
     */
    @JsProperty
    public String sortBy;

    @JsMethod
    public native void dispose();
}
