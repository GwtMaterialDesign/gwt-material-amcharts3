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
package gwt.material.design.amchart.client.ui.maps.js.options;

import gwt.material.design.amchart.client.ui.maps.js.AmMap;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Baseclass for {@link MapArea}, {@link MapLine} and {@link MapImage}, it overwrites the default settings from
 * {@link AreasSettings}, {@link LinesSettings} and {@link ImagesSettings}.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/MapObject">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class MapObject {

    @JsProperty
    private String accessibleLabel;

    @JsProperty
    private double alpha;

    @JsProperty
    private String balloonText;

    @JsProperty
    private boolean bringForwardOnHover;

    @JsProperty
    private String color;

    @JsProperty
    private Object customData;

    @JsProperty
    private String description;

    @JsProperty
    private Object descriptionWindowBottom;

    @JsProperty
    private double descriptionWindowHeight;

    @JsProperty
    private double descriptionWindowLeft;

    @JsProperty
    private double descriptionWindowRight;

    @JsProperty
    private double descriptionWindowTop;

    @JsProperty
    private double descriptionWindowWidth;

    @JsProperty
    private double fixedSize;

    @JsProperty
    private String groupId;

    @JsProperty
    private String id;

    @JsProperty
    private MapImage[] images;

    @JsProperty
    private MapImage[] lines;

    @JsProperty
    private MapObject linkToObject;

    @JsProperty
    private boolean mouseEnabled;

    @JsProperty
    private Object objectType;

    @JsProperty
    private boolean passZoomValuesToTarget;

    @JsProperty
    private boolean remainVisible;

    @JsProperty
    private String rollOverColor;

    @JsProperty
    private boolean selectable;

    @JsProperty
    private String selectedColor;

    @JsProperty
    private boolean showAsSelected;

    @JsProperty
    private boolean showInList;

    @JsProperty
    private int tabIndex;

    @JsProperty
    private String title;

    @JsProperty
    private String url;

    @JsProperty
    private String urlTarget;

    @JsProperty
    private boolean useTargetsZoomValues;

    @JsProperty
    private float zoomLatitude;

    @JsProperty
    private int zoomLevel;

    @JsProperty
    private float zoomLongitude;

    @JsProperty
    private float zoomX;

    @JsProperty
    private float zoomY;

    @JsOverlay
    public final String getAccessibleLabel() {
        return accessibleLabel;
    }

    /**
     * Text which screen readers will read if user rolls-over the object or sets focus using tab key (this is possible
     * only if tabIndex property of object settings or individual object is set to some number). Text is added as
     * aria-label tag. Note - not all screen readers and browsers support this.
     */
    @JsOverlay
    public final void setAccessibleLabel(String accessibleLabel) {
        this.accessibleLabel = accessibleLabel;
    }

    @JsOverlay
    public final double getAlpha() {
        return alpha;
    }

    /**
     * Opacity of map object.
     */
    @JsOverlay
    public final void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    @JsOverlay
    public final String getBalloonText() {
        return balloonText;
    }

    /**
     * Text which is displayed in a roll-over balloon. You can use the following tags: [[title]], [[description]],
     * [[value]] and [[percent]].
     * <p>
     * To disable the balloons, set it to an empty string.
     */
    @JsOverlay
    public final void setBalloonText(String balloonText) {
        this.balloonText = balloonText;
    }

    @JsOverlay
    public final boolean isBringForwardOnHover() {
        return bringForwardOnHover;
    }

    /**
     * Specifies if the object should change it's z-index to the top-most when user hovers it.
     */
    @JsOverlay
    public final void setBringForwardOnHover(boolean bringForwardOnHover) {
        this.bringForwardOnHover = bringForwardOnHover;
    }

    @JsOverlay
    public final String getColor() {
        return color;
    }

    @JsOverlay
    public final void setColor(Color color) {
        setColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * Color of MapObject
     */
    @JsOverlay
    public final void setColor(String color) {
        this.color = color;
    }

    @JsOverlay
    public final Object getCustomData() {
        return customData;
    }

    /**
     * A custom data holder.
     */
    @JsOverlay
    public final void setCustomData(Object customData) {
        this.customData = customData;
    }

    @JsOverlay
    public final String getDescription() {
        return description;
    }

    /**
     * Description of MapObject. Description is displayed in DescriptionWindow (when user clicks on an object). It can
     * also be displayed in a roll-over balloon. DescriptionWindow can display HTML formatted code.
     */
    @JsOverlay
    public final void setDescription(String description) {
        this.description = description;
    }

    @JsOverlay
    public final Object getDescriptionWindowBottom() {
        return descriptionWindowBottom;
    }

    /**
     * Distance from the bottom side of map container to the description window. In case it is not set
     * (also if descriptionWindowTop is not set), window will be placed near the mouse pointer.
     */
    @JsOverlay
    public final void setDescriptionWindowBottom(Object descriptionWindowBottom) {
        this.descriptionWindowBottom = descriptionWindowBottom;
    }

    @JsOverlay
    public final double getDescriptionWindowHeight() {
        return descriptionWindowHeight;
    }

    /**
     * Height of description window.
     */
    @JsOverlay
    public final void setDescriptionWindowHeight(double descriptionWindowHeight) {
        this.descriptionWindowHeight = descriptionWindowHeight;
    }

    @JsOverlay
    public final double getDescriptionWindowLeft() {
        return descriptionWindowLeft;
    }

    /**
     * Distance from the left side of map container to the description window. In case it is not set
     * (also if descriptionWindowRight is not set), window will be placed near the mouse pointer.
     */
    @JsOverlay
    public final void setDescriptionWindowLeft(double descriptionWindowLeft) {
        this.descriptionWindowLeft = descriptionWindowLeft;
    }

    @JsOverlay
    public final double getDescriptionWindowRight() {
        return descriptionWindowRight;
    }

    /**
     * Distance from the right side of map container to the description window. In case it is not set
     * (also if descriptionWindowLeft is not set), window will be placed near the mouse pointer.
     */
    @JsOverlay
    public final void setDescriptionWindowRight(double descriptionWindowRight) {
        this.descriptionWindowRight = descriptionWindowRight;
    }

    @JsOverlay
    public final double getDescriptionWindowTop() {
        return descriptionWindowTop;
    }

    /**
     * Distance from the top side of map container to the description window. In case it is not set
     * (also if descriptionWindowBottom is not set), window will be placed near the mouse pointer.
     */
    @JsOverlay
    public final void setDescriptionWindowTop(double descriptionWindowTop) {
        this.descriptionWindowTop = descriptionWindowTop;
    }

    @JsOverlay
    public final double getDescriptionWindowWidth() {
        return descriptionWindowWidth;
    }

    /**
     * Width of description window.
     */
    @JsOverlay
    public final void setDescriptionWindowWidth(double descriptionWindowWidth) {
        this.descriptionWindowWidth = descriptionWindowWidth;
    }

    @JsOverlay
    public final double getFixedSize() {
        return fixedSize;
    }

    /**
     * Specifies if the object should change the size together with the map or keep fixed size. This applies for objects
     * with lat and long properties set, as they move together with the map. Default to true
     */
    @JsOverlay
    public final void setFixedSize(double fixedSize) {
        this.fixedSize = fixedSize;
    }

    @JsOverlay
    public final String getGroupId() {
        return groupId;
    }

    /**
     * Id of a group. You can group MapObjects to groups. Grouped objects will change color together with this object
     * when you roll-over it or click it. You can show/hide them using showGroup(groupId) and hideGroup(groupId) methods
     * of {@link AmMap} class. You can also use map.zoomToGroup(groupId) methot to
     * zoom-in the map so that all grouped objects are visible.
     */
    @JsOverlay
    public final void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @JsOverlay
    public final String getId() {
        return id;
    }

    /**
     * Unique id of the object. In case it's area, id should match svg path id from SVG file.
     * Id can be used with linkToObject property of MapObject - you can link one object to another using it.
     */
    @JsOverlay
    public final void setId(String id) {
        this.id = id;
    }

    @JsOverlay
    public final MapImage[] getImages() {
        return images;
    }

    /**
     * Array of {@link MapImage} objects.
     */
    @JsOverlay
    public final void setImages(MapImage... images) {
        this.images = images;
    }

    @JsOverlay
    public final MapImage[] getLines() {
        return lines;
    }

    /**
     * Array of {@link MapLine} objects.
     */
    @JsOverlay
    public final void setLines(MapImage[] lines) {
        this.lines = lines;
    }

    @JsOverlay
    public final MapObject getLinkToObject() {
        return linkToObject;
    }

    /**
     * linkToObject can be a reference or id of some other MapObject - MapArea, MapImage or MapLine. It can also be a
     * reference to another DataSet (but not an id). Then user clicks on this object the application would zoom-in to
     * this objects' zoom position (if it is set) and then act as if the linkToObject was clicked. This can also be
     * used for selecting the object you want to be selected right after the map is initialized, as DataSet extends
     * MapObject class, you can specify linkToObject for your DataSet. When you link to another DataSet, you can build
     * drill-down maps.
     */
    @JsOverlay
    public final void setLinkToObject(MapObject linkToObject) {
        this.linkToObject = linkToObject;
    }

    @JsOverlay
    public final boolean isMouseEnabled() {
        return mouseEnabled;
    }

    /**
     * Set this to false to make the object be irresponsive to any interactions like hover or click events.
     * Default to true
     */
    @JsOverlay
    public final void setMouseEnabled(boolean mouseEnabled) {
        this.mouseEnabled = mouseEnabled;
    }

    @JsOverlay
    public final Object getObjectType() {
        return objectType;
    }

    /**
     * Read-only, type of the Object. Possible values are: "DataSet", "MapImage", "MapLine" and "MapArea".
     */
    @JsOverlay
    public final void setObjectType(Object objectType) {
        this.objectType = objectType;
    }

    @JsOverlay
    public final boolean isPassZoomValuesToTarget() {
        return passZoomValuesToTarget;
    }

    /**
     * Specifies if current zoom values should be passed to target MapObject. Useful when building drill down maps.
     * Default to false
     */
    @JsOverlay
    public final void setPassZoomValuesToTarget(boolean passZoomValuesToTarget) {
        this.passZoomValuesToTarget = passZoomValuesToTarget;
    }

    @JsOverlay
    public final boolean isRemainVisible() {
        return remainVisible;
    }

    /**
     * Specifies if the MapObject and other objects of the same level should remain visible if it was clicked and it
     * has children MapObjects. Default to true
     */
    @JsOverlay
    public final void setRemainVisible(boolean remainVisible) {
        this.remainVisible = remainVisible;
    }

    @JsOverlay
    public final String getRollOverColor() {
        return rollOverColor;
    }

    @JsOverlay
    public final void setRollOverColor(Color rollOverColor) {
        setRollOverColor(ColorHelper.setupComputedBackgroundColor(rollOverColor));
    }

    /**
     * Roll over color of of the object.
     */
    @JsOverlay
    public final void setRollOverColor(String rollOverColor) {
        this.rollOverColor = rollOverColor;
    }

    @JsOverlay
    public final boolean isSelectable() {
        return selectable;
    }

    /**
     * Specifies if the object can be selected even if it is not clickable. Map object is clickable if zoom properties
     * are set or it has description or has children objects. Sometimes even non of the listed conditions is met you
     * might need it to be clickable. You should set this property to true in this case. Default to false
     */
    @JsOverlay
    public final void setSelectable(boolean selectable) {
        this.selectable = selectable;
    }

    @JsOverlay
    public final String getSelectedColor() {
        return selectedColor;
    }

    /**
     * Color of an object when it is selected (somebody clicked on it).
     */
    @JsOverlay
    public final void setSelectedColor(String selectedColor) {
        this.selectedColor = selectedColor;
    }

    @JsOverlay
    public final boolean isShowAsSelected() {
        return showAsSelected;
    }

    /**
     * Specifies if selectedColor should be applied to the object. AmMap can have only one selected item at a time,
     * however there might be situations when multiple objects (areas, images, lines) have to look like they are selected. By setting this property to true, you will be able to produce this result.
     */
    @JsOverlay
    public final void setShowAsSelected(boolean showAsSelected) {
        this.showAsSelected = showAsSelected;
    }

    @JsOverlay
    public final boolean isShowInList() {
        return showInList;
    }

    /**
     * Specifies if this object must be displayed in {@link ObjectList} Title should be defined in order the object to appear
     * there.
     */
    @JsOverlay
    public final void setShowInList(boolean showInList) {
        this.showInList = showInList;
    }

    @JsOverlay
    public final int getTabIndex() {
        return tabIndex;
    }

    /**
     * In case you set it to some number, the map will set focus on this object when user clicks tab key. When a focus
     * is set, screen readers like NVDA Screen reader will read label which is set using accessibleLabel property of
     * object settings or individual object. If object is clickable, pressing Enter/Return while focus is set will
     * select the object. Note, not all browsers and readers support this.
     */
    @JsOverlay
    public final void setTabIndex(int tabIndex) {
        this.tabIndex = tabIndex;
    }

    @JsOverlay
    public final String getTitle() {
        return title;
    }

    /**
     * Title of a MapObject. It can be displayed in the roll-over balloon and in the header of description window.
     * All areas in SVG maps distributed with amMap has country names (titles) hard coded in the SVG file.
     */
    @JsOverlay
    public final void setTitle(String title) {
        this.title = title;
    }

    @JsOverlay
    public final String getUrl() {
        return url;
    }

    /**
     * Url of an object. The application will go to this url when you click on the object.
     */
    @JsOverlay
    public final void setUrl(String url) {
        this.url = url;
    }

    @JsOverlay
    public final String getUrlTarget() {
        return urlTarget;
    }

    /**
     * Target of an URL, if URL is a string, for example: "_blank", "_top". Default to "_self"
     */
    @JsOverlay
    public final void setUrlTarget(String urlTarget) {
        this.urlTarget = urlTarget;
    }

    @JsOverlay
    public final boolean isUseTargetsZoomValues() {
        return useTargetsZoomValues;
    }

    /**
     * If set to `true` the map will carry over the same zoom values when transitioning to new data provider. Useful
     * when building drill down maps.
     */
    @JsOverlay
    public final void setUseTargetsZoomValues(boolean useTargetsZoomValues) {
        this.useTargetsZoomValues = useTargetsZoomValues;
    }

    @JsOverlay
    public final float getZoomLatitude() {
        return zoomLatitude;
    }

    /**
     * Specifies latitude to which map should be moved when this object is clicked
     */
    @JsOverlay
    public final void setZoomLatitude(float zoomLatitude) {
        this.zoomLatitude = zoomLatitude;
    }

    @JsOverlay
    public final int getZoomLevel() {
        return zoomLevel;
    }

    /**
     * Specifies map scale to which map should be rescaled when this object is clicked.
     */
    @JsOverlay
    public final void setZoomLevel(int zoomLevel) {
        this.zoomLevel = zoomLevel;
    }

    @JsOverlay
    public final float getZoomLongitude() {
        return zoomLongitude;
    }

    /**
     * Specifies longitude to which map should be moved when this object is clicked.
     */
    @JsOverlay
    public final void setZoomLongitude(float zoomLongitude) {
        this.zoomLongitude = zoomLongitude;
    }

    @JsOverlay
    public final float getZoomX() {
        return zoomX;
    }

    /**
     * Specifies X position (in percents of stage width) to which map should be moved when this object is clicked.
     * You can also use zoomLat and zoomLong instead of zoomX and zoomY.
     */
    @JsOverlay
    public final void setZoomX(float zoomX) {
        this.zoomX = zoomX;
    }

    @JsOverlay
    public final float getZoomY() {
        return zoomY;
    }

    /**
     * Specifies Y position (in percents of stage height) to which map should be moved when this object is clicked.
     * You can also use zoomLat and zoomLong instead of zoomX and zoomY.
     */
    @JsOverlay
    public final void setZoomY(float zoomY) {
        this.zoomY = zoomY;
    }
}
