package com.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "User Service is taking than longer than expected."+"Please try again later";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentFallBackMethod() {
		return  "Department Service is taking than longer than expected."+"Please try again later";
	}
}
