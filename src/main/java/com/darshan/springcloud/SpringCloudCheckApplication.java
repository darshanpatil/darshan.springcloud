package com.darshan.springcloud;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author darshan
 *
 */
@SpringBootApplication
public class SpringCloudCheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCheckApplication.class, args);
	}

	@Bean
	public Function<String, String> function() {
		System.out.println("Inside function");
		return input -> input;
	}

	@Bean
	public Consumer<String> consume() {
		System.out.println("Inside consume");
		return input -> System.out.println("Input " + input);
	}

	@Bean
	public Supplier<String> supply() {
		System.out.println("Inside supply");
		return () -> "Spring Cloud Test App";
	}
}