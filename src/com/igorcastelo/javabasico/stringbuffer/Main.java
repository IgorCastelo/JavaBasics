package com.igorcastelo.javabasico.stringbuffer;

public class Main {

	public static void main(String[] args) {
		String nome = "Igor";
		String sobreNome = "Castelo";
		String nomeCompleto = nome + sobreNome;
		String nomeComBuffer;
		
		System.out.println(nome + " " + sobreNome);//Esse método cria 36 variáveis
		
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append(nome);
		stringBuffer.append(sobreNome);
		
		System.out.println(nomeCompleto);//Esse método também cria 3 variáveos
	
		nomeComBuffer = stringBuffer.toString();
		
		System.out.println(nomeComBuffer);//Esse método aaglomera todas as strings para depois declarar uma única String
	}

}
