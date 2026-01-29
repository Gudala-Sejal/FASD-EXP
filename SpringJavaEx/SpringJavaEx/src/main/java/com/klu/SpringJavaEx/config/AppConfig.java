package com.klu.SpringJavaEx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.klu.SpringJavaEx.model.Student;

@Configuration
@ComponentScan("com.klu.SpringJavaEx.model")
public class AppConfig {
	
	@Bean
	public Student student() {
		Student s = new Student();
		s.setId(101);
		s.setName("Sejal");
		return s;
	}

}
