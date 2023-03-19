package com.igorcastelo.javabasico.treemap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		TreeMap<Integer, String> mapaNomes = new TreeMap<>();

		mapaNomes.put(1, "Java");
		mapaNomes.put(2, "SQL");
		mapaNomes.put(400, "JavaScript");
		mapaNomes.put(300, "C#");
		
		//As Chaves e os valores  aparecem ordenados
		System.out.println("Conteudo da TreeMap : " + mapaNomes);		
		System.out.println("Chaves: " + mapaNomes.keySet());
		System.out.println("Valores: " + mapaNomes.values());
		System.out.println("Chave/Valor: " + mapaNomes.entrySet());		
	}

}
