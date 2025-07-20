package com.example.usermanagement.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.License;

import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "My Spring Boot API",
        version = "1.0",
        description = "API documentation for My Spring Boot app",
        contact = @Contact(name = "Sudhir Rakholiya", email = "you@example.com"),
        license = @License(name = "Apache 2.0", url = "http://springdoc.org")
    )
)
public class SwaggerConfig {
}
