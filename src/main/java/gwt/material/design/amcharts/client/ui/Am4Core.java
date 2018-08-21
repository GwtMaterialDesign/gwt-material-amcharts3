package gwt.material.design.amcharts.client.ui;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.amcharts.client.ui.chart.Chart;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Am4Core {

    @JsMethod(namespace = "am4core")
    public static native Chart create(String div, Chart chartObject);

    @JsMethod(namespace = "am4core")
    public static native Chart create(Element div, Chart chartObject);

    @JsOverlay
    public final static Chart create(Widget widget, Chart chartObject) {
        return create(widget.getElement(), chartObject);
    }

    @JsMethod(namespace = "am4core")
    public static native void useTheme(Object object);
}
