package com.igorcastelo.javabasico.classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		 Scanner leitor = new Scanner(System.in);

		Pessoa objetoPessoa = new Pessoa(83f,1.82f);
        
               
        System.out.println("Digite o peso da pessoa");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite a altura da pessoa");
        objetoPessoa.setAltura(leitor.nextFloat());
    
        System.out.println("IMC = " + objetoPessoa.calcularIMC());

	}

}
