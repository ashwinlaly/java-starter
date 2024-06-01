package com.example.demo;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringApplication {

	public static void main(String args[]) {
		var context = new AnnotationConfigApplicationContext(HelloworldConfiguration.class);
		
		System.out.println(context.getBean(Person.class));
//		System.out.println(context.getBean("hello"));
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}
