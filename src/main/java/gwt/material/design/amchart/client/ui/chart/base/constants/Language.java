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
package gwt.material.design.amchart.client.ui.chart.base.constants;

//@formatter:off

import gwt.material.design.amchart.client.ui.chart.resources.ChartLanguageClientBundle;

/**
 * Used by {@link gwt.material.design.amchart.client.ui.chart.base.AbstractChart#setLanguage(Language)}
 *
 * @author kevzlou7979@gmail.com
 */
//@formatter:on
public enum Language {

    AZ("az", ChartLanguageClientBundle.INSTANCE.azJs().getText()),
    BG("bg", ChartLanguageClientBundle.INSTANCE.bgJs().getText()),
    CS("cs", ChartLanguageClientBundle.INSTANCE.csJs().getText()),
    DE("de", ChartLanguageClientBundle.INSTANCE.deJs().getText()),
    ES("es", ChartLanguageClientBundle.INSTANCE.esJs().getText()),
    FI("fi", ChartLanguageClientBundle.INSTANCE.fiJs().getText()),
    FO("fo", ChartLanguageClientBundle.INSTANCE.foJs().getText()),
    FR("fr", ChartLanguageClientBundle.INSTANCE.frJs().getText()),
    HR("hr", ChartLanguageClientBundle.INSTANCE.hrJs().getText()),
    HU("hu", ChartLanguageClientBundle.INSTANCE.huJs().getText()),
    ID("id", ChartLanguageClientBundle.INSTANCE.idJs().getText()),
    IS("is", ChartLanguageClientBundle.INSTANCE.isJs().getText()),
    IT("it", ChartLanguageClientBundle.INSTANCE.itJs().getText()),
    JA("ja", ChartLanguageClientBundle.INSTANCE.jaJs().getText()),
    KO("ko", ChartLanguageClientBundle.INSTANCE.koJs().getText()),
    LT("lt", ChartLanguageClientBundle.INSTANCE.ltJs().getText()),
    LV("lv", ChartLanguageClientBundle.INSTANCE.lvJs().getText()),
    MK("mk", ChartLanguageClientBundle.INSTANCE.mkJs().getText()),
    MN("mn", ChartLanguageClientBundle.INSTANCE.mnJs().getText()),
    MT("mt", ChartLanguageClientBundle.INSTANCE.mtJs().getText()),
    NL("nl", ChartLanguageClientBundle.INSTANCE.nlJs().getText()),
    NO("no", ChartLanguageClientBundle.INSTANCE.noJs().getText()),
    PL("pl", ChartLanguageClientBundle.INSTANCE.plJs().getText()),
    PT("pt", ChartLanguageClientBundle.INSTANCE.ptJs().getText()),
    RO("ro", ChartLanguageClientBundle.INSTANCE.roJs().getText()),
    RU("ru", ChartLanguageClientBundle.INSTANCE.ruJs().getText()),
    RW("rw", ChartLanguageClientBundle.INSTANCE.rwJs().getText()),
    SK("sk", ChartLanguageClientBundle.INSTANCE.skJs().getText()),
    SL("sl", ChartLanguageClientBundle.INSTANCE.slJs().getText()),
    SO("so", ChartLanguageClientBundle.INSTANCE.soJs().getText()),
    TH("th", ChartLanguageClientBundle.INSTANCE.thJs().getText()),
    TR("tr", ChartLanguageClientBundle.INSTANCE.trJs().getText()),
    ZH("zh", ChartLanguageClientBundle.INSTANCE.zhJs().getText());

    private String name;
    private String jsResource;

    Language(String name, String jsResource) {
        this.name = name;
        this.jsResource = jsResource;
    }

    public String getName() {
        return name;
    }

    public String getJsResource() {
        return jsResource;
    }
}
