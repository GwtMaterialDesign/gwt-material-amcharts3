package gwt.material.design.amcharts.client.ui.chart;

import gwt.material.design.amcharts.client.ui.chart.axis.ValueAxis;
import gwt.material.design.amcharts.client.ui.chart.base.ColorSet;
import gwt.material.design.amcharts.client.ui.chart.base.NavigationBar;
import gwt.material.design.amcharts.client.ui.chart.datafields.ITreeMapDataFields;
import gwt.material.design.amcharts.client.ui.chart.dictionary.DictionaryTemplate;
import gwt.material.design.amcharts.client.ui.chart.series.TreeMapSeries;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class TreeMap extends XYChart {

    @JsProperty
    public ColorSet colors;

    @JsProperty
    public Number currentLevel;

    //TODO: TreeMapDataItem currentlyZoomed

    @JsProperty
    public String homeText;

    @JsProperty
    public Object layoutAlgorithm;

    @JsProperty
    public ITreeMapDataFields dataFields;

    @JsProperty
    public Number maxLevels;

    @JsProperty
    public NavigationBar navigationBar;

    @JsProperty
    public DictionaryTemplate<TreeMapSeries> seriesTemplates;

    /**
     * @see gwt.material.design.amcharts.client.ui.chart.constants.Sorting
     */
    @JsProperty
    public String sorting;

    @JsProperty
    public ValueAxis xAxis;

    @JsProperty
    public ValueAxis yAxis;

    @JsProperty
    public boolean zoomable;

    //TODO
    /*@JsMethod
    public native void zoomToSeriesDataItem(TreeMapSeriesDataItem dataItem);*/
}
