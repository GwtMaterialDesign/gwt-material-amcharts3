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
package gwt.material.design.amcharts.client.ui.chart.plugins.annotation.js;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Extends {@link AnnotationObjectBase} to provide a text type annotation.
 *
 * @author kevzlou7979@gmail.com
 * @see gwt.material.design.amcharts.client.ui.chart.plugins.export.js.AmExportOption#setAnnotations(AnnotationObjectBase[])
 */
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class TextAnnotation extends AnnotationObjectBase {

    @JsProperty
    public double charSpacing;

    @JsProperty
    public String fontFamily;

    @JsProperty
    public double fontSize;

    @JsProperty
    public String fontStyle;

    @JsProperty
    public String fontWeight;

    @JsProperty
    public double lineHeight;

    @JsProperty
    public Object style;

    @JsProperty
    public String text;

    @JsProperty
    public String textAlign;

    @JsProperty
    public String textBackgroundColor;

    @JsProperty
    public String textDecoration;
}
