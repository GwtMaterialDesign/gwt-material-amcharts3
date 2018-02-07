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
package gwt.material.design.amchart.client.ui.maps;

import gwt.material.design.amchart.client.ui.GwtMaterialAmChart;
import gwt.material.design.amchart.client.ui.chart.base.AbstractChart;
import gwt.material.design.amchart.client.ui.chart.base.constants.ChartType;
import gwt.material.design.amchart.client.ui.maps.base.constants.Projection;
import gwt.material.design.amchart.client.ui.maps.js.AmMap;
import gwt.material.design.amchart.client.ui.maps.js.options.*;
import gwt.material.design.amchart.client.ui.maps.resources.MapClientBundle;
import gwt.material.design.amchart.client.ui.maps.resources.MapClientDebugBundle;
import gwt.material.design.client.MaterialDesign;
import gwt.material.design.jquery.client.api.Functions;

/**
 * Base class of {@link AbstractChart}. It can not be instantiated explicitly. It's makeChart method gives you the
 * possibility to create maps easily with a single object.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/AmMap">Official Documentation</a>
 */
//@formatter:on
public class Map extends AbstractChart {

    static {
        if (GwtMaterialAmChart.isDebug()) {
            MaterialDesign.injectDebugJs(MapClientDebugBundle.INSTANCE.amMapDebugJs());
            MaterialDesign.injectCss(MapClientDebugBundle.INSTANCE.ammapDebugCss());
        } else {
            MaterialDesign.injectJs(MapClientBundle.INSTANCE.amMapJs());
            MaterialDesign.injectCss(MapClientBundle.INSTANCE.ammapCss());
        }
    }

    private AmMap amMap;

    public Map() {
        super(ChartType.MAP);
    }

    public Map(ChartType chartType) {
        super(chartType);
    }

    public boolean isAllowClickOnSelectedObject() {
        return getAmMap().allowClickOnSelectedObject;
    }

    /**
     * Specifies if user can repeatedly click on already selected object. Default to true
     */
    public void setAllowClickOnSelectedObject(boolean allowClickOnSelectedObject) {
        getAmMap().allowClickOnSelectedObject = allowClickOnSelectedObject;
    }

    public boolean isAllowMultipleDescriptionWindows() {
        return getAmMap().allowMultipleDescriptionWindows;
    }

    /**
     * Specifies if multiple description windows at a time are allowed. When set to false, previously opened window is
     * closed when opening a new one. Default to false
     */
    public void setAllowMultipleDescriptionWindows(boolean allowMultipleDescriptionWindows) {
        getAmMap().allowMultipleDescriptionWindows = allowMultipleDescriptionWindows;
    }

    public Object getAreasClasses() {
        return getAmMap().areasClasses;
    }

    /**
     * You can create multiple AreasSettings objects and then set them using this property. For example,
     * map.areasClasses["rivers"] = riversSettings; The class "rivers" should be set for your svg areas which should
     * use the riversSettings object.
     */
    public void setAreasClasses(Object areasClasses) {
        getAmMap().areasClasses = areasClasses;
    }

    public AreasSettings getAreasSettings() {
        return getAmMap().areasSettings;
    }

    /**
     * Common settings of areas.
     */
    public void setAreasSettings(AreasSettings areasSettings) {
        getAmMap().areasSettings = areasSettings;
    }

    public boolean isBackgroundZoomsToTop() {
        return getAmMap().backgroundZoomsToTop;
    }

    /**
     * Specifies if clicking on the "water" zooms to the "top". Default to false
     */
    public void setBackgroundZoomsToTop(boolean backgroundZoomsToTop) {
        getAmMap().backgroundZoomsToTop = backgroundZoomsToTop;
    }

    public Functions.Func getBalloonLabelFunction() {
        return getAmMap().balloonLabelFunction;
    }

    /**
     * Method which will be called by the map when a balloon with some text is displayed. You can use it to change the
     * default text of a balloon.When this function is called, mapObject and map references are passed to it:
     * <p>
     * balloonLabelFunction(mapObject, ammap);
     * <p>
     * You can extract any data from mapObject and return new balloon text.
     */
    public void setBalloonLabelFunction(Functions.Func balloonLabelFunction) {
        getAmMap().balloonLabelFunction = balloonLabelFunction;
    }

    public boolean isCenterMap() {
        return getAmMap().centerMap;
    }

    /**
     * Specifies if the map should be centered. Default to true
     */
    public void setCenterMap(boolean centerMap) {
        getAmMap().centerMap = centerMap;
    }

    public int getColorSteps() {
        return getAmMap().colorSteps;
    }

    /**
     * If you set values for MapAreas, they are filled with colors between color and colorSolid
     * (both set in AreasSettings). colorSteps property specifies how many different colors should be used.
     * Set this to some big number like 100 if you want each area to be filled with a different shade of color
     * (according to it's value). Default to 5
     */
    public void setColorSteps(int colorSteps) {
        getAmMap().colorSteps = colorSteps;
    }

    public boolean isDeveloperMode() {
        return getAmMap().developerMode;
    }

    /**
     * When developer mode is set to true, you can click anywhere on the map while SHIFT key is pressed to trigger a
     * writeDevInfo event. All the information about current map position/zoom will be transferred to the event handler.
     * Default to false
     */
    public void setDeveloperMode(boolean developerMode) {
        getAmMap().developerMode = developerMode;
    }

    public boolean isDragMap() {
        return getAmMap().dragMap;
    }

    /**
     * Specifies if the map is draggable. Default to true
     */
    public void setDragMap(boolean dragMap) {
        getAmMap().dragMap = dragMap;
    }

    public boolean isFitMapToContainer() {
        return getAmMap().fitMapToContainer;
    }

    /**
     * Specifies if the map should be resized to fit to the stage. Default to true
     */
    public void setFitMapToContainer(boolean fitMapToContainer) {
        getAmMap().fitMapToContainer = fitMapToContainer;
    }

    public boolean isForceNormalize() {
        return getAmMap().forceNormalize;
    }

    /**
     * If you set it to true, the map will redraw all the areas, normalizing paths. This might be needed if you use SVG
     * filters with areas. Might not work with maps containing complex paths (with arcs and similar). Default to false
     */
    public void setForceNormalize(boolean forceNormalize) {
        getAmMap().forceNormalize = forceNormalize;
    }

    public ImagesSettings getImagesSettings() {
        return getAmMap().imagesSettings;
    }

    /**
     * Common settings of images.
     */
    public void setImagesSettings(ImagesSettings imagesSettings) {
        getAmMap().imagesSettings = imagesSettings;
    }

    public boolean isLinesAboveImages() {
        return getAmMap().linesAboveImages;
    }

    /**
     * You can specify whether lines should be above or below images. Default to true
     */
    public void setLinesAboveImages(boolean linesAboveImages) {
        getAmMap().linesAboveImages = linesAboveImages;
    }

    public LinesSettings getLinesSettings() {
        return getAmMap().linesSettings;
    }

    /**
     * Common settings of lines.
     */
    public void setLinesSettings(LinesSettings linesSettings) {
        getAmMap().linesSettings = linesSettings;
    }

    public Object getMapVar() {
        return getAmMap().mapVar;
    }

    public void setMapVar(Object mapVar) {
        getAmMap().mapVar = mapVar;
    }

    public int getMaxValue() {
        return getAmMap().maxValue;
    }

    /**
     * Use this property in case you set values for your areas and wish to set a different maxValue. These values
     * are used when choosing a color for an area.
     */
    public void setMaxValue(int maxValue) {
        getAmMap().maxValue = maxValue;
    }

    public int getMinValue() {
        return getAmMap().minValue;
    }

    /**
     * Use this property in case you set values for your areas and wish
     * to set a different minValue (it's 0 by default). These values are used when choosing a color for an area. Default
     * to 0
     */
    public void setMinValue(int minValue) {
        getAmMap().minValue = minValue;
    }

    public boolean isMouseWheelZoomEnabled() {
        return getAmMap().mouseWheelZoomEnabled;
    }

    /**
     * Specifies if zooming with mouse wheel is enabled. Default to false
     */
    public void setMouseWheelZoomEnabled(boolean mouseWheelZoomEnabled) {
        getAmMap().mouseWheelZoomEnabled = mouseWheelZoomEnabled;
    }

    public boolean isPreventDragOut() {
        return getAmMap().preventDragOut;
    }

    /**
     * If set to true, user won't be able to drag map out of the visible area. Default to false
     */
    public void setPreventDragOut(boolean preventDragOut) {
        getAmMap().preventDragOut = preventDragOut;
    }

    public String getProjection() {
        return getAmMap().projection;
    }

    /**
     * Projection of the map. Projection can be also set in SVG map - all svg maps which are distributed with amMap have
     * projection set in SVG.
     * <p>
     * Available values are: "winkel3", "eckert3", "eckert5", "eckert6", "miller", "equirectangular" and "mercator" (default).
     */
    public void setProjection(Projection projection) {
        getAmMap().projection = projection.getName();
    }

    public MapObject getSelectedObject() {
        return getAmMap().selectedObject;
    }

    /**
     * Read-only. Returns currently selected map object. Use map.selectObject(mapObject) method to change it.
     */
    public void setSelectedObject(MapObject selectedObject) {
        getAmMap().selectedObject = selectedObject;
    }

    public boolean isShowAreasInList() {
        return getAmMap().showAreasInList;
    }

    /**
     * Specifies if MapAreas should be displayed in the ObjectList. Default to true
     */
    public void setShowAreasInList(boolean showAreasInList) {
        getAmMap().showAreasInList = showAreasInList;
    }

    public boolean isShowBalloonOnSelectedObject() {
        return getAmMap().showBalloonOnSelectedObject;
    }

    /**
     * Specifies if balloon should be displayed when hovering currently selected object. Default to true
     */
    public void setShowBalloonOnSelectedObject(boolean showBalloonOnSelectedObject) {
        getAmMap().showBalloonOnSelectedObject = showBalloonOnSelectedObject;
    }

    public boolean isShowDescriptionOnHover() {
        return getAmMap().showDescriptionOnHover;
    }

    /**
     * Specifies if description window should be shown when user hovers over the object. Default to false
     */
    public void setShowDescriptionOnHover(boolean showDescriptionOnHover) {
        getAmMap().showDescriptionOnHover = showDescriptionOnHover;
    }

    public boolean isShowImagesInList() {
        return getAmMap().showImagesInList;
    }

    /**
     * Specifies if MapImages should be displayed in the ObjectList. Default to false
     */
    public void setShowImagesInList(boolean showImagesInList) {
        getAmMap().showImagesInList = showImagesInList;
    }

    public boolean isShowLinesInList() {
        return getAmMap().showLinesInList;
    }

    /**
     * Specifies if MapLines should be displayed in the ObjectList. Default to false
     */
    public void setShowLinesInList(boolean showLinesInList) {
        getAmMap().showLinesInList = showLinesInList;
    }

    public boolean isShowObjectsAfterZoom() {
        return getAmMap().showObjectsAfterZoom;
    }

    /**
     * Specifies if child objects should be added to stage only after the map zoomed to the final position.
     * Default to false
     */
    public void setShowObjectsAfterZoom(boolean showObjectsAfterZoom) {
        getAmMap().showObjectsAfterZoom = showObjectsAfterZoom;
    }

    public SmallMap getSmallMap() {
        return getAmMap().smallMap;
    }

    /**
     * Small map displays a small map indicating zoom level and position.
     */
    public void setSmallMap(SmallMap smallMap) {
        getAmMap().smallMap = smallMap;
    }

    public boolean isUseHandCursorOnClickableOjects() {
        return getAmMap().useHandCursorOnClickableOjects;
    }

    /**
     * Specifies if hand cursor should be displayed when mouse moves over a clickable object. Default to true
     */
    public void setUseHandCursorOnClickableOjects(boolean useHandCursorOnClickableOjects) {
        getAmMap().useHandCursorOnClickableOjects = useHandCursorOnClickableOjects;
    }

    public boolean isUseObjectColorForBalloon() {
        return getAmMap().useObjectColorForBalloon;
    }

    /**
     * Specifies if balloon should use color of currenlty hovered object. Default to true
     */
    public void setUseObjectColorForBalloon(boolean useObjectColorForBalloon) {
        getAmMap().useObjectColorForBalloon = useObjectColorForBalloon;
    }

    public ValueLegend getValueLegend() {
        return getAmMap().valueLegend;
    }

    /**
     * Value legend displays a color range used by areas (in case you set values for your areas).
     */
    public void setValueLegend(ValueLegend valueLegend) {
        getAmMap().valueLegend = valueLegend;
    }

    public ZoomControl getZoomControl() {
        return getAmMap().zoomControl;
    }

    /**
     * Zoom control of the map.
     */
    public void setZoomControl(ZoomControl zoomControl) {
        getAmMap().zoomControl = zoomControl;
    }

    public int getZoomDuration() {
        return getAmMap().zoomDuration;
    }

    /**
     * Duration of zoom animation, in seconds. Default to 1
     */
    public void setZoomDuration(int zoomDuration) {
        getAmMap().zoomDuration = zoomDuration;
    }

    public boolean isZoomOnDoubleClick() {
        return getAmMap().zoomOnDoubleClick;
    }

    /**
     * Specifies if the map should be zoomed-in when user double clicks anywhere on the map
     * (except objects which are clickable). Default to true
     */
    public void setZoomOnDoubleClick(boolean zoomOnDoubleClick) {
        getAmMap().zoomOnDoubleClick = zoomOnDoubleClick;
    }

    public AmMap getAmMap() {
        if (amMap == null) {
            amMap = new AmMap();
        }
        return amMap;
    }

    @Override
    public AmMap getChart() {
        return getAmMap();
    }
}
