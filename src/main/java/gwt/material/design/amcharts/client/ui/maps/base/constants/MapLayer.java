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
package gwt.material.design.amcharts.client.ui.maps.base.constants;

import gwt.material.design.amcharts.client.ui.maps.resources.MapLayerClientBundle;

import javax.annotation.Generated;

@Generated(value = "MapLayerGenerator", date = "2018-02-07T06:40:07Z")
public enum MapLayer {

    
    CANADA_LOW("canadaLow", MapLayerClientBundle.INSTANCE.canadaLowJs().getText()),

    FRANCE_LOW("franceLow", MapLayerClientBundle.INSTANCE.franceLowJs().getText()),

    PHILIPPINES_LOW("philippinesLow", MapLayerClientBundle.INSTANCE.philippinesLowJs().getText()),

    USA2_LOW("usa2Low", MapLayerClientBundle.INSTANCE.usa2LowJs().getText()),

    USA_LOW("usaLow", MapLayerClientBundle.INSTANCE.usaLowJs().getText()),

    USA_TERRITORIES_LOW("usaTerritoriesLow", MapLayerClientBundle.INSTANCE.usaTerritoriesLowJs().getText()),

    WORLD_LOW("worldLow", MapLayerClientBundle.INSTANCE.worldLowJs().getText());


    String name;
    String jsResource;

    MapLayer(String name, String jsResource) {
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
