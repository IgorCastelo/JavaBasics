package com.igorcastelo.javabasico.classesabstratas2;

public class Main {

	public static void main(String[] args) {
		//Pessoa pessoa =  new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		//pessoa.setEndereco("Street Sete, 7, Zion");
		aluno.setEndereco("Street Sete, 8, Zion");
		professor.setEndereco("Street Sete, 9, Zion");
		
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(professor.obterEtiquetaEndereco());
		
		aluno.obterEtiquetaEndereco();
		aluno.imprimirEtiquetaEndereco();
		
	}

}
