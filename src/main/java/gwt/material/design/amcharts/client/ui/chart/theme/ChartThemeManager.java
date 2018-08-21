package gwt.material.design.amcharts.client.ui.chart.theme;

import com.google.gwt.resources.client.TextResource;
import gwt.material.design.amcharts.client.ui.Am4Core;
import gwt.material.design.amcharts.client.ui.chart.resources.ChartClientBundle;
import gwt.material.design.client.MaterialDesignBase;

public class ChartThemeManager {

    public static void load(Themes themes) {
        TextResource resource = null;
        switch (themes) {
            case ANIMATED:
                resource = ChartClientBundle.INSTANCE.animatedJs();
                break;
            case MATERIAL:
                resource = ChartClientBundle.INSTANCE.materialJs();
                break;
        }
        MaterialDesignBase.injectDebugJs(resource);
        Am4Core.useTheme(ChartTheme.am4themes_material);
    }

    public static void unload() {

    }
}
