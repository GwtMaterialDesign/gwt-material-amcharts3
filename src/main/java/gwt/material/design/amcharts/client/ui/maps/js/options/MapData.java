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
package gwt.material.design.amcharts.client.ui.maps.js.options;

import com.google.gwt.resources.client.TextResource;
import gwt.material.design.amcharts.client.ui.maps.base.constants.MapLayer;
import gwt.material.design.amcharts.client.ui.maps.resources.MapResourceLoader;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Extension for {@link MapObject} to define the dataProvider for the map. It's an object which may contain an array of images,
 * areas or lines.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/MapData">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class MapData extends MapObject {

    @JsProperty
    private MapArea[] areas;

    @JsProperty
    private float bottomLatitude;

    @JsProperty
    private boolean getAreasFromMap;

    @JsProperty
    private float leftLongitude;

    @JsProperty
    private String map;

    @JsProperty
    private String mapURL;

    @JsProperty
    private Object mapVar;

    @JsProperty
    private float rightLongitude;

    @JsProperty
    private float topLatitude;

    @JsOverlay
    public final MapArea[] getAreas() {
        return areas;
    }

    /**
     * Array of MapArea objects.
     */
    @JsOverlay
    public final void setAreas(MapArea... areas) {
        this.areas = areas;
    }

    @JsOverlay
    public final float getBottomLatitude() {
        return bottomLatitude;
    }

    /**
     * Latitude of bottom-most point of a map. All maps in amMap package have this information hardcoded in SVG file.
     * Default to -90
     */
    @JsOverlay
    public final void setBottomLatitude(float bottomLatitude) {
        this.bottomLatitude = bottomLatitude;
    }

    @JsOverlay
    public final boolean isGetAreasFromMap() {
        return getAreasFromMap;
    }

    /**
     * If you set this to true, all areas available in SVG map will be created automatically. Default to false
     */
    @JsOverlay
    public final void setGetAreasFromMap(boolean getAreasFromMap) {
        this.getAreasFromMap = getAreasFromMap;
    }

    @JsOverlay
    public final float getLeftLongitude() {
        return leftLongitude;
    }

    /**
     * Longitude of left-most point of a map. All maps in amMap package have this information hardcoded in SVG file.
     * Default to -180
     */
    @JsOverlay
    public final void setLeftLongitude(float leftLongitude) {
        this.leftLongitude = leftLongitude;
    }

    @JsOverlay
    public final String getMap() {
        return map;
    }

    /**
     * Name of a map. Instead of using mapURL or mapVar you can use name of the map, usualy the same as file name of the
     * map, for example: map = "worldLow".
     */
    @JsOverlay
    public final void setMap(MapLayer map) {
        MapResourceLoader.loadMap(map);
        this.map = map.getName();
    }

    @JsOverlay
    public final void setMap(String name, TextResource jsMapResource) {
        MapResourceLoader.injectJs(name, jsMapResource.getText());
        this.map = name;
    }

    @JsOverlay
    public final String getMapURL() {
        return mapURL;
    }

    /**
     * Path to map SVG file. Use it if you don't include map as .js file. Loading SVG is a bit risky, as some browsers
     * might not do this correctly - it depends on server configuration. We recommend to include maps as .js files.
     * Application won't load svg files from hard drive, so you can test this only on web server.
     */
    @JsOverlay
    public final void setMapURL(String mapURL) {
        this.mapURL = mapURL;
    }

    @JsOverlay
    public final Object getMapVar() {
        return mapVar;
    }

    /**
     * In case you included map as js file, you should specify variable name of a map. Open your map.js file and copy
     * variable name, for example: AmCharts.maps.worldLow
     */
    @JsOverlay
    public final void setMapVar(Object mapVar) {
        this.mapVar = mapVar;
    }

    @JsOverlay
    public final float getRightLongitude() {
        return rightLongitude;
    }

    /**
     * Longitude of right-most point of a map. All maps in amMap package have this information hardcoded in SVG file.
     * Default to 180
     */
    @JsOverlay
    public final void setRightLongitude(float rightLongitude) {
        this.rightLongitude = rightLongitude;
    }

    @JsOverlay
    public final float getTopLatitude() {
        return topLatitude;
    }

    /**
     * Latitude of top-most point of a map. All maps in amMap package have this information hardcoded in SVG file.
     * Default to 90
     */
    @JsOverlay
    public final void setTopLatitude(float topLatitude) {
        this.topLatitude = topLatitude;
    }
}
