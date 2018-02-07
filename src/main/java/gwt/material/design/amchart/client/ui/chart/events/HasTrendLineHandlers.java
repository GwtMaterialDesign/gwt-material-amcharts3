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
package gwt.material.design.amchart.client.ui.chart.events;

import gwt.material.design.amchart.client.ui.chart.events.trendline.TrendLineClickEvent;
import gwt.material.design.amchart.client.ui.chart.events.trendline.TrendLineRollOutEvent;
import gwt.material.design.amchart.client.ui.chart.events.trendline.TrendLineRollOverEvent;

//@formatter:off

/**
 * {@link gwt.material.design.amchart.client.ui.chart.options.TrendLine} event handlers
 *
 * @author kevzlou7979@gmail.com
 */
//@formatter:on
public interface HasTrendLineHandlers {

    /**
     * Dispatched when user clicks on a trend line.
     */
    void addTrendLineClickHandler(TrendLineClickEvent.TrendLineClickHandler handler);

    /**
     * Dispatched when user rolls out of a trend line.
     */
    void addTrendLineRollOutHandler(TrendLineRollOutEvent.TrendLineRollOutHandler handler);

    /**
     * Dispatched when user clicks rolls-over a trend line.
     */
    void addTrendLineRollOverHandler(TrendLineRollOverEvent.TrendLineRollOverHandler handler);
}
