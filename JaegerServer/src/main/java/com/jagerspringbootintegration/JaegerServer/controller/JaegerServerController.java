package com.jagerspringbootintegration.JaegerServer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class JaegerServerController {

	@GetMapping("/jaeger/server/{id}")
	public String stringByNumber(@PathVariable("id") int id) {
		ResponseEntity<String> response = new RestTemplate().getForEntity("http://numbersapi.com/" + id, String.class);
		return response.getBody().toString();
	}
}
