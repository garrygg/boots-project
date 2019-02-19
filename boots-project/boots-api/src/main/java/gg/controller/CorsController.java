package gg.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsController {

	/*
	 * test
	 * server1 port:8080
	 * server2 port:80
	 */
	@GetMapping("/test/cros")
//	@CrossOrigin(origins ="*")
	@CrossOrigin(origins="http://127.0.0.1:8080")
	public String testCors() {
		return "{\"message\": \"cros success!\"}";
	}
	
}
