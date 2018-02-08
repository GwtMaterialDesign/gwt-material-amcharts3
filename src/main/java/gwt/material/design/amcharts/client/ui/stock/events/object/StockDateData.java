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
package gwt.material.design.amcharts.client.ui.stock.events.object;

import com.google.gwt.core.client.JsDate;
import gwt.material.design.amcharts.client.ui.stock.js.AmStockChart;
import gwt.material.design.amcharts.client.ui.stock.js.AmStockGraph;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class StockDateData {

    @JsProperty
    private AmStockGraph graph;

    @JsProperty
    private JsDate date;

    @JsProperty
    private AmStockChart chart;

    @JsProperty
    private String type;

    @JsProperty
    private Object eventObject;

    @JsOverlay
    public final String getType() {
        return type;
    }

    @JsOverlay
    public final Object getEventObject() {
        return eventObject;
    }

    @JsOverlay
    public final AmStockGraph getGraph() {
        return graph;
    }

    @JsOverlay
    public final JsDate getDate() {
        return date;
    }

    @JsOverlay
    public final AmStockChart getChart() {
        return chart;
    }
}
