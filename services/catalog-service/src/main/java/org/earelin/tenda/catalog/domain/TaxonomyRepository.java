package org.earelin.tenda.catalog.domain;

public interface TaxonomyRepository {
    Taxonomy get();

    void save(Taxonomy taxonomy);
}
