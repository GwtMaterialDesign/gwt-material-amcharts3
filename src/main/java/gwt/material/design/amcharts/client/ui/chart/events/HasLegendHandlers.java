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
import gwt.material.design.amcharts.client.ui.chart.events.legend.*;

//@formatter:off

/**
 * {@link gwt.material.design.amcharts.client.ui.chart.options.Legend} event handlers
 *
 * @author kevzlou7979@gmail.com
 */
//@formatter:on
public interface HasLegendHandlers {

    /**
     * Dispatched when legend label is clicked.
     */
    HandlerRegistration addClickLabelHandler(ClickLabelEvent.ClickLabelHandler handler);

    /**
     * Dispatched when legend marker is clicked.
     */
    HandlerRegistration addClickMarkerHandler(ClickMarkerEvent.ClickMarkerHandler handler);

    /**
     * Dispatched when user clicks on a legend item marker and hides corresponding object.
     */
    HandlerRegistration addHideItemHandler(HideItemEvent.HideItemHandler handler);

    /**
     * Dispatched when user rolls-out of the legend item label (or whole item, if switchable is set to false).
     */
    HandlerRegistration addRollOutItemHandler(RollOutItemEvent.RollOutItemHandler handler);

    /**
     * Dispatched when user rolls-over the legend item label (or whole item, if switchable is set to false).
     */
    HandlerRegistration addRollOverItemHandler(RollOverItemEvent.RollOverItemHandler handler);

    /**
     * Dispatched when user rolls-over the legend item marker.
     */
    HandlerRegistration addRollOverMarkerHandler(RollOverMarkerEvent.RollOverMarkerHandler handler);

    /**
     * Dispatched when user clicks on a legend item marker and shows corresponding object.
     */
    HandlerRegistration addShowItemHandler(ShowItemEvent.ShowItemHandler handler);
}
