package com.sov.anik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AnikApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnikApplication.class, args);
	}

	//http://localhost:8080/hello?name=Amy
	//http://localhost:8080/hello
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

}