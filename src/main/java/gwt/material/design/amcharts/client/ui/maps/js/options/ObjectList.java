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
package gwt.material.design.amcharts.client.ui.maps.js.options;

import gwt.material.design.amcharts.client.ui.maps.js.AmMap;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Creates a list of all available {@link MapObject}, it's entries can be generally controlled within the
 * {@link AmMap} class using showAreasInList, showLinesInList, showImagesInList
 * or individually within the {@link MapObject} itself.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/ObjectList">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ObjectList {

    /**
     * Id or reference to div which will hold ObjectList.
     */
    @JsProperty
    public String container;

    @JsOverlay
    public final String getContainer() {
        return container;
    }

    @JsOverlay
    public final void setContainer(String container) {
        this.container = container;
    }
}
