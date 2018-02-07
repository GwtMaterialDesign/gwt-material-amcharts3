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
package gwt.material.design.amchart.client.ui.chart.resources;

import gwt.material.design.amchart.client.ui.GwtMaterialAmChart;
import gwt.material.design.amchart.client.ui.chart.base.constants.ChartPlugin;
import gwt.material.design.amchart.client.ui.chart.base.constants.ChartTheme;
import gwt.material.design.amchart.client.ui.chart.base.constants.ChartType;
import gwt.material.design.amchart.client.ui.chart.base.constants.Language;

public class ChartResourceLoader extends ResourceLoader {

    public static void loadChartTypeResource(ChartType type) {
        if (GwtMaterialAmChart.isDebug()) {
            injectDebugJs(type.getName(), type.getJsResource());
        } else {
            injectJs(type.getName(), type.getJsResource());
        }
    }

    public static void loadLanguage(Language language) {
        injectJs(language.getName(), language.getJsResource());
    }

    public static void loadTheme(ChartTheme theme) {
        if (GwtMaterialAmChart.isDebug()) {
            injectDebugJs(theme.getName(), theme.getJsResource());
        } else {
            injectJs(theme.getName(), theme.getJsResource());
        }
    }

    public static void loadPluginResource(ChartPlugin plugin) {
        if (GwtMaterialAmChart.isDebug()) {
            injectDebugJs(plugin.getName(), plugin.getjsResource());
            if (plugin.getCssDebugResource() != null) {
                injectCss(plugin.getCssDebugResource());
            }
        } else {
            injectJs(plugin.getName(), plugin.getjsResource());
            if (plugin.getCssResource() != null) {
                injectCss(plugin.getCssResource());
            }
        }
    }
}
