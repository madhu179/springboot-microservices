package com.microservice.departmentservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@OpenAPIDefinition(
		info = @Info(
				title = "Department Service Rest APIs",
				description = "Department Service Rest APIs Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Dev",
						email = "dev@gmail.com",
						url = "https://www.devvw.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.devvw.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Department-Service Doc",
				url = "https://www.devvw.com"
		)
)
@SpringBootApplication
public class DepratmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepratmentServiceApplication.class, args);
	}

}
