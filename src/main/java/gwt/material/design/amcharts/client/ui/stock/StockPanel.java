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
package gwt.material.design.amcharts.client.ui.stock;

import gwt.material.design.amcharts.client.ui.chart.SerialChart;
import gwt.material.design.amcharts.client.ui.chart.js.options.AmValueAxis;
import gwt.material.design.amcharts.client.ui.stock.constants.RecalculateToPercents;
import gwt.material.design.amcharts.client.ui.stock.js.AmStockGraph;
import gwt.material.design.amcharts.client.ui.stock.js.AmStockLegend;
import gwt.material.design.amcharts.client.ui.stock.js.AmStockPanel;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;

import java.util.Date;

public class StockPanel extends SerialChart {

    private AmStockPanel amStockPanel;

    public boolean isAllowTurningOff() {
        return getChart().allowTurningOff;
    }

    /**
     * Specifies whether x button will be displayed near the panel. This button allows turning panel off.
     * Default to false
     */
    public void setAllowTurningOff(boolean allowTurningOff) {
        getChart().allowTurningOff = allowTurningOff;
    }

    public boolean isDrawingIconsEnabled() {
        return getChart().drawingIconsEnabled;
    }

    /**
     * If true, drawing icons will be displayed in top-right corner.
     * Default to false
     */
    public void setDrawingIconsEnabled(boolean drawingIconsEnabled) {
        getChart().drawingIconsEnabled = drawingIconsEnabled;
    }


    public AmValueAxis getDrawOnAxis() {
        return getChart().drawOnAxis;
    }

    /**
     * Specifies on which value axis user can draw trend lines. Set drawingIconsEnabled to true if you want drawing icons
     * to be visible. First value axis will be used if not set here. You can use a reference to the value axis object
     * or id of value axis.
     */
    public void setDrawOnAxis(AmValueAxis drawOnAxis) {
        getChart().drawOnAxis = drawOnAxis;
    }


    public boolean isEraseAll() {
        return getChart().eraseAll;
    }

    /**
     * Specifies if all trend lines should be erased when erase button is clicked. If false, trend lines can be erased
     * one by one. Default to false
     */
    public void setEraseAll(boolean eraseAll) {
        getChart().eraseAll = eraseAll;
    }


    public int getIconSize() {
        return getChart().iconSize;
    }

    /**
     * Size of trend line drawing icons. If you change this size, you should update icon images if you want them to
     * look properly. Default to 18
     */
    public void setIconSize(int iconSize) {
        getChart().iconSize = iconSize;
    }

    public double getPercentHeight() {
        return getChart().percentHeight;
    }

    /**
     * Relative height of panel. Possible values 0 - 100.
     */
    public void setPercentHeight(double percentHeight) {
        getChart().percentHeight = percentHeight;
    }


    public Date getRecalculateFromDate() {
        return getChart().recalculateFromDate;
    }

    /**
     * Specifies from which date's value should be used as base when recalculating values to percent.
     */
    public void setRecalculateFromDate(Date recalculateFromDate) {
        getChart().recalculateFromDate = recalculateFromDate;
    }


    public String getRecalculateToPercents() {
        return getChart().recalculateToPercents;
    }

    /**
     * Specifies when values should be recalculated to percents. Possible values are: "never", "always", "whenComparing".
     * Default to "whenComparing"
     */
    public void setRecalculateToPercents(RecalculateToPercents recalculateToPercents) {
        getChart().recalculateToPercents = recalculateToPercents.getName();
    }


    public boolean isShowCategoryAxis() {
        return getChart().showCategoryAxis;
    }

    /**
     * Specifies whether this panel will show category axis. Default to true
     */
    public void setShowCategoryAxis(boolean showCategoryAxis) {
        getChart().showCategoryAxis = showCategoryAxis;
    }


    public boolean isShowComparedOnTop() {
        return getChart().showComparedOnTop;
    }

    /**
     * Specifies if compared graphs should be shown above or behind the main graph. Default to true
     */
    public void setShowComparedOnTop(boolean showComparedOnTop) {
        getChart().showComparedOnTop = showComparedOnTop;
    }


    public AmStockGraph[] getStockGraphs() {
        return getChart().stockGraphs;
    }

    /**
     * Array of stock graphs.
     */
    public void setStockGraphs(StockGraph... stockGraphs) {
        for (int i = 0; i < stockGraphs.length; i++) {
            getChart().stockGraphs[i] = stockGraphs[i].getAmGraph();
        }
    }


    public AmStockLegend getStockLegend() {
        return getChart().stockLegend;
    }

    /**
     * Stock chart legend.
     */
    public void setStockLegend(StockLegend stockLegend) {
        getChart().stockLegend = stockLegend.getAmLegend();
        stockLegend.load();
    }


    public String getTitle() {
        return getChart().title;
    }

    /**
     * A title of a panel. Note, AmStockLegend should be added in order title to be displayed.
     */
    public void setTitle(String title) {
        getChart().title = title;
    }


    public double getTrendLineAlpha() {
        return getChart().trendLineAlpha;
    }

    /**
     * Trend line opacity. Default to 1
     */
    public void setTrendLineAlpha(double trendLineAlpha) {
        getChart().trendLineAlpha = trendLineAlpha;
    }


    public String getTrendLineColor() {
        return getChart().trendLineColor;
    }


    public void setTrendLineColor(Color trendLineColor) {
        setTrendLineColor(ColorHelper.setupComputedBackgroundColor(trendLineColor));
    }

    /**
     * Trend line color. Default to #00CC00
     */
    public void setTrendLineColor(String trendLineColor) {
        getChart().trendLineColor = trendLineColor;
    }


    public double getTrendLineDashLength() {
        return getChart().trendLineDashLength;
    }

    /**
     * Trend line dash length. Default to 0
     */
    public void setTrendLineDashLength(double trendLineDashLength) {
        getChart().trendLineDashLength = trendLineDashLength;
    }


    public double getTrendLineThickness() {
        return getChart().trendLineThickness;
    }

    /**
     * Trend line thickness. Default to 2
     */
    public void setTrendLineThickness(double trendLineThickness) {
        getChart().trendLineThickness = trendLineThickness;
    }

    /**
     * Adds a graph to the panel.
     */
    public void addStockGraph(StockGraph graph) {
        getChart().addStockGraph(graph.getAmGraph());
    }

    /**
     * Toggles trend line eraser mode. Same as clicking on an eraser icon.
     */
    public void handleEraserClick() {
        getChart().handleEraserClick();
    }

    /**
     * Toggles between regular and drawing of trend lines mode.
     */
    public void handlePencilClick() {
        getChart().handlePencilClick();
    }

    /**
     * Removes graph from the panel.
     */
    public void removeStockGraph(StockGraph graph) {
        getChart().removeStockGraph(graph.getAmGraph());
    }

    @Override
    public AmStockPanel getChart() {
        if (amStockPanel == null) {
            amStockPanel = new AmStockPanel();
        }
        return amStockPanel;
    }
}
