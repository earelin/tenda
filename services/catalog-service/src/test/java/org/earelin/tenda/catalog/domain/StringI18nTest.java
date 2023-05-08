package org.earelin.tenda.catalog.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class StringI18nTest {

    private static final String DEFAUL_STRING = "default";

    StringI18n stringI18n;

    @BeforeEach
    void setUp() {
        stringI18n = new StringI18n(DEFAUL_STRING);
        stringI18n.addTranslation("es", "por defecto");
    }

    @Test
    void should_create_with_translations() {
        StringI18n stringI18n = new StringI18n(DEFAUL_STRING, Map.of("es", "por defecto"));
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
                .isEqualTo(DEFAUL_STRING);
    }

    @Test
    void should_remove_translation() {
        stringI18n.removeTranslation("es");
        assertThat(stringI18n.getTranslation("es"))
                .isEqualTo(DEFAUL_STRING);
    }

    @Test
    void should_be_equal_to_object_with_same_default_string() {
        assertThat(stringI18n.equals(new StringI18n(DEFAUL_STRING)))
                .isTrue();
    }

    @Test
    void should_not_be_equal_to_object_with_same_default_string() {
        assertThat(stringI18n.equals(new StringI18n("another string")))
                .isFalse();
    }

    @Test
    void should_have_equal_hashcode_with_same_default_string() {
        assertThat(stringI18n.hashCode())
                .isEqualTo(new StringI18n(DEFAUL_STRING).hashCode());
    }
}
