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
package gwt.material.design.amcore.client.base;

import gwt.material.design.amcore.client.dataitem.DataItem;
import gwt.material.design.amcore.client.adapter.Adapter;
import gwt.material.design.amcore.client.animation.Animation;
import gwt.material.design.amcore.client.color.DesaturateFilter;
import gwt.material.design.amcore.client.constants.Align;
import gwt.material.design.amcore.client.constants.Valign;
import gwt.material.design.amcore.client.events.SpriteEventDispatcher;
import gwt.material.design.amcore.client.export.Export;
import gwt.material.design.amcore.client.formatter.DateFormatter;
import gwt.material.design.amcore.client.formatter.NumberFormatter;
import gwt.material.design.amcore.client.list.DictionaryTemplate;
import gwt.material.design.amcore.client.list.ListTemplate;
import gwt.material.design.amcore.client.properties.Point;
import gwt.material.design.amcore.client.properties.SpriteAnimationOptions;
import gwt.material.design.amcore.client.properties.SpriteProperties;
import gwt.material.design.amcore.client.properties.SpritePropertyField;
import gwt.material.design.jscore.client.api.core.Element;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


@JsType(isNative = true, namespace = "am4core")
public class Sprite extends BaseObjectsEvents {

    @JsProperty
    public Adapter adapter;

    /**
     * @see Align
     */
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

    @JsProperty
    public DataItem dataItem;

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

    /**
     * @see gwt.material.design.amcore.client.constants.HorizontalCenter
     */
    @JsProperty
    public String horizontalCenter;

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

    @JsProperty
    public Language language;

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

    //TODO: SpriteProperties properties

    @JsProperty
    public SpritePropertyField propertyFields;

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

    @JsProperty
    public DictionaryTemplate<String, SpriteProperties> states;

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

    @JsProperty
    public Tooltip tooltip;

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

    /**
     * @see Valign
     */
    @JsProperty
    public String valign;

    /**
     * @see gwt.material.design.amcore.client.constants.VerticalCenter
     */
    @JsProperty
    public String verticalCenter;

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
    public ListTemplate<DesaturateFilter> filters;

    @JsMethod
    public native Animation animate(SpriteAnimationOptions[] animationOptions, int duration);

    @JsMethod
    public native Animation animate(SpriteAnimationOptions[] animationOptions, int duration, Object easing);

    @JsMethod
    public native void appear();

    @JsMethod
    public native Animation applyCurrentState();

    @JsMethod
    public native Animation applyCurrentState(Number duration);

    @JsMethod
    public native void closeAllPopups();

    @JsMethod
    public native void closeModal();

    @JsMethod
    public native void copyFrom(Sprite source);

    @JsMethod
    public native void dispose();

    /*TODO:
    @JsMethod
    public native ITheme[] getCurrentThemes;*/

    @JsMethod
    public native Number getPixelX(Number value);

    @JsMethod
    public native Number getPixelY(Number value);

    @JsMethod
    public native Object getPropertyValue(String propertyName);

    @JsMethod
    public native Number getRelativeX(Number value);

    @JsMethod
    public native Number getRelativeY(Number value);

    @JsMethod
    public native Point getSvgPoint(Point point);

    @JsMethod
    public native void hide();

    @JsMethod
    public native void hide(Number duration);

    @JsMethod
    public native void hideTooltip();

    @JsMethod
    public native void hideTooltip(Number duration);

    @JsMethod
    public native boolean hitTest(Sprite sprite);

    @JsMethod
    public native Sprite insertAfter(Sprite sprite);

    @JsMethod
    public native Sprite insertBefore(Sprite sprite);

    @JsMethod
    public native void invalidate();

    @JsMethod
    public native boolean isInTransition();

    @JsMethod
    public native boolean isInteractive();

    @JsMethod
    public native boolean isReady();

    @JsMethod
    public native Sprite margin(Number top, Number right, Number bottom, Number left);

    @JsMethod
    public native void moveTo(Point point);

    @JsMethod
    public native void moveTo(Point point, Number rotation, Number scale, boolean isDragged);

    @JsMethod
    public native void openModal(String text);

    @JsMethod
    public native void openModal(String text, String title);

    @JsMethod
    public native void openPopup(String text);

    @JsMethod
    public native void openPopup(String text, String title);

    @JsMethod
    public native Sprite padding(Number top, Number right, Number bottom, Number left);

    @JsMethod
    public native void setElement(AMElement element);

    @JsMethod
    public native boolean setPropertyValue(String property, Object value);

    @JsMethod
    public native boolean setPropertyValue(String property, Object value, boolean invalidate, boolean transform);

   /*TODO:
    @JsMethod
    public native Animation setState(Object value)*/

    @JsMethod
    public native void setVisibility(boolean value);

    @JsMethod
    public native void show();

    @JsMethod
    public native void show(Number duration);

    @JsMethod
    public native void showTooltip();


    @JsMethod
    public native void showTooltip(Point point);

    @JsMethod
    public native void toBack();

    @JsMethod
    public native void toFront();

    @JsMethod
    public native void removeChildren();
}
