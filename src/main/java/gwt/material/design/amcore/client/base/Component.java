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
package gwt.material.design.amcore.client.base;

import gwt.material.design.amcore.client.data.DataSource;
import gwt.material.design.amcore.client.properties.IComponentDataFields;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Component extends Container {

    @JsProperty
    public Object[] data;

    @JsProperty
    public IComponentDataFields dataFields;

    //TODO: OrderedListTemplate < DataItem > dataItems

    @JsProperty
    public Component dataProvider;

    @JsProperty
    public DataSource dataSource;

    @JsProperty
    public Number interpolationDuration;

    @JsProperty
    public Object interpolationEasing;

    @JsProperty
    public Number maxZoomFactor;

    @JsProperty
    public Number parsingStepDuration;

    @JsProperty
    public Number rangeChangeDuration;

    @JsProperty
    public Object rangeChangeEasing;

    //TODO: Responsive responsive

    @JsProperty
    public boolean sequencedInterpolation;

    @JsProperty
    public Number sequencedInterpolationDelay;

    @JsProperty
    public boolean skipRangeEvent;

    @JsProperty
    public Number zoomFactor;

    @JsMethod
    public native void addData(Object[] rawDataItem, Number removeCount);

    @JsMethod
    public native void bindDataField(Object key, Object value);

    @JsMethod
    public native Component clone();

    @JsMethod
    public native void copyFrom(Component component);

    @JsMethod
    public native void disposeData();

    @JsMethod
    public native DataSource getDataSource(String property);

    @JsMethod
    public native void invalidateRawData();

    @JsMethod
    public native void reinit();

    @JsMethod
    public native void removeData(Number count);

    //Irange zoom

    @JsMethod
    public native void zoomToIndexes(Number startIndex, Number endIndex);

    @JsMethod
    public native void zoomToIndexes(Number startIndex, Number endIndex, boolean skipRangeEvent, boolean instantly);

    @JsMethod
    public native void zoomToIndexes(int startIndex, int endIndex, boolean skipRangeEvent, boolean instantly);

    @JsMethod
    public native void zoomToIndexes(int startIndex, int endIndex);
}
