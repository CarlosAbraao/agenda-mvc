package com.devcarlos.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
	@GetMapping("/cadastro")
	public String cadastro() {
		return "cadastro";
	}
	
	
	@GetMapping("/contato")
	public String contato() {
		return "contato";
	}

}
