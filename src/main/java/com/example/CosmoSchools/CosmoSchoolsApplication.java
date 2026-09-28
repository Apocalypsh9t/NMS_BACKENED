package com.example.CosmoSchools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // necesario para el chequeo periódico de solicitudes atrasadas
public class CosmoSchoolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CosmoSchoolsApplication.class, args);
	}

}
