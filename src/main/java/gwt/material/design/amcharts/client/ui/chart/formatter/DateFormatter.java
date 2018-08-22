package gwt.material.design.amcharts.client.ui.chart.formatter;

import gwt.material.design.amcharts.client.ui.chart.base.BaseObject;
import gwt.material.design.amcharts.client.ui.chart.base.Sprite;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class DateFormatter extends BaseObject {

    /**
     * Should the first letter of the formatted date be capitalized?
     * <p>
     * Default true
     */
    @JsProperty
    public boolean capitalize;

    /**
     * Date format to use.
     * <p>
     * If format is not supplied in-line in the string, this setting will be used.
     * <p>
     * Default "yyyy-MM-dd"
     */
    @JsProperty
    public String dateFormat;

    /**
     * First day of the week:
     * <li>0 - Sunday</li>
     * <li>1 - Monday</li>
     * <li>2 - Tuesday</li>
     */
    @JsProperty
    public int firstDayOfWeek;

    /**
     * Date format to use when parsing dates.
     */
    @JsProperty
    public String inputDateFormat;

    //TODO
    /*@JsProperty
    public Language language;*/

    /**
     * Holds reference to parent {@link Sprite} object.
     */
    @JsProperty
    public Sprite sprite;

    /**
     * Should formatter use UTC functions?
     * <p>
     * If UTC is used, all date/time values will be independent on client's time zone.
     */
    @JsProperty
    public boolean utc;
}
