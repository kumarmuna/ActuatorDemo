package com.manas.ActuatorDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

	@GetMapping(value="/get")
	public String getMessage() {
		return "Hello....";
	}
}
