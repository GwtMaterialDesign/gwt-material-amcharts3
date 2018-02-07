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
package gwt.material.design.amchart.client.ui.stock.constants;

//@formatter:off

/**
 * Property used by {@link gwt.material.design.amchart.client.ui.stock.js.StockEventsSettings#setShowAt(ShowAt)}
 *
 * @author kevzlou7979@gmail.com
 */
//@formatter:on
public enum ShowAt {

    OPEN("open"),
    CLOSE("close"),
    LOW("low"),
    HIGH("high");

    private String name;

    ShowAt(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
