package org.earelin.tenda.commons;

import java.util.Locale;
import java.util.Map;

public class StringI18n {
    private final String defaultString;

    private Map<Locale, String> translations;

    public StringI18n(String defaultString) {
        this.defaultString = defaultString;
    }

    public void addTranslation(Locale locale, String translation) {
        translations.put(locale, translation);
    }

    public void removeTranslation(Locale locale) {
        translations.remove(locale);
    }

    public String getTranslation(Locale locale) {
        if (!translations.containsKey(locale)) {
            return defaultString;
        }
        return translations.get(locale);
    }

    public String toString() {
        return defaultString;
    }
}
