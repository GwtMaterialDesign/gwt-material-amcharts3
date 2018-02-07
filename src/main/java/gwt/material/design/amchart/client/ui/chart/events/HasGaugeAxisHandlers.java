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
import gwt.material.design.amchart.client.ui.chart.events.gauge.ClickBandEvent;
import gwt.material.design.amchart.client.ui.chart.events.gauge.RollOutBandEvent;
import gwt.material.design.amchart.client.ui.chart.events.gauge.RollOverBandEvent;

//@formatter:off

/**
 * {@link gwt.material.design.amchart.client.ui.chart.options.GaugeAxis} event handlers
 *
 * @author kevzlou7979@gmail.com
 */
//@formatter:on
public interface HasGaugeAxisHandlers {

    /**
     * Event which is fired when user clicks on gauge band.
     */
    HandlerRegistration addClickBandHandler(ClickBandEvent.ClickBandHandler handler);

    /**
     * Event which is fired when user rolls-out gauge band.
     */
    HandlerRegistration addRollOutBandHandler(RollOutBandEvent.RollOutBandHandler handler);

    /**
     * Event which is fired when user rolls-over gauge band.
     */
    HandlerRegistration addRollOverBandHandler(RollOverBandEvent.RollOverBandHandler handler);
}
