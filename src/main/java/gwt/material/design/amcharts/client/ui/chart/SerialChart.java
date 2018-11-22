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

import gwt.material.design.amcharts.client.ui.chart.base.ColorSet;
import gwt.material.design.amcharts.client.ui.chart.base.Container;
import gwt.material.design.amcharts.client.ui.chart.base.ListTemplate;
import gwt.material.design.amcharts.client.ui.chart.datafields.ISerialChartDataFields;
import gwt.material.design.amcharts.client.ui.chart.series.Series;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class SerialChart extends Chart {

    @JsProperty
    public Container bulletsContainer;

    @JsProperty
    public ISerialChartDataFields dataFields;

    @JsProperty
    public ColorSet colors;

    @JsProperty
    public ListTemplate<Series> series;

    @JsProperty
    public Container seriesContainer;

    @JsMethod
    public native void copyFrom(SerialChart copyFrom);

    @JsMethod
    public native void dispose();
}
