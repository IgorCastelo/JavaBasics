package com.igorcastelo.javabasico.polimorfismo;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa =  new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Street Sete, 7, Zion");
		aluno.setEndereco("Street Sete, 8, Zion");
		professor.setEndereco("Street Sete, 9, Zion");
		
		System.out.println(pessoa.obeterEtiquetaEndereco());
		System.out.println(aluno.obeterEtiquetaEndereco());
		System.out.println(professor.obeterEtiquetaEndereco());
		
	}

}
