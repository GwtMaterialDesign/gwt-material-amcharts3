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

import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * This class displays a color range used by areas (in case you set values for your areas).
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptmaps/ValueLegend">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class ZoomControl {

    @JsProperty
    private double bottom;

    @JsProperty
    private double buttonBorderAlpha;

    @JsProperty
    private String buttonBorderColor;

    @JsProperty
    private double buttonBorderThickness;

    @JsProperty
    private String buttonColorHover;

    @JsProperty
    private double buttonCornerRadius;

    @JsProperty
    private double buttonFillAlpha;

    @JsProperty
    private String buttonFillColor;

    @JsProperty
    private double buttonIconAlpha;

    @JsProperty
    private String buttonIconColor;

    @JsProperty
    private String buttonRollOverColor;

    @JsProperty
    private double buttonSize;

    @JsProperty
    private double draggerAlpha;

    @JsProperty
    private double gridAlpha;

    @JsProperty
    private double gridBackgroundAlpha;

    @JsProperty
    private String gridBackgroundColor;

    @JsProperty
    private String gridColor;

    @JsProperty
    private double gridHeight;

    @JsProperty
    private boolean homeButtonEnabled;

    @JsProperty
    private String homeIconColor;

    @JsProperty
    private String homeIconFile;

    @JsProperty
    private double iconSize;

    @JsProperty
    private double left;

    @JsProperty
    private double maxZoomLevel;

    @JsProperty
    private double minZoomLevel;

    @JsProperty
    private boolean panControlEnabled;

    @JsProperty
    private double panStepSize;

    @JsProperty
    private double right;

    @JsProperty
    private boolean roundButtons;

    @JsProperty
    private double top;

    @JsProperty
    private boolean zoomControlEnabled;

    @JsProperty
    private double zoomFactor;

    @JsOverlay
    public final double getBottom() {
        return bottom;
    }

    /**
     * Width of value legend.
     */
    @JsOverlay
    public final void setBottom(double bottom) {
        this.bottom = bottom;
    }

    @JsOverlay
    public final double getButtonBorderAlpha() {
        return buttonBorderAlpha;
    }

    /**
     * Button border opacity. Default to 0.1
     */
    @JsOverlay
    public final void setButtonBorderAlpha(double buttonBorderAlpha) {
        this.buttonBorderAlpha = buttonBorderAlpha;
    }

    @JsOverlay
    public final String getButtonBorderColor() {
        return buttonBorderColor;
    }

    @JsOverlay
    public final void setButtonBorderColor(Color buttonBorderColor) {
        setButtonBorderColor(ColorHelper.setupComputedBackgroundColor(buttonBorderColor));
    }

    /**
     * Color of button borders. Default to #000000
     */
    @JsOverlay
    public final void setButtonBorderColor(String buttonBorderColor) {
        this.buttonBorderColor = buttonBorderColor;
    }

    @JsOverlay
    public final double getButtonBorderThickness() {
        return buttonBorderThickness;
    }

    /**
     * Button border thickness. Default to 1
     */
    @JsOverlay
    public final void setButtonBorderThickness(double buttonBorderThickness) {
        this.buttonBorderThickness = buttonBorderThickness;
    }

    @JsOverlay
    public final String getButtonColorHover() {
        return buttonColorHover;
    }

    @JsOverlay
    public final void setButtonColorHover(Color buttonColorHover) {
        setButtonColorHover(ColorHelper.setupComputedBackgroundColor(buttonColorHover));
    }

    /**
     * Button roll-over color. Default to #FF0000
     */
    @JsOverlay
    public final void setButtonColorHover(String buttonColorHover) {
        this.buttonColorHover = buttonColorHover;
    }

    @JsOverlay
    public final double getButtonCornerRadius() {
        return buttonCornerRadius;
    }

    /**
     * Button corner radius. Default to 2
     */
    @JsOverlay
    public final void setButtonCornerRadius(double buttonCornerRadius) {
        this.buttonCornerRadius = buttonCornerRadius;
    }

    @JsOverlay
    public final double getButtonFillAlpha() {
        return buttonFillAlpha;
    }

    /**
     * Button fill opacity. Default to 1
     */
    @JsOverlay
    public final void setButtonFillAlpha(double buttonFillAlpha) {
        this.buttonFillAlpha = buttonFillAlpha;
    }

    @JsOverlay
    public final String getButtonFillColor() {
        return buttonFillColor;
    }

    /**
     * Button fill color. Default to #FFFFFF
     */
    @JsOverlay
    public final void setButtonFillColor(String buttonFillColor) {
        this.buttonFillColor = buttonFillColor;
    }

    @JsOverlay
    public final double getButtonIconAlpha() {
        return buttonIconAlpha;
    }

    /**
     * Opacity of button icons. Default to 1
     */
    @JsOverlay
    public final void setButtonIconAlpha(double buttonIconAlpha) {
        this.buttonIconAlpha = buttonIconAlpha;
    }

    @JsOverlay
    public final String getButtonIconColor() {
        return buttonIconColor;
    }

    /**
     * Button icon color. Default to #000000
     */
    @JsOverlay
    public final void setButtonIconColor(String buttonIconColor) {
        this.buttonIconColor = buttonIconColor;
    }

    @JsOverlay
    public final String getButtonRollOverColor() {
        return buttonRollOverColor;
    }

    /**
     * Button roll-over color. Default to #DADADA
     */
    @JsOverlay
    public final void setButtonRollOverColor(String buttonRollOverColor) {
        this.buttonRollOverColor = buttonRollOverColor;
    }

    @JsOverlay
    public final double getButtonSize() {
        return buttonSize;
    }

    /**
     * Size of buttons. Default to 31
     */
    @JsOverlay
    public final void setButtonSize(double buttonSize) {
        this.buttonSize = buttonSize;
    }

    @JsOverlay
    public final double getDraggerAlpha() {
        return draggerAlpha;
    }

    /**
     * Opacity of a dragger. Default to 0
     */
    @JsOverlay
    public final void setDraggerAlpha(double draggerAlpha) {
        this.draggerAlpha = draggerAlpha;
    }

    @JsOverlay
    public final double getGridAlpha() {
        return gridAlpha;
    }

    /**
     * Opacity of zoom-grid. Default to 0
     */
    @JsOverlay
    public final void setGridAlpha(double gridAlpha) {
        this.gridAlpha = gridAlpha;
    }

    @JsOverlay
    public final double getGridBackgroundAlpha() {
        return gridBackgroundAlpha;
    }

    /**
     * Opacity of background under zoom-grid. Default to 0
     */
    @JsOverlay
    public final void setGridBackgroundAlpha(double gridBackgroundAlpha) {
        this.gridBackgroundAlpha = gridBackgroundAlpha;
    }

    @JsOverlay
    public final String getGridBackgroundColor() {
        return gridBackgroundColor;
    }

    /**
     * Color of background under zoom-grid. Default to #000000
     */
    @JsOverlay
    public final void setGridBackgroundColor(String gridBackgroundColor) {
        this.gridBackgroundColor = gridBackgroundColor;
    }

    @JsOverlay
    public final String getGridColor() {
        return gridColor;
    }

    /**
     * Grid color. Default to #000000
     */
    @JsOverlay
    public final void setGridColor(String gridColor) {
        this.gridColor = gridColor;
    }

    @JsOverlay
    public final double getGridHeight() {
        return gridHeight;
    }

    /**
     * Zoom grid height in pixels. Default to 5
     */
    @JsOverlay
    public final void setGridHeight(double gridHeight) {
        this.gridHeight = gridHeight;
    }

    @JsOverlay
    public final boolean isHomeButtonEnabled() {
        return homeButtonEnabled;
    }

    /**
     * Specifies if home button is visible or not. Default to true
     */
    @JsOverlay
    public final void setHomeButtonEnabled(boolean homeButtonEnabled) {
        this.homeButtonEnabled = homeButtonEnabled;
    }

    @JsOverlay
    public final String getHomeIconColor() {
        return homeIconColor;
    }

    /**
     * Home icon color. Default to #FFFFFF
     */
    @JsOverlay
    public final void setHomeIconColor(String homeIconColor) {
        this.homeIconColor = homeIconColor;
    }

    @JsOverlay
    public final String getHomeIconFile() {
        return homeIconFile;
    }

    /**
     * File name of home icon. You can also find homeIconWhite.gif in the images folder, or you can create your own image.
     * <p>
     * Important: This setting is ignored by default because Map uses SVG paths for all controls. To enable this feature
     * set map's ZoomControl.svgIcons to false. Default to "homeIcon.gif"
     */
    @JsOverlay
    public final void setHomeIconFile(String homeIconFile) {
        this.homeIconFile = homeIconFile;
    }

    @JsOverlay
    public final double getIconSize() {
        return iconSize;
    }

    /**
     * Size of icons. You might need to change size of icon gif files if you change this property. Default to 11
     */
    @JsOverlay
    public final void setIconSize(double iconSize) {
        this.iconSize = iconSize;
    }

    @JsOverlay
    public final double getLeft() {
        return left;
    }

    /**
     * Distance from left side of map container to the zoom control. Default to 10
     */
    @JsOverlay
    public final void setLeft(double left) {
        this.left = left;
    }

    @JsOverlay
    public final double getMaxZoomLevel() {
        return maxZoomLevel;
    }

    /**
     * Max zoom level. Default to 64
     */
    @JsOverlay
    public final void setMaxZoomLevel(double maxZoomLevel) {
        this.maxZoomLevel = maxZoomLevel;
    }

    @JsOverlay
    public final double getMinZoomLevel() {
        return minZoomLevel;
    }

    /**
     * Min zoom level. Default to 1
     */
    @JsOverlay
    public final void setMinZoomLevel(double minZoomLevel) {
        this.minZoomLevel = minZoomLevel;
    }

    @JsOverlay
    public final boolean isPanControlEnabled() {
        return panControlEnabled;
    }

    /**
     * Specifies if pan control is enabled. Default to false
     */
    @JsOverlay
    public final void setPanControlEnabled(boolean panControlEnabled) {
        this.panControlEnabled = panControlEnabled;
    }

    @JsOverlay
    public final double getPanStepSize() {
        return panStepSize;
    }

    /**
     * Specifies by what part of a map container width/height the map will be moved when user clicks on pan arrows.
     * Default to 0.2
     */
    @JsOverlay
    public final void setPanStepSize(double panStepSize) {
        this.panStepSize = panStepSize;
    }

    @JsOverlay
    public final double getRight() {
        return right;
    }

    /**
     * Distance from right side of map container to the zoom control.
     */
    @JsOverlay
    public final void setRight(double right) {
        this.right = right;
    }

    @JsOverlay
    public final boolean isRoundButtons() {
        return roundButtons;
    }

    /**
     * Specifies if buttons should be round or not (rectangular). Default to true
     */
    @JsOverlay
    public final void setRoundButtons(boolean roundButtons) {
        this.roundButtons = roundButtons;
    }

    @JsOverlay
    public final double getTop() {
        return top;
    }

    /**
     * Default to 10
     */
    @JsOverlay
    public final void setTop(double top) {
        this.top = top;
    }

    @JsOverlay
    public final boolean isZoomControlEnabled() {
        return zoomControlEnabled;
    }

    /**
     * Specifies if zoom control is enabled. Default to true
     */
    @JsOverlay
    public final void setZoomControlEnabled(boolean zoomControlEnabled) {
        this.zoomControlEnabled = zoomControlEnabled;
    }

    @JsOverlay
    public final double getZoomFactor() {
        return zoomFactor;
    }

    /**
     * zoomFactor is a number by which current scale will be multiplied when user clicks on zoom in button or divided
     * when user clicks on zoom-out button. Default to 2
     */
    @JsOverlay
    public final void setZoomFactor(double zoomFactor) {
        this.zoomFactor = zoomFactor;
    }
}
