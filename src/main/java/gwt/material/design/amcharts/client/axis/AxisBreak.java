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
package gwt.material.design.amcharts.client.axis;

import gwt.material.design.amcharts.client.base.Container;
import gwt.material.design.amcharts.client.base.List;
import gwt.material.design.amcharts.client.dataitem.DataItem;
import gwt.material.design.amcharts.client.properties.IPoint;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class AxisBreak extends Container {

    //TODO: adapter

    @JsProperty
    public Number adjustedEndValue;

    @JsProperty
    public Number adjustedStartValue;

    @JsProperty
    public Axis axis;

    @JsProperty
    public Number breakSize;

    @JsProperty
    public List<DataItem> dataItems;

    //TODO: endLine

    @JsProperty
    public IPoint endPoint;

    @JsProperty
    public Number endPosition;

    @JsProperty
    public Number endValue;

    //TODO: fillShape

    //TODO: startLine

    @JsProperty
    public IPoint startPoint;

    @JsProperty
    public Number startPosition;

    @JsProperty
    public Number startValue;

    @JsMethod
    public native void dispose();
}
