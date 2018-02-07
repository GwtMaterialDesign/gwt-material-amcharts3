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
package gwt.material.design.amchart.client.ui.chart.options;

import gwt.material.design.amchart.client.ui.chart.base.ChartOptions;
import gwt.material.design.amchart.client.ui.chart.js.options.AmGaugeBand;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;

//@formatter:off

/**
 * Creates a band for a specified value range on the {@link GaugeAxis}. Multiple bands can be assigned to a single
 * {@link GaugeAxis}.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptcharts/GaugeBand">Official Documentation</a>
 *///@formatter:on
public class GaugeBand extends ChartOptions {

    private AmGaugeBand gaugeBand;

    public double getAlpha() {
        return getAmGaugeBand().alpha;
    }

    /**
     * Opacity of band fill. Will use axis.bandAlpha if not set any.
     */
    public void setAlpha(double alpha) {
        getAmGaugeBand().alpha = alpha;
    }

    public String getBalloonText() {
        return getAmGaugeBand().balloonText;
    }

    /**
     * When rolled-over, band will display balloon if you set some text for this property.
     */
    public void setBalloonText(String balloonText) {
        getAmGaugeBand().balloonText = balloonText;
    }

    public String getColor() {
        return getAmGaugeBand().color;
    }

    public void setColor(Color color) {
        setColor(ColorHelper.setupComputedBackgroundColor(color));
    }

    /**
     * Color of a band.
     */
    public void setColor(String color) {
        getAmGaugeBand().color = color;
    }

    public int getEndValue() {
        return getAmGaugeBand().endValue;
    }

    /**
     * End value of a fill.
     */
    public void setEndValue(int value) {
        getAmGaugeBand().setEndValue(value);
    }

    public int[] getGradientRatio() {
        return getAmGaugeBand().gradientRatio;
    }

    /**
     * Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients. Negative value means the color will
     * be darker than the original, and positive number means the color will be lighter.
     */
    public void setGradientRatio(int[] gradientRatio) {
        getAmGaugeBand().gradientRatio = gradientRatio;
    }

    public String getId() {
        return getAmGaugeBand().id;
    }

    /**
     * Unique id of a band.
     */
    public void setId(String id) {
        getAmGaugeBand().id = id;
    }

    public Object getInnerRadius() {
        return getAmGaugeBand().innerRadius;
    }

    /**
     * Inner radius of a band. If not set any, the band will end with the end of minor ticks. Set 0 if you want the band
     * to be drawn to the axis center.
     */
    public void setInnerRadius(Object innerRadius) {
        getAmGaugeBand().innerRadius = innerRadius;
    }

    public Object getRadius() {
        return getAmGaugeBand().radius;
    }

    /**
     * Band radius. If not set any, the band will start with the axis outline.
     */
    public void setRadius(Object radius) {
        getAmGaugeBand().radius = radius;
    }

    public int getStartValue() {
        return getAmGaugeBand().startValue;
    }

    /**
     * Start value of a fill.
     */
    public void setStartValue(int value) {
        getAmGaugeBand().setStartValue(value);
    }

    public String getUrl() {
        return getAmGaugeBand().url;
    }

    public void setUrl(String url) {
        getAmGaugeBand().url = url;
    }

    public AmGaugeBand getAmGaugeBand() {
        if (gaugeBand == null) {
            gaugeBand = new AmGaugeBand();
        }
        return gaugeBand;
    }
}
