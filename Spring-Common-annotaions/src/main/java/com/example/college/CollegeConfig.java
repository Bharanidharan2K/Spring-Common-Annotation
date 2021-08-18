package com.example.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

	@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	@Bean
	public Teacher mathTeacherBean() {
		return new MathTeacher();
	}

	@Bean(name = "collegeObj") // Or we can set the bean ID with name attribute
	public College collegeBean() { // This collegeBean is the bean ID
		College college = new College();
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacherBean());
		return college;
	}

}
