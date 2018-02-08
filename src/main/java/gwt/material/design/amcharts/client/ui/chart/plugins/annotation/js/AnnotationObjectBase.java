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

import gwt.material.design.jscore.client.api.JsObject;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

// Type Path Group
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AnnotationObjectBase extends JsObject {

    @JsProperty
    public double angle;

    @JsProperty
    public String backgroundColor;

    @JsProperty
    public String clipTo;

    @JsProperty
    public String fill;

    @JsProperty
    public String fillRule;

    @JsProperty
    public boolean flipX;

    @JsProperty
    public boolean flipY;

    @JsProperty
    public String globalCompositeOperation;

    @JsProperty
    public double height;

    @JsProperty
    public double left;

    @JsProperty
    public double opacity;

    @JsProperty
    public String originX;

    @JsProperty
    public String originY;

    @JsProperty
    public double scaleX;

    @JsProperty
    public double scaleY;

    @JsProperty
    public String shadow;

    @JsProperty
    public double skewX;

    @JsProperty
    public double skewY;

    @JsProperty
    public String stroke;

    @JsProperty
    public String[] strokeDashArray;

    @JsProperty
    public String strokeLineCap;

    @JsProperty
    public String strokeLineJoin;

    @JsProperty
    public double strokeMiterLimit;

    @JsProperty
    public double strokeWidth;

    @JsProperty
    public double top;

    @JsProperty
    public String transformMatrix;

    @JsProperty
    public String type;

    @JsProperty
    public boolean visible;

    @JsProperty
    public double width;
}
