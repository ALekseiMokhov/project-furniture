package com.gmail.qwertygoog.Project.furniture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

/*
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
*/
@ComponentScan
@SpringBootApplication
public class ProjectFurnitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectFurnitureApplication.class, args);
	}

}
