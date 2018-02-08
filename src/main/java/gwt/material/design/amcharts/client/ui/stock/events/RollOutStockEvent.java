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
import gwt.material.design.amcharts.client.ui.stock.events.object.StockDateData;
//@formatter:off

/**
 * Dispatched when the user rolls-out of the Stock event (bullet).
 *
 * @author kevzlou7979
 */
public class RollOutStockEvent extends GwtEvent<RollOutStockEvent.RollOutStockHandler> {

    public static final Type<RollOutStockHandler> TYPE = new Type<>();
    private StockDateData data;

    public RollOutStockEvent(StockDateData data) {
        this.data = data;
    }

    public static Type<RollOutStockHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source, StockDateData data) {
        source.fireEvent(new RollOutStockEvent(data));
    }

    @Override
    public Type<RollOutStockHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(RollOutStockEvent.RollOutStockHandler handler) {
        handler.onRollOutStock(this);
    }

    public StockDateData getData() {
        return data;
    }

    public interface RollOutStockHandler extends EventHandler {
        void onRollOutStock(RollOutStockEvent event);
    }
}
