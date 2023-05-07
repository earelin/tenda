package org.earelin.tenda.catalog.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class StringI18nTest {

    StringI18n stringI18n;

    @BeforeEach
    void setUp() {
        stringI18n = new StringI18n("default");
        stringI18n.addTranslation("es", "por defecto");
    }

    @Test
    void should_create_with_translations() {
        StringI18n stringI18n = new StringI18n("default", Map.of("es", "por defecto"));
        assertThat(stringI18n.getTranslation("es"))
                .isEqualTo("por defecto");
    }

    @Test
    void should_resolve_translation() {
        assertThat(stringI18n.getTranslation("es"))
                .isEqualTo("por defecto");
    }

    @Test
    void should_return_default_string_if_translation_not_found() {
        assertThat(stringI18n.getTranslation("fr"))
                .isEqualTo("default");
    }

    @Test
    void should_remove_translation() {
        stringI18n.removeTranslation("es");
        assertThat(stringI18n.getTranslation("es"))
                .isEqualTo("default");
    }

}
