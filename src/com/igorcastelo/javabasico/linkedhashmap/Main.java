package com.igorcastelo.javabasico.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		LinkedHashMap<String,String> linguagensProgramacao = new LinkedHashMap<>();
		
		linguagensProgramacao.put("maisCompleta", "Java");
		linguagensProgramacao.put("melhorAmigoBackEnd", "SQL");
		linguagensProgramacao.put("frontEnd","JavaScript");
		linguagensProgramacao.put("plagiou0Java", "C#");
		
		System.out.println("Conteudo do LinkedHashMap : " + linguagensProgramacao);
		
		String valor = linguagensProgramacao.get(1);
		
		System.out.println("Valor da Chave 1: " + valor);
		
		System.out.println("Chaves: "+linguagensProgramacao.keySet());
		System.out.println("Valores: "+linguagensProgramacao.values());
		System.out.println("Chave / Valor: "+linguagensProgramacao.entrySet());
		
		LinkedHashMap<String,String>  linkedHashMap = new LinkedHashMap<>(linguagensProgramacao);
		linkedHashMap.put("Desenvolvedor","Igor");
		
		System.out.println("Depois "+linkedHashMap.entrySet());

		
	}

}
