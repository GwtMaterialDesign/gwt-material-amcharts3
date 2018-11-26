package gwt.material.design.amcore.client.events;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class EventTarget<T> {

    @JsProperty
    public T target;

}
