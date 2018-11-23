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
package gwt.material.design.amcharts.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.amcharts.client.base.Circle;
import gwt.material.design.amcharts.client.base.Container;
import gwt.material.design.amcharts.client.base.Rectangle;
import gwt.material.design.amcharts.client.base.Trapezoid;
import gwt.material.design.amcharts.client.theme.ChartTheme;
import jsinterop.annotations.*;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Am4Core {

    @JsProperty(namespace = "am4core", name = "Container")
    public static Container Container;

    @JsProperty(namespace = "am4core", name = "Rectangle")
    public static Rectangle Rectangle;

    @JsProperty(namespace = "am4core", name = "Trapezoid")
    public static Trapezoid Trapezoid;

    @JsProperty(namespace = "am4core", name = "Circle")
    public static Circle Circle;

    @JsMethod(namespace = "am4core")
    public static native Object create(String div, Object object);

    @JsMethod(namespace = "am4core")
    public static native Object create(Element div, Object chartObject);

    @JsOverlay
    public final static Object create(Widget widget, Object chartObject) {
        return create(widget.getElement(), chartObject);
    }

    @JsMethod(namespace = "am4core")
    public static native void useTheme(Object object);

    @JsOverlay
    public final static void useTheme(ChartTheme theme) {
        theme.loadResource();
        useTheme(theme.get());
    }
}
