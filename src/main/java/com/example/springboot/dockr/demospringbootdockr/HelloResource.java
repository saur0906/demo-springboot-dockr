package com.example.springboot.dockr.demospringbootdockr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloResource {

	@GetMapping
	public String hello() {
		return "Hello from java App running on docker containers v3";
	}
}
