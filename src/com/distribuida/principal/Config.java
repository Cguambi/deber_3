package com.distribuida.principal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Cliente;

@Configuration
@ComponentScan("com.distribuida")
@PropertySource("classpath:datosLibreria.properties")	
public class Config {

	
	@Bean
	public Cliente cliente() {
		return new Cliente();
	}
	@Bean
	public Autor autor() {
		return new Autor();
	}
}