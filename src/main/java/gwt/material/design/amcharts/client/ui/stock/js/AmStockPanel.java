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

import gwt.material.design.amcharts.client.ui.chart.js.AmSerialChart;
import gwt.material.design.amcharts.client.ui.chart.js.options.AmValueAxis;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.Date;

/**
 * AreasSettings is a class which defines the default settings for all MapArea objects.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/AreasSettings">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, namespace = "AmCharts", name = "StockPanel")
public class AmStockPanel extends AmSerialChart {

    @JsProperty
    public double percentHeight;

    @JsProperty
    public boolean allowTurningOff;

    @JsProperty
    public boolean drawingIconsEnabled;

    @JsProperty
    public AmValueAxis drawOnAxis;

    @JsProperty
    public boolean eraseAll;

    @JsProperty
    public int iconSize;

    @JsProperty
    public Date recalculateFromDate;

    @JsProperty
    public String recalculateToPercents;

    @JsProperty
    public boolean showCategoryAxis;

    @JsProperty
    public boolean showComparedOnTop;

    @JsProperty
    public AmStockGraph[] stockGraphs;

    @JsProperty
    public AmStockLegend stockLegend;

    @JsProperty
    public String title;

    @JsProperty
    public double trendLineAlpha;

    @JsProperty
    public String trendLineColor;

    @JsProperty
    public double trendLineDashLength;

    @JsProperty
    public double trendLineThickness;

    /**
     * Adds a graph to the panel.
     */
    @JsMethod
    public native void addStockGraph(AmStockGraph graph);

    /**
     * Toggles trend line eraser mode. Same as clicking on an eraser icon.
     */
    @JsMethod
    public native void handleEraserClick();

    /**
     * Toggles between regular and drawing of trend lines mode.
     */
    @JsMethod
    public native void handlePencilClick();

    /**
     * Removes graph from the panel.
     */
    @JsMethod
    public native void removeStockGraph(AmStockGraph graph);
}
