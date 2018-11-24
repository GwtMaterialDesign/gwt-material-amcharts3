package gwt.material.design.amcore.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface ThemeClientBundle extends ClientBundle {

    ThemeClientBundle INSTANCE = GWT.create(ThemeClientBundle.class);

    @Source("js/themes/animated.js")
    TextResource animatedJs();

    @Source("js/themes/material.js")
    TextResource materialJs();

    @Source("js/themes/kelly.js")
    TextResource kellyJs();

    @Source("js/themes/dark.js")
    TextResource darkJs();
}
