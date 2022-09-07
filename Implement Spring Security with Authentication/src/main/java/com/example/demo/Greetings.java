package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {

	@RequestMapping("/")
	public String getMsg() {
		return "Hello All !!!";
	}
	
	@RequestMapping("/greet")
	public String getGreet() {
		return "Good Morning All !!!";
	}
}
