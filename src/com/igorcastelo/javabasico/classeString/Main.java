package com.igorcastelo.javabasico.classeString;

public class Main {

	public static void main(String[] args) {
		
			String nome = "Igor";
			String nomeGuerra = "Igor";
			String sobreNome = new String("Igor");
			
			System.out.println(nome);
			System.out.println(sobreNome);
		
			System.out.println(nome.length());
			System.out.println(sobreNome.length());
			
			if(nome.equals(sobreNome)) {
				System.out.println("Nomes iguais!");
			}else System.out.println("Nomes diferentes");
				
			if(sobreNome.equals(nomeGuerra)) {
				System.out.println("Nomes iguais!");
				}else System.out.println("Nomes diferentes");
	}
}


