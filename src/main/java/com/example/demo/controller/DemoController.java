package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/name")
	public String getName() {
		return "my name is aman";
	}
	
	@GetMapping("/number")
	public String getNumber() {
		return "7992274853";
	}
}
