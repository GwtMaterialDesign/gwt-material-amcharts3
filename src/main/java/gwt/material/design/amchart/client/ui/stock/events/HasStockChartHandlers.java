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
package gwt.material.design.amchart.client.ui.stock.events;

import com.google.gwt.event.shared.HandlerRegistration;

public interface HasStockChartHandlers {

    HandlerRegistration addBuildStartedHandler(BuildStartedEvent.BuildStartedHandler handler);

    HandlerRegistration addClickStockHandler(ClickStockEvent.ClickStockHandler handler);

    HandlerRegistration addDataUpdatedHander(DataUpdatedEvent.DataUpdateddHandler handler);

    HandlerRegistration addInitHandler(InitEvent.InitHandler handler);

    HandlerRegistration addPanelRemovedHandler(PanelRemovedEvent.PanelRemovedHandler handler);

    HandlerRegistration addRenderedHandler(RenderedEvent.RenderedHandler handler);

    HandlerRegistration addRollOutStockHandler(RollOutStockEvent.RollOutStockHandler handler);

    HandlerRegistration addRollOverStockHandler(RollOverStockEvent.RollOverStockHandler handler);

    HandlerRegistration addZoomedHandler(ZoomedEvent.ZoomedHandler handler);
}
