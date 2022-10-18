package br.com.tarcnux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/users")
	public String welcome() {
		return "Welcome to My Spring Boot Web API";
	}

}
