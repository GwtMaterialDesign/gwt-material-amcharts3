package gwt.material.design.amcharts.client.ui;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.amcharts.client.ui.chart.base.Container;
import gwt.material.design.amcharts.client.ui.chart.base.Rectangle;
import gwt.material.design.amcharts.client.ui.chart.theme.ChartTheme;
import jsinterop.annotations.*;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Am4Core {

    @JsProperty(namespace = "am4core", name = "Container")
    public static Container Container;

    @JsProperty(namespace = "am4core", name = "Rectangle")
    public static Rectangle Rectangle;

    @JsMethod(namespace = "am4core")
    public static native Object create(String div, Object object);

    @JsMethod(namespace = "am4core")
    public static native Object create(Element div, Object chartObject);

    @JsOverlay
    public final static Object create(Widget widget, Object chartObject) {
        return create(widget.getElement(), chartObject);
    }

    @JsMethod(namespace = "am4core")
    public static native void useTheme(Object object);

    @JsOverlay
    public final static void useTheme(ChartTheme theme) {
        theme.loadResource();
        useTheme(theme.get());
    }
}
