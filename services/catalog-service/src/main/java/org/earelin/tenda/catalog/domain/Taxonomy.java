package org.earelin.tenda.catalog.domain;

public class Taxonomy {
    private Category root = null;

    public Taxonomy() {}

    public Taxonomy(Category root) {
        this.root = root;
    }

    public void setRoot(Category category) {
        root = category;
    }

    public Category getRoot() {
        return root;
    }
}
