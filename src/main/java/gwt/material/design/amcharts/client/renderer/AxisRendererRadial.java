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
package gwt.material.design.amcharts.client.renderer;

import gwt.material.design.amcharts.client.axis.Axis;
import gwt.material.design.amcharts.client.axis.AxisFillCircular;
import gwt.material.design.amcharts.client.axis.AxisLabelCircular;
import gwt.material.design.amcharts.client.axis.GridCircular;
import gwt.material.design.amcore.client.base.Container;
import gwt.material.design.amcore.client.properties.IPoint;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class AxisRendererRadial extends AxisRendererY {

    @JsProperty
    public Number axisAngle;

    @JsProperty
    public Number axisLength;

    @JsProperty
    public Number endAngle;

    /**
     * @see gwt.material.design.amcore.client.constants.GridType
     */
    @JsProperty
    public String gridType;

    /**
     * Accepts {@link Number} or {@link gwt.material.design.amcore.client.base.Percent}
     */
    @JsProperty
    public Object innerRadius;

    @JsProperty
    public Number pixelInnerRadius;

    @JsProperty
    public Number pixelRadius;

    /**
     * Accepts {@link Number} or {@link gwt.material.design.amcore.client.base.Percent}
     */
    @JsProperty
    public Object radius;

    @JsProperty
    public Number startAngle;

    @JsMethod
    public native IPoint positionToPoint(Number position);
}
