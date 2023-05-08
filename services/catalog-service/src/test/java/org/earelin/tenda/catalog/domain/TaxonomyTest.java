package org.earelin.tenda.catalog.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TaxonomyTest {

    private Taxonomy taxonomy;

    @BeforeEach
    void setUp() {
        taxonomy = new Taxonomy();
    }

    @Test
    void should_set_category_on_constructor() {
        Category category = Category.create(new StringI18n("Kitchenware"));

        taxonomy = new Taxonomy(category);

        assertThat(taxonomy.getRoot())
                .isEqualTo(category);
    }
}