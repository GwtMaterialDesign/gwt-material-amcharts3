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
package gwt.material.design.amcharts.client.ui.chart.events;

import gwt.material.design.amcharts.client.ui.chart.events.valueaxis.AxisChangedEvent;
import gwt.material.design.amcharts.client.ui.chart.events.valueaxis.AxisZoomedEvent;
import gwt.material.design.amcharts.client.ui.chart.events.valueaxis.LogarithmicAxisFailedEvent;

//@formatter:off

/**
 * {@link gwt.material.design.amcharts.client.ui.chart.options.ValueAxis} event handlers
 *
 * @author kevzlou7979@gmail.com
 */
//@formatter:on
public interface HasValueAxisHandlers {

    /**
     * Dispatched when value axis min/max values are changed.
     */
    void addAxisChangedHandler(AxisChangedEvent.AxisChangedHandler handler);

    /**
     * Dispatched when axis is zoomed.
     */
    void addAxisZoomedHandler(AxisZoomedEvent.AxisZoomedHandler handler);

    /**
     * Dispatched when valueAxis is logarithmic and values equal or less then zero were found in data.
     */
    void addLogarithmicAxisFailedHandler(LogarithmicAxisFailedEvent.LogarithmicAxisFailedHandler handler);
}
