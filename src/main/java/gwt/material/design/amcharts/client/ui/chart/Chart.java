package gwt.material.design.amcharts.client.ui.chart;

import gwt.material.design.amcharts.client.ui.chart.base.Component;
import gwt.material.design.amcharts.client.ui.chart.legend.Legend;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Chart extends Component {

    @JsProperty
    public Legend legend;
}
