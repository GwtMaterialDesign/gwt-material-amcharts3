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
package gwt.material.design.amchart.client.ui.maps.js;

//@formatter:off

import gwt.material.design.amchart.client.ui.chart.js.AmChart;
import gwt.material.design.amchart.client.ui.maps.Map;
import gwt.material.design.amchart.client.ui.maps.js.options.*;
import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * JsUtility method for {@link Map}
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/AmMap">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, namespace = "AmCharts")
public class AmMap extends AmChart {

    @JsProperty
    public boolean allowClickOnSelectedObject;

    @JsProperty
    public boolean allowMultipleDescriptionWindows;

    @JsProperty
    public Object areasClasses;

    @JsProperty
    public AreasSettings areasSettings;

    @JsProperty
    public boolean backgroundZoomsToTop;

    @JsProperty
    public Functions.Func balloonLabelFunction;

    @JsProperty
    public boolean centerMap;

    @JsProperty
    public int colorSteps;

    @JsProperty
    public boolean developerMode;

    @JsProperty
    public boolean dragMap;

    @JsProperty
    public boolean fitMapToContainer;

    @JsProperty
    public boolean forceNormalize;

    @JsProperty
    public ImagesSettings imagesSettings;

    @JsProperty
    public boolean linesAboveImages;

    @JsProperty
    public LinesSettings linesSettings;

    @JsProperty
    public Object mapVar;

    @JsProperty
    public int maxValue;

    @JsProperty
    public int minValue;

    @JsProperty
    public boolean mouseWheelZoomEnabled;

    @JsProperty
    public boolean preventDragOut;

    @JsProperty
    public String projection;

    @JsProperty
    public MapObject selectedObject;

    @JsProperty
    public boolean showAreasInList;

    @JsProperty
    public boolean showBalloonOnSelectedObject;

    @JsProperty
    public boolean showDescriptionOnHover;

    @JsProperty
    public boolean showImagesInList;

    @JsProperty
    public boolean showLinesInList;

    @JsProperty
    public boolean showObjectsAfterZoom;

    @JsProperty
    public SmallMap smallMap;

    @JsProperty
    public boolean useHandCursorOnClickableOjects;

    @JsProperty
    public boolean useObjectColorForBalloon;

    @JsProperty
    public ValueLegend valueLegend;

    @JsProperty
    public ZoomControl zoomControl;

    @JsProperty
    public int zoomDuration;

    @JsProperty
    public boolean zoomOnDoubleClick;
}
