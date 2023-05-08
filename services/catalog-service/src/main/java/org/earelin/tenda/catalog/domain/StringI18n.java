package org.earelin.tenda.catalog.domain;

import java.util.HashMap;
import java.util.Map;

public class StringI18n {
    private final String defaultString;

    private final Map<String, String> translations = new HashMap<>();

    public StringI18n(String defaultString) {
        this.defaultString = defaultString;
    }

    public StringI18n(String defaultString, Map<String, String> translations) {
        this.defaultString = defaultString;
        this.translations.putAll(translations);
    }

    public void addTranslation(String language, String translation) {
        translations.put(language, translation);
    }

    public void removeTranslation(String language) {
        translations.remove(language);
    }

    public String getTranslation(String language) {
        if (!translations.containsKey(language)) {
            return defaultString;
        }
        return translations.get(language);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StringI18n) {
            return defaultString.equals(((StringI18n) obj).defaultString);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return defaultString.hashCode();
    }

    @Override
    public String toString() {
        return defaultString;
    }
}
