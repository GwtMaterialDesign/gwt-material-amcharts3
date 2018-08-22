package gwt.material.design.amcharts.client.ui.chart.cursor;

import gwt.material.design.amcharts.client.ui.chart.events.SpriteEventDispatcher;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class XYCursor extends Cursor {

    @JsProperty
    public SpriteEventDispatcher events;
}
