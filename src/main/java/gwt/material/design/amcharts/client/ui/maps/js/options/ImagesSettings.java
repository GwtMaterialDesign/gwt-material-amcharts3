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

import gwt.material.design.amcharts.client.ui.chart.base.constants.Position;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.*;

/**
 * ImagesSettings is a class which defines the default settings for all MapImage objects.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/ImagesSettings">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ImagesSettings {

    @JsProperty
    private String accessibleLabel;

    @JsProperty
    private boolean adjustAnimationSpeed;

    @JsProperty
    private double alpha;

    @JsProperty
    private double animationDuration;

    @JsProperty
    private String balloonText;

    @JsProperty
    private double baseAnimationDistance;

    @JsProperty
    private boolean bringForwardOnHover;

    @JsProperty
    private boolean centered;

    @JsProperty
    private String color;

    @JsProperty
    private double descriptionWindowBottom;

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
    private Functions.Func easingFunction;

    @JsProperty
    private String labelColor;

    @JsProperty
    private double labelFontSize;

    @JsProperty
    private String labelPosition;

    @JsProperty
    private String labelRollOverColor;

    @JsProperty
    private double outlineAlpha;

    @JsProperty
    private String outlineColor;

    @JsProperty
    private double outlineThickness;

    @JsProperty
    private double pauseDuration;

    @JsProperty
    private String rollOverColor;

    @JsProperty
    private double rollOverOutlineThickness;

    @JsProperty
    private double rollOverScale;

    @JsProperty
    private boolean selectable;

    @JsProperty
    private String selectedLabelColor;

    @JsProperty
    private String selectedOutlineColor;

    @JsProperty
    private double selectedOutlineThickness;

    @JsProperty
    private double selectedScale;

    @JsProperty
    private int tabIndex;

    @JsMethod
    public native void descriptionWindowX(double windowX);

    @JsOverlay
    public final String getAccessibleLabel() {
        return accessibleLabel;
    }

    /**
     * Text which screen readers will read if user rolls-over the image or sets focus using tab key (this is possible
     * only if tabIndex property of ImagesSettings or individual image is set to some number). Text is added as aria-label
     * tag. Note - not all screen readers and browsers support this. Default to [[title]] [[description]]
     */
    @JsOverlay
    public final void setAccessibleLabel(String accessibleLabel) {
        this.accessibleLabel = accessibleLabel;
    }

    @JsOverlay
    public final boolean isAdjustAnimationSpeed() {
        return adjustAnimationSpeed;
    }

    /**
     * If you set it to true, images along the lines will adjust the speed of animation corresponding the distance
     * between lines. Default to false
     */
    @JsOverlay
    public final void setAdjustAnimationSpeed(boolean adjustAnimationSpeed) {
        this.adjustAnimationSpeed = adjustAnimationSpeed;
    }

    @JsOverlay
    public final double getAlpha() {
        return alpha;
    }

    /**
     * Opacity of the image. Default to 1
     */
    @JsOverlay
    public final void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    @JsOverlay
    public final double getAnimationDuration() {
        return animationDuration;
    }

    /**
     * Defines duration of animation, in seconds. Custom animationDuration can also be set directly on {@link MapImage}.
     * Default to 3
     */
    @JsOverlay
    public final void setAnimationDuration(double animationDuration) {
        this.animationDuration = animationDuration;
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
     * <p>
     * Default to [[title]]
     */
    @JsOverlay
    public final void setBalloonText(String balloonText) {
        this.balloonText = balloonText;
    }

    @JsOverlay
    public final double getBaseAnimationDistance() {
        return baseAnimationDistance;
    }

    /**
     * If adjustAnimationSpeed is set to true, the the image will move at a speed which would allow to move by 500
     * pixels during animationDuration. If the distance between start/end points of animation is less than
     * baseAnimationDistance, the image will move faster, otherwise – slower. Default to 500
     */
    @JsOverlay
    public final void setBaseAnimationDistance(double baseAnimationDistance) {
        this.baseAnimationDistance = baseAnimationDistance;
    }

    @JsOverlay
    public final boolean isBringForwardOnHover() {
        return bringForwardOnHover;
    }

    /**
     * Specifies if image should change it's z-index to the most top when user hovers it. Default to true
     */
    @JsOverlay
    public final void setBringForwardOnHover(boolean bringForwardOnHover) {
        this.bringForwardOnHover = bringForwardOnHover;
    }

    @JsOverlay
    public final boolean isCentered() {
        return centered;
    }

    /**
     * Specifies if the image's center should be placed in the provided coordinates. If false, top-left corner will be
     * at provided coordinates. Default to true
     */
    @JsOverlay
    public final void setCentered(boolean centered) {
        this.centered = centered;
    }

    @JsOverlay
    public final String getColor() {
        return color;
    }

    /**
     * Color of image. This will affect only predefined images (with "type" property set) and images with svgPath set.
     * This property won't affect bitmap images and loaded SVG images. Default to #000000
     */
    @JsOverlay
    public final void setColor(String color) {
        this.color = color;
    }

    @JsOverlay
    public final double getDescriptionWindowBottom() {
        return descriptionWindowBottom;
    }

    /**
     * Distance from the bottom side of map container to the description window. In case it is not set
     * (also if descriptionWindowTop is not set), window will be placed near the mouse pointer.
     */
    @JsOverlay
    public final void setDescriptionWindowBottom(double descriptionWindowBottom) {
        this.descriptionWindowBottom = descriptionWindowBottom;
    }

    @JsOverlay
    public final double getDescriptionWindowHeight() {
        return descriptionWindowHeight;
    }

    /**
     * Height of a description window.
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
     * Width of a description window. Default to 250
     */
    @JsOverlay
    public final void setDescriptionWindowWidth(double descriptionWindowWidth) {
        this.descriptionWindowWidth = descriptionWindowWidth;
    }

    @JsOverlay
    public final Functions.Func getEasingFunction() {
        return easingFunction;
    }

    /**
     * This particular function makes the animation to be slower in the beginning and end of animation and faster in
     * the middle. Alternatively you can use these methods: AmCharts.bounce, AmCharts.easeInSine, AmCharts.easeOutSine,
     * AmCharts.easeOutElastic. You can also set easing function on MapImage. Default to AmCharts.easeInOutQuad
     */
    @JsOverlay
    public final void setEasingFunction(Functions.Func easingFunction) {
        this.easingFunction = easingFunction;
    }

    @JsOverlay
    public final String getLabelColor() {
        return labelColor;
    }

    /**
     * Label color. Default to #000000
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
     * Font size of a label. Default to 11
     */
    @JsOverlay
    public final void setLabelFontSize(double labelFontSize) {
        this.labelFontSize = labelFontSize;
    }

    @JsOverlay
    public final String getLabelPosition() {
        return labelPosition;
    }

    @JsOverlay
    public final void setLabelPosition(Position position) {
        setLabelPosition(position.getName());
    }

    /**
     * Position of the label. Allowed values are: left, right, top, bottom and middle. Default to "right"
     */
    @JsOverlay
    public final void setLabelPosition(String labelPosition) {
        this.labelPosition = labelPosition;
    }

    @JsOverlay
    public final String getLabelRollOverColor() {
        return labelRollOverColor;
    }

    @JsOverlay
    public final void setLabelRollOverColor(Color color) {
        setLabelRollOverColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * Label roll-over color. Default to #00CC00
     */
    @JsOverlay
    public final void setLabelRollOverColor(String labelRollOverColor) {
        this.labelRollOverColor = labelRollOverColor;
    }

    @JsOverlay
    public final double getOutlineAlpha() {
        return outlineAlpha;
    }

    /**
     * Opacity of image outline. This will affect only predefined images (with "type" property set) and images with
     * svgPath set. This property won't affect bitmap images and loaded SVG images. Default to 0
     */
    @JsOverlay
    public final void setOutlineAlpha(double outlineAlpha) {
        this.outlineAlpha = outlineAlpha;
    }

    @JsOverlay
    public final String getOutlineColor() {
        return outlineColor;
    }

    @JsOverlay
    public final void setOutlineColor(Color outlineColor) {
        setOutlineColor(ColorHelper.setupComputedBackgroundColor(outlineColor));
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
     * svgPath set. This property won't affect bitmap images and loaded SVG images. Default to 1
     */
    @JsOverlay
    public final void setOutlineThickness(double outlineThickness) {
        this.outlineThickness = outlineThickness;
    }

    @JsOverlay
    public final double getPauseDuration() {
        return pauseDuration;
    }

    /**
     * Defines pause between animations (if a line has more than one segment or animation is looped or flipped).
     * Default to 0
     */
    @JsOverlay
    public final void setPauseDuration(double pauseDuration) {
        this.pauseDuration = pauseDuration;
    }

    @JsOverlay
    public final String getRollOverColor() {
        return rollOverColor;
    }

    /**
     * Color of image when hovered. This will affect only predefined images (with "type" property set) and images with
     * svgPath set. This property won't affect bitmap images and loaded SVG images.
     */
    @JsOverlay
    public final void setRollOverColor(String rollOverColor) {
        this.rollOverColor = rollOverColor;
    }

    @JsOverlay
    public final double getRollOverOutlineThickness() {
        return rollOverOutlineThickness;
    }

    /**
     * Thickness of rolled-over image outline.
     */
    @JsOverlay
    public final void setRollOverOutlineThickness(double rollOverOutlineThickness) {
        this.rollOverOutlineThickness = rollOverOutlineThickness;
    }

    @JsOverlay
    public final double getRollOverScale() {
        return rollOverScale;
    }

    /**
     * Scale of the image when hovered. Use value like 1.5 - 2 to enlarge image when user rolls-over it. Default to 1
     */
    @JsOverlay
    public final void setRollOverScale(double rollOverScale) {
        this.rollOverScale = rollOverScale;
    }

    @JsOverlay
    public final boolean isSelectable() {
        return selectable;
    }

    /**
     * Specifies if all images on the map can be selected. You can also override this setting for each individual image
     * individually. Default to false
     */
    @JsOverlay
    public final void setSelectable(boolean selectable) {
        this.selectable = selectable;
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
     * Label color in case the image is selected.
     */
    @JsOverlay
    public final void setSelectedLabelColor(String selectedLabelColor) {
        this.selectedLabelColor = selectedLabelColor;
    }

    @JsOverlay
    public final String getSelectedOutlineColor() {
        return selectedOutlineColor;
    }

    /**
     * Color of selected image outline.
     */
    @JsOverlay
    public final void setSelectedOutlineColor(String selectedOutlineColor) {
        this.selectedOutlineColor = selectedOutlineColor;
    }

    @JsOverlay
    public final double getSelectedOutlineThickness() {
        return selectedOutlineThickness;
    }

    /**
     * Outline thickness of selected image
     */
    @JsOverlay
    public final void setSelectedOutlineThickness(double selectedOutlineThickness) {
        this.selectedOutlineThickness = selectedOutlineThickness;
    }

    @JsOverlay
    public final double getSelectedScale() {
        return selectedScale;
    }

    /**
     * Scale of the image if it is selected. Use value like 1.5 - 2 to enlarge selected image. Default to 1
     */
    @JsOverlay
    public final void setSelectedScale(double selectedScale) {
        this.selectedScale = selectedScale;
    }

    @JsOverlay
    public final int getTabIndex() {
        return tabIndex;
    }

    /**
     * In case you set it to some number, the map will set focus on images (one by one) when user clicks tab key. When
     * a focus is set, screen readers like NVDA Screen reader will read label which is set using accessibleLabel property
     * of ImagesSettings or individual image. If area is clickable, pressing Enter/Return while focus is set will select
     * the image. Note, not all browsers and readers support this.
     */
    @JsOverlay
    public final void setTabIndex(int tabIndex) {
        this.tabIndex = tabIndex;
    }
}
