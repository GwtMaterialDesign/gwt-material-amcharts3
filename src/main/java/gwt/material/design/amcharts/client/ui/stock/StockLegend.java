package gwt.material.design.amcharts.client.ui.stock;

import gwt.material.design.amcharts.client.ui.chart.options.Legend;
import gwt.material.design.amcharts.client.ui.stock.js.AmStockLegend;

/**
 * AmStockLegend is a legend of AmStockPanel.
 *
 * @author kevzlou7979@gmail.com
 * @see <a href="https://docs.amcharts.com/3/javascriptstockchart/StockLegend">Official Documentation</a>
 */
//@formatter:on
public class StockLegend extends Legend {

    private AmStockLegend amStockLegend;


    public String getPeriodValueTextComparing() {
        return getAmLegend().periodValueTextComparing;
    }

    /**
     * The text which will be displayed in the value portion of the legend when user is not hovering above any data
     * point and the data sets are compared. The tags should be made out of two parts - the name of a field
     * (value / open / close / high / low) and the value of the period you want to be show - open / close / high /
     * low / sum / average / count. For example: [[value.sum]] means that sum of all data points of value field in the
     * selected period will be displayed. In case you want to display percent values, you should add "percent" string
     * in front of a tag, for example: [[percents.value.close]] means that last percent value of a period will be displayed.
     */
    public void setPeriodValueTextComparing(String periodValueTextComparing) {
        getAmLegend().periodValueTextComparing = periodValueTextComparing;
    }


    public String getPeriodValueTextRegular() {
        return getAmLegend().periodValueTextRegular;
    }

    /**
     * The text which will be displayed in the value portion of the legend when user is not hovering above any data point.
     * The tags should be made out of two parts - the name of a field (value / open / close / high / low) and the value
     * of the period you want to be show - open / close / high / low / sum / average / count. For example: [[value.sum]]
     * means that sum of all data points of value field in the selected period will be displayed.
     */
    public void setPeriodValueTextRegular(String periodValueTextRegular) {
        getAmLegend().periodValueTextRegular = periodValueTextRegular;
    }


    public String getValueTextComparing() {
        return getAmLegend().valueTextComparing;
    }

    /**
     * The text which will be displayed in the value portion of the legend when graph is comparable and at least one
     * dataSet is selected for comparing. You can use tags like [[value]], [[open]], [[high]], [[low]], [[close]],
     * [[percents.value/open/close/low/high]], [[description]]. Default to "[[percents.value]]%"
     */
    public void setValueTextComparing(String valueTextComparing) {
        getAmLegend().valueTextComparing = valueTextComparing;
    }


    public String getValueTextRegular() {
        return getAmLegend().valueTextRegular;
    }

    /**
     * The text which will be displayed in the value portion of the legend. You can use tags like [[value]], [[open]],
     * [[high]], [[low]], [[close]], [[percents]], [[description]]. Default to "[[value]]"
     */
    public void setValueTextRegular(String valueTextRegular) {
        getAmLegend().valueTextRegular = valueTextRegular;
    }

    @Override
    public AmStockLegend getAmLegend() {
        if (amStockLegend == null) {
            amStockLegend = new AmStockLegend();
        }
        return amStockLegend;
    }
}
