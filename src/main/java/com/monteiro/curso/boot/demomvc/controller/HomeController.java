package com.monteiro.curso.boot.demomvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/index")
	public String index() {
		
		return "Teste";
	}
	
	@GetMapping("/pessoas")
	public String pessoas() {
		
		return "Pessoas";
	}

}
