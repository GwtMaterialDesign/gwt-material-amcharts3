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
package gwt.material.design.amcharts.client.ui.chart.base;

import gwt.material.design.amcharts.client.ui.chart.adapter.Adapter;
import gwt.material.design.amcharts.client.ui.chart.animation.Animation;
import gwt.material.design.amcharts.client.ui.chart.dictionary.DictionaryTemplate;
import gwt.material.design.amcharts.client.ui.chart.events.SpriteEventDispatcher;
import gwt.material.design.amcharts.client.ui.chart.export.Export;
import gwt.material.design.amcharts.client.ui.chart.filter.DesaturateFilter;
import gwt.material.design.amcharts.client.ui.chart.formatter.DateFormatter;
import gwt.material.design.amcharts.client.ui.chart.formatter.NumberFormatter;
import gwt.material.design.amcharts.client.ui.chart.state.SpriteState;
import gwt.material.design.jscore.client.api.core.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true, namespace = "am4core")
public class Sprite extends BaseObjectsEvents {

    @JsProperty
    public Adapter adapter;

    @JsProperty
    public String align;

    @JsProperty
    public Animation[] animations;

    @JsProperty
    public boolean appeared;

    @JsProperty
    public boolean applyOnClones;

    @JsProperty
    public String baseId;

    @JsProperty
    public Object configField;

    //TODO: IStyleProperty[] cursorDownStyle;

    //TODO: ICursorOptions cursorOptions;

    //TODO: IStyleProperty[] cursorOverStyle;

    //TODO: DataItem dataItem;

    @JsProperty
    public DateFormatter dateFormatter;

    //TODO: Sprite State defaultState

    @JsProperty
    public boolean disabled;

    //TODO: SVGSVGElement dom

    @JsProperty
    public boolean draggable;

    @JsProperty
    public Object dummyData;

    //TODO: DurationFormatter durationFormatter

    @JsProperty
    public Number dx;

    @JsProperty
    public Number dy;

    //TODO: AMElement element;

    @JsProperty
    public SpriteEventDispatcher events;

    @JsProperty
    public Number ex;

    @JsProperty
    public boolean exportable;

    @JsProperty
    public Export exporting;

    @JsProperty
    public Number ey;

    @JsProperty
    public Object fill;

    //TODO: ColorModifier fillModifier

    @JsProperty
    public Number fillOpacity;

    // List<Filter> filters

    @JsProperty
    public boolean focusable;

    @JsProperty
    public Number globalScale;

    //TODO Group group

    @JsProperty
    public Object height;

    @JsProperty
    public boolean hidden;

    //TODO: SpriteState hiddenState

    //TODO: IHitOptions hitOptions

    //TODO: HorizontalCenter horizontalCenter

    @JsProperty
    public boolean hoverOnFocus;

    //TODO: IHoverOptions hoverOptions

    @JsProperty
    public boolean hoverable;

    @JsProperty
    public Element htmlContainer;

    @JsProperty
    public String id;

    @JsProperty
    public boolean inert;

    //TODO: Dictionary InertialOptions

    @JsProperty
    public boolean inited;

    @JsProperty
    public Number innerHeight;

    @JsProperty
    public Number innerWidth;

    //TODO: InteractioObject interactions

    @JsProperty
    public boolean interactionsEnabled;

    @JsProperty
    public boolean isActive;

    @JsProperty
    public boolean isDown;

    @JsProperty
    public boolean isDragged;

    @JsProperty
    public boolean isFocused;

    @JsProperty
    public boolean isHidden;

    @JsProperty
    public boolean isHiding;

    @JsProperty
    public boolean isHover;

    @JsProperty
    public boolean isShowing;

    //TODO: IKeyboardOptions keyboardOptions

    //TODO: Language language

    @JsProperty
    public Object marginBottom;

    @JsProperty
    public Object marginLeft;

    @JsProperty
    public Object marginRight;

    @JsProperty
    public Object marginTop;

    @JsProperty
    public Number maxHeight;

    @JsProperty
    public Number maxWidth;

    @JsProperty
    public Number measuredHeight;

    @JsProperty
    public Number measuredWidth;

    @JsProperty
    public Number minHeight;

    @JsProperty
    public Number minWidth;

    //TODO: Modal modal

    @JsProperty
    public boolean nonScaling;

    @JsProperty
    public boolean nonScalingStroke;

    @JsProperty
    public NumberFormatter numberFormatter;

    @JsProperty
    public Number opacity;

    @JsProperty
    public Number outerHeight;

    @JsProperty
    public Number outerWidth;

    @JsProperty
    public Object paddingBottom;

    @JsProperty
    public Object paddingLeft;

    @JsProperty
    public Object paddingRight;

    @JsProperty
    public Object paddingTop;

    @JsProperty
    public Container parent;

    @JsProperty
    public String path;

    @JsProperty
    public Number pixelHeight;

    @JsProperty
    public Number pixelMarginBottom;

    @JsProperty
    public Number pixelMarginLeft;

    @JsProperty
    public Number pixelMarginRight;

    @JsProperty
    public Number pixelMarginTop;

    @JsProperty
    public Number pixelPaddingBottom;

    @JsProperty
    public Number pixelPaddingLeft;

    @JsProperty
    public Number pixelPaddingRight;

    @JsProperty
    public Number pixelPaddingTop;

    @JsProperty
    public boolean pixelPerfect;

    @JsProperty
    public Number pixelWidth;

    @JsProperty
    public Number pixelX;

    @JsProperty
    public Number pixelY;

    //TODO: ListTemplate<Popup> popups

    //TODO: ISpriteProperties properties

    @JsProperty
    public Object propertyFields;

    @JsProperty
    public String readerDescription;

    @JsProperty
    public boolean readerHidden;

    @JsProperty
    public String readerTitle;

    @JsProperty
    public Object realFill;

    @JsProperty
    public Object realStroke;

    @JsProperty
    public Number relativeMarginBottom;

    @JsProperty
    public Number relativeMarginLeft;

    @JsProperty
    public Number relativeMarginRight;

    @JsProperty
    public Number relativeMarginTop;

    @JsProperty
    public Number relativePaddingBottom;

    @JsProperty
    public Number relativePaddingLeft;

    @JsProperty
    public Number relativePaddingRight;

    @JsProperty
    public Number relativePaddingTop;

    @JsProperty
    public Number relativeX;

    @JsProperty
    public Number relativeY;

    @JsProperty
    public boolean resizable;

    //TODO: Roles role

    @JsProperty
    public Number rollOutDelay;

    @JsProperty
    public Number rotation;

    @JsProperty
    public boolean rtl;

    @JsProperty
    public Number scale;

    //TODO: ShapeRendering shapeRendering

    @JsProperty
    public boolean shouldClone;

    @JsProperty
    public boolean showOnInit;

    @JsProperty
    public boolean showSystemTooltip;

    //TODO: Sprite Stats states

    @JsProperty
    public Object stroke;

    @JsProperty
    public String strokeDasharray;

    //TODO: ColorModifier strokeModifier

    @JsProperty
    public Number strokeOpacity;

    @JsProperty
    public Number strokeWidth;

    //TODO: SVGCOntainer svgContainer

    //TODO: Swipe Options

    @JsProperty
    public boolean swipeable;

    @JsProperty
    public Number tabindex;

    @JsProperty
    public boolean togglable;

    //TODO: TOoltip tooltip

    //TODO: Sprite tooltipColorSource

    //TODO: DataItem tooltipDataItem

    //TODO: tooltipPosition

    @JsProperty
    public String tooltipText;

    @JsProperty
    public String tooltipHTML;

    @JsProperty
    public boolean trackable;

    @JsProperty
    public String url;

    @JsProperty
    public String urlTarget;

    @JsProperty
    public String valign;

    //TODO: VerticalCenter verticalCenter ;

    @JsProperty
    public boolean visible;

    @JsProperty
    public boolean wheelable;

    @JsProperty
    public Object width;

    @JsProperty
    public Object x;

    @JsProperty
    public Object y;

    @JsProperty
    public Number zIndex;

    @JsProperty
    public boolean clickable;


    /////////////////////////////////


    @JsProperty
    public DictionaryTemplate<SpriteState> states;

    @JsProperty
    public ListTemplate<DesaturateFilter> filters;

    @JsMethod
    public native void hide();

    @JsMethod
    public native void removeChildren();
}
