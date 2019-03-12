package com.TravelCosts.TravelCosts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TravelCostsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelCostsApplication.class, args);
		
		
	}
	


}
