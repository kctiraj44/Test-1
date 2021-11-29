package com.openshift.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudFoundry1Application {

	@GetMapping("/")
	public String getInfo() {
		return "This is just a demo 1";
	}
	
	@GetMapping("/{name}")
	public String getInfo1(@PathVariable String name) {
		return "This is just a demo 1" + name;
	}
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFoundry1Application.class, args);
	}

}
