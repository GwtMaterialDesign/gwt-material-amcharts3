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
package gwt.material.design.amchart.client.ui.stock;

import com.google.gwt.core.client.JsDate;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.shared.HandlerRegistration;
import gwt.material.design.amchart.client.ui.GwtMaterialAmChart;
import gwt.material.design.amchart.client.ui.chart.js.AmBalloon;
import gwt.material.design.amchart.client.ui.chart.js.AmSerialChart;
import gwt.material.design.amchart.client.ui.chart.plugins.export.js.AmExportOption;
import gwt.material.design.amchart.client.ui.stock.events.*;
import gwt.material.design.amchart.client.ui.stock.js.*;
import gwt.material.design.amchart.client.ui.stock.resources.StockChartClientBundle;
import gwt.material.design.amchart.client.ui.stock.resources.StockChartClientDebugBundle;
import gwt.material.design.client.MaterialDesign;
import gwt.material.design.client.base.JsLoader;
import gwt.material.design.client.base.MaterialWidget;
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

    public void setAddClassNames(boolean addClassNames) {
        getAmStockChart().addClassNames = addClassNames;
    }

    public AmExportOption getAmExport() {
        return getAmStockChart().amExport;
    }

    public void setAmExport(AmExportOption amExport) {
        getAmStockChart().amExport = amExport;
    }

    public boolean isAnimationPlayed() {
        return getAmStockChart().animationPlayed;
    }

    public void setAnimationPlayed(boolean animationPlayed) {
        getAmStockChart().animationPlayed = animationPlayed;
    }

    public boolean isAutoResize() {
        return getAmStockChart().autoResize;
    }

    public void setAutoResize(boolean autoResize) {
        getAmStockChart().autoResize = autoResize;
    }

    public AmBalloon getBalloon() {
        return getAmStockChart().balloon;
    }

    public void setBalloon(AmBalloon balloon) {
        getAmStockChart().balloon = balloon;
    }

    public CategoryAxesSettings getCategoryAxesSettings() {
        return getAmStockChart().categoryAxesSettings;
    }

    public void setCategoryAxesSettings(CategoryAxesSettings categoryAxesSettings) {
        getAmStockChart().categoryAxesSettings = categoryAxesSettings;
    }

    public boolean isChartCreated() {
        return getAmStockChart().chartCreated;
    }

    public void setChartCreated(boolean chartCreated) {
        getAmStockChart().chartCreated = chartCreated;
    }

    public ChartCursorSettings getChartCursorSettings() {
        return getAmStockChart().chartCursorSettings;
    }

    public void setChartCursorSettings(ChartCursorSettings chartCursorSettings) {
        getAmStockChart().chartCursorSettings = chartCursorSettings;
    }

    public ChartScrollbarSettings getChartScrollbarSettings() {
        return getAmStockChart().chartScrollbarSettings;
    }

    public void setChartScrollbarSettings(ChartScrollbarSettings chartScrollbarSettings) {
        getAmStockChart().chartScrollbarSettings = chartScrollbarSettings;
    }

    public String getClassNamePrefix() {
        return getAmStockChart().classNamePrefix;
    }

    public void setClassNamePrefix(String classNamePrefix) {
        getAmStockChart().classNamePrefix = classNamePrefix;
    }

    public String[] getColors() {
        return getAmStockChart().colors;
    }

    public void setColors(String[] colors) {
        getAmStockChart().colors = colors;
    }

    public DataSet[] getComparedDataSets() {
        return getAmStockChart().comparedDataSets;
    }

    public void setComparedDataSets(DataSet[] comparedDataSets) {
        getAmStockChart().comparedDataSets = comparedDataSets;
    }

    public String getDataDateFormat() {
        return getAmStockChart().dataDateFormat;
    }

    public void setDataDateFormat(String dataDateFormat) {
        getAmStockChart().dataDateFormat = dataDateFormat;
    }

    public DataSet[] getDataSets() {
        return getAmStockChart().dataSets;
    }

    public void setDataSets(DataSet[] dataSets) {
        getAmStockChart().dataSets = dataSets;
    }

    public DataSetSelector getDataSetSelector() {
        return getAmStockChart().dataSetSelector;
    }

    public void setDataSetSelector(DataSetSelector dataSetSelector) {
        getAmStockChart().dataSetSelector = dataSetSelector;
    }

    public Date getEndDate() {
        return getAmStockChart().endDate;
    }

    public void setEndDate(Date endDate) {
        getAmStockChart().endDate = endDate;
    }

    public Object getExport() {
        return getAmStockChart().export;
    }

    public void setExport(Object export) {
        getAmStockChart().export = export;
    }

    public boolean isExtendToFullPeriod() {
        return getAmStockChart().extendToFullPeriod;
    }

    public void setExtendToFullPeriod(boolean extendToFullPeriod) {
        getAmStockChart().extendToFullPeriod = extendToFullPeriod;
    }

    public int getFirstDayOfWeek() {
        return getAmStockChart().firstDayOfWeek;
    }

    public void setFirstDayOfWeek(int firstDayOfWeek) {
        getAmStockChart().firstDayOfWeek = firstDayOfWeek;
    }

    public boolean isGlueToTheEnd() {
        return getAmStockChart().glueToTheEnd;
    }

    public void setGlueToTheEnd(boolean glueToTheEnd) {
        getAmStockChart().glueToTheEnd = glueToTheEnd;
    }

    public String getLanguage() {
        return getAmStockChart().language;
    }

    public void setLanguage(String language) {
        getAmStockChart().language = language;
    }

    public LegendSettings getLegendSettings() {
        return getAmStockChart().legendSettings;
    }

    public void setLegendSettings(LegendSettings legendSettings) {
        getAmStockChart().legendSettings = legendSettings;
    }

    public Object[] getListeners() {
        return getAmStockChart().listeners;
    }

    public void setListeners(Object[] listeners) {
        getAmStockChart().listeners = listeners;
    }

    public DataSet getMainDataSet() {
        return getAmStockChart().mainDataSet;
    }

    public void setMainDataSet(DataSet mainDataSet) {
        getAmStockChart().mainDataSet = mainDataSet;
    }

    public boolean isMouseWheelScrollEnabled() {
        return getAmStockChart().mouseWheelScrollEnabled;
    }

    public void setMouseWheelScrollEnabled(boolean mouseWheelScrollEnabled) {
        getAmStockChart().mouseWheelScrollEnabled = mouseWheelScrollEnabled;
    }

    public StockPanel[] getPanels() {
        return getAmStockChart().panels;
    }

    public void setPanels(StockPanel[] panels) {
        getAmStockChart().panels = panels;
    }

    public PanelsSettings getPanelsSettings() {
        return getAmStockChart().panelsSettings;
    }

    public void setPanelsSettings(PanelsSettings panelsSettings) {
        getAmStockChart().panelsSettings = panelsSettings;
    }

    public String getPath() {
        return getAmStockChart().path;
    }

    public void setPath(String path) {
        getAmStockChart().path = path;
    }

    public String getPathToImages() {
        return getAmStockChart().pathToImages;
    }

    public void setPathToImages(String pathToImages) {
        getAmStockChart().pathToImages = pathToImages;
    }

    public PeriodSelector getPeriodSelector() {
        return getAmStockChart().periodSelector;
    }

    public void setPeriodSelector(PeriodSelector periodSelector) {
        getAmStockChart().periodSelector = periodSelector;
    }

    public double getProcessTimeout() {
        return getAmStockChart().processTimeout;
    }

    public void setProcessTimeout(double processTimeout) {
        getAmStockChart().processTimeout = processTimeout;
    }

    public AmSerialChart getScrollbarChart() {
        return getAmStockChart().scrollbarChart;
    }

    public void setScrollbarChart(AmSerialChart scrollbarChart) {
        getAmStockChart().scrollbarChart = scrollbarChart;
    }

    public Date getStartDate() {
        return getAmStockChart().startDate;
    }

    public void setStartDate(Date startDate) {
        getAmStockChart().startDate = startDate;
    }

    public StockEventsSettings getStockEventsSettings() {
        return getAmStockChart().stockEventsSettings;
    }

    public void setStockEventsSettings(StockEventsSettings stockEventsSettings) {
        getAmStockChart().stockEventsSettings = stockEventsSettings;
    }

    public String getType() {
        return getAmStockChart().type;
    }

    public void setType(String type) {
        getAmStockChart().type = type;
    }

    public ValueAxesSettings getValueAxesSettings() {
        return getAmStockChart().valueAxesSettings;
    }

    public void setValueAxesSettings(ValueAxesSettings valueAxesSettings) {
        getAmStockChart().valueAxesSettings = valueAxesSettings;
    }

    public String getVersion() {
        return getAmStockChart().version;
    }

    public void setVersion(String version) {
        getAmStockChart().version = version;
    }

    public boolean isZoomOutOnDataSetChange() {
        return getAmStockChart().zoomOutOnDataSetChange;
    }

    public void setZoomOutOnDataSetChange(boolean zoomOutOnDataSetChange) {
        getAmStockChart().zoomOutOnDataSetChange = zoomOutOnDataSetChange;
    }

    public void addListener(String type, Functions.Func handler) {
        getAmStockChart().addListener(type, handler);
    }


    public void addPanel(StockPanel panel) {
        getAmStockChart().addPanel(panel);
    }


    public void addPanelAt(StockPanel panel, int index) {
        getAmStockChart().addPanelAt(panel, index);
    }


    public void clear() {
        getAmStockChart().clear();
    }


    public void hideStockEvents() {
        getAmStockChart().hideStockEvents();
    }


    public void removeListener(Object obj, String type, Functions.Func handler) {
        getAmStockChart().removeListener(obj, type, handler);
    }


    public void removePanel(StockPanel panel) {
        getAmStockChart().removePanel(panel);
    }


    public void showStockEvents() {
        getAmStockChart().showStockEvents();
    }


    public void validateData() {
        getAmStockChart().validateData();
    }


    public void validateNow(boolean validateData, boolean skipEvents) {
        getAmStockChart().validateData();
    }


    public void validateNow() {
        getAmStockChart().validateNow();
    }


    public void zoom(JsDate startDate, JsDate endDate) {
        getAmStockChart().zoom(startDate, endDate);
    }


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
