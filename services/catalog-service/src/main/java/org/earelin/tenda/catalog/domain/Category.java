package org.earelin.tenda.catalog.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Category {
    private final UUID id;
    private final StringI18n name;
    private Category parent = null;
    private final List<Category> children = new ArrayList<>();

    public static Category create(StringI18n name) {
        return new Category(UUID.randomUUID(), name);
    }

    public Category(UUID uuid, StringI18n name) {
        this.id = uuid;
        this.name = name;
    }

    public void addChildren(Category category) {
        category.setParent(this);
        children.add(category);
    }

    public List<Category> getChildren() {
        return new ArrayList<>(children);
    }

    public void removeChildren(Category category) {
        children.remove(category);
        category.setParent(null);
    }

    private void setParent(Category category) {
        parent = category;
    }

    public Category getParent() {
        return parent;
    }

    public StringI18n getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
