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

import gwt.material.design.amchart.client.ui.chart.base.constants.Position;
import gwt.material.design.amchart.client.ui.maps.base.constants.MapImageType;
import gwt.material.design.amchart.client.ui.maps.js.AmMap;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.*;

/**
 * Extension for {@link MapObject} to define individual settings for each image. it overwrites the settings obtained from
 * {@link ImagesSettings}. It supports svg (or path), png, jpg or gif files and has three predefined types available circle,
 * rectangle and bubble, labels can be shown as well.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/MapImage">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class MapImage extends MapObject {

    @JsProperty
    public double positionScale;

    @JsProperty
    private boolean animateAlongLine;

    @JsProperty
    private boolean animateAngle;

    @JsProperty
    private double animationDuration;

    @JsProperty
    private double bottom;

    @JsProperty
    private boolean centered;

    @JsProperty
    private Functions.Func easingFunction;

    @JsProperty
    private boolean flipDirection;

    @JsProperty
    private double height;

    @JsProperty
    private String imageURL;

    @JsProperty
    private String label;

    @JsProperty
    private double labelBackgroundAlpha;

    @JsProperty
    private String labelBackgroundColor;

    @JsProperty
    private String labelColor;

    @JsProperty
    private double labelFontSize;

    @JsProperty
    private String labelPosition;

    @JsProperty
    private String labelRollOverColor;

    @JsProperty
    private double labelShiftX;

    @JsProperty
    private double labelShiftY;

    @JsProperty
    private float latitude;

    @JsProperty
    private Object left;

    @JsProperty
    private String lineId;

    @JsProperty
    private float longitude;

    @JsProperty
    private boolean loop;

    @JsProperty
    private double outlineAlpha;

    @JsProperty
    private String outlineColor;

    @JsProperty
    private double outlineThickness;

    @JsProperty
    private double percentHeight;

    @JsProperty
    private double percentWidth;

    @JsProperty
    private double positionOnLine;

    @JsProperty
    private double right;

    @JsProperty
    private double rollOverScale;

    @JsProperty
    private double scale;

    @JsProperty
    private String selectedLabelColor;

    @JsProperty
    private double selectedScale;

    @JsProperty
    private String svgPath;

    @JsProperty
    private double top;

    @JsProperty
    private String type;

    @JsProperty
    private double width;

    @JsProperty
    private String widthAndHeightUnits;

    /**
     * Triggers animation along a line. Duration and easingFunction attributes are optional.
     */
    @JsMethod
    public native void animateAlong(String lineId, double duration, Functions.Func easingFunction);

    @JsMethod
    public native void animateAlong(String lineId);

    /**
     * You can animate images to any coordinates (instead of longitude/latitude you can use top/left/right/bottom
     * coordinates).
     */
    @JsMethod
    public native void animateTo(float longitude, float lantitude, double duration, Functions.Func easingFunction);

    /**
     * Deletes the image.
     */
    @JsMethod
    public native void deleteObject();

    /**
     * Fixes the image to the map instead of the stage. To do this, left/top/right/bottom coordinates are changed to
     * latitude/longitude.
     */
    @JsMethod
    public native void fixToMap();

    /**
     * Fixes the image to the stage instead of the map. To do latitude and longitude are changed to top/left coordinates.
     */
    @JsMethod
    public native void fixToStage();

    /**
     * Updates position of an image.
     */
    @JsMethod
    public native void updatePosition();

    /**
     * Redraws the image.
     */
    @JsMethod
    public native void validate();

    @JsOverlay
    public final boolean isAnimateAlongLine() {
        return animateAlongLine;
    }

    /**
     * If you set it to true, and lineId of some line is set, the image will animate along the line. Default to false
     */
    @JsOverlay
    public final void setAnimateAlongLine(boolean animateAlongLine) {
        this.animateAlongLine = animateAlongLine;
    }

    @JsOverlay
    public final boolean isAnimateAngle() {
        return animateAngle;
    }

    /**
     * Set this to `false` if you do not want the image change it's angle to align with the line's direction, it is
     * animating on. Default to true
     */
    @JsOverlay
    public final void setAnimateAngle(boolean animateAngle) {
        this.animateAngle = animateAngle;
    }

    @JsOverlay
    public final double getAnimationDuration() {
        return animationDuration;
    }

    /**
     * Defines duration of animation (along line or when animateTo method is called, in seconds. Global
     * animationDuration can also be set via {@link ImagesSettings}.
     */
    @JsOverlay
    public final void setAnimationDuration(double animationDuration) {
        this.animationDuration = animationDuration;
    }

    @JsOverlay
    public final double getBottom() {
        return bottom;
    }

    /**
     * Distance from bottom of a map container to the image. If centered property is false, then the distance is
     * measured to the bottom of the image, otherwise - to the center. If you set this property, value of top property
     * is ignored. This property can be set as a number (of pixels) or as a percent value, like: image.bottom = "10%";.
     * The image will not be bounded to the map if this property is set. Use latitude and longitude properties if you
     * want the image to move with the map.
     */
    @JsOverlay
    public final void setBottom(double bottom) {
        this.bottom = bottom;
    }

    @JsOverlay
    public final boolean isCentered() {
        return centered;
    }

    /**
     * Specifies if the image's center should be placed in the provided coordinates. If false, top-left corner will be
     * at provided coordinates. This property doesn't work with images set as svgPath.
     */
    @JsOverlay
    public final void setCentered(boolean centered) {
        this.centered = centered;
    }

    @JsOverlay
    public final Functions.Func getEasingFunction() {
        return easingFunction;
    }

    /**
     * Function which defines how the image should animate. AmCharts.easeInOutQuad. You can use these methods:
     * AmCharts.bounce, AmCharts.easeInSine, AmCharts.easeOutSine, AmCharts.easeOutElastic. Common for all easing
     * function is set on ImagesSettings.
     */
    @JsOverlay
    public final void setEasingFunction(Functions.Func easingFunction) {
        this.easingFunction = easingFunction;
    }

    @JsOverlay
    public final boolean isFlipDirection() {
        return flipDirection;
    }

    /**
     * Specifies if animation along lines should be played in reverse direction when reached the end of a line.
     * Default to false
     */
    @JsOverlay
    public final void setFlipDirection(boolean flipDirection) {
        this.flipDirection = flipDirection;
    }

    @JsOverlay
    public final double getHeight() {
        return height;
    }

    /**
     * Height of an image. Works with predefined images (if type is set) and loaded images (imageURL is set). If
     * svgPath is set, use scale property to change it's size.
     */
    @JsOverlay
    public final void setHeight(double height) {
        this.height = height;
    }

    @JsOverlay
    public final String getImageURL() {
        return imageURL;
    }

    /**
     * Url of an image. Images can be svg, jpg, png or gif files. Note, you can't control color, outlineColor,
     * outlineAlpha and outlineThickness of loaded images. Use svgPath property if you need to change these properties.
     */
    @JsOverlay
    public final void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @JsOverlay
    public final String getLabel() {
        return label;
    }

    /**
     * Text which will be shown next to the image.
     */
    @JsOverlay
    public final void setLabel(String label) {
        this.label = label;
    }

    @JsOverlay
    public final double getLabelBackgroundAlpha() {
        return labelBackgroundAlpha;
    }

    /**
     * Opacity of label background alpha.
     */
    @JsOverlay
    public final void setLabelBackgroundAlpha(double labelBackgroundAlpha) {
        this.labelBackgroundAlpha = labelBackgroundAlpha;
    }

    @JsOverlay
    public final String getLabelBackgroundColor() {
        return labelBackgroundColor;
    }

    @JsOverlay
    public final void setLabelBackgroundColor(Color labelBackgroundColor) {
        setLabelBackgroundColor(ColorHelper.setupComputedBackgroundColor(labelBackgroundColor));
    }

    /**
     * Color of label background.
     */
    @JsOverlay
    public final void setLabelBackgroundColor(String labelBackgroundColor) {
        this.labelBackgroundColor = labelBackgroundColor;
    }

    @JsOverlay
    public final String getLabelColor() {
        return labelColor;
    }

    @JsOverlay
    public final void setLabelColor(Color labelColor) {
        setLabelColor(ColorHelper.setupComputedBackgroundColor(labelColor));
    }

    /**
     * Label color.
     */
    @JsOverlay
    public final void setLabelColor(String labelColor) {
        this.labelColor = labelColor;
    }

    @JsOverlay
    public final double getLabelFontSize() {
        return labelFontSize;
    }

    /**
     * Font size of a label.
     */
    @JsOverlay
    public final void setLabelFontSize(double labelFontSize) {
        this.labelFontSize = labelFontSize;
    }

    @JsOverlay
    public final String getLabelPosition() {
        return labelPosition;
    }

    /**
     * Position of the label. Allowed values are: left, right, top, bottom and middle.
     */
    @JsOverlay
    public final void setLabelPosition(Position labelPosition) {
        this.labelPosition = labelPosition.getName();
    }

    @JsOverlay
    public final String getLabelRollOverColor() {
        return labelRollOverColor;
    }

    @JsOverlay
    public final void setLabelRollOverColor(Color labelRollOverColor) {
        setLabelRollOverColor(ColorHelper.setupComputedBackgroundColor(labelRollOverColor));
    }

    /**
     * Label roll-over color.
     */
    @JsOverlay
    public final void setLabelRollOverColor(String labelRollOverColor) {
        this.labelRollOverColor = labelRollOverColor;
    }

    @JsOverlay
    public final double getLabelShiftX() {
        return labelShiftX;
    }

    /**
     * In some cases you might want to adjust label position a bit. Use this property to shift label horizontally.
     * Default to 0
     */
    @JsOverlay
    public final void setLabelShiftX(double labelShiftX) {
        this.labelShiftX = labelShiftX;
    }

    @JsOverlay
    public final double getLabelShiftY() {
        return labelShiftY;
    }

    /**
     * In some cases you might want to adjust label position a bit. Use this property to shift label vertically.
     * Default to 0
     */
    @JsOverlay
    public final void setLabelShiftY(double labelShiftY) {
        this.labelShiftY = labelShiftY;
    }

    @JsOverlay
    public final float getLatitude() {
        return latitude;
    }

    /**
     * Latitude of the image. of the image. Set this property if you want the image to be bounded to the map.
     * Otherwise use left/right/top/bottom properties.
     */
    @JsOverlay
    public final void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    @JsOverlay
    public final Object getLeft() {
        return left;
    }

    /**
     * Distance from left of a map container to the image. If centered property is false, then the distance is measured
     * to the left of the image, otherwise - to the center. The image will not be bounded to the map if this property is
     * set. Use latitude and longitude properties if you want the image to move with the map. This property can be set
     * as a number (of pixels) or as a percent value, like: image.left = "10%";
     */
    @JsOverlay
    public final void setLeft(Object left) {
        this.left = left;
    }

    @JsOverlay
    public final String getLineId() {
        return lineId;
    }

    /**
     * You should add id for the line and set this id for the image if you want to use create animation along line or
     * position image at some relative position of a line.
     */
    @JsOverlay
    public final void setLineId(String lineId) {
        this.lineId = lineId;
    }

    @JsOverlay
    public final float getLongitude() {
        return longitude;
    }

    /**
     * Longitude of the image. Set this property if you want the image to be bounded to the map. Otherwise use
     * left/right/top/bottom properties.
     */
    @JsOverlay
    public final void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    @JsOverlay
    public final boolean isLoop() {
        return loop;
    }

    /**
     * Specifies if animation along lines should be looped. Default to true
     */
    @JsOverlay
    public final void setLoop(boolean loop) {
        this.loop = loop;
    }

    @JsOverlay
    public final double getOutlineAlpha() {
        return outlineAlpha;
    }

    /**
     * Opacity of image outline. This will affect only predefined images (with "type" property set) and images with
     * svgPath set. This property won't affect bitmap images and loaded SVG images.
     */
    @JsOverlay
    public final void setOutlineAlpha(double outlineAlpha) {
        this.outlineAlpha = outlineAlpha;
    }

    @JsOverlay
    public final String getOutlineColor() {
        return outlineColor;
    }

    /**
     * Color of image outline. This will affect only predefined images (with "type" property set) and images with
     * svgPath set. This property won't affect bitmap images and loaded SVG images.
     */
    @JsOverlay
    public final void setOutlineColor(String outlineColor) {
        this.outlineColor = outlineColor;
    }

    @JsOverlay
    public final double getOutlineThickness() {
        return outlineThickness;
    }

    /**
     * Thickness of image outline. This will affect only predefined images (with "type" property set) and images with
     * svgPath set. This property won't affect bitmap images and loaded SVG images.
     */
    @JsOverlay
    public final void setOutlineThickness(double outlineThickness) {
        this.outlineThickness = outlineThickness;
    }

    @JsOverlay
    public final double getPercentHeight() {
        return percentHeight;
    }

    /**
     * Height of an image, in percents of map container. Works with predefined images (if type is set) and loaded images
     * (imageURL is set). If svgPath is set, use scale property to change it's size.
     */
    @JsOverlay
    public final void setPercentHeight(double percentHeight) {
        this.percentHeight = percentHeight;
    }

    @JsOverlay
    public final double getPercentWidth() {
        return percentWidth;
    }

    /**
     * Width of an image, in percents of map container. Works with predefined images (if type is set) and loaded images
     * (imageURL is set). If svgPath is set, use scale property to change it's size.
     */
    @JsOverlay
    public final void setPercentWidth(double percentWidth) {
        this.percentWidth = percentWidth;
    }

    @JsOverlay
    public final double getPositionOnLine() {
        return positionOnLine;
    }

    /**
     * If you set lineId of some line and then set positionOnLine to 0.5, the image will be placed in the middle of the
     * line. Allowed values are from 0 to 1. Default to 0.5
     */
    @JsOverlay
    public final void setPositionOnLine(double positionOnLine) {
        this.positionOnLine = positionOnLine;
    }

    @JsOverlay
    public final double getPositionScale() {
        return positionScale;
    }

    /**
     * If you set it to 2, the image will scale 2x in the middle of the animation.
     */
    @JsOverlay
    public final void setPositionScale(double positionScale) {
        this.positionScale = positionScale;
    }

    @JsOverlay
    public final double getRight() {
        return right;
    }

    /**
     * Distance from right of a map container to the image. If centered property is false, then the distance is measured
     * to the right of the image, otherwise - to the center. If you set this property, value of left property is ignored.
     * The image will not be bounded to the map if this property is set. This property can be set as a number (of pixels)
     * or as a percent value, like: image.right= "10%"; Use latitude and longitude properties if you want the image to
     * move with the map.
     */
    @JsOverlay
    public final void setRight(double right) {
        this.right = right;
    }

    @JsOverlay
    public final double getRollOverScale() {
        return rollOverScale;
    }

    /**
     * Scale of the image when hovered. Use value like 1.5 - 2 to enlarge image when user rolls-over it.
     */
    @JsOverlay
    public final void setRollOverScale(double rollOverScale) {
        this.rollOverScale = rollOverScale;
    }

    @JsOverlay
    public final double getScale() {
        return scale;
    }

    /**
     * Scale of the image. Works only with images created using svgPath. Use width/height properties for all other images.
     * Default to 1
     */
    @JsOverlay
    public final void setScale(double scale) {
        this.scale = scale;
    }

    @JsOverlay
    public final String getSelectedLabelColor() {
        return selectedLabelColor;
    }

    @JsOverlay
    public final void setSelectedLabelColor(Color selectedLabelColor) {
        setSelectedLabelColor(ColorHelper.setupComputedBackgroundColor(selectedLabelColor));
    }

    /**
     * Color of a label when image is selected.
     */
    @JsOverlay
    public final void setSelectedLabelColor(String selectedLabelColor) {
        this.selectedLabelColor = selectedLabelColor;
    }

    @JsOverlay
    public final double getSelectedScale() {
        return selectedScale;
    }

    /**
     * Scale of the image if it is selected. Use value like 1.5 - 2 to enlarge selected image.
     */
    @JsOverlay
    public final void setSelectedScale(double selectedScale) {
        this.selectedScale = selectedScale;
    }

    @JsOverlay
    public final String getSvgPath() {
        return svgPath;
    }

    /**
     * SVG path, for example:
     * <p>
     * M9,0C4.029,0,0,4.029,0,9s4.029,9,9,9s9-4.029,9-9S13.971,0,9,0z M9,15.93 c-3.83,0-6.93-3.1-6.93-6.93S5.17,2.07,
     * 9,2.07s6.93,3.1,6.93,6.93S12.83,15.93,9,15.93 M12.5,9c0,1.933-1.567,3.5-3.5,3.5S5.5,10.933,5.5,9S7.067,5.5,9,5.5
     * S12.5,7.067,12.5,9z
     * <p>
     * The line above will create a target icon. For more icons we recommend visiting this page: http://raphaeljs.com/icons/
     * Simply click on an icon you like and you will get SVG path in the bottom. This is the recommended way to create
     * icons/images in {@link AmMap}.
     */
    @JsOverlay
    public final void setSvgPath(String svgPath) {
        this.svgPath = svgPath;
    }

    @JsOverlay
    public final double getTop() {
        return top;
    }

    /**
     * Distance from top of a map container to the image. If centered property is false, then the distance is measured
     * to the top bound of the image, otherwise - to the center. The image will not be bounded to the map if this
     * property is set. This property can be set as a number (of pixels) or as a percent value, like: image.top = "10%";
     * Use latitude and longitude properties if you want the image to move with the map.
     */
    @JsOverlay
    public final void setTop(double top) {
        this.top = top;
    }

    @JsOverlay
    public final String getType() {
        return type;
    }

    /**
     * Type of a predefined image. Allowed values are: circle, rectangle, bubble and hexagon.
     */
    @JsOverlay
    public final void setType(MapImageType type) {
        this.type = type.getName();
    }

    @JsOverlay
    public final double getWidth() {
        return width;
    }

    /**
     * Width of an image. Works with predefined images (if type is set) and loaded images (imageURL is set). If svgPath
     * is set, use scale property to change it's size.
     */
    @JsOverlay
    public final void setWidth(double width) {
        this.width = width;
    }

    @JsOverlay
    public final String getWidthAndHeightUnits() {
        return widthAndHeightUnits;
    }

    /**
     * You can set miles or kilometers as a unit of width/height of an image. This works only with predefined images
     * (type is set). Default to "pixels"
     */
    @JsOverlay
    public final void setWidthAndHeightUnits(String widthAndHeightUnits) {
        this.widthAndHeightUnits = widthAndHeightUnits;
    }
}
