package com.igorcastelo.javabasico.stringbuilder;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Igor";
		String sobreNome = "Castelo";
		String nomeCompleto = nome + sobreNome;
		String nomeComStringBuilder;
		
		System.out.println(nome + " " + sobreNome);//Esse método cria 36 variáveis
		
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append(nome);
		stringBuilder.append(sobreNome);
		
		System.out.println(nomeCompleto);//Esse método também cria 3 variáveos
	
		nomeComStringBuilder = stringBuilder.toString();
		
		System.out.println(nomeComStringBuilder);//Esse método aaglomera todas as strings para depois declarar uma única String
	}
	}


