package gwt.material.design.amcharts.client.ui.chart.base;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Represents a color.
 *
 * @author kevzlou7979
 */
@JsType(isNative = true, namespace = "am4core", name = "color")
public class Color {

    public Color() {}

    @JsConstructor
    public Color(String color) {}

    /**
     * Set alpha (transparency) of the color.
     * <p>
     * Returns current transparency.
     */
    @JsProperty
    public int alpha;

    /**
     * Returns a either light or dark color that contrasts specifically with this color.
     * <p>
     * Uses properties darkColor (default black) and lightColor (default white).
     * <p>
     * Useful when determining which color label should be on a colored background, so that it stands out.
     */
    @JsProperty
    public Color alternative;

    /**
     * Sets "dark" color. Used when determining contrasting color.
     * <p>
     * Returns current dark color setting.
     */
    @JsProperty
    public Color darkColor;

    /**
     * Returns color hex value string, e.g. "#FF0000".
     */
    @JsProperty
    public String hex;

    /**
     * Sets "light" color. Used when determining contrasting color.
     * <p>
     * Returns current light color setting.
     */
    @JsProperty
    public Color lightColor;

    /**
     * Returns an rgba() representation of the color, e.g.:
     */
    @JsProperty
    public String rgba;

    /**
     * Returns a new Color which is percent brighter (positive value), or darker (negative value).
     * <p>
     * Parameter is in the scale of -1 to 1.
     */
    @JsMethod
    public native Color brighten(double percent);

    /**
     * Returns a new Color which is percent lighter (positive value), or darker (negative value).
     * <p>
     * Parameter is in the scale of -1 to 1.
     */
    @JsMethod
    public native Color lighten(double percent);

    /**
     * Returns a new Color based on current color with specific saturation applied.
     * <p>
     * saturation can be in the range of 0 (fully desaturated) to 1 (fully saturated).
     */
    @JsMethod
    public native Color saturate(double saturation);
}
