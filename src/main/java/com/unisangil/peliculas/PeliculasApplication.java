package com.unisangil.peliculas;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Backend Peliculas",version = "0.0.2",description = "ApiRest para gestionar peliculas"))
public class PeliculasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeliculasApplication.class, args);
	}

}
