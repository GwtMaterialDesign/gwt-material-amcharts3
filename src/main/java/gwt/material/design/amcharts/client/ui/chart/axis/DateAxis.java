package gwt.material.design.amcharts.client.ui.chart.axis;

import gwt.material.design.amcharts.client.ui.chart.datafields.IDateAxisDataFields;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.Date;

@JsType(isNative = true, namespace = "am4charts")
public class DateAxis extends ValueAxis {

    @JsProperty
    public IDateAxisDataFields dataFields;

    @JsMethod
    public native void zoomToDates(Date startDate, Date endDate);

    @JsMethod
    public native void zoomToDates(Date startDate, Date endDate, boolean skipRangeEvent, boolean instantly);
}
