package org.earelin.tenda.catalog;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.library.Architectures;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

public class ArchitecturalTest {

    private static JavaClasses classes;

    @BeforeAll
    static void beforeAll() {
        classes = new ClassFileImporter()
                .importPackages("org.earelin.tenda.catalog");
    }

    @Test
    void should_check_layers() {
        var layeredArchitecture =
                layeredArchitecture()
                        .consideringAllDependencies()
                        .layer("Application").definedBy("org.earelin.tenda.catalog.application..")
                        .layer("Domain").definedBy("org.earelin.tenda.catalog.domain..")
                        .layer("Infrastructure").definedBy("org.earelin.tenda.catalog.infrastructure..")
                        .whereLayer("Application").mayNotBeAccessedByAnyLayer()
                        .whereLayer("Domain").mayOnlyBeAccessedByLayers("Application", "Infrastructure")
                        .whereLayer("Infrastructure").mayOnlyBeAccessedByLayers("Domain");
        layeredArchitecture.check(classes);
    }
}
