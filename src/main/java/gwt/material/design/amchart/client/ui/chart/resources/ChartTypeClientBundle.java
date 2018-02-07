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
package gwt.material.design.amchart.client.ui.chart.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface ChartTypeClientBundle extends ClientBundle {

    ChartTypeClientBundle INSTANCE = GWT.create(ChartTypeClientBundle.class);

    @Source("js/charts/serial.min.js")
    TextResource serialJs();

    @Source("js/charts/funnel.min.js")
    TextResource funnelJs();

    @Source("js/charts/gantt.min.js")
    TextResource ganttJs();

    @Source("js/charts/gauge.min.js")
    TextResource gaugeJs();

    @Source("js/charts/pie.min.js")
    TextResource pieJs();

    @Source("js/charts/radar.min.js")
    TextResource radarJs();

    @Source("js/charts/xy.min.js")
    TextResource xyJs();
}
