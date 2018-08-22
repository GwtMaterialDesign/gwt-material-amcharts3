package gwt.material.design.amcharts.client.ui.chart.base;

import gwt.material.design.amcharts.client.ui.chart.adapter.Adapter;
import gwt.material.design.amcharts.client.ui.chart.animation.Animation;
import gwt.material.design.amcharts.client.ui.chart.export.Export;
import gwt.material.design.amcharts.client.ui.chart.formatter.DateFormatter;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Sprite represents any displayable element.
 * <p>
 * This is the main class that encapsulates every object on the chart.
 * <p>
 * If it's an element that is to be displayed on the screen at some point, its class must extend Sprite class.
 * <p>
 * Sprite class represents the a hierarchical structure. Every object that extends Sprite can have children, that would
 * inherit their properties, such as language, formatters, etc.
 *
 * @author kevzlou7979
 */
@JsType(isNative = true, namespace = "am4core")
public class Sprite {

    /**
     * Holds Adapter.
     */
    @JsProperty
    public Adapter adapter;

    @JsProperty
    public Export exporting;

    /**
     * Controls horizontal alignment of the element.
     * <p>
     * This is used by parent {@link Container} when layouting its children.
     * <p>
     * Accepted values are in {@link gwt.material.design.amcharts.client.ui.chart.constants.Align} interface
     * </p>
     */
    @JsProperty
    public String align;

    /**
     * Returns a list elements's animations currently being played.
     * <p>
     * If the list has not been initialized it is created.
     */
    @JsProperty
    public Animation[] animation;

    /**
     * Specifies if a property changes on this object should be propaged to the objects cloned from this object.
     * <p>
     * This setting affects property changes *after* cloning, since at the moment of cloning all of properties from source
     * object are copied to the clone anyway.
     */
    @JsProperty
    public boolean applyOnClones;

    /**
     * Indicates if the element is clickable.
     * <p>
     * Some times of the elements, like buttons are clickable by default.
     * <p>
     * Most of the elements are not clickable by default.
     * <p>
     * Use hit, doublehit, up, down, toggled events to watch for respective click/touch actions.
     */
    @JsProperty
    public boolean clickable;

    /**
     * A field in data context of element's dataItem that holds config values for this element.
     * <p>
     * This is a very powerful feature, allowing changing virtually any setting, including those for element's children,
     * for the element via data.
     */
    @JsProperty
    public String configField;

    //TODO
    /*@JsProperty
    public IStyleProperty cursorDownStyle;*/

    @JsProperty
    public Object width;

    @JsProperty
    public Object height;

    @JsProperty
    public String valign;

    @JsProperty
    public int strokeWidth;

    @JsProperty
    public Color fill;

    @JsProperty
    public Color stroke;

    @JsProperty
    public DateFormatter dateFormatter;

    @JsProperty
    public int zIndex;

    @JsMethod
    public native void hide();


}
