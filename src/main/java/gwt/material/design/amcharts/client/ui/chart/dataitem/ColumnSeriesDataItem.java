package gwt.material.design.amcharts.client.ui.chart.dataitem;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.Date;

@JsType(isNative = true, namespace = "am4charts")
public class ColumnSeriesDataItem extends XYSeriesDataItem {

    @JsProperty
    public String categoryX;

    @JsProperty
    public String categoryY;

    @JsProperty
    public Date dateX;

    @JsProperty
    public Date dateY;

    @JsProperty
    public String openCategoryX;

    @JsProperty
    public String openCategoryY;

    @JsProperty
    public Date openDateX;

    @JsProperty
    public Date openDateY;

    @JsProperty
    public Number openValueX;

    @JsProperty
    public Number openValueY;

    @JsProperty
    public Number valueX;

    @JsProperty
    public Number valueY;
}
