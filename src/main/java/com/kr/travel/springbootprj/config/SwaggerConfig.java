package com.kr.travel.springbootprj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SwaggerConfig {

  @Bean
  OpenAPI customOpenAPI() {
    return new OpenAPI()
        .info(new Info().title("Travel API").version("1.0.0").description("Travel API 문서"))
        .addSecurityItem(new SecurityRequirement().addList("Authorization"))
        .components(new Components().addSecuritySchemes("Authorization",
            new SecurityScheme().name("Authorization").type(SecurityScheme.Type.HTTP)
                .scheme("bearer").bearerFormat("JWT")));
  }
}
