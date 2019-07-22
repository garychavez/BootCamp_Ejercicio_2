package com.everis.bootcamp.model.variable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	@Bean("variable")
	public RestTemplate registarRestTemplate() {
		return new RestTemplate();

	}
}
