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
package gwt.material.design.amcharts.client.ui.chart.plugins.annotation.js.options;

import gwt.material.design.amcharts.client.ui.chart.plugins.annotation.js.AnnotationObjectBase;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Data Wrapper to gather all the {@link gwt.material.design.amcharts.client.ui.chart.plugins.annotation.js.AnnotationObjectBase}
 * and will set in {@link gwt.material.design.amcharts.client.ui.chart.plugins.export.js.AmExportOption#setAnnotations(AnnotationObjectBase[])}.
 *
 * @author kevzlou7979@gmail.com
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AnnotationData {

    @JsProperty
    public Object data;
}
