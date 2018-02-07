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
 * Dispatched when the user rolls-over the Stock event (bullet).
 *
 * @author kevzlou7979
 */
public class RollOverStockEvent extends GwtEvent<RollOverStockEvent.RollOverStockHandler> {

    public static final Type<RollOverStockHandler> TYPE = new Type<>();
    private StockDateData data;

    public RollOverStockEvent(StockDateData data) {
        this.data = data;
    }

    public static Type<RollOverStockHandler> getType() {
        return TYPE;
    }

    public static void fire(HasHandlers source, StockDateData data) {
        source.fireEvent(new RollOverStockEvent(data));
    }

    @Override
    public Type<RollOverStockHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(RollOverStockEvent.RollOverStockHandler handler) {
        handler.onRollOverStock(this);
    }

    public StockDateData getData() {
        return data;
    }

    public interface RollOverStockHandler extends EventHandler {
        void onRollOverStock(RollOverStockEvent event);
    }
}
