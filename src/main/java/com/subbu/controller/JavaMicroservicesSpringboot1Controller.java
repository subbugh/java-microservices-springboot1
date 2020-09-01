package com.subbu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaMicroservicesSpringboot1Controller {

	@GetMapping("/massage")
	public String getMessage() {
		return "Welcome to Subbu - massage - call through the REST API";
	}
}
