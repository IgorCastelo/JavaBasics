package com.igorcastelo.javabasico.classeString;

public class Exemplo2 {

	public static void main(String[] args) {
		
	String nome= "Igor Castelo";
		
		System.out.println(nome.length());
		System.out.println(nome.toLowerCase());
		System.out.println(nome.toUpperCase());
		System.out.println(nome.charAt(2));
		System.out.println(nome.isEmpty());
		System.out.println(nome.indexOf("as"));
		System.out.println(nome.contains("as"));
		System.out.println(nome.concat(" F."));
		System.out.println(nome.equals("igor castelo"));
		System.out.println(nome.equalsIgnoreCase("igor castelo"));
	}
}