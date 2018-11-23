package gwt.material.design.amcharts.client.ui.chart.base;

import gwt.material.design.amcharts.client.ui.chart.datafields.INavigationBarDataFields;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class NavigationBar extends Component {

    @JsProperty
    public TextLink activeLink;

    @JsProperty
    public ListTemplate<TextLink> links;

    @JsProperty
    public ListTemplate<Triangle> separators;

    @JsProperty
    public INavigationBarDataFields dataFields;
}
