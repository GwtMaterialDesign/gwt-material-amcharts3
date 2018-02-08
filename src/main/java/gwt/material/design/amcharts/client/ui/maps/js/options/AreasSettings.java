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

//@formatter:off

import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * AreasSettings is a class which defines the default settings for all MapArea objects.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/AreasSettings">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AreasSettings {

    @JsProperty
    private String accessibleLabel;

    @JsProperty
    private boolean adjustOutlineThickness;

    @JsProperty
    private double alpha;

    @JsProperty
    private boolean autoZoom;

    @JsProperty
    private String balloonText;

    @JsProperty
    private boolean bringForwardOnHover;

    @JsProperty
    private String color;

    @JsProperty
    private String colorSolid;

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
    private double outlineAlpha;

    @JsProperty
    private String outlineColor;

    @JsProperty
    private double outlineThickness;

    @JsProperty
    private String rollOverColor;

    @JsProperty
    private double rollOverOutlineAlpha;

    @JsProperty
    private String rollOverOutlineColor;

    @JsProperty
    private double rollOverOutlineThickness;

    @JsProperty
    private boolean selectable;

    @JsProperty
    private String selectedColor;

    @JsProperty
    private String selectedOutlineColor;

    @JsProperty
    private double selectedOutlineThickness;

    @JsProperty
    private int tabIndex;

    @JsProperty
    private double unlistedAreasAlpha;

    @JsProperty
    private String unlistedAreasColor;

    @JsProperty
    private double unlistedAreasOutlineAlpha;

    @JsProperty
    private String unlistedAreasOutlineColor;

    @JsOverlay
    public final String getAccessibleLabel() {
        return accessibleLabel;
    }

    /**
     * Text which screen readers will read if user rolls-over the area or sets focus using tab key (this is possible
     * only if tabIndex property of AreasSettings or individual area is set to some number). Text is added as aria-label
     * tag. Note - not all screen readers and browsers support this.
     * Default to [[title]] [[value]] [[description]].
     */
    @JsOverlay
    public final void setAccessibleLabel(String accessibleLabel) {
        this.accessibleLabel = accessibleLabel;
    }

    @JsOverlay
    public final boolean isAdjustOutlineThickness() {
        return adjustOutlineThickness;
    }

    /**
     * By default the map will adjust area outlines when zooming in/out so that they will always stay of the same width.
     * This however loads CPU quite a lot. If you set it to false, outlines will scale together with the areas.
     * Default to true
     */
    @JsOverlay
    public final void setAdjustOutlineThickness(boolean adjustOutlineThickness) {
        this.adjustOutlineThickness = adjustOutlineThickness;
    }

    @JsOverlay
    public final double getAlpha() {
        return alpha;
    }

    /**
     * Opacity of areas. Default to 1
     */
    @JsOverlay
    public final void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    @JsOverlay
    public final boolean isAutoZoom() {
        return autoZoom;
    }

    /**
     * Specifies if the areas should be zoomed-in when user clicks on them, event if zoom properties are not set.
     * Default to false
     */
    @JsOverlay
    public final void setAutoZoom(boolean autoZoom) {
        this.autoZoom = autoZoom;
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
    public final boolean isBringForwardOnHover() {
        return bringForwardOnHover;
    }

    /**
     * Specifies if the area should change it's z-index to the most top when user hovers it. Default to true
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
     * Color of the areas. Default to #FFCC00
     */
    @JsOverlay
    public final void setColor(String color) {
        this.color = color;
    }

    @JsOverlay
    public final String getColorSolid() {
        return colorSolid;
    }

    @JsOverlay
    public final void setColorSolid(Color color) {
        setColorSolid(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * Color of area with highest value. Colors for areas with values less then highest will be colored with intermediate
     * colors between color and colorSolid. Use colorSteps property of AmMap to change the number of intermediate colors.
     * Default to #990000
     */
    @JsOverlay
    public final void setColorSolid(String colorSolid) {
        this.colorSolid = colorSolid;
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
     * Distance from the left side of map container to the description window. In case it is not set (also if
     * descriptionWindowRight is not set), window will be placed near the mouse pointer.
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
    public final double getOutlineAlpha() {
        return outlineAlpha;
    }

    /**
     * Opacity of area's outline. Default to 1
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
    public final void setOutlineColor(Color color) {
        setOutlineColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * Color of area's outline. Default to #FFFFFF
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
     * Thickness of area's outline. Default to 1
     */
    @JsOverlay
    public final void setOutlineThickness(double outlineThickness) {
        this.outlineThickness = outlineThickness;
    }

    @JsOverlay
    public final String getRollOverColor() {
        return rollOverColor;
    }

    @JsOverlay
    public final void setRollOverColor(Color color) {
        setRollOverColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * Color of area when user rolls-over it. You can set this to "undefined" (no quotes) to make the area retain it's
     * original color when hovered.
     */
    @JsOverlay
    public final void setRollOverColor(String rollOverColor) {
        this.rollOverColor = rollOverColor;
    }

    @JsOverlay
    public final double getRollOverOutlineAlpha() {
        return rollOverOutlineAlpha;
    }

    /**
     * Opacity of rolled-over area outline.
     */
    @JsOverlay
    public final void setRollOverOutlineAlpha(double rollOverOutlineAlpha) {
        this.rollOverOutlineAlpha = rollOverOutlineAlpha;
    }

    @JsOverlay
    public final String getRollOverOutlineColor() {
        return rollOverOutlineColor;
    }

    @JsOverlay
    public final void setRollOverOutlineColor(Color color) {
        setRollOverOutlineColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * Color of area's outline when user rolls-over it. Default to #CC0000
     */
    @JsOverlay
    public final void setRollOverOutlineColor(String rollOverOutlineColor) {
        this.rollOverOutlineColor = rollOverOutlineColor;
    }

    @JsOverlay
    public final double getRollOverOutlineThickness() {
        return rollOverOutlineThickness;
    }

    /**
     * Thickness of rolled-over area outline. Default to 1
     */
    @JsOverlay
    public final void setRollOverOutlineThickness(double rollOverOutlineThickness) {
        this.rollOverOutlineThickness = rollOverOutlineThickness;
    }

    @JsOverlay
    public final boolean isSelectable() {
        return selectable;
    }

    /**
     * Specifies if areas are selectable, even no zoom/description/url is set. You can also override this setting for
     * each individual area individually. Default to false
     */
    @JsOverlay
    public final void setSelectable(boolean selectable) {
        this.selectable = selectable;
    }

    @JsOverlay
    public final String getSelectedColor() {
        return selectedColor;
    }

    @JsOverlay
    public final void setSelectedColor(Color color) {
        setSelectedColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * Color of area which is currently selected. You can set this to "undefined" (no quotes) to make the area retain
     * it's original color when selected. Default to #CC0000
     */
    @JsOverlay
    public final void setSelectedColor(String selectedColor) {
        this.selectedColor = selectedColor;
    }

    @JsOverlay
    public final String getSelectedOutlineColor() {
        return selectedOutlineColor;
    }

    @JsOverlay
    public final void setSelectedOutlineColor(Color color) {
        setSelectedOutlineColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * Color of selected area's outline.
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
     * Thickness of selected area outline.
     */
    @JsOverlay
    public final void setSelectedOutlineThickness(double selectedOutlineThickness) {
        this.selectedOutlineThickness = selectedOutlineThickness;
    }

    @JsOverlay
    public final int getTabIndex() {
        return tabIndex;
    }

    /**
     * In case you set it to some number, the map will set focus on areas (one by one) when user clicks tab key. When a
     * focus is set, screen readers like NVDA Screen reader will read label which is set using accessibleLabel property
     * of AreasSettings or individual area. If area is clickable, pressing Enter/Return while focus is set will select
     * the area. Note, not all browsers and readers support this.
     */
    @JsOverlay
    public final void setTabIndex(int tabIndex) {
        this.tabIndex = tabIndex;
    }

    @JsOverlay
    public final double getUnlistedAreasAlpha() {
        return unlistedAreasAlpha;
    }

    /**
     * Opacity of all areas which are in the map svg file, but not listed as areas in DataSet. Default to 1
     */
    @JsOverlay
    public final void setUnlistedAreasAlpha(double unlistedAreasAlpha) {
        this.unlistedAreasAlpha = unlistedAreasAlpha;
    }

    @JsOverlay
    public final String getUnlistedAreasColor() {
        return unlistedAreasColor;
    }

    @JsOverlay
    public final void setUnlistedAreasColor(Color color) {
        setUnlistedAreasColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * Color of all areas which are in the map svg file, but not listed as areas in DataSet. Default to #DDDDDD
     */
    @JsOverlay
    public final void setUnlistedAreasColor(String unlistedAreasColor) {
        this.unlistedAreasColor = unlistedAreasColor;
    }

    @JsOverlay
    public final double getUnlistedAreasOutlineAlpha() {
        return unlistedAreasOutlineAlpha;
    }

    /**
     * Opacity of all areas' outline which are in the map svg file, but not listed as areas in DataSet. Default to 1
     */
    @JsOverlay
    public final void setUnlistedAreasOutlineAlpha(double unlistedAreasOutlineAlpha) {
        this.unlistedAreasOutlineAlpha = unlistedAreasOutlineAlpha;
    }

    @JsOverlay
    public final String getUnlistedAreasOutlineColor() {
        return unlistedAreasOutlineColor;
    }

    @JsOverlay
    public final void setUnlistedAreasOutlineColor(Color color) {
        setUnlistedAreasOutlineColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * Color of all areas' outline which are in the map svg file, but not listed as areas in DataSet. Default to #FFFFFF
     */
    @JsOverlay
    public final void setUnlistedAreasOutlineColor(String unlistedAreasOutlineColor) {
        this.unlistedAreasOutlineColor = unlistedAreasOutlineColor;
    }
}
