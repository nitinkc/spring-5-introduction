package com.spring5.introduction.spring5introduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5IntroductionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Spring5IntroductionApplication.class, args);

		for(String name : applicationContext.getBeanDefinitionNames()){
			System.out.println(name);
		}
	}
}