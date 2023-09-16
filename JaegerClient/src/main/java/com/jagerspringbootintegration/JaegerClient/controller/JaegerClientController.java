package com.jagerspringbootintegration.JaegerClient.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class JaegerClientController {

	@GetMapping("/jaeger/client/{id}")
	public String stringByNumber(@PathVariable("id") int id) {
		ResponseEntity<String> response = new RestTemplate().getForEntity("http://localhost:8082/jaeger/server/" + id,
				String.class);
		return response.getBody().toString();
	}
}
