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

import gwt.material.design.amcharts.client.ui.chart.base.constants.GraphType;
import gwt.material.design.amcharts.client.ui.chart.js.AmGraph;
import gwt.material.design.amcharts.client.ui.chart.options.Graph;
import gwt.material.design.amcharts.client.ui.stock.constants.PeriodValue;
import gwt.material.design.amcharts.client.ui.stock.js.AmStockGraph;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import gwt.material.design.jquery.client.api.Functions;

public class StockGraph extends Graph {

    private AmStockGraph amStockGraph;

    public boolean isComparable() {
        return getAmGraph().comparable;
    }

    /**
     * Specifies whether this graph will be compared if some data set is selected for comparing. Default to false
     */
    public void setComparable(boolean comparable) {
        getAmGraph().comparable = comparable;
    }


    public String getCompareField() {
        return getAmGraph().compareField;
    }

    /**
     * Specifies a field to be used to generate comparing graph. Note, this field is not the one used in your
     * dataProvider, but toField from FieldMapping object.
     */
    public void setCompareField(String compareField) {
        getAmGraph().compareField = compareField;
    }


    public boolean isCompareFromStart() {
        return getAmGraph().compareFromStart;
    }

    /**
     * If you set it to true, when data sets are compared, the graphs will use first value as a base value instead of
     * using the first value of selected period. Default to false
     */
    public void setCompareFromStart(boolean compareFromStart) {
        getAmGraph().compareFromStart = compareFromStart;
    }


    public AmGraph getCompareGraph() {
        return getAmGraph().compareGraph;
    }

    /**
     * You can use this property to set config of compared graphs. This allows you to set any of AmGraph properties on
     * compared graphs instead of using old-style properties like compareGraphBulletBorderThickness. For example:
     * stockGraph.compareGraph = {“bulletBorderThickness”:2, “lineAlpha”:0.4}.
     */
    public void setCompareGraph(AmGraph compareGraph) {
        getAmGraph().compareGraph = compareGraph;
    }


    public String getCompareGraphBalloonColor() {
        return getAmGraph().compareGraphBalloonColor;
    }


    public void setCompareGraphBalloonColor(Color compareGraphBalloonColor) {
        setCompareGraphBalloonColor(ColorHelper.setupComputedBackgroundColor(compareGraphBalloonColor));
    }

    /**
     * Balloon color of comparing graph.
     */
    public void setCompareGraphBalloonColor(String compareGraphBalloonColor) {
        getAmGraph().compareGraphBalloonColor = compareGraphBalloonColor;
    }


    public Functions.Func getCompareGraphBalloonFunction() {
        return getAmGraph().compareGraphBalloonFunction;
    }

    /**
     * If you set some function, the graph will call it and pass GraphDataItem and AmGraph object to it. This function
     * should return getAmGraph().a string which will be displayed in a balloon. This will be used for graphs from compared data
     * sets only. Use balloonFunction for main data set's graphs.
     */
    public void setCompareGraphBalloonFunction(Functions.Func compareGraphBalloonFunction) {
        getAmGraph().compareGraphBalloonFunction = compareGraphBalloonFunction;
    }


    public String getCompareGraphBalloonText() {
        return getAmGraph().compareGraphBalloonText;
    }

    /**
     * Balloon text of comparing graph.
     */
    public void setCompareGraphBalloonText(String compareGraphBalloonText) {
        getAmGraph().compareGraphBalloonText = compareGraphBalloonText;
    }


    public String getCompareGraphBullet() {
        return getAmGraph().compareGraphBullet;
    }

    /**
     * Bullet of comparing graph. Possible values are: round, square, diamond, triangleUp, triangleDown, triangleLeft,
     * triangleRight, bubble
     */
    public void setCompareGraphBullet(String compareGraphBullet) {
        getAmGraph().compareGraphBullet = compareGraphBullet;
    }


    public double getCompareGraphBulletBorderAlpha() {
        return getAmGraph().compareGraphBulletBorderAlpha;
    }

    /**
     * Opacity of bullet border of comparing graph.
     */
    public void setCompareGraphBulletBorderAlpha(double compareGraphBulletBorderAlpha) {
        getAmGraph().compareGraphBulletBorderAlpha = compareGraphBulletBorderAlpha;
    }


    public String getCompareGraphBulletBorderColor() {
        return getAmGraph().compareGraphBulletBorderColor;
    }


    public void setCompareGraphBulletBorderColor(Color compareGraphBulletBorderColor) {
        setCompareGraphBulletBorderColor(ColorHelper.setupComputedBackgroundColor(compareGraphBulletBorderColor));
    }

    /**
     * Color of bullet border of comparing graph.
     */
    public void setCompareGraphBulletBorderColor(String compareGraphBulletBorderColor) {
        getAmGraph().compareGraphBulletBorderColor = compareGraphBulletBorderColor;
    }


    public double getCompareGraphBulletBorderThickness() {
        return getAmGraph().compareGraphBulletBorderThickness;
    }

    /**
     * Thickness of bullet border of comparing graph.
     */
    public void setCompareGraphBulletBorderThickness(double compareGraphBulletBorderThickness) {
        getAmGraph().compareGraphBulletBorderThickness = compareGraphBulletBorderThickness;
    }


    public String getCompareGraphBulletColor() {
        return getAmGraph().compareGraphBulletColor;
    }


    public void setCompareGraphBulletColor(Color compareGraphBulletColor) {
        setCompareGraphBulletColor(ColorHelper.setupComputedBackgroundColor(compareGraphBulletColor));
    }

    /**
     * Color of compared graphs' bullets.
     */
    public void setCompareGraphBulletColor(String compareGraphBulletColor) {
        getAmGraph().compareGraphBulletColor = compareGraphBulletColor;
    }


    public double getCompareGraphBulletSize() {
        return getAmGraph().compareGraphBulletSize;
    }

    /**
     * Bullet size of comparing graph.
     */
    public void setCompareGraphBulletSize(double compareGraphBulletSize) {
        getAmGraph().compareGraphBulletSize = compareGraphBulletSize;
    }


    public double getCompareGraphCornerRadiusTop() {
        return getAmGraph().compareGraphCornerRadiusTop;
    }

    /**
     * Corner radius of comparing graph (if type is "column").
     */
    public void setCompareGraphCornerRadiusTop(double compareGraphCornerRadiusTop) {
        getAmGraph().compareGraphCornerRadiusTop = compareGraphCornerRadiusTop;
    }


    public double getCompareGraphDashLength() {
        return getAmGraph().compareGraphDashLength;
    }

    /**
     * Dash length of compare graph.
     */
    public void setCompareGraphDashLength(double compareGraphDashLength) {
        getAmGraph().compareGraphDashLength = compareGraphDashLength;
    }


    public double getCompareGraphFillAlphas() {
        return getAmGraph().compareGraphFillAlphas;
    }

    /**
     * Fill alpha of comparing graph.
     */
    public void setCompareGraphFillAlphas(double compareGraphFillAlphas) {
        getAmGraph().compareGraphFillAlphas = compareGraphFillAlphas;
    }


    public String getCompareGraphFillColors() {
        return getAmGraph().compareGraphFillColors;
    }


    public void setCompareGraphFillColors(Color compareGraphFillColors) {
        setCompareGraphFillColors(ColorHelper.setupComputedBackgroundColor(compareGraphFillColors));
    }

    /**
     * Fill color of comparing graph.
     */
    public void setCompareGraphFillColors(String compareGraphFillColors) {
        getAmGraph().compareGraphFillColors = compareGraphFillColors;
    }


    public double getCompareGraphLineAlpha() {
        return getAmGraph().compareGraphLineAlpha;
    }

    /**
     * Opacity of comparing graph line.
     */
    public void setCompareGraphLineAlpha(double compareGraphLineAlpha) {
        getAmGraph().compareGraphLineAlpha = compareGraphLineAlpha;
    }


    public String getCompareGraphLineColor() {
        return getAmGraph().compareGraphLineColor;
    }


    public void setCompareGraphLineColor(Color compareGraphLineColor) {
        setCompareGraphLineColor(ColorHelper.setupComputedBackgroundColor(compareGraphLineColor));
    }

    /**
     * Color of compare graph (by default data set color is used)
     */
    public void setCompareGraphLineColor(String compareGraphLineColor) {
        getAmGraph().compareGraphLineColor = compareGraphLineColor;
    }


    public double getCompareGraphLineThickness() {
        return getAmGraph().compareGraphLineThickness;
    }

    /**
     * Thickness of compare graph.
     */
    public void setCompareGraphLineThickness(double compareGraphLineThickness) {
        getAmGraph().compareGraphLineThickness = compareGraphLineThickness;
    }


    public String getCompareGraphType() {
        return getAmGraph().compareGraphType;
    }

    /**
     * Type of comparing graph. Possible values are: "line", "column", "step", "smoothedLine." Default to "line"
     */
    public void setCompareGraphType(GraphType compareGraphType) {
        getAmGraph().compareGraphType = compareGraphType.getName();
    }


    public boolean isCompareGraphVisibleInLegend() {
        return getAmGraph().compareGraphVisibleInLegend;
    }

    /**
     * Specifies if compare graph is visible in legend. Default to true
     */
    public void setCompareGraphVisibleInLegend(boolean compareGraphVisibleInLegend) {
        getAmGraph().compareGraphVisibleInLegend = compareGraphVisibleInLegend;
    }


    public String getPeriodValue() {
        return getAmGraph().periodValue;
    }

    /**
     * When data is grouped to periods, the graph must know which period value should be used.
     * Possible values are: "Open", "Low", "High", "Close", "Average" and "Sum". Default to "Close"
     */
    public void setPeriodValue(PeriodValue periodValue) {
        getAmGraph().periodValue = periodValue.getName();
    }


    public Object getRecalculateValue() {
        return getAmGraph().recalculateValue;
    }

    /**
     * Possible values are Open, Close, High, Low, Average and Sum. There is no default value set – graph uses it’s
     * periodValue when calculating changes. For example, the graph’s periodValue is Close. This means that when data
     * is grouped to longer periods (months for example) when recalculating, the graph will use Close value of the
     * first period of the selection as base value and will compare each months Close value to it. If you set
     * recalculateValue to Open, the first value of a month will be used as base value.
     */
    public void setRecalculateValue(Object recalculateValue) {
        getAmGraph().recalculateValue = recalculateValue;
    }


    public boolean isShowEventsOnComparedGraphs() {
        return getAmGraph().showEventsOnComparedGraphs;
    }

    /**
     * Specifies if events of compared graphs should be shown. Default to false
     */
    public void setShowEventsOnComparedGraphs(boolean showEventsOnComparedGraphs) {
        getAmGraph().showEventsOnComparedGraphs = showEventsOnComparedGraphs;
    }


    public boolean isUseDataSetColors() {
        return getAmGraph().useDataSetColors;
    }

    /**
     * Specifies whether data set color should be used as this graph's lineColor. By default all graphs from the same
     * data set will have a color from its relative DataSet (either auto-assigned by chart or set by color parameter).
     * The graph's color properties will be ignored.
     * <p>
     * To disable this behavior, set "useDataSetColors" to false. This way the chart will use graph's own color settings,
     * such as "lineColor" or auto-assign the color if those are not set.
     */
    public void setUseDataSetColors(boolean useDataSetColors) {
        getAmGraph().useDataSetColors = useDataSetColors;
    }

    @Override
    public AmStockGraph getAmGraph() {
        if (amStockGraph == null) {
            amStockGraph = new AmStockGraph();
        }
        return amStockGraph;
    }
}
