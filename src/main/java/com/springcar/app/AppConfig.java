package com.springcar.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springcar.app.controllers.beans.LoginBean;
import com.springcar.app.models.entity.Reservation;


@Configuration
public class AppConfig {
	
	@Bean
	public LoginBean myBean() {
		return new LoginBean();
	}
	
	@Bean
	public Reservation myRent() {
		return new Reservation();
	}
	
}
