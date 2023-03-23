package com.igorcastelo.javabasico.newexception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int opcao;
		
		do {
			System.out.println("Digite o numero 1 ou 2:");
			System.out.println();
			try{
				opcao = teclado.nextInt();
				switch(opcao) {
					case 1:
						System.out.println("Voce digiou a opcao : " + opcao);
						break;
					case 2:
						System.out.println("Voce figitou a opcao :" + opcao);
						break;
					default: 
						throw new Excecao("Erro");		
				}
			}
			catch(Excecao excecao) {
				System.out.println(excecao.getMessage());
			}
			finally {
				System.out.println("-----------------");
			}
		}while(true);
	}

}
