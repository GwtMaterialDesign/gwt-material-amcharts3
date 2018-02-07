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
package gwt.material.design.amcharts.client.ui.stock.events;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import gwt.material.design.amcharts.client.ui.stock.events.object.PanelRemovedData;
//@formatter:off

/**
 * Dispatched when the {@link StockPanel} is removed.
 *
 * @author kevzlou7979
 */
public class PanelRemovedEvent extends GwtEvent<PanelRemovedEvent.PanelRemovedHandler> {

    public static final Type<PanelRemovedHandler> TYPE = new Type<>();
    private PanelRemovedData data;

    public PanelRemovedEvent(PanelRemovedData data) {
        this.data = data;
    }

    public static Type<PanelRemovedHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source, PanelRemovedData data) {
        source.fireEvent(new PanelRemovedEvent(data));
    }

    @Override
    public Type<PanelRemovedHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(PanelRemovedEvent.PanelRemovedHandler handler) {
        handler.onPanelRemoved(this);
    }

    public PanelRemovedData getData() {
        return data;
    }

    public interface PanelRemovedHandler extends EventHandler {
        void onPanelRemoved(PanelRemovedEvent event);
    }
}
