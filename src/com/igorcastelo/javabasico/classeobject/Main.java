package com.igorcastelo.javabasico.classeobject;

public class Main {

	public static void main(String[] args) {
	
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Engenharia da Computação");
		double[] notas = {10,10,10};
		aluno.setNotas(notas);
		
		//System.out.println(aluno);
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Engenharia da Computação");
		double[] notas2 = {10,10,10};
		aluno.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
		
		
		
		
		
		
		
	
	

	}

}
