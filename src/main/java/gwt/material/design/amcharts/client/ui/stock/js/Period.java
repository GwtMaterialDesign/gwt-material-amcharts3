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
package gwt.material.design.amcharts.client.ui.stock.js;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class Period {

    @JsProperty
    private String period;

    @JsProperty
    private int count;

    @JsProperty
    private String label;

    @JsProperty
    private boolean selected;

    @JsOverlay
    public final String getPeriod() {
        return period;
    }

    @JsOverlay
    public final void setPeriod(String period) {
        this.period = period;
    }

    @JsOverlay
    public final int getCount() {
        return count;
    }

    @JsOverlay
    public final void setCount(int count) {
        this.count = count;
    }

    @JsOverlay
    public final String getLabel() {
        return label;
    }

    @JsOverlay
    public final void setLabel(String label) {
        this.label = label;
    }

    @JsOverlay
    public final boolean isSelected() {
        return selected;
    }

    @JsOverlay
    public final void setSelected(boolean selected) {
        this.selected = selected;
    }
}
