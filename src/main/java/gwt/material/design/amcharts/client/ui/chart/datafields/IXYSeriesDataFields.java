package gwt.material.design.amcharts.client.ui.chart.datafields;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class IXYSeriesDataFields extends ISeriesDataFields {

    @JsProperty
    public String categoryX;

    @JsProperty
    public String categoryY;

    @JsProperty
    public String dateX;

    @JsProperty
    public String dateY;

    @JsProperty
    public String openCategoryX;

    @JsProperty
    public String openCategoryY;

    @JsProperty
    public String openDateX;

    @JsProperty
    public String openDateY;

    @JsProperty
    public String openValueX;

    //TODO CalculatedValue - openValueXShow

    @JsProperty
    public String openValueY;

    //TODO CalculatedValue - openValueYShow

    @JsProperty
    public String valueX;

    //TODO CalculatedValue - valueXShow

    @JsProperty
    public String valueY;

    //TODO CalculatedValue - valueYShow
}
