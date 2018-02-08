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
package gwt.material.design.amcharts.client.ui.chart.plugins.export;

import gwt.material.design.amcharts.client.ui.chart.base.ChartOptions;
import gwt.material.design.amcharts.client.ui.chart.plugins.export.js.AmExportLib;
import gwt.material.design.amcharts.client.ui.chart.plugins.export.js.AmExportOption;
import gwt.material.design.jquery.client.api.Functions;

//@formatter:off

/**
 * Used by {@link gwt.material.design.amcharts.client.ui.chart.base.AbstractChart#setExport(ExportOption)} to configure
 * each export options.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://github.com/amcharts/export#amcharts-export">Official Documentation</a>
 */
//@formatter:on
public class ExportOption extends ChartOptions {

    private AmExportOption exportOption;

    public String getBackgroundColor() {
        return getAmExportOption().backgroundColor;
    }

    /**
     * RGB code of the color for the background of the exported image. Default to #FFFFFF
     */
    public void setBackgroundColor(String backgroundColor) {
        getAmExportOption().backgroundColor = backgroundColor;
    }

    public boolean isEnabled() {
        return getAmExportOption().enabled;
    }

    /**
     * Enables or disables export functionality. Default to true
     */
    public void setEnabled(boolean enabled) {
        getAmExportOption().enabled = enabled;
    }

    public String getDivId() {
        return getAmExportOption().divId;
    }

    /**
     * ID or a reference to div object in case you want the menu in a separate container.
     */
    public void setDivId(String divId) {
        getAmExportOption().divId = divId;
    }

    public Object getFabric() {
        return getAmExportOption().fabric;
    }

    /**
     * Overwrites the default drawing settings (fabricJS library)
     */
    public void setFabric(Object fabric) {
        getAmExportOption().fabric = fabric;
    }

    public Object getFallback() {
        return getAmExportOption().fallback;
    }

    /**
     * Holds the messages to guide the user to copy the generated output; false will disable the fallback feature
     */
    public void setFallback(Object fallback) {
        getAmExportOption().fallback = fallback;
    }

    public String getFileName() {
        return getAmExportOption().fileName;
    }

    /**
     * A file name to use for generated export files (an extension will be appended to it based on the export format).
     * Default to amCharts
     */
    public void setFileName(String fileName) {
        getAmExportOption().fileName = fileName;
    }

    public Object getLegend() {
        return getAmExportOption().legend;
    }

    /**
     * Places the legend in case it is within an external container
     */
    public void setLegend(Object legend) {
        getAmExportOption().legend = legend;
    }

    public Object getLibs() {
        return getAmExportOption().libs;
    }

    /**
     * 3rd party required library settings (see the above section)
     */
    public void setLibs(AmExportLib libs) {
        getAmExportOption().libs = libs;
    }

    public Object[] getMenu() {
        return getAmExportOption().menu;
    }

    /**
     * A list of menu or submenu items (see the next chapter for details)
     */
    public void setMenu(Object[] menu) {
        getAmExportOption().menu = menu;
    }

    public Object getPdfMake() {
        return getAmExportOption().pdfMake;
    }

    /**
     * Overwrites the default settings for PDF export (pdfMake library)
     */
    public void setPdfMake(Object pdfMake) {
        getAmExportOption().pdfMake = pdfMake;
    }

    public String getPosition() {
        return getAmExportOption().position;
    }

    /**
     * A position of export icon. Possible values: "top-left", "top-right" (default), "bottom-left", "bottom-right".
     * Default to "top-right".
     */
    public void setPosition(String position) {
        getAmExportOption().position = position;
    }

    public boolean isRemoveImages() {
        return getAmExportOption().removeImages;
    }

    /**
     * If true export checks for and removes "tainted" images that area lodead from different domains. Default to true
     */
    public void setRemoveImages(boolean removeImages) {
        getAmExportOption().removeImages = removeImages;
    }

    public int getDelay() {
        return getAmExportOption().delay;
    }

    /**
     * General setting to delay the capturing of the chart
     */
    public void setDelay(int delay) {
        getAmExportOption().delay = delay;
    }

    public Object[] getExportFields() {
        return getAmExportOption().exportFields;
    }

    /**
     * If set, only fields in this array will be exported ( data export only )
     */
    public void setExportFields(Object[] exportFields) {
        getAmExportOption().exportFields = exportFields;
    }

    public boolean isExportTitles() {
        return getAmExportOption().exportTitles;
    }

    /**
     * Exchanges the data field names with it's dedicated title ( data export only ). Default to false
     */
    public void setExportTitles(boolean exportTitles) {
        getAmExportOption().exportTitles = exportTitles;
    }

    public Object getColumnNames() {
        return getAmExportOption().columnNames;
    }

    /**
     * An object of key/value pairs to use as column names when exporting to data formats. exportTitles needs to be set
     * for this to work as well.
     */
    public void setColumnNames(Object columnNames) {
        getAmExportOption().columnNames = columnNames;
    }

    public boolean isExportSelection() {
        return getAmExportOption().exportSelection;
    }

    /**
     * Exports the current data selection only ( data export only ). Default to false
     */
    public void setExportSelection(boolean exportSelection) {
        getAmExportOption().exportSelection = exportSelection;
    }

    public String getDataDateFormat() {
        return getAmExportOption().dataDateFormat;
    }

    /**
     * Format to convert date strings to date objects, uses by default charts dataDateFormat ( data export only )
     */
    public void setDataDateFormat(String dataDateFormat) {
        getAmExportOption().dataDateFormat = dataDateFormat;
    }

    public String getDateFormat() {
        return getAmExportOption().dateFormat;
    }

    /**
     * Formats the category field in given date format ( data export only ). Default to YYYY-MM-DD
     */
    public void setDateFormat(String dateFormat) {
        getAmExportOption().dateFormat = dateFormat;
    }

    public boolean isKeyListener() {
        return getAmExportOption().keyListener;
    }

    /**
     * If true it observes the pressed keys to undo/redo the annotations. Default to false
     */
    public void setKeyListener(boolean keyListener) {
        getAmExportOption().keyListener = keyListener;
    }

    public boolean isFileListener() {
        return getAmExportOption().fileListener;
    }

    /**
     * If true it observes the drag and drop feature and loads the dropped image file into the annotation. Default to false
     */
    public void setFileListener(boolean fileListener) {
        getAmExportOption().fileListener = fileListener;
    }

    public Object getDrawing() {
        return getAmExportOption().drawing;
    }

    /**
     * Object which holds all possible settings for the annotation mode
     */
    public void setDrawing(Object drawing) {
        getAmExportOption().drawing = drawing;
    }

    public boolean isOverflow() {
        return getAmExportOption().overflow;
    }

    /**
     * Flag to overwrite the css attribute 'overflow' of the chart container to avoid cropping the menu on small container
     * Default to true
     */
    public void setOverflow(boolean overflow) {
        getAmExportOption().overflow = overflow;
    }

    public Object getBorder() {
        return getAmExportOption().border;
    }

    /**
     * An object of key/value pairs to define the overlaying border
     */
    public void setBorder(Object border) {
        getAmExportOption().border = border;
    }

    public Functions.Func getProcessData() {
        return getAmExportOption().processData;
    }

    /**
     * A function which can be used to change the dataProvider when exporting to CSV, XLSX, or JSON
     */
    public void setProcessData(Functions.Func processData) {
        getAmExportOption().processData = processData;
    }

    public boolean isPageOrigin() {
        return getAmExportOption().pageOrigin;
    }

    /**
     * A flag to show / hide the origin of the generated PDF ( pdf export only ). Default to true
     */
    public void setPageOrigin(boolean pageOrigin) {
        getAmExportOption().pageOrigin = pageOrigin;
    }

    public boolean isForceRemoveImages() {
        return getAmExportOption().forceRemoveImages;
    }

    /**
     * If true export removes all images. Default to false
     */
    public void setForceRemoveImages(boolean forceRemoveImages) {
        getAmExportOption().forceRemoveImages = forceRemoveImages;
    }

    public boolean isDebug() {
        return getAmExportOption().debug;
    }

    /**
     * A flag which enables the plugin to write console logs (currently used by the dependency handler only). Default to
     * false
     */
    public void setDebug(boolean debug) {
        getAmExportOption().debug = debug;
    }

    public AmExportOption getAmExportOption() {
        if (exportOption == null) {
            exportOption = new AmExportOption();
        }
        return exportOption;
    }
}
