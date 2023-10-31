package br.com.spring.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundoController {

		
		@GetMapping("/")
			public String casa() {
				return "Olá Mundo!";
			}
		
		@GetMapping("/ingles")
		public String home() {
			return "Hello World!";
			}
		
		@GetMapping("/professor")
		public String bemVindo() {
			return "Olá, bem vindo professor(a).";
		}
		
		@GetMapping("/senai")
		public String boasVindasSenai() {
			return "Olá, bem vindo ao Senai.";
		}

	}

