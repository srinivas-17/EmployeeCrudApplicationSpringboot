package com.emloyee.Incident.Incident.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/welcome")
	public String login() {
		return "Welcome to edutech";
	}
}
