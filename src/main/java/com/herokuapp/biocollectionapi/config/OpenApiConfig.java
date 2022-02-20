package com.herokuapp.biocollectionapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI infoApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Biological Collections API") //
                        .license(new License().name("MIT License")) //
                        .version("1.0") //
                        .description("Catalog of the biological collection of the Federal Institute of Espírito Santo Campus Santa Teresa"));
    }

    @Bean
    public GroupedOpenApi biologicalCollectionOpenApi() {
        String[] paths = {"/api/biological-collections/**"};
        return GroupedOpenApi.builder()
                .group("Biological Collections")
                .pathsToMatch(paths)
                .build();
    }
}