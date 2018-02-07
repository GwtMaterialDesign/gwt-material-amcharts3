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
package gwt.material.design.amcharts.client.ui.chart.resources;

import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.dom.client.StyleInjector;

public class ResourceLoader {

    //TODO Unload all injected js

    public static void injectJs(String name, String textResource) {
        directInjectJs(name, textResource, true, false);
    }

    public static void injectDebugJs(String name, String textResource) {
        directInjectJs(name, textResource, false, true);
    }

    public static void directInjectJs(String resourceName, String textResource, boolean removeTag, boolean sourceUrl) {
        String text = textResource + (sourceUrl ?
                "//# sourceURL=" + resourceName + ".js" : "");

        // Inject the script resource
        ScriptInjector.fromString(text)
                .setWindow(ScriptInjector.TOP_WINDOW)
                .setRemoveTag(removeTag)
                .inject();
    }

    public static void injectCss(String resource) {
        StyleInjector.inject(resource);
    }
}
