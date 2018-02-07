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

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import gwt.material.design.amchart.client.ui.stock.events.object.StockBaseData;
//@formatter:off

/**
 * Dispatched each when chart is rendered.
 *
 * @author kevzlou7979
 */
public class RenderedEvent extends GwtEvent<RenderedEvent.RenderedHandler> {

    public static final Type<RenderedHandler> TYPE = new Type<>();
    private StockBaseData data;

    public RenderedEvent(StockBaseData data) {
        this.data = data;
    }

    public static Type<RenderedHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source, StockBaseData data) {
        source.fireEvent(new RenderedEvent(data));
    }

    @Override
    public Type<RenderedHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(RenderedEvent.RenderedHandler handler) {
        handler.onRendered(this);
    }

    public StockBaseData getData() {
        return data;
    }

    public interface RenderedHandler extends EventHandler {
        void onRendered(RenderedEvent event);
    }
}
