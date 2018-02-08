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
package gwt.material.design.amcharts.client.ui.stock.js;

//@formatter:off

import gwt.material.design.amcharts.client.ui.chart.base.constants.CursorPosition;
import gwt.material.design.amcharts.client.ui.chart.base.constants.Orientation;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * ChartCursorSettings settings set's settings for chart cursor. If you change a property after the chart is initialized,
 * you should call stockChart.validateNow() method in order for it to work. If there is no default value specified,
 * default value of ChartCursor class will be used.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptstockchart/ChartCursorSettings">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, namespace = "AmCharts")
public class ChartCursorSettings {

    @JsProperty
    private String balloonPointerOrientation;

    @JsProperty
    private boolean bulletsEnabled;

    @JsProperty
    private double bulletSize;

    @JsProperty
    private double categoryBalloonAlpha;

    @JsProperty
    private String categoryBalloonColor;

    @JsProperty
    private Object[] categoryBalloonDateFormats;

    @JsProperty
    private boolean categoryBalloonEnabled;

    @JsProperty
    private Functions.Func categoryBalloonFunction;

    @JsProperty
    private String categoryBalloonText;

    @JsProperty
    private String color;

    @JsProperty
    private double cursorAlpha;

    @JsProperty
    private String cursorColor;

    @JsProperty
    private String cursorPosition;

    @JsProperty
    private boolean enabled;

    @JsProperty
    private boolean fullWidth;

    @JsProperty
    private double graphBulletSize;

    @JsProperty
    private boolean leaveAfterTouch;

    @JsProperty
    private boolean leaveCursor;

    @JsProperty
    private boolean onePanelOnly;

    @JsProperty
    private boolean pan;

    @JsProperty
    private boolean selectWithoutZooming;

    @JsProperty
    private boolean showNextAvailable;

    @JsProperty
    private boolean valueBalloonsEnabled;

    @JsProperty
    private double valueLineAlpha;

    @JsProperty
    private boolean valueLineBalloonEnabled;

    @JsProperty
    private boolean valueLineEnabled;

    @JsProperty
    private boolean zoomable;

    @JsOverlay
    public final String getBalloonPointerOrientation() {
        return balloonPointerOrientation;
    }

    /**
     * Specifies orientation of value balloon pointer.
     */
    @JsOverlay
    public final void setBalloonPointerOrientation(Orientation balloonPointerOrientation) {
        this.balloonPointerOrientation = balloonPointerOrientation.getName();
    }

    @JsOverlay
    public final boolean isBulletsEnabled() {
        return bulletsEnabled;
    }

    /**
     * Specifies if bullet for each graph will follow the cursor.
     */
    @JsOverlay
    public final void setBulletsEnabled(boolean bulletsEnabled) {
        this.bulletsEnabled = bulletsEnabled;
    }

    @JsOverlay
    public final double getBulletSize() {
        return bulletSize;
    }

    /**
     * Size of bullets, following the cursor.
     */
    @JsOverlay
    public final void setBulletSize(double bulletSize) {
        this.bulletSize = bulletSize;
    }

    @JsOverlay
    public final double getCategoryBalloonAlpha() {
        return categoryBalloonAlpha;
    }

    /**
     * Opacity of the category balloon.
     */
    @JsOverlay
    public final void setCategoryBalloonAlpha(double categoryBalloonAlpha) {
        this.categoryBalloonAlpha = categoryBalloonAlpha;
    }

    @JsOverlay
    public final String getCategoryBalloonColor() {
        return categoryBalloonColor;
    }

    @JsOverlay
    public final void setCategoryBalloonColor(Color categoryBalloonColor) {
        setCategoryBalloonColor(ColorHelper.setupComputedBackgroundColor(categoryBalloonColor));
    }

    /**
     * Color of the category balloon.
     */
    @JsOverlay
    public final void setCategoryBalloonColor(String categoryBalloonColor) {
        this.categoryBalloonColor = categoryBalloonColor;
    }

    @JsOverlay
    public final Object[] getCategoryBalloonDateFormats() {
        return categoryBalloonDateFormats;
    }

    /**
     * Array of date format objects. Date format object must have "period" and "format" items. Available periods are:
     * fff - millisecond, ss - second, mm - minute, hh - hour, DD - date, WW - week, MM - month, YYYY - year.
     */
    @JsOverlay
    public final void setCategoryBalloonDateFormats(Object[] categoryBalloonDateFormats) {
        this.categoryBalloonDateFormats = categoryBalloonDateFormats;
    }

    @JsOverlay
    public final boolean isCategoryBalloonEnabled() {
        return categoryBalloonEnabled;
    }

    /**
     * Specifies whether category balloon is enabled.
     */
    @JsOverlay
    public final void setCategoryBalloonEnabled(boolean categoryBalloonEnabled) {
        this.categoryBalloonEnabled = categoryBalloonEnabled;
    }

    @JsOverlay
    public final Functions.Func getCategoryBalloonFunction() {
        return categoryBalloonFunction;
    }

    /**
     * Allows formatting any category balloon text you want. categoryBalloonFunction should return a string which will
     * be displayed in a balloon. When categoryBalloonFunction is called, category value (or date) is passed as an
     * argument.
     */
    @JsOverlay
    public final void setCategoryBalloonFunction(Functions.Func categoryBalloonFunction) {
        this.categoryBalloonFunction = categoryBalloonFunction;
    }

    @JsOverlay
    public final String getCategoryBalloonText() {
        return categoryBalloonText;
    }

    /**
     * You can have [[category]] - [[toCategory]] tags in there and show category ranges this way. Default to [[category]]
     */
    @JsOverlay
    public final void setCategoryBalloonText(String categoryBalloonText) {
        this.categoryBalloonText = categoryBalloonText;
    }

    @JsOverlay
    public final String getColor() {
        return color;
    }

    /**
     * Text color. Default to #FFFFFF
     */
    @JsOverlay
    public final void setColor(String color) {
        this.color = color;
    }

    @JsOverlay
    public final double getCursorAlpha() {
        return cursorAlpha;
    }

    /**
     * Opacity of the cursor line.
     */
    @JsOverlay
    public final void setCursorAlpha(double cursorAlpha) {
        this.cursorAlpha = cursorAlpha;
    }

    @JsOverlay
    public final String getCursorColor() {
        return cursorColor;
    }

    @JsOverlay
    public final void setCursorColor(Color cursorColor) {
        setCursorColor(ColorHelper.setupComputedBackgroundColor(cursorColor));
    }

    /**
     * Color of the cursor line.
     */
    @JsOverlay
    public final void setCursorColor(String cursorColor) {
        this.cursorColor = cursorColor;
    }

    @JsOverlay
    public final String getCursorPosition() {
        return cursorPosition;
    }

    /**
     * Possible values: start, middle, mouse.
     */
    @JsOverlay
    public final void setCursorPosition(CursorPosition cursorPosition) {
        this.cursorPosition = cursorPosition.getName();
    }

    @JsOverlay
    public final boolean isEnabled() {
        return enabled;
    }

    /**
     * Set this to "false" if you don't want chart cursor to appear in your charts. Default to true
     */
    @JsOverlay
    public final void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @JsOverlay
    public final boolean isFullWidth() {
        return fullWidth;
    }

    /**
     * If set to true, instead of a cursor line user will see a fill which width will always be equal to the width of
     * one data item. We'd recommend setting cursorAlpha to 0.1 or some other small number if using this feature.
     * Default to false
     */
    @JsOverlay
    public final void setFullWidth(boolean fullWidth) {
        this.fullWidth = fullWidth;
    }

    @JsOverlay
    public final double getGraphBulletSize() {
        return graphBulletSize;
    }

    /**
     * Size of a graph's bullet (if available) at the cursor position. If you don't want the bullet to change it's size,
     * set this property to 1. Default to 1.7
     */
    @JsOverlay
    public final void setGraphBulletSize(double graphBulletSize) {
        this.graphBulletSize = graphBulletSize;
    }

    @JsOverlay
    public final boolean isLeaveAfterTouch() {
        return leaveAfterTouch;
    }

    /**
     * This makes cursor and balloons to remain after user touches the chart. Default to true
     */
    @JsOverlay
    public final void setLeaveAfterTouch(boolean leaveAfterTouch) {
        this.leaveAfterTouch = leaveAfterTouch;
    }

    @JsOverlay
    public final boolean isLeaveCursor() {
        return leaveCursor;
    }

    /**
     * Specifies if cursor should be left at it's last position. Useful for touch devices - user might want to see the
     * balloons after he moves finger away. Default to false
     */
    @JsOverlay
    public final void setLeaveCursor(boolean leaveCursor) {
        this.leaveCursor = leaveCursor;
    }

    @JsOverlay
    public final boolean isOnePanelOnly() {
        return onePanelOnly;
    }

    /**
     * If you set this to true, Stock Chart will display value balloons on currently hovered panel only. Default to false
     */
    @JsOverlay
    public final void setOnePanelOnly(boolean onePanelOnly) {
        this.onePanelOnly = onePanelOnly;
    }

    @JsOverlay
    public final boolean isPan() {
        return pan;
    }

    /**
     * If this is set to true, the user will be able to pan the chart instead of zooming.
     */
    @JsOverlay
    public final void setPan(boolean pan) {
        this.pan = pan;
    }

    @JsOverlay
    public final boolean isSelectWithoutZooming() {
        return selectWithoutZooming;
    }

    /**
     * Specifies if cursor should only mark selected area but not zoom-in after user releases mouse button. Default to false
     */
    @JsOverlay
    public final void setSelectWithoutZooming(boolean selectWithoutZooming) {
        this.selectWithoutZooming = selectWithoutZooming;
    }

    @JsOverlay
    public final boolean isShowNextAvailable() {
        return showNextAvailable;
    }

    /**
     * If true, the graph will display balloon on next available data point if currently hovered item doesn't have
     * value for this graph. Default to false
     */
    @JsOverlay
    public final void setShowNextAvailable(boolean showNextAvailable) {
        this.showNextAvailable = showNextAvailable;
    }

    @JsOverlay
    public final boolean isValueBalloonsEnabled() {
        return valueBalloonsEnabled;
    }

    /**
     * Specifies whether value balloons are enabled. In case they are not, the balloons might be displayed anyway, when
     * the user rolls-over the column or bullet. Default to false
     */
    @JsOverlay
    public final void setValueBalloonsEnabled(boolean valueBalloonsEnabled) {
        this.valueBalloonsEnabled = valueBalloonsEnabled;
    }

    @JsOverlay
    public final double getValueLineAlpha() {
        return valueLineAlpha;
    }

    /**
     * Opacity of value line. Will use cursorAlpha value if not set.
     */
    @JsOverlay
    public final void setValueLineAlpha(double valueLineAlpha) {
        this.valueLineAlpha = valueLineAlpha;
    }

    @JsOverlay
    public final boolean isValueLineBalloonEnabled() {
        return valueLineBalloonEnabled;
    }

    /**
     * Specifies if value balloon next to value axis labels should be displayed. If you have more than one axis, set
     * valueLineAxis property of ChartCursor to indicate which axis should display the balloon. Default to false
     */
    @JsOverlay
    public final void setValueLineBalloonEnabled(boolean valueLineBalloonEnabled) {
        this.valueLineBalloonEnabled = valueLineBalloonEnabled;
    }

    @JsOverlay
    public final boolean isValueLineEnabled() {
        return valueLineEnabled;
    }

    /**
     * Specifies if cursor of Serial chart should display horizontal (or vertical if chart is rotated) line. This line
     * might help users to compare distant values of a chart. You can also enable value balloon on this line by setting
     * valueLineAxis property of ChartCursor. Default to false
     */
    @JsOverlay
    public final void setValueLineEnabled(boolean valueLineEnabled) {
        this.valueLineEnabled = valueLineEnabled;
    }

    @JsOverlay
    public final boolean isZoomable() {
        return zoomable;
    }

    /**
     * Specifies if the user can zoom-in the chart. If pan is set to true, zoomable is switched to false automatically.
     */
    @JsOverlay
    public final void setZoomable(boolean zoomable) {
        this.zoomable = zoomable;
    }
}
