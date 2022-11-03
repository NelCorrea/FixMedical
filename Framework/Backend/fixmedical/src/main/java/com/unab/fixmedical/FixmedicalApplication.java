package com.unab.fixmedical;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FixmedicalApplication {

	public static void main(String[] args) {
		SpringApplication.run(FixmedicalApplication.class, args);
		System.out.println("Api corriendo...");
	}

	//recorrido de datos con modelmapper
	@Bean
	public ModelMapper modelMapper(){
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}

}