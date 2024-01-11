package com.generetion.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lista")

public class OlaMundo {

	@GetMapping("ola")
	public String olaMundo() {
		return "Olá mundo !!!";
	}
	
	@GetMapping("BSM")
	public String BSM() {
		return "Mentalidade de crescimento\r\n"
				+ "Orientação ao detalhe\r\n"
				+ "Comunicação\r\n"
				+ "Trabalho em equipe\r\n"
				+ "Proatividade\r\n"
				+ "Orientação ao futuro\r\n"
				+ "Gestão do tempo  !!!";
	}
	
	@GetMapping("lista")
	public String Lista() {
		return "Spring\r\n"
				+ "API\r\n";
	}
	
	
	
}
