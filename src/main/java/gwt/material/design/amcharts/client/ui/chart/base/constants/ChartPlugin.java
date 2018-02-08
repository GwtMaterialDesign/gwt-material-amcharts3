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
package gwt.material.design.amcharts.client.ui.chart.base.constants;

//@formatter:off

import gwt.material.design.amcharts.client.ui.chart.resources.ChartPluginClientBundle;
import gwt.material.design.amcharts.client.ui.chart.resources.ChartPluginClientDebugBundle;

/**
 * Available plugins for {@link gwt.material.design.amcharts.client.ui.chart.base.AbstractChart#loadPlugin(ChartPlugin)}
 *
 * @author kevzlou7979@gmail.com
 */
//@formatter:on
public enum ChartPlugin {

    DATA_LOADER("dataloader",
            ChartPluginClientBundle.INSTANCE.dataLoaderJs().getText(),
            ChartPluginClientDebugBundle.INSTANCE.dataLoaderDebugJs().getText()),

    ANIMATION("animation",
            ChartPluginClientBundle.INSTANCE.animateJs().getText(),
            ChartPluginClientDebugBundle.INSTANCE.animateDebugJs().getText()),

    EXPORT("export",
            ChartPluginClientBundle.INSTANCE.exportJs().getText(),
            ChartPluginClientDebugBundle.INSTANCE.exportDebugJs().getText(),
            ChartPluginClientBundle.INSTANCE.exportCss().getText(),
            ChartPluginClientDebugBundle.INSTANCE.exportDebugCss().getText()),

    RESPONSIVE("responsive",
            ChartPluginClientBundle.INSTANCE.responsiveJs().getText(),
            ChartPluginClientDebugBundle.INSTANCE.responsiveDebugJs().getText());

    private String name;
    private String jsResource;
    private String jsDebugResource;
    private String cssResource;
    private String cssDebugResource;

    ChartPlugin(String name, String jsResource, String jsDebugResource) {
        this.name = name;
        this.jsResource = jsResource;
        this.jsDebugResource = jsDebugResource;
    }

    ChartPlugin(String name, String jsResource, String jsDebugResource, String cssResource, String cssDebugResource) {
        this.name = name;
        this.jsResource = jsResource;
        this.jsDebugResource = jsDebugResource;
        this.cssResource = cssResource;
        this.cssDebugResource = cssDebugResource;
    }

    public String getName() {
        return name;
    }

    public String getjsDebugResource() {
        return jsDebugResource;
    }

    public String getjsResource() {
        return jsResource;
    }

    public String getCssResource() {
        return cssResource;
    }

    public String getCssDebugResource() {
        return cssDebugResource;
    }
}
