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
package gwt.material.design.ammaps.client;

import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.amcharts.client.Am4Core;
import gwt.material.design.amcharts.client.SerialChart;
import gwt.material.design.amcharts.client.base.ListTemplate;
import gwt.material.design.amcharts.client.data.DataSource;
import gwt.material.design.ammaps.client.datafields.IMapChartDataFields;
import gwt.material.design.ammaps.client.projections.Projection;
import gwt.material.design.ammaps.client.series.MapSeries;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4maps")
public class MapChart extends SerialChart {
    private MapChart() {}

    @JsOverlay
    public final static MapChart create(Widget container) {
        return (MapChart) Am4Core.create(container, "MapChart");
    }

    @JsProperty
    public Object geodata;

    @JsProperty
    public ListTemplate<MapSeries> series;

    @JsProperty
    public DataSource geodataSource;

    @JsProperty
    public Projection projection;

    @JsProperty
    public IMapChartDataFields dataFields;
}
