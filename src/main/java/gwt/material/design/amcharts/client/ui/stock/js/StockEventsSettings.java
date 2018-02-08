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

import gwt.material.design.amcharts.client.ui.stock.constants.BulletType;
import gwt.material.design.amcharts.client.ui.stock.constants.ShowAt;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * StockEventsSettings set's settings for all StockEvents.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptstockchart/StockEventsSettings">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, namespace = "AmCharts")
public class StockEventsSettings {

    @JsProperty
    private double backgroundAlpha;

    @JsProperty
    private String backgroundColor;

    @JsProperty
    private String balloonColor;

    @JsProperty
    private double borderAlpha;

    @JsProperty
    private String borderColor;

    @JsProperty
    private String rollOverColor;

    @JsProperty
    private String showAt;

    @JsProperty
    private String type;

    @JsOverlay
    public final double getBackgroundAlpha() {
        return backgroundAlpha;
    }

    /**
     * Opacity of bullet background. Default to 1
     */
    @JsOverlay
    public final void setBackgroundAlpha(double backgroundAlpha) {
        this.backgroundAlpha = backgroundAlpha;
    }

    @JsOverlay
    public final String getBackgroundColor() {
        return backgroundColor;
    }

    @JsOverlay
    public final void setBackgroundColor(Color backgroundColor) {
        setBackgroundColor(ColorHelper.setupComputedBackgroundColor(backgroundColor));
    }

    /**
     * Color of bullet background. Default to #DADADA
     */
    @JsOverlay
    public final void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @JsOverlay
    public final String getBalloonColor() {
        return balloonColor;
    }

    @JsOverlay
    public final void setBalloonColor(Color balloonColor) {
        setBalloonColor(ColorHelper.setupComputedBackgroundColor(balloonColor));
    }

    /**
     * Color for a roll-over balloon. Default to #CC0000
     */
    @JsOverlay
    public final void setBalloonColor(String balloonColor) {
        this.balloonColor = balloonColor;
    }

    @JsOverlay
    public final double getBorderAlpha() {
        return borderAlpha;
    }

    /**
     * Opacity of bullet border. Default to 1
     */
    @JsOverlay
    public final void setBorderAlpha(double borderAlpha) {
        this.borderAlpha = borderAlpha;
    }

    @JsOverlay
    public final String getBorderColor() {
        return borderColor;
    }

    @JsOverlay
    public final void setBorderColor(Color borderColor) {
        setBorderColor(ColorHelper.setupComputedBackgroundColor(borderColor));
    }

    /**
     * Bullet border color. Default to #888888
     */
    @JsOverlay
    public final void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @JsOverlay
    public final String getRollOverColor() {
        return rollOverColor;
    }

    @JsOverlay
    public final void setRollOverColor(Color rollOverColor) {
        setRollOverColor(rollOverColor);
    }

    /**
     * Roll-over background color. Default to #CC0000
     */
    @JsOverlay
    public final void setRollOverColor(String rollOverColor) {
        this.rollOverColor = rollOverColor;
    }

    @JsOverlay
    public final String getShowAt() {
        return showAt;
    }

    /**
     * Allows placing event bullets at open/close/low/high values.
     */
    @JsOverlay
    public final void setShowAt(ShowAt showAt) {
        this.showAt = showAt.getName();
    }

    @JsOverlay
    public final String getType() {
        return type;
    }

    /**
     * Type of bullet. Possible values are: "flag", "sign", "pin", "triangleUp", "triangleDown", "triangleLeft",
     * "triangleRight", "text", "arrowUp", "arrowDown".
     */
    @JsOverlay
    public final void setType(BulletType type) {
        this.type = type.getName();
    }
}
