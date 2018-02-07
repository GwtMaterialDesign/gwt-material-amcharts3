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
package gwt.material.design.amcharts.client.ui.stock;

import com.google.gwt.core.client.JsDate;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.shared.HandlerRegistration;
import gwt.material.design.amcharts.client.ui.GwtMaterialAmChart;
import gwt.material.design.amcharts.client.ui.chart.js.AmBalloon;
import gwt.material.design.amcharts.client.ui.chart.js.AmSerialChart;
import gwt.material.design.amcharts.client.ui.chart.options.Balloon;
import gwt.material.design.amcharts.client.ui.chart.plugins.export.ExportOption;
import gwt.material.design.amcharts.client.ui.chart.plugins.export.js.AmExportOption;
import gwt.material.design.amcharts.client.ui.stock.constants.DayOfWeek;
import gwt.material.design.amcharts.client.ui.stock.events.*;
import gwt.material.design.amcharts.client.ui.stock.js.*;
import gwt.material.design.amcharts.client.ui.stock.resources.StockChartClientBundle;
import gwt.material.design.amcharts.client.ui.stock.resources.StockChartClientDebugBundle;
import gwt.material.design.client.MaterialDesign;
import gwt.material.design.client.base.JsLoader;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.base.helper.ColorHelper;
import gwt.material.design.client.constants.Color;
import gwt.material.design.jquery.client.api.Functions;

import java.util.Date;

public class StockChart extends MaterialWidget implements JsLoader, HasStockChartHandlers {

    static {
        if (GwtMaterialAmChart.isDebug()) {
            MaterialDesign.injectDebugJs(StockChartClientDebugBundle.INSTANCE.stockChartDebugJs());
            MaterialDesign.injectCss(StockChartClientDebugBundle.INSTANCE.stockChartDebugCss());
        } else {
            MaterialDesign.injectJs(StockChartClientBundle.INSTANCE.stockChartJs());
            MaterialDesign.injectCss(StockChartClientBundle.INSTANCE.stockChartCss());
        }
    }

    private AmStockChart amStockChart;

    public StockChart() {
        super(Document.get().createDivElement());
    }

    @Override
    protected void onLoad() {
        super.onLoad();

        load();
    }

    @Override
    public void load() {

    }

    @Override
    protected void onUnload() {
        super.onUnload();

        unload();
    }

    @Override
    public void unload() {

    }

    @Override
    public void reload() {
        unload();
        load();
    }

    public boolean isAddClassNames() {
        return getAmStockChart().addClassNames;
    }

    /**
     * Specifies, if class names should be added to chart elements.
     */
    public void setAddClassNames(boolean addClassNames) {
        getAmStockChart().addClassNames = addClassNames;
    }

    public AmExportOption getAmExport() {
        return getAmStockChart().amExport;
    }

    /**
     * AmExport object.
     */
    public void setExport(ExportOption export) {
        getAmStockChart().amExport = export.getAmExportOption();
    }

    public boolean isAnimationPlayed() {
        return getAmStockChart().animationPlayed;
    }

    /**
     * Specifies if animation was already played. Animation is only played once, when chart is rendered for the first
     * time. If you want the animation to be repeated, set this property to false.
     */
    public void setAnimationPlayed(boolean animationPlayed) {
        getAmStockChart().animationPlayed = animationPlayed;
    }

    public boolean isAutoResize() {
        return getAmStockChart().autoResize;
    }

    /**
     * Set this to false if you don't want chart to resize itself whenever its parent container size changes.
     */
    public void setAutoResize(boolean autoResize) {
        getAmStockChart().autoResize = autoResize;
    }

    public AmBalloon getBalloon() {
        return getAmStockChart().balloon;
    }

    /**
     * Balloon object.
     */
    public void setBalloon(Balloon balloon) {
        getAmStockChart().balloon = balloon.getAmBalloon();
    }

    public CategoryAxesSettings getCategoryAxesSettings() {
        return getAmStockChart().categoryAxesSettings;
    }

    /**
     * Settings for category axes.
     */
    public void setCategoryAxesSettings(CategoryAxesSettings categoryAxesSettings) {
        getAmStockChart().categoryAxesSettings = categoryAxesSettings;
    }

    public boolean isChartCreated() {
        return getAmStockChart().chartCreated;
    }

    /**
     * Read-only. Indicates if the chart is created.
     */
    public void setChartCreated(boolean chartCreated) {
        getAmStockChart().chartCreated = chartCreated;
    }

    public ChartCursorSettings getChartCursorSettings() {
        return getAmStockChart().chartCursorSettings;
    }

    /**
     * Chart cursor settings.
     */
    public void setChartCursorSettings(ChartCursorSettings chartCursorSettings) {
        getAmStockChart().chartCursorSettings = chartCursorSettings;
    }

    public ChartScrollbarSettings getChartScrollbarSettings() {
        return getAmStockChart().chartScrollbarSettings;
    }

    /**
     * Chart scrollbar settings.
     */
    public void setChartScrollbarSettings(ChartScrollbarSettings chartScrollbarSettings) {
        getAmStockChart().chartScrollbarSettings = chartScrollbarSettings;
    }

    public String getClassNamePrefix() {
        return getAmStockChart().classNamePrefix;
    }

    /**
     * This prefix is added to all class names which are added to all visual elements of a chart in case addClassNames
     * is set to true.
     */
    public void setClassNamePrefix(String classNamePrefix) {
        getAmStockChart().classNamePrefix = classNamePrefix;
    }

    public String[] getColors() {
        return getAmStockChart().colors;
    }

    /**
     * Array of colors used by data sets if no color was set explicitly on data set itself.
     * Default to ["#FF6600", "#FCD202", "#B0DE09", "#0D8ECF", "#2A0CD0", "#CD0D74", "#CC0000", "#00CC00", "#0000CC",
     * "#DDDDDD", "#999999", "#333333", "#990000"]
     */
    public void setColors(String... colors) {
        getAmStockChart().colors = colors;
    }

    public void setColors(Color... colors) {
        for (int i = 0; i < colors.length; i++) {
            getAmStockChart().colors[i] = ColorHelper.setupComputedBackgroundColor(colors[i]);
        }
    }

    public DataSet[] getComparedDataSets() {
        return getAmStockChart().comparedDataSets;
    }

    /**
     * Array of data sets selected for comparing.
     */
    public void setComparedDataSets(DataSet... comparedDataSets) {
        getAmStockChart().comparedDataSets = comparedDataSets;
    }

    public String getDataDateFormat() {
        return getAmStockChart().dataDateFormat;
    }

    /**
     * Data provider of data set can have dates as Date Objects or as Strings. In case you use strings, you need to
     * set data date format and the chart will parse dates to date objects. Check this page for date formatting strings.
     * <p>
     * Please note that two-digit years (YY) is NOT supported in this setting.
     */
    public void setDataDateFormat(String dataDateFormat) {
        getAmStockChart().dataDateFormat = dataDateFormat;
    }

    public DataSet[] getDataSets() {
        return getAmStockChart().dataSets;
    }

    /**
     * Array of DataSets.
     */
    public void setDataSets(DataSet... dataSets) {
        getAmStockChart().dataSets = dataSets;
    }

    public DataSetSelector getDataSetSelector() {
        return getAmStockChart().dataSetSelector;
    }

    /**
     * DataSetSelector object. You can add it if you have more than one data set and want users to be able to
     * select/compare them.
     */
    public void setDataSetSelector(DataSetSelector dataSetSelector) {
        getAmStockChart().dataSetSelector = dataSetSelector;
    }

    public Date getEndDate() {
        return getAmStockChart().endDate;
    }

    /**
     * Read-only. Current end date of the selected period, get only. To set start/end dates, use
     * stockChart.zoom(startDate, endDate) method.
     */
    public void setEndDate(Date endDate) {
        getAmStockChart().endDate = endDate;
    }

    public Object getExport() {
        return getAmStockChart().export;
    }

    /**
     * Export config. Specifies how export to image/data export/print/annotate menu will look and behave. You can find
     * a lot of examples in amcharts/plugins/export folder. More details can be found here.
     */
    public void setExport(Object export) {
        getAmStockChart().export = export;
    }

    public boolean isExtendToFullPeriod() {
        return getAmStockChart().extendToFullPeriod;
    }

    /**
     * Specifies if the chart should always display full first and last data item when data is grouped to a longer
     * period if the chart is zoomed from the beginning or end of the data. Default to true
     */
    public void setExtendToFullPeriod(boolean extendToFullPeriod) {
        getAmStockChart().extendToFullPeriod = extendToFullPeriod;
    }

    public int getFirstDayOfWeek() {
        return getAmStockChart().firstDayOfWeek;
    }

    /**
     * Defines on which day week starts. 0 - Sunday, 1 - Monday...
     */
    public void setFirstDayOfWeek(DayOfWeek firstDayOfWeek) {
        getAmStockChart().firstDayOfWeek = firstDayOfWeek.getValue();
    }

    public boolean isGlueToTheEnd() {
        return getAmStockChart().glueToTheEnd;
    }

    /**
     * If set to true the scope of the data view will be set to the end after data update.
     */
    public void setGlueToTheEnd(boolean glueToTheEnd) {
        getAmStockChart().glueToTheEnd = glueToTheEnd;
    }

    public String getLanguage() {
        return getAmStockChart().language;
    }

    /**
     * Allows changing language easily.
     * <p>
     * Note: you should include language js file from amcharts/lang or ammap/lang folder and then use variable name
     * used in this file, like chart.language = "de".
     */
    public void setLanguage(String language) {
        getAmStockChart().language = language;
    }

    public LegendSettings getLegendSettings() {
        return getAmStockChart().legendSettings;
    }

    /**
     * Legend settings.
     */
    public void setLegendSettings(LegendSettings legendSettings) {
        getAmStockChart().legendSettings = legendSettings;
    }

    public Object[] getListeners() {
        return getAmStockChart().listeners;
    }

    /**
     * You can add listeners of events using this property. Example: listeners = [{"event":"dataUpdated", "method":handleEvent}];
     */
    public void setListeners(Object[] listeners) {
        getAmStockChart().listeners = listeners;
    }

    public DataSet getMainDataSet() {
        return getAmStockChart().mainDataSet;
    }

    /**
     * Data set selected as main.
     */
    public void setMainDataSet(DataSet mainDataSet) {
        getAmStockChart().mainDataSet = mainDataSet;
    }

    public boolean isMouseWheelScrollEnabled() {
        return getAmStockChart().mouseWheelScrollEnabled;
    }

    /**
     * Specifies if scrolling of a chart with mouse wheel is enabled. Default to false
     */
    public void setMouseWheelScrollEnabled(boolean mouseWheelScrollEnabled) {
        getAmStockChart().mouseWheelScrollEnabled = mouseWheelScrollEnabled;
    }

    public StockPanel[] getPanels() {
        return getAmStockChart().panels;
    }

    /**
     * Array of StockPanels (charts).
     */
    public void setPanels(StockPanel[] panels) {
        getAmStockChart().panels = panels;
    }

    public PanelsSettings getPanelsSettings() {
        return getAmStockChart().panelsSettings;
    }

    /**
     * Settings for stock panels.
     */
    public void setPanelsSettings(PanelsSettings panelsSettings) {
        getAmStockChart().panelsSettings = panelsSettings;
    }

    public String getPath() {
        return getAmStockChart().path;
    }

    /**
     * Specifies absolute or relative path to amCharts files, i.e. "amcharts/". (where all .js files are located)
     * <p>
     * If relative URLs are used, they will be relative to the current web page, displaying the chart.
     * <p>
     * You can also set path globally, using global JavaScript variable AmCharts_path. If this variable is set, and
     * "path" is not set in chart config, the chart will assume the path from the global variable. This allows setting
     * amCharts path globally. I.e.:
     * <p><pre>
     * var AmCharts_path = "/libs/amcharts/";
     * </pre><p>
     * <p>
     * "path" parameter will be used by the charts to locate it's files, like images, plugins or patterns.
     *
     * @param path
     */
    public void setPath(String path) {
        getAmStockChart().path = path;
    }

    public String getPathToImages() {
        return getAmStockChart().pathToImages;
    }

    /**
     * Specifies path to the folder where images like resize grips, lens and similar are.
     * <p>
     * IMPORTANT: Since V3.4.12, you should use "path" to point to amCharts directory instead. The "pathToImages"
     * will be automatically set and does not need to be in the chart config, unless you keep your images separately
     * from other amCharts files.
     */
    public void setPathToImages(String pathToImages) {
        getAmStockChart().pathToImages = pathToImages;
    }

    public PeriodSelector getPeriodSelector() {
        return getAmStockChart().periodSelector;
    }

    /**
     * Period selector object. You can add it if you want user's to be able to enter date ranges or zoom chart with
     * predefined period buttons.
     */
    public void setPeriodSelector(PeriodSelector periodSelector) {
        getAmStockChart().periodSelector = periodSelector;
    }

    public double getProcessTimeout() {
        return getAmStockChart().processTimeout;
    }

    /**
     * If you set it to 1 millisecond or some bigger value, chart will be built in chunks instead of all at once. This
     * is useful if you work with a lot of data and the initial build of the chart takes a lot of time, which freezes
     * the whole web application by not allowing other processes to do their job while the chart is busy.
     * Default to 0
     */
    public void setProcessTimeout(double processTimeout) {
        getAmStockChart().processTimeout = processTimeout;
    }

    public AmSerialChart getScrollbarChart() {
        return getAmStockChart().scrollbarChart;
    }

    /**
     * Read-only. Scrollbar's chart object.
     */
    public void setScrollbarChart(AmSerialChart scrollbarChart) {
        getAmStockChart().scrollbarChart = scrollbarChart;
    }

    public Date getStartDate() {
        return getAmStockChart().startDate;
    }

    /**
     * Read-only. Current start date of the selected period. To set start/end dates, use
     * stockChart.zoom(startDate, endDate) method.
     */
    public void setStartDate(Date startDate) {
        getAmStockChart().startDate = startDate;
    }

    public StockEventsSettings getStockEventsSettings() {
        return getAmStockChart().stockEventsSettings;
    }

    /**
     * Settings for stock events.
     */
    public void setStockEventsSettings(StockEventsSettings stockEventsSettings) {
        getAmStockChart().stockEventsSettings = stockEventsSettings;
    }

    public String getType() {
        return getAmStockChart().type;
    }

    /**
     * Read-only. Type of the chart.
     */
    public void setType(String type) {
        getAmStockChart().type = type;
    }

    public ValueAxesSettings getValueAxesSettings() {
        return getAmStockChart().valueAxesSettings;
    }

    /**
     * Settings for value axes.
     */
    public void setValueAxesSettings(ValueAxesSettings valueAxesSettings) {
        getAmStockChart().valueAxesSettings = valueAxesSettings;
    }

    public String getVersion() {
        return getAmStockChart().version;
    }

    /**
     * Read-only. Indicates current version of a script.
     */
    public void setVersion(String version) {
        getAmStockChart().version = version;
    }

    public boolean isZoomOutOnDataSetChange() {
        return getAmStockChart().zoomOutOnDataSetChange;
    }

    /**
     * Specifies whether the chart should zoom-out when main data set is changed. Default to false
     */
    public void setZoomOutOnDataSetChange(boolean zoomOutOnDataSetChange) {
        getAmStockChart().zoomOutOnDataSetChange = zoomOutOnDataSetChange;
    }

    /**
     * Adds event listener to the object.
     */
    public void addListener(String type, Functions.Func handler) {
        getAmStockChart().addListener(type, handler);
    }

    /**
     * Adds panel to the stock chart. Requires stockChart.validateNow() method to be called after this action.
     */
    public void addPanel(StockPanel panel) {
        getAmStockChart().addPanel(panel);
    }

    /**
     * Adds panel to the stock chart at a specified index. Requires stockChart.validateNow() method to be called after this action.
     */
    public void addPanelAt(StockPanel panel, int index) {
        getAmStockChart().addPanelAt(panel, index);
    }

    /**
     * Destroys chart, all timeouts and listeners.
     */
    public void clear() {
        getAmStockChart().clear();
    }

    /**
     * Hides event bullets.
     */
    public void hideStockEvents() {
        getAmStockChart().hideStockEvents();
    }

    /**
     * Removes event listener from the object.
     */
    public void removeListener(Object obj, String type, Functions.Func handler) {
        getAmStockChart().removeListener(obj, type, handler);
    }

    /**
     * Removes panel from the stock chart. Requires stockChart.validateNow() method to be called after this action.
     */
    public void removePanel(StockPanel panel) {
        getAmStockChart().removePanel(panel);
    }

    /**
     * Shows event bullets.
     */
    public void showStockEvents() {
        getAmStockChart().showStockEvents();
    }

    /**
     * Method which should be called after data was changed.
     */
    public void validateData() {
        getAmStockChart().validateData();
    }

    /**
     * Method which forces the stock chart to rebuild. Should be called after properties are changed.
     */
    public void validateNow(boolean validateData, boolean skipEvents) {
        getAmStockChart().validateData();
    }

    /**
     * Zooms chart to specified dates.
     */
    public void validateNow() {
        getAmStockChart().validateNow();
    }


    public void zoom(JsDate startDate, JsDate endDate) {
        getAmStockChart().zoom(startDate, endDate);
    }

    /**
     * Zooms out the chart.
     */
    public void zoomOut() {
        getAmStockChart().zoomOut();
    }

    public AmStockChart getAmStockChart() {
        if (amStockChart == null) {
            amStockChart = new AmStockChart();
        }
        return amStockChart;
    }

    @Override
    public HandlerRegistration addBuildStartedHandler(BuildStartedEvent.BuildStartedHandler handler) {
        return addHandler(handler, BuildStartedEvent.getType());
    }

    @Override
    public HandlerRegistration addClickStockHandler(ClickStockEvent.ClickStockHandler handler) {
        return addHandler(handler, ClickStockEvent.getType());
    }

    @Override
    public HandlerRegistration addDataUpdatedHander(DataUpdatedEvent.DataUpdateddHandler handler) {
        return addHandler(handler, DataUpdatedEvent.getType());
    }

    @Override
    public HandlerRegistration addInitHandler(InitEvent.InitHandler handler) {
        return addHandler(handler, InitEvent.getType());
    }

    @Override
    public HandlerRegistration addPanelRemovedHandler(PanelRemovedEvent.PanelRemovedHandler handler) {
        return addHandler(handler, PanelRemovedEvent.getType());
    }

    @Override
    public HandlerRegistration addRenderedHandler(RenderedEvent.RenderedHandler handler) {
        return addHandler(handler, RenderedEvent.getType());
    }

    @Override
    public HandlerRegistration addRollOutStockHandler(RollOutStockEvent.RollOutStockHandler handler) {
        return addHandler(handler, RollOutStockEvent.getType());
    }

    @Override
    public HandlerRegistration addRollOverStockHandler(RollOverStockEvent.RollOverStockHandler handler) {
        return addHandler(handler, RollOverStockEvent.getType());
    }

    @Override
    public HandlerRegistration addZoomedHandler(ZoomedEvent.ZoomedHandler handler) {
        return addHandler(handler, ZoomedEvent.getType());
    }
}
