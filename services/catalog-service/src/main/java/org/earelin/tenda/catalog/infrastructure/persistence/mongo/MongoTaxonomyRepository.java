package org.earelin.tenda.catalog.infrastructure.persistence.mongo;

import org.earelin.tenda.catalog.domain.Taxonomy;
import org.earelin.tenda.catalog.domain.TaxonomyRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MongoTaxonomyRepository implements TaxonomyRepository {
    @Override
    public Taxonomy get() {
        return null;
    }

    @Override
    public void save(Taxonomy taxonomy) {

    }
}
