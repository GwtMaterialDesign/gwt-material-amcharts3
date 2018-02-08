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

import gwt.material.design.amcharts.client.ui.chart.js.AmLegend;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

//TODO Migrate to EventBus class

/**
 * AmStockLegend is a legend of AmStockPanel.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptstockchart/StockLegend">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, namespace = "AmCharts", name = "StockLegend")
public class AmStockLegend extends AmLegend {

    @JsProperty
    public String periodValueTextComparing;

    @JsProperty
    public String periodValueTextRegular;

    @JsProperty
    public String valueTextComparing;

    @JsProperty
    public String valueTextRegular;
}
