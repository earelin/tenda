package org.earelin.tenda.catalog.infrastructure.persistence.mongo;

import java.util.List;
import java.util.UUID;

public record CategoryDto(UUID id, String name, List<CategoryDto> children) {
}
