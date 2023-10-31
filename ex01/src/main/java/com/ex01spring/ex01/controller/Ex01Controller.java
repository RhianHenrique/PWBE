package com.ex01spring.ex01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex01Controller {
	
	@GetMapping("/professor")
	public String bemVindoProf() {
		return "Olá, bem vindo professor(a).";
	}
	
	@GetMapping("/senai")
	public String boasVindasSenai() {
		return "Olá, bem vindo ao SENAI.";
	}
	
	@GetMapping("/home")
	public String minhasInformcoes(@RequestParam String nome, @RequestParam int idade) {
		return "Olá, " + nome + ". Voce tem " + idade + " anos de idade.";
	}
	
	@GetMapping("/soma")
	public String matematica(@RequestParam int numA, @RequestParam int numB, @RequestParam int result) {
		result = numA + numB;
		return "O resultado da soma de " + numA + " + " + numB + " é igual a: " + result;
	}
	
	@GetMapping("/subtracao")
	public String matematicaSub(@RequestParam int numA, @RequestParam int numB, @RequestParam int result) {
		result = numA - numB;
		return "O resultado da subtracao de " + numA + " - " + numB + " é igual a: " + result;
	}
	
	@GetMapping("/multiplicacao")
	public String matematicaMulti(@RequestParam int numA, @RequestParam int numB, @RequestParam int result) {
		result = numA * numB;
		return "O resultado da multiplicacao de " + numA + " x " + numB + " é igual a: " + result;
	}
	
	@GetMapping("/divisao")
	public String matematicaDiv(@RequestParam int numA, @RequestParam int numB, @RequestParam int result) {
		result = numA / numB;
		return "O resultado da divisao de " + numA + " : " + numB + " é igual a: " + result;
	}
	
	@GetMapping("/conversao")
	public String conversaoMoeadas(@RequestParam double real, @RequestParam double dolar, @RequestParam double valor) {
		real = valor * 5;
		dolar = valor / 5;
		return "Conversao dolar para real - Valor em dolar: " + valor + " -> em real -> " + real + "\n"
				+ "Conversao real para dolar - Valor em real: " + valor + " -> em dolar -> " + dolar;
		
	}
	
	//Coneversao de Moedas utilizando If e Else
	@GetMapping("/conversaoIf")
	public Double conversaoMoedasIf(@RequestParam String tipoMoeda, @RequestParam double valor) {
		double retorno = 0;
		if(tipoMoeda.equals("Real")) {
			retorno = valor / 5;
		} else {
			retorno = valor * 5;
		}
		
		return retorno;
	}
	
	@GetMapping("/inverter")
	public String inverterPalavra(@RequestParam String string) {
		return new StringBuilder(string).reverse().toString();
		
	}
	
	@GetMapping("/contar")
	public int contaCaracter(@RequestParam String string) {
		return string.toCharArray().length;
	}
	
	@GetMapping("/converter/minusculas")
	public String conversaoCases(@RequestParam String string) {
		return string.toLowerCase();
	}
	
	@GetMapping("/converter/maiusculas")
	public String conversaoCases2(@RequestParam String string) {
		return string.toUpperCase();
	}
	
	
}
