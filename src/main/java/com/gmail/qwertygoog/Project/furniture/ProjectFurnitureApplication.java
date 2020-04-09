package com.gmail.qwertygoog.Project.furniture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

/*
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
*/
@SpringBootApplication
public class ProjectFurnitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectFurnitureApplication.class, args);
	}

}
