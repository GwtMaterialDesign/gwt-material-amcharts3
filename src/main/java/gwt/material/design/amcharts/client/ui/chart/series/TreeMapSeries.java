package gwt.material.design.amcharts.client.ui.chart.series;

import gwt.material.design.amcharts.client.ui.chart.animation.Animation;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class TreeMapSeries extends LineSeries {

    @JsProperty
    public Number level;

    //TODO: TreeMApDataITem parentDataItem

    @JsMethod
    public native Animation hide(Number duration);

    @JsMethod
    public native Animation show(Number duration);
}
