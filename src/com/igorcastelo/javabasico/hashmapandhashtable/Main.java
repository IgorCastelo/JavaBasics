package com.igorcastelo.javabasico.hashmapandhashtable;

import java.util.HashMap;
import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
								//HashMAp
		/*
		HashMap<Integer,String> linguagensProgramacao = new HashMap<>();
		linguagensProgramacao.put(1, "Java");
		linguagensProgramacao.put(2, "SQL");
		linguagensProgramacao.put(3,"JavaScript");
		linguagensProgramacao.put(5, "C#");
		
		System.out.println("Conteudo do HashMap Linguagens de Progracao : " + linguagensProgramacao);
		
		String valor = linguagensProgramacao.get(1);
		
		System.out.println("Valor da Chave 1: " + valor);
		
		System.out.println("Chaves: "+linguagensProgramacao.keySet());
		System.out.println("Valores: "+linguagensProgramacao.values());
		System.out.println("Chave / Valor: "+linguagensProgramacao.entrySet());*/

							//HashTable
		
		Hashtable<Integer,String> linguagensProgramacao = new Hashtable<>();
		linguagensProgramacao.put(1, "Java");
		linguagensProgramacao.put(2, "SQL");
		linguagensProgramacao.put(3,"JavaScript");
		linguagensProgramacao.put(5, "C#");
		
		System.out.println("Conteudo do HashMap Linguagens de Progracao : " + linguagensProgramacao);
		
		String valor = linguagensProgramacao.get(1);
		
		System.out.println("Valor da Chave 1: " + valor);
		
		System.out.println("Chaves: "+linguagensProgramacao.keySet());
		System.out.println("Valores: "+linguagensProgramacao.values());
		System.out.println("Chave / Valor: "+linguagensProgramacao.entrySet());
		
	
	}	

}
