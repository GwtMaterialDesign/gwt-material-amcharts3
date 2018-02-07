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

import gwt.material.design.amchart.client.ui.chart.resources.ChartThemeClientBundle;
import gwt.material.design.amchart.client.ui.chart.resources.ChartThemeClientDebugBundle;
import gwt.material.design.client.base.helper.EnumHelper;
import gwt.material.design.client.constants.CssType;

//@formatter:off

/**
 * Available themes for {@link gwt.material.design.amchart.client.ui.chart.base.AbstractChart#setTheme(ChartTheme)}
 *
 * @author kevzlou7979@gmail.com
 */
//@formatter:on
public enum ChartTheme implements CssType {

    NONE("none", null, null),
    BLACK("black",
            ChartThemeClientBundle.INSTANCE.blackJs().getText(),
            ChartThemeClientDebugBundle.INSTANCE.blackDebugJs().getText()),

    CHALK("chalk",
            ChartThemeClientBundle.INSTANCE.chalkJs().getText(),
            ChartThemeClientDebugBundle.INSTANCE.chalkDebugJs().getText()),

    DARK("dark",
            ChartThemeClientBundle.INSTANCE.darkJs().getText(),
            ChartThemeClientDebugBundle.INSTANCE.darkDebugJs().getText()),

    LIGHT("light",
            ChartThemeClientBundle.INSTANCE.lightJs().getText(),
            ChartThemeClientDebugBundle.INSTANCE.lightDebugJs().getText()),

    PATTERNS("patterns",
            ChartThemeClientBundle.INSTANCE.patternsJs().getText(),
            ChartThemeClientDebugBundle.INSTANCE.patternsDebugJs().getText());

    private String name;
    private String jsResource;
    private String jsDebugResource;

    ChartTheme(String name, String jsResource, String jsDebugResource) {
        this.name = name;
        this.jsResource = jsResource;
        this.jsDebugResource = jsDebugResource;
    }

    public static ChartTheme fromStyleName(final String styleName) {
        return EnumHelper.fromStyleName(styleName, ChartTheme.class, NONE);
    }

    public String getJsResource() {
        return jsResource;
    }

    public String getJsDebugResource() {
        return jsDebugResource;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getCssName() {
        return name;
    }
}
