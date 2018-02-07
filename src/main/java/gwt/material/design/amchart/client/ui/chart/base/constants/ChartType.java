/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2018 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.amchart.client.ui.chart.base.constants;

import gwt.material.design.amchart.client.ui.chart.resources.ChartTypeClientBundle;
import gwt.material.design.amchart.client.ui.chart.resources.ChartTypeClientDebugBundle;
import gwt.material.design.client.base.helper.EnumHelper;
import gwt.material.design.client.constants.CssType;

//@formatter:off

/**
 * Type of the graph. Possible values are: "line", "column", "step", "smoothedLine", "candlestick", "ohlc".
 * XY and Radar charts can only display "line" type graphs.
 *
 * @author kevzlou7979@gmail.com
 */
//@formatter:on
public enum ChartType implements CssType {

    SERIAL("serial",
            ChartTypeClientBundle.INSTANCE.serialJs().getText(),
            ChartTypeClientDebugBundle.INSTANCE.serialDebugJs().getText()),

    PIE("pie",
            ChartTypeClientBundle.INSTANCE.pieJs().getText(),
            ChartTypeClientDebugBundle.INSTANCE.pieDebugJs().getText()),

    XY("xy",
            ChartTypeClientBundle.INSTANCE.xyJs().getText(),
            ChartTypeClientDebugBundle.INSTANCE.xyDebugJs().getText()),

    RADAR("radar",
            ChartTypeClientBundle.INSTANCE.radarJs().getText(),
            ChartTypeClientDebugBundle.INSTANCE.radarDebugJs().getText()),

    FUNNEL("funnel",
            ChartTypeClientBundle.INSTANCE.funnelJs().getText(),
            ChartTypeClientDebugBundle.INSTANCE.funnelDebugJs().getText()),

    GAUGE("gauge",
            ChartTypeClientBundle.INSTANCE.gaugeJs().getText(),
            ChartTypeClientDebugBundle.INSTANCE.gaugeDebugJs().getText()),

    GANTT("gantt",
            ChartTypeClientBundle.INSTANCE.ganttJs().getText(),
            ChartTypeClientDebugBundle.INSTANCE.ganttDebugJs().getText()),

    MAP("map", null, null);

    private String name;
    private String jsResource;
    private String jsDebugResource;

    ChartType(String name, String jsResource, String jsDebugResource) {
        this.name = name;
        this.jsResource = jsResource;
        this.jsDebugResource = jsDebugResource;
    }

    public static ChartType fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, ChartType.class, SERIAL);
    }

    public String getName() {
        return name;
    }

    @Override
    public String getCssName() {
        return name;
    }

    public String getJsResource() {
        return jsResource;
    }

    public String getJsDebugResource() {
        return jsDebugResource;
    }
}
