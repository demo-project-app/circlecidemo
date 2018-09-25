package com.circlecidemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@RequestMapping("/")
	public String welcome() {
		return "Circle CI - Docker - AWS Demo App";
	}
	
}
