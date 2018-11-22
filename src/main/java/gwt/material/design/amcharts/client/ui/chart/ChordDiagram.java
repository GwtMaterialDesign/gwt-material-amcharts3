package gwt.material.design.amcharts.client.ui.chart;

import gwt.material.design.amcharts.client.ui.chart.base.Container;
import gwt.material.design.amcharts.client.ui.chart.datafields.ISankeyDiagramDataFields;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class ChordDiagram extends FlowDiagram {

    @JsProperty
    public Container chordContainer;

    @JsProperty
    public Number endAngle;

    /**
     * Accepts {@link Number} or {@link gwt.material.design.amcharts.client.ui.chart.base.Percent}
     */
    @JsProperty
    public Object innerRadius;

    //TODO nodes

    @JsProperty
    public boolean nonRibbon;

    /**
     * Accepts {@link Number} or {@link gwt.material.design.amcharts.client.ui.chart.base.Percent}
     */
    @JsProperty
    public Object radius;

    @JsProperty
    public Number startAngle;
}
