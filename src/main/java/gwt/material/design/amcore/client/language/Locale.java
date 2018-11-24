package gwt.material.design.amcore.client.language;

import com.google.gwt.resources.client.TextResource;
import gwt.material.design.amcore.client.properties.ILocale;
import gwt.material.design.amcore.client.resources.LanguageClientBundle;

import static gwt.material.design.jquery.client.api.JQuery.window;

public enum Locale implements LocaleResource {

    de_CH(new LocaleResource() {
        @Override
        public ILocale getValue() {
            return (ILocale) window().getPropertyObject("am4lang_de_CH");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.deCH();
        }
    }),

    de_DE(new LocaleResource() {
        @Override
        public ILocale getValue() {
            return (ILocale) window().getPropertyObject("am4lang_de_DE");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.deDE();
        }
    }),

    en(new LocaleResource() {
        @Override
        public ILocale getValue() {
            return (ILocale) window().getPropertyObject("am4lang_en");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.en();
        }
    }),

    en_CA(new LocaleResource() {
        @Override
        public ILocale getValue() {
            return (ILocale) window().getPropertyObject("am4lang_en_CA");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.enCA();
        }
    }),

    en_US(new LocaleResource() {
        @Override
        public ILocale getValue() {
            return (ILocale) window().getPropertyObject("am4lang_en_US");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.enUS();
        }
    }),

    fr_FR(new LocaleResource() {
        @Override
        public ILocale getValue() {
            return (ILocale) window().getPropertyObject("am4lang_fr_FR");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.frFR();
        }
    }),

    lt_LT(new LocaleResource() {
        @Override
        public ILocale getValue() {
            return (ILocale) window().getPropertyObject("am4lang_lt_LT");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.ltLT();
        }
    }),

    nl_NL(new LocaleResource() {
        @Override
        public ILocale getValue() {
            return (ILocale) window().getPropertyObject("am4lang_nl_NL");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.nlNL();
        }
    }),

    pt_BR(new LocaleResource() {
        @Override
        public ILocale getValue() {
            return (ILocale) window().getPropertyObject("am4lang_pt_BR");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.ptBR();
        }
    }),

    pt_PT(new LocaleResource() {
        @Override
        public ILocale getValue() {
            return (ILocale) window().getPropertyObject("am4lang_pt_PT");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.ptPT();
        }
    }),

    ru_RU(new LocaleResource() {
        @Override
        public ILocale getValue() {
            return (ILocale) window().getPropertyObject("am4lang_ru_RU");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.ruRU();
        }
    }),

    sv_SV(new LocaleResource() {
        @Override
        public ILocale getValue() {
            return (ILocale) window().getPropertyObject("am4lang_sv_SV");
        }

        @Override
        public TextResource getResource() {
            return LanguageClientBundle.INSTANCE.svSV();
        }
    });

    LocaleResource resource;

    Locale(LocaleResource resource) {
        this.resource = resource;
    }

    @Override
    public ILocale getValue() {
        return resource.getValue();
    }

    @Override
    public TextResource getResource() {
        return resource.getResource();
    }
}
