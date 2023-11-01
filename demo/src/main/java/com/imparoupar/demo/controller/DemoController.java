package com.imparoupar.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	
	@GetMapping("/imparoupar")
	public String verificarNumero(@RequestParam int a) {
		String retorno;
		
		if(a % 2 == 0) {
			retorno = "o numero " + a + " é par!";
		} else {
			retorno = "o numero " + a + " é impar!";
		}
		
		return retorno;
	}
}
