package com.example;

import java.time.Clock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "controllers", "services", "filters" })
public class PlaySpringDIConfiguration {

	@Bean
	public java.time.Clock getClock() {
		return Clock.systemDefaultZone();
	}

	// @Primary
	// @Bean
	// @org.springframework.core.annotation.Order(1)
	// public play.api.http.HttpErrorHandler
	// errorHandler(play.api.http.DefaultHttpErrorHandler handler,
	// play.api.http.GlobalSettingsHttpErrorHandler ghe,
	// play.api.http.HttpErrorHandler api) {
	// return handler;
	// }
}