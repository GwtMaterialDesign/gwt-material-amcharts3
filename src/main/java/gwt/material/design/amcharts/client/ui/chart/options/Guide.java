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
package gwt.material.design.amcharts.client.ui.chart.options;

import gwt.material.design.amcharts.client.ui.chart.RadarChart;
import gwt.material.design.amcharts.client.ui.chart.SerialChart;
import gwt.material.design.amcharts.client.ui.chart.XyChart;
import gwt.material.design.amcharts.client.ui.chart.base.ChartOptions;
import gwt.material.design.amcharts.client.ui.chart.js.options.AmGuide;
import gwt.material.design.amcharts.client.ui.chart.js.options.AmValueAxis;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;

import java.util.Date;

//@formatter:off

/**
 * Creates a horizontal/vertical guideline-/area for {@link SerialChart},
 * {@link XyChart} and
 * {@link RadarChart} charts, automatically
 * adapts it's settings from the axes if none has been specified.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptcharts/Guide">Official Documentation</a>
 */
//@formatter:on
public class Guide extends ChartOptions {

    private AmGuide guide;

    public boolean isAbove() {
        return getAmGuide().above;
    }

    /**
     * If you set it to true, the guide will be displayed above the graphs. Default to false
     */
    public void setAbove(boolean above) {
        getAmGuide().above = above;
    }


    public int getAngle() {
        return getAmGuide().angle;
    }

    /**
     * Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines.
     */
    public void setAngle(int angle) {
        getAmGuide().angle = angle;
    }


    public String getBalloonColor() {
        return getAmGuide().balloonColor;
    }

    public void setBalloonColor(Color color) {
        setBalloonColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * Balloon fill color.
     */
    public void setBalloonColor(String balloonColor) {
        getAmGuide().balloonColor = balloonColor;
    }

    public String getBalloonText() {
        return getAmGuide().balloonText;
    }

    /**
     * The text which will be displayed if the user rolls-over the guide.
     */
    public void setBalloonText(String balloonText) {
        getAmGuide().balloonText = balloonText;
    }


    public boolean isBoldLabel() {
        return getAmGuide().boldLabel;
    }

    /**
     * Specifies if label should be bold or not. Default to false
     */
    public void setBoldLabel(boolean boldLabel) {
        getAmGuide().boldLabel = boldLabel;
    }


    public String getCategory() {
        return getAmGuide().category;
    }

    /**
     * Category of the guide (in case the guide is for category axis).
     */
    public void setCategory(String category) {
        getAmGuide().category = category;
    }


    public String getColor() {
        return getAmGuide().color;
    }

    public void setColor(Color color) {
        setColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * Color of a guide label.
     */
    public void setColor(String color) {
        getAmGuide().color = color;
    }

    public int getDashLength() {
        return getAmGuide().dashLength;
    }

    /**
     * Dash length.
     */
    public void setDashLength(int dashLength) {
        getAmGuide().dashLength = dashLength;
    }


    public Date getDate() {
        return getAmGuide().date;
    }

    /**
     * Date of the guide (in case the guide is for category axis and parseDates is set to true).
     */
    public void setDate(Date date) {
        getAmGuide().date = date;
    }


    public boolean isExpand() {
        return getAmGuide().expand;
    }

    /**
     * Works if a guide is added to CategoryAxis and this axis is non-date-based. If you set it to true, the guide will
     * start (or be placed, if it's not a fill) on the beginning of the category cell and will end at the end of toCategory cell.
     * Default to false
     */
    public void setExpand(boolean expand) {
        getAmGuide().expand = expand;
    }


    public double getFillAlpha() {
        return getAmGuide().fillAlpha;
    }

    /**
     * Fill opacity. Value range is 0 - 1.
     */
    public void setFillAlpha(double fillAlpha) {
        getAmGuide().fillAlpha = fillAlpha;
    }


    public String getFillColor() {
        return getAmGuide().fillColor;
    }

    public void setFillColor(Color color) {
        setFillColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * Fill color.
     */
    public void setFillColor(String fillColor) {
        getAmGuide().fillColor = fillColor;
    }

    public int getFontSize() {
        return getAmGuide().fontSize;
    }

    /**
     * Font size of guide label.
     */
    public void setFontSize(int fontSize) {
        getAmGuide().fontSize = fontSize;
    }


    public String getId() {
        return getAmGuide().id;
    }

    /**
     * Unique id of a AmGuide. You don't need to set it, unless you want to.
     */
    public void setId(String id) {
        getAmGuide().id = id;
    }


    public boolean isInside() {
        return getAmGuide().inside;
    }

    /**
     * Specifies whether label should be placed inside or outside plot area.
     */
    public void setInside(boolean inside) {
        getAmGuide().inside = inside;
    }


    public String getLabel() {
        return getAmGuide().label;
    }

    /**
     * The label which will be displayed near the guide.
     */
    public void setLabel(String label) {
        getAmGuide().label = label;
    }


    public int getLabelRotation() {
        return getAmGuide().labelRotation;
    }

    /**
     * Rotation angle of a guide label.
     */
    public void setLabelRotation(int labelRotation) {
        getAmGuide().labelRotation = labelRotation;
    }


    public double getLineAlpha() {
        return getAmGuide().lineAlpha;
    }

    /**
     * Line opacity.
     */
    public void setLineAlpha(double lineAlpha) {
        getAmGuide().lineAlpha = lineAlpha;
    }


    public String getLineColor() {
        return getAmGuide().lineColor;
    }

    public void setLineColor(Color color) {
        setLineColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * Line color.
     */
    public void setLineColor(String lineColor) {
        getAmGuide().lineColor = lineColor;
    }

    public int getLineThickness() {
        return getAmGuide().lineThickness;
    }

    /**
     * Line thickness.
     */
    public void setLineThickness(int lineThickness) {
        getAmGuide().lineThickness = lineThickness;
    }


    public String getPosition() {
        return getAmGuide().position;
    }

    /**
     * Position of guide label. Possible values are "left" or "right" for horizontal axis and "top" or "bottom" for vertical axis.
     */
    public void setPosition(String position) {
        getAmGuide().position = position;
    }


    public int getTickLength() {
        return getAmGuide().tickLength;
    }

    /**
     * Tick length.
     */
    public void setTickLength(int tickLength) {
        getAmGuide().tickLength = tickLength;
    }


    public int getToAngle() {
        return getAmGuide().toAngle;
    }

    /**
     * Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines.
     */
    public void setToAngle(int toAngle) {
        getAmGuide().toAngle = toAngle;
    }


    public String getToCategory() {
        return getAmGuide().toCategory;
    }

    /**
     * "To" category of the guide (in case the guide is for category axis).
     */
    public void setToCategory(String toCategory) {
        getAmGuide().toCategory = toCategory;
    }


    public Date getToDate() {
        return getAmGuide().toDate;
    }

    /**
     * "To" date of the guide (in case the guide is for category axis and parseDates is set to true) If you have both
     * date and toDate, the space between these two dates can be filled with color.
     */
    public void setToDate(Date toDate) {
        getAmGuide().toDate = toDate;
    }


    public int getToValue() {
        return getAmGuide().toValue;
    }

    /**
     * "To" value of the guide (in case the guide is for value axis).
     */
    public void setToValue(int toValue) {
        getAmGuide().toValue = toValue;
    }


    public int getValue() {
        return getAmGuide().value;
    }

    /**
     * Value of the guide (in case the guide is for value axis).
     */
    public void setValue(int value) {
        getAmGuide().value = value;
    }


    public AmValueAxis getValueAxis() {
        return getAmGuide().valueAxis;
    }

    /**
     * Value axis of a guide. As you can add guides directly to the chart, you might need to specify which which value
     * axis should be used.
     */
    public void setValueAxis(AmValueAxis valueAxis) {
        getAmGuide().valueAxis = valueAxis;
    }

    public AmGuide getAmGuide() {
        if (guide == null) {
            guide = new AmGuide();
        }
        return guide;
    }
}
