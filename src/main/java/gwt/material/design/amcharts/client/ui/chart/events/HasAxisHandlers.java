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

import com.google.gwt.event.shared.HandlerRegistration;
import gwt.material.design.amcharts.client.ui.chart.events.axis.*;

//@formatter:off

/**
 * {@link gwt.material.design.amcharts.client.ui.chart.options.AxisBase} event handlers
 *
 * @author kevzlou7979@gmail.com
 */
//@formatter:on
public interface HasAxisHandlers {

    /**
     * Dispatched when user clicks on a guide.
     */
    HandlerRegistration addClickGuideHandler(ClickGuideEvent.ClickGuideHandler handler);

    /**
     * Fired if user clicks on axis label.
     */
    HandlerRegistration addClickItemHandler(ClickItemEvent.ClickItemHandler handler);

    /**
     * Dispatched when user rolls-out of the guide.
     */
    HandlerRegistration addRollOutGuideHandler(RollOutGuideEvent.RollOutGuideHandler handler);

    /**
     * Fired if user rolls-out of the axis label.
     */
    HandlerRegistration addRollOutItemHandler(RollOutGuideItemEvent.RollOutGuideItemHandler handler);

    /**
     * Dispatched when user rolls-over some guide.
     */
    HandlerRegistration addRollOverGuideHandler(RollOverGuideEvent.RollOverGuideHandler handler);

    /**
     * Fired if user rolls-over axis label.
     */
    HandlerRegistration addRollOverItemHandler(RollOverGuideItemEvent.RollOverGuideItemHandler handler);
}
