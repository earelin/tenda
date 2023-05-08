package org.earelin.tenda.catalog.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class CategoryTest {

    private static final UUID CATEGORY_ID = UUID.randomUUID();
    private static final StringI18n CATEGORY_NAME = new StringI18n("Kitchenware");

    private Category category;

    @BeforeEach
    void setUp() {
        category = new Category(CATEGORY_ID, CATEGORY_NAME);
    }

    @Test
    void should_build_from_string() {
        Category category = Category.create(CATEGORY_NAME);

        assertThat(category.getId())
                .isNotNull();
        assertThat(category.getName())
                .isEqualTo(CATEGORY_NAME);
    }

    @Test
    void should_add_children() {
        Category child = Category.create(new StringI18n("Knives"));
        category.addChildren(child);

        assertThat(category.getChildren())
                .contains(child);
        assertThat(child.getParent())
                .isEqualTo(category);
    }

    @Test
    void should_remove_children() {
        Category child = Category.create(new StringI18n("Knives"));
        category.addChildren(child);
        category.removeChildren(child);

        assertThat(category.getChildren())
                .doesNotContain(child);
    }

    @Test
    void should_be_equal_with_same_id() {
        Category category = new Category(CATEGORY_ID, new StringI18n("Furniture"));

        assertThat(category.equals(this.category))
                .isTrue();
    }

    @Test
    void should_not_be_equal_with_different_id() {
        Category category = new Category(UUID.randomUUID(), new StringI18n("Furniture"));

        assertThat(category.equals(this.category))
                .isFalse();
    }

    @Test
    void should_have_same_hascode_with_same_id() {
        Category category = new Category(CATEGORY_ID, new StringI18n("Furniture"));

        assertThat(category.hashCode())
                .isEqualTo(this.category.hashCode());
    }
}
