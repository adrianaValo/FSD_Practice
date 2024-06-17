package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com") //component scan for @Controller annotation, @service and @Repository
@EntityScan(basePackages = "com.bean") //Enable @Entity annotation
@EnableJpaRepositories(basePackages = "com.dao") // spring JPA data enable
public class SpringBootMvcWithJpaWithThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcWithJpaWithThymeleafApplication.class, args);
	}

}
