package org.earelin.tenda.catalog.domain;

import org.javamoney.moneta.FastMoney;

import java.util.UUID;

public class Product {
    private final UUID id;
    private Category category;
    private StringI18n description;
    private StringI18n name;
    private FastMoney price;

    public Product(UUID id, Category category, StringI18n description, StringI18n name, FastMoney price) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.name = name;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public StringI18n getDescription() {
        return description;
    }

    public void setDescription(StringI18n description) {
        this.description = description;
    }

    public StringI18n getName() {
        return name;
    }

    public void setName(StringI18n name) {
        this.name = name;
    }

    public FastMoney getPrice() {
        return price;
    }

    public void setPrice(FastMoney price) {
        this.price = price;
    }
}
