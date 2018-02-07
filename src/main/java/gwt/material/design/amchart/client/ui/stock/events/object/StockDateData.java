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
import gwt.material.design.amchart.client.ui.stock.js.StockGraph;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class StockDateData {

    @JsProperty
    public StockGraph graph;
    @JsProperty
    public JsDate date;
    @JsProperty
    public AmStockChart chart;
    @JsProperty
    private String type;
    @JsProperty
    private Object eventObject;

    @JsOverlay
    public final String getType() {
        return type;
    }

    @JsOverlay
    public final void setType(String type) {
        this.type = type;
    }

    @JsOverlay
    public final Object getEventObject() {
        return eventObject;
    }

    @JsOverlay
    public final void setEventObject(Object eventObject) {
        this.eventObject = eventObject;
    }

    @JsOverlay
    public final StockGraph getGraph() {
        return graph;
    }

    @JsOverlay
    public final void setGraph(StockGraph graph) {
        this.graph = graph;
    }

    @JsOverlay
    public final JsDate getDate() {
        return date;
    }

    @JsOverlay
    public final void setDate(JsDate date) {
        this.date = date;
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
