package gwt.material.design.amcharts.client.ui.chart.dictionary;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class DictionaryTemplate<T extends Object> extends Dictionary {

    @JsMethod
    public native T create(String key);
}
