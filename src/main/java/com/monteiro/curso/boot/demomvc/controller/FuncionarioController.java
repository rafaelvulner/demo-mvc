package com.monteiro.curso.boot.demomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamentos")
public class FuncionarioController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/departamento/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/departamento/lista";
	}

}
