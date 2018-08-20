package gwt.material.design.amcharts.client.ui.chart.theme;

import com.google.gwt.resources.client.TextResource;
import gwt.material.design.amcharts.client.ui.Am4Core;
import gwt.material.design.amcharts.client.ui.chart.resources.ChartClientBundle;
import gwt.material.design.client.MaterialDesignBase;

public class ChartThemeManager {

    public static void load(Themes themes) {
        Object theme = null;
        TextResource resource = null;
        switch (themes) {
            case ANIMATED:
                resource = ChartClientBundle.INSTANCE.animatedJs();
                theme = "am4themes_animated";
                break;
            case MATERIAL:
                resource = ChartClientBundle.INSTANCE.materialJs();
                theme = "am4themes_material";
                break;
        }
        MaterialDesignBase.injectDebugJs(resource);
        Am4Core.useTheme(theme);
    }

    public static void unload() {

    }
}
