package gwt.material.design.ammaps.client.geodata;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.resources.client.TextResource;
import gwt.material.design.client.MaterialDesign;

import static gwt.material.design.jquery.client.api.JQuery.window;

public abstract class Geodata {

    public JavaScriptObject get() {
        injectJs();
        return window().getPropertyJSO(getName());
    }

    protected void injectJs() {
        if (!GeoDataRegistry.contains(getName())) {
            MaterialDesign.injectJs(getJsResource());
        }

        GeoDataRegistry.register(getName(), getJsResource());
    }

    protected abstract TextResource getJsResource();

    protected abstract String getName();
}
