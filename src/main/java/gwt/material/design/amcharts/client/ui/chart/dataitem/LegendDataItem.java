package gwt.material.design.amcharts.client.ui.chart.dataitem;

import gwt.material.design.amcharts.client.ui.chart.base.Container;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class LegendDataItem extends DataItem {

    @JsProperty
    public Object dataContext;

    @JsProperty
    public Container itemContainer;
}
