package gwt.material.design.amcore.client.language;

import com.google.gwt.resources.client.TextResource;
import gwt.material.design.amcore.client.properties.ILocale;

import java.io.Serializable;

public interface LocaleResource extends Serializable {

    ILocale getValue();
    TextResource getResource();
}
