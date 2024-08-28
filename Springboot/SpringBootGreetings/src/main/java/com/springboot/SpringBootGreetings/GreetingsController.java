package com.springboot.SpringBootGreetings;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
	@Value("Welcome Nikhil...")
	private String message;
	
	@RequestMapping("/hello")
	public String greet() 
	{ 
		return message;
	}

}
