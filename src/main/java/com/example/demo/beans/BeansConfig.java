package com.example.demo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.components.Menu;

@Configuration
public class BeansConfig {

	@Bean
	public Menu menu() {
		Menu menu = new  Menu();
		menu.getListaPizza().add();
	}
}
