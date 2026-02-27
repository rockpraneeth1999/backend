package com.praneeth.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String welcome() {
		return "<html><body><h1>Welcome to backend app</h1></body></html>";
	}
}
