package gwt.material.design.amcore.client.language;

import com.google.gwt.resources.client.TextResource;
import gwt.material.design.amcore.client.properties.Locale;

import java.io.Serializable;

public interface LocaleResource extends Serializable {

    Locale getValue();
    TextResource getResource();
}
