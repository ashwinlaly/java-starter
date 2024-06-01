package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {}
record Address(String address, String pin) {}

@Configuration
public class HelloworldConfiguration {

	@Bean
	public Person person(Address address) {
		return new Person("Ashwin", 31, address);
	}
	
	
	public Address adderss3() {
		return new Address("bomba", "1");
	}
	
	@Primary
	public Address adderss2() {
		return new Address("bomba", "2");
	}
}
