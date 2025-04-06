package com.cluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJenkinsIntegrationApplication {

	@GetMapping
	public String message() {
		System.out.println("Tetsing Jenkinf pipeline");
		return "Welcome to Jenkins";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsIntegrationApplication.class, args);
	}

}
