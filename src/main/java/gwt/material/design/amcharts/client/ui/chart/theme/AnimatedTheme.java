package gwt.material.design.amcharts.client.ui.chart.theme;

import gwt.material.design.amcharts.client.ui.chart.resources.ChartClientBundle;
import gwt.material.design.client.MaterialDesignBase;

import static gwt.material.design.jquery.client.api.JQuery.window;

public class AnimatedTheme implements ChartTheme {

    @Override
    public void loadResource() {
        MaterialDesignBase.injectDebugJs(ChartClientBundle.INSTANCE.animatedJs());
    }

    public Object get() {
        return window().getPropertyObject("am4themes_animated");
    }
}
