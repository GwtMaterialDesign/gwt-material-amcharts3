package gwt.material.design.amcharts.client.ui.map.geodata;

import static gwt.material.design.jquery.client.api.JQuery.window;

public class WorldLow {

    public static Object get() {
        return window().getPropertyObject("am4geodata_worldLow");
    }
}
