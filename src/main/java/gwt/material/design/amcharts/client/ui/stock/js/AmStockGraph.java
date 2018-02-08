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
package gwt.material.design.amcharts.client.ui.stock.js;

//@formatter:off

import gwt.material.design.amcharts.client.ui.chart.js.AmGraph;
import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * AmStockGraph displays graphs on AmStockPanel.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptstockchart/StockGraph">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, namespace = "AmCharts", name = "StockGraph")
public class AmStockGraph extends AmGraph {

    @JsProperty
    public boolean comparable;

    @JsProperty
    public String compareField;

    @JsProperty
    public boolean compareFromStart;

    @JsProperty
    public AmGraph compareGraph;

    @JsProperty
    public String compareGraphBalloonColor;

    @JsProperty
    public Functions.Func compareGraphBalloonFunction;

    @JsProperty
    public String compareGraphBalloonText;

    @JsProperty
    public String compareGraphBullet;

    @JsProperty
    public double compareGraphBulletBorderAlpha;

    @JsProperty
    public String compareGraphBulletBorderColor;

    @JsProperty
    public double compareGraphBulletBorderThickness;

    @JsProperty
    public String compareGraphBulletColor;

    @JsProperty
    public double compareGraphBulletSize;

    @JsProperty
    public double compareGraphCornerRadiusTop;

    @JsProperty
    public double compareGraphDashLength;

    @JsProperty
    public double compareGraphFillAlphas;

    @JsProperty
    public String compareGraphFillColors;

    @JsProperty
    public double compareGraphLineAlpha;

    @JsProperty
    public String compareGraphLineColor;

    @JsProperty
    public double compareGraphLineThickness;

    @JsProperty
    public String compareGraphType;

    @JsProperty
    public boolean compareGraphVisibleInLegend;

    @JsProperty
    public String periodValue;

    @JsProperty
    public Object recalculateValue;

    @JsProperty
    public boolean showEventsOnComparedGraphs;

    @JsProperty
    public boolean useDataSetColors;
}
