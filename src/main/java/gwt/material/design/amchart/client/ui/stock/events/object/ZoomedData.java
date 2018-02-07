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
package gwt.material.design.amchart.client.ui.stock.events.object;

import com.google.gwt.core.client.JsDate;
import gwt.material.design.amchart.client.ui.stock.js.AmStockChart;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ZoomedData {

    @JsProperty
    private String type;

    @JsProperty
    private JsDate startDate;

    @JsProperty
    private JsDate endDate;

    @JsProperty
    private double period;

    @JsProperty
    private AmStockChart chart;

    @JsOverlay
    public final String getType() {
        return type;
    }

    @JsOverlay
    public final void setType(String type) {
        this.type = type;
    }

    @JsOverlay
    public final JsDate getStartDate() {
        return startDate;
    }

    @JsOverlay
    public final void setStartDate(JsDate startDate) {
        this.startDate = startDate;
    }

    @JsOverlay
    public final JsDate getEndDate() {
        return endDate;
    }

    @JsOverlay
    public final void setEndDate(JsDate endDate) {
        this.endDate = endDate;
    }

    @JsOverlay
    public final double getPeriod() {
        return period;
    }

    @JsOverlay
    public final void setPeriod(double period) {
        this.period = period;
    }

    @JsOverlay
    public final AmStockChart getChart() {
        return chart;
    }

    @JsOverlay
    public final void setChart(AmStockChart chart) {
        this.chart = chart;
    }
}
