package com.igorcastelo.javabasico.casting;

public class Main {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		//Pessoa pessoaAluno = aluno;//UpCasting: transforma a instância de uma subclasse em uma super classe. 
		Pessoa pessoaAluno = new Aluno();
		//Pessoa aluno2 = (Pessoa) new Aluno();
		
		
		
		pessoaAluno.setNome("igor");
		System.out.println(pessoaAluno.getNome());
		aluno.setCursos("Costura");
		
		pessoaAluno.setCurso("Corte e Costura");
		System.out.println(pessoaAluno.getCursos());/*Observe que,
ao fazer o upcast de uma referência, você perde o acesso a  quaisquer
 métodos ou campos específicos da subclasse.*/

		
		
	}

}
