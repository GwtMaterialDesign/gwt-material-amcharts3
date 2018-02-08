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
package gwt.material.design.amcharts.client.ui.chart;

import com.google.gwt.dom.client.Document;
import com.google.gwt.user.client.DOM;
import gwt.material.design.amcharts.client.ui.GwtMaterialAmChart;
import gwt.material.design.amcharts.client.ui.chart.base.constants.ChartPlugin;
import gwt.material.design.amcharts.client.ui.chart.base.constants.ChartTheme;
import gwt.material.design.amcharts.client.ui.chart.base.constants.ChartType;
import gwt.material.design.amcharts.client.ui.chart.js.AmCharts;
import gwt.material.design.amcharts.client.ui.chart.resources.ChartClientBundle;
import gwt.material.design.amcharts.client.ui.chart.resources.ChartClientDebugBundle;
import gwt.material.design.amcharts.client.ui.chart.resources.ChartResourceLoader;
import gwt.material.design.client.MaterialDesign;
import gwt.material.design.client.base.MaterialWidget;

//@formatter:off

/**
 * Will build your AmChart using JSON Configs
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptcharts/AmFunnelChart">Official Documentation</a>
 */
//@formatter:on
public class ChartJsonLoader extends MaterialWidget {

    static {
        if (GwtMaterialAmChart.isDebug()) {
            MaterialDesign.injectDebugJs(ChartClientDebugBundle.INSTANCE.amChartDebugJs());
        } else {
            MaterialDesign.injectDebugJs(ChartClientBundle.INSTANCE.amChartJs());
        }
    }

    public ChartJsonLoader() {
        super(Document.get().createDivElement());
        setId(DOM.createUniqueId());
    }

    public void load(Object jsonConfigs) {
        loadPlugin(ChartPlugin.DATA_LOADER);
        AmCharts.makeChart(getId(), jsonConfigs);
    }

    public void setType(ChartType type) {
        ChartResourceLoader.loadChartTypeResource(type);
    }

    public void setTheme(ChartTheme theme) {
        ChartResourceLoader.loadTheme(theme);
    }

    public void loadPlugin(ChartPlugin plugin) {
        ChartResourceLoader.loadPluginResource(plugin);
    }
}
