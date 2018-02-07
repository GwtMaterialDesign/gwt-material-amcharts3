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

import gwt.material.design.amchart.client.ui.maps.base.constants.ArrowPosition;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * LinesSettings is a class which defines the default settings for all MapLine objects.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/LinesSettings">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class LinesSettings {

    @JsProperty
    private String accessibleLabel;

    @JsProperty
    private double alpha;

    @JsProperty
    private double arc;

    @JsProperty
    private String arrow;

    @JsProperty
    private double arrowAlpha;

    @JsProperty
    private String arrowColor;

    @JsProperty
    private double arrowSize;

    @JsProperty
    private String balloonText;

    @JsProperty
    private boolean bringForwardOnHover;

    @JsProperty
    private String color;

    @JsProperty
    private double dashLength;

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
    private int tabIndex;

    @JsProperty
    private double thickness;

    @JsOverlay
    public final String getAccessibleLabel() {
        return accessibleLabel;
    }

    /**
     * Text which screen readers will read if user rolls-over the line or sets focus using tab key (this is possible
     * only if tabIndex property of LinesSettings or individual line is set to some number). Text is added as aria-label
     * tag. Note - not all screen readers and browsers support this.
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
     * Opacity of the line. Default to 1
     */
    @JsOverlay
    public final void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    @JsOverlay
    public final double getArc() {
        return arc;
    }

    /**
     * Using this setting you can make lines to be curved, or actually to make them look like arcs. Note, there is one
     * limitation - this works well with two-point lines only. You can also set arc for MapLine individually.
     * Default to 0
     */
    @JsOverlay
    public final void setArc(double arc) {
        this.arc = arc;
    }

    @JsOverlay
    public final String getArrow() {
        return arrow;
    }

    /**
     * Position of the arrows. Possible values are "start", "end", "middle", "both" and "none". Defaykt
     */
    @JsOverlay
    public final void setArrow(ArrowPosition arrow) {
        this.arrow = arrow.getName();
    }

    @JsOverlay
    public final double getArrowAlpha() {
        return arrowAlpha;
    }

    /**
     * Opacity of the arrows. Default to 1
     */
    @JsOverlay
    public final void setArrowAlpha(double arrowAlpha) {
        this.arrowAlpha = arrowAlpha;
    }

    @JsOverlay
    public final String getArrowColor() {
        return arrowColor;
    }

    @JsOverlay
    public final void setArrowColor(Color arrowColor) {
        setArrowColor(ColorHelper.setupComputedBackgroundColor(arrowColor));
    }

    /**
     * Arrow color. Will use line color if not set.
     */
    @JsOverlay
    public final void setArrowColor(String arrowColor) {
        this.arrowColor = arrowColor;
    }

    @JsOverlay
    public final double getArrowSize() {
        return arrowSize;
    }

    /**
     * Size of the arrows. Default to 10
     */
    @JsOverlay
    public final void setArrowSize(double arrowSize) {
        this.arrowSize = arrowSize;
    }

    @JsOverlay
    public final String getBalloonText() {
        return balloonText;
    }

    /**
     * Text which is displayed in a roll-over balloon. You can use the following tags: [[title]], [[description]],
     * [[value]] and [[percent]]. Default to [[title]].
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
     * Specifies if line should change it's z-index to the most top when user hovers it. Default to true
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
     * Line color. Default to #990000
     */
    @JsOverlay
    public final void setColor(String color) {
        this.color = color;
    }

    @JsOverlay
    public final double getDashLength() {
        return dashLength;
    }

    /**
     * Length of a dash. 0 means line is not dashed. Default to 0
     */
    @JsOverlay
    public final void setDashLength(double dashLength) {
        this.dashLength = dashLength;
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
    public final int getTabIndex() {
        return tabIndex;
    }

    /**
     * In case you set it to some number, the map will set focus on lines (one by one) when user clicks tab key.
     * When a focus is set, screen readers like NVDA Screen reader will read label which is set using accessibleLabel
     * property of LinesSettings or individual line. If area is clickable, pressing Enter/Return while focus is set will
     * select the line. Note, not all browsers and readers support this.
     */
    @JsOverlay
    public final void setTabIndex(int tabIndex) {
        this.tabIndex = tabIndex;
    }

    @JsOverlay
    public final double getThickness() {
        return thickness;
    }

    /**
     * Line thickness. Default to 1
     */
    @JsOverlay
    public final void setThickness(double thickness) {
        this.thickness = thickness;
    }
}
