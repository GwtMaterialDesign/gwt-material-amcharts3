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
package gwt.material.design.amcharts.client.ui.chart.plugins.export.js;

import com.google.gwt.core.client.GWT;
import gwt.material.design.amcharts.client.ui.chart.plugins.annotation.js.AnnotationObjectBase;
import gwt.material.design.amcharts.client.ui.chart.plugins.annotation.js.options.AmCaptureData;
import gwt.material.design.amcharts.client.ui.chart.plugins.annotation.js.options.AnnotationData;
import gwt.material.design.amcharts.client.ui.chart.plugins.export.ExportOption;
import gwt.material.design.jquery.client.api.Functions;
import jsinterop.annotations.*;

//@formatter:off

/**
 * JSInterop util for {@link ExportOption}
 *
 * @author kevzlou7979@gmail.com
 */
//@formatter:on
@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class AmExportOption {

    @JsProperty
    public String backgroundColor;

    @JsProperty
    public boolean enabled;

    @JsProperty
    public String divId;

    @JsProperty
    public Object fabric;

    @JsProperty
    public Object fallback;

    @JsProperty
    public String fileName;

    @JsProperty
    public Object legend;

    @JsProperty
    public AmExportLib libs;

    @JsProperty
    public Object[] menu;

    @JsProperty
    public Object pdfMake;

    @JsProperty
    public String position;

    @JsProperty
    public boolean removeImages;

    @JsProperty
    public int delay;

    @JsProperty
    public Object[] exportFields;

    @JsProperty
    public boolean exportTitles;

    @JsProperty
    public Object columnNames;

    @JsProperty
    public boolean exportSelection;

    @JsProperty
    public String dataDateFormat;

    @JsProperty
    public String dateFormat;

    @JsProperty
    public boolean keyListener;

    @JsProperty
    public boolean fileListener;

    @JsProperty
    public Object drawing;

    @JsProperty
    public boolean overflow;

    @JsProperty
    public Object border;

    @JsProperty
    public Functions.Func processData;

    @JsProperty
    public boolean pageOrigin;

    @JsProperty
    public boolean forceRemoveImages;

    @JsProperty
    public boolean debug;

    @JsProperty
    public AmExportConfig config;

    /**
     * Returns an array of objects where each element represents an annotation.
     */
    @JsMethod
    public native AnnotationObjectBase[] getAnnotations(AnnotationObjectBase options, Functions.Func1<Object> callback);

    @JsOverlay
    public final AnnotationObjectBase[] getAnnotations() {
        return getAnnotations(null, param1 -> {
        });
    }

    /**
     * Draws the given annotations with automatically toggle annotation.
     */
    @JsOverlay
    public final void setAnnotations(AnnotationObjectBase[] objects) {
        setAnnotations(objects, true);
    }

    /**
     * Draws the given annotations (options.data).
     */
    @JsMethod
    public native void setAnnotations(AnnotationData options, Functions.Func callback);

    /**
     * Will capture the chart.
     */
    @JsMethod
    public native void capture(AmCaptureData capture, Functions.Func callback);

    /**
     * Manage to create the Export Menu.
     */
    @JsMethod
    public native void createMenu(AmExportMenu[] data);

    /**
     * Draws the given annotations with provided callback.
     */
    @JsOverlay
    public final void setAnnotations(AnnotationObjectBase[] objects, Functions.Func callback) {
        AnnotationData annotationData = new AnnotationData();
        annotationData.data = objects;
        setAnnotations(annotationData, callback);
    }

    /**
     * Draws the given annotations.
     */
    @JsOverlay
    public final void setAnnotations(AnnotationObjectBase[] objects, boolean toggleAnnotation) {
        if (toggleAnnotation) {
            enterAnnotationMode();
        }

        setAnnotations(objects, null);
    }

    /**
     * Will automatically load the annotation mode.
     */
    @JsOverlay
    public final void enterAnnotationMode() {
        AmCaptureData amCaptureData = new AmCaptureData();
        amCaptureData.action = "draw";
        capture(amCaptureData, () -> GWT.log("CALLBACK FIRED"));

        AmExportMenu[] exportMenus = config.menu[0].menu[2].menu;
        createMenu(exportMenus);
    }
}
