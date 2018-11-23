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
package gwt.material.design.amcharts.client.ui.chart;

import gwt.material.design.amcharts.client.ui.chart.base.Component;
import gwt.material.design.amcharts.client.ui.chart.base.Container;
import gwt.material.design.amcharts.client.ui.chart.base.Label;
import gwt.material.design.amcharts.client.ui.chart.base.ListTemplate;
import gwt.material.design.amcharts.client.ui.chart.datafields.chart.IChartDataFields;
import gwt.material.design.amcharts.client.ui.chart.legend.Legend;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Chart extends Component {

    @JsProperty
    public Container chartAndLegendContainer;

    @JsProperty
    public Container chartContainer;

    @JsProperty
    public Legend legend;

    @JsProperty
    public ListTemplate<Label> titles;

    @JsProperty
    public IChartDataFields dataFields;

    @JsMethod
    public native void copyFrom(Chart source);
}
