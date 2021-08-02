package com.example.owasp.controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.owasp.model.Greeting;

@RestController
public class HelloController {

	@RequestMapping("/get")
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("hello get");
	}
	
	@PostMapping("/post")
	public ResponseEntity<Greeting> post() {
		return ResponseEntity.ok(new Greeting("hello post"));
	}
}
