package gwt.material.design.amcharts.client.ui.map;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.amcharts.client.ui.Am4Core;
import gwt.material.design.amcharts.client.ui.chart.SerialChart;
import gwt.material.design.amcharts.client.ui.chart.base.ListTemplate;
import gwt.material.design.amcharts.client.ui.chart.data.DataSource;
import gwt.material.design.amcharts.client.ui.map.projections.Projection;
import gwt.material.design.amcharts.client.ui.map.series.MapSeries;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4maps")
public class MapChart extends SerialChart {
    private MapChart() {}

    @JsOverlay
    public final static MapChart create(Widget container) {
        return (MapChart) Am4Core.create(container, "MapChart");
    }

    @JsProperty
    public Object geodata;

    @JsProperty
    public ListTemplate<MapSeries> series;

    @JsProperty
    public DataSource geodataSource;

    @JsProperty
    public Projection projection;
}
