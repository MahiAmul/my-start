package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo2Application {
	
	@GetMapping("/check")
	public String check() {
		return "Main";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
