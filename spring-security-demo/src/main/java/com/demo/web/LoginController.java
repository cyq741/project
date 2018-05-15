package com.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login() {

		return "login";
	}

	@GetMapping("/unAuthorzied")
	public String unAuthorzied() {

		return "unAuthorzied";
	}
@GetMapping("/admin")
	public String admin() {
		return  "admin";
	}
	
	@GetMapping("/db")
	public String db() {
		return "db";
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}

}
