package com.github.tonmoyc.app.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GreetingAppApplication {

	@RequestMapping("/greeting/{name}")
	public String greeting(@PathVariable String name) {
		return "Greetings, " + name;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(GreetingAppApplication.class, args);
	}

}
