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
package gwt.material.design.amchart.client.ui.chart.events;

import com.google.gwt.event.shared.HandlerRegistration;
import gwt.material.design.amchart.client.ui.chart.SerialChart;
import gwt.material.design.amchart.client.ui.chart.events.serial.SerialChangedEvent;
import gwt.material.design.amchart.client.ui.chart.events.serial.SerialZoomedEvent;

//@formatter:off

/**
 * {@link SerialChart} event handlers
 *
 * @author kevzlou7979@gmail.com
 */
//@formatter:on
public interface HasSerialChartHandlers {

    /**
     * Dispatched when cursor position is changed. "index" is a series index over which chart cursors currently is.
     * "zooming" specifies if user is currently zooming (is selecting) the chart.
     */
    HandlerRegistration addChangedHandler(SerialChangedEvent.SerialChangedHandler handler);

    /**
     * Dispatched when the chart is zoomed (even for the first time, when chart is initialized)
     */
    HandlerRegistration addZoomedHandler(SerialZoomedEvent.SerialZoomedHandler handler);
}
