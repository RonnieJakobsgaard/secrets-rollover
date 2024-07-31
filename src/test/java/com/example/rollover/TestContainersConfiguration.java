package com.example.rollover;

import dasniko.testcontainers.keycloak.KeycloakContainer;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@TestConfiguration(proxyBeanMethods = false)
class TestContainersConfiguration {

    @Bean
    @Scope("singleton")
    KeycloakContainer keycloakContainer() {
        var keycloak = new KeycloakContainer("quay.io/keycloak/keycloak:25.0.2")
                .withRealmImportFile("realms.json")
                .withReuse(true);

        return keycloak;
    }
}
