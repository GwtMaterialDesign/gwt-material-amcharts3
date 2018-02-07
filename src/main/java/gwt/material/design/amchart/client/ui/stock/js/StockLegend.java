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
package gwt.material.design.amchart.client.ui.stock.js;

//@formatter:off

import gwt.material.design.amchart.client.ui.chart.js.AmLegend;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

//TODO Migrate to EventBus class

/**
 * StockLegend is a legend of StockPanel.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptstockchart/StockLegend">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class StockLegend extends AmLegend {

    @JsProperty
    private String periodValueTextComparing;

    @JsProperty
    private String periodValueTextRegular;

    @JsProperty
    private String valueTextComparing;

    @JsProperty
    private String valueTextRegular;

    @JsOverlay
    public final String getPeriodValueTextComparing() {
        return periodValueTextComparing;
    }

    /**
     * The text which will be displayed in the value portion of the legend when user is not hovering above any data
     * point and the data sets are compared. The tags should be made out of two parts - the name of a field
     * (value / open / close / high / low) and the value of the period you want to be show - open / close / high /
     * low / sum / average / count. For example: [[value.sum]] means that sum of all data points of value field in the
     * selected period will be displayed. In case you want to display percent values, you should add "percent" string
     * in front of a tag, for example: [[percents.value.close]] means that last percent value of a period will be displayed.
     */
    @JsOverlay
    public final void setPeriodValueTextComparing(String periodValueTextComparing) {
        this.periodValueTextComparing = periodValueTextComparing;
    }

    @JsOverlay
    public final String getPeriodValueTextRegular() {
        return periodValueTextRegular;
    }

    /**
     * The text which will be displayed in the value portion of the legend when user is not hovering above any data point.
     * The tags should be made out of two parts - the name of a field (value / open / close / high / low) and the value
     * of the period you want to be show - open / close / high / low / sum / average / count. For example: [[value.sum]]
     * means that sum of all data points of value field in the selected period will be displayed.
     */
    @JsOverlay
    public final void setPeriodValueTextRegular(String periodValueTextRegular) {
        this.periodValueTextRegular = periodValueTextRegular;
    }

    @JsOverlay
    public final String getValueTextComparing() {
        return valueTextComparing;
    }

    /**
     * The text which will be displayed in the value portion of the legend when graph is comparable and at least one
     * dataSet is selected for comparing. You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]],
     * [[percents.value/open/close/low/high]], [[description]]. Default to "[[percents.value]]%"
     */
    @JsOverlay
    public final void setValueTextComparing(String valueTextComparing) {
        this.valueTextComparing = valueTextComparing;
    }

    @JsOverlay
    public final String getValueTextRegular() {
        return valueTextRegular;
    }

    /**
     * The text which will be displayed in the value portion of the legend. You can use tags like [[value]], [[open]],
     * [[high]], [[low]], [[close]], [[percents]], [[description]]. Default to "[[value]]"
     */
    @JsOverlay
    public final void setValueTextRegular(String valueTextRegular) {
        this.valueTextRegular = valueTextRegular;
    }
}
