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

import com.google.gwt.core.client.JsDate;
import gwt.material.design.amcharts.client.ui.chart.js.AmBalloon;
import gwt.material.design.amcharts.client.ui.chart.js.AmChart;
import gwt.material.design.amcharts.client.ui.chart.js.AmSerialChart;
import gwt.material.design.amcharts.client.ui.chart.plugins.export.js.AmExportOption;
import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.Date;

/**
 * AmStockChart is a main class Stock chart.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptstockchart/AmStockChart">Official Documentation</a>
 */
//@formatter:on
@JsType(isNative = true, namespace = "AmCharts")
public class AmStockChart extends AmChart {

    @JsProperty
    public boolean addClassNames;

    @JsProperty
    public AmExportOption amExport;

    @JsProperty
    public boolean animationPlayed;

    @JsProperty
    public boolean autoResize;

    @JsProperty
    public AmBalloon balloon;

    @JsProperty
    public CategoryAxesSettings categoryAxesSettings;

    @JsProperty
    public boolean chartCreated;

    @JsProperty
    public ChartCursorSettings chartCursorSettings;

    @JsProperty
    public ChartScrollbarSettings chartScrollbarSettings;

    @JsProperty
    public String classNamePrefix;

    @JsProperty
    public String[] colors;

    @JsProperty
    public DataSet[] comparedDataSets;

    @JsProperty
    public String dataDateFormat;

    @JsProperty
    public DataSet[] dataSets;

    @JsProperty
    public DataSetSelector dataSetSelector;

    @JsProperty
    public Date endDate;

    @JsProperty
    public Object export;

    @JsProperty
    public boolean extendToFullPeriod;

    @JsProperty
    public int firstDayOfWeek;

    @JsProperty
    public boolean glueToTheEnd;

    @JsProperty
    public String language;

    @JsProperty
    public LegendSettings legendSettings;

    @JsProperty
    public Object[] listeners;

    @JsProperty
    public DataSet mainDataSet;

    @JsProperty
    public boolean mouseWheelScrollEnabled;

    @JsProperty
    public AmStockPanel[] panels;

    @JsProperty
    public PanelsSettings panelsSettings;

    @JsProperty
    public String path;

    @JsProperty
    public String pathToImages;

    @JsProperty
    public PeriodSelector periodSelector;

    @JsProperty
    public double processTimeout;

    @JsProperty
    public AmSerialChart scrollbarChart;

    @JsProperty
    public Date startDate;

    @JsProperty
    public StockEventsSettings stockEventsSettings;

    @JsProperty
    public String type;

    @JsProperty
    public ValueAxesSettings valueAxesSettings;

    @JsProperty
    public String version;

    @JsProperty
    public boolean zoomOutOnDataSetChange;

    @JsMethod
    public native void addListener(String type, Functions.Func handler);

    @JsMethod
    public native void addPanel(AmStockPanel panel);

    @JsMethod
    public native void addPanelAt(AmStockPanel panel, int index);

    @JsMethod
    public native void clear();

    @JsMethod
    public native void hideStockEvents();

    @JsMethod
    public native void removeListener(Object obj, String type, Functions.Func handler);

    @JsMethod
    public native void removePanel(AmStockPanel panel);

    @JsMethod
    public native void showStockEvents();

    @JsMethod
    public native void validateData();

    @JsMethod
    public native void validateNow(boolean validateData, boolean skipEvents);

    @JsMethod
    public native void validateNow();

    @JsMethod
    public native void zoom(JsDate startDate, JsDate endDate);

    @JsMethod
    public native void zoomOut();

    @JsMethod
    public native void write(String elementId);
}
