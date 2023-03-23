package com.igorcastelo.javabasico.exeptions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		Integer dividendo = scanner.nextInt();
		Integer divisor = scanner.nextInt();
		
		try {
			Integer quociente = dividendo/divisor;
			System.out.println("Resultado: " + quociente);
		}catch(Exception e) {
			System.out.println("Causa: " + e.getCause());
			System.out.println("Menssagem: " + e.getMessage());
			System.out.println("Tipode Exceção: " + e.getClass().getCanonicalName());
			System.out.println("Ops! Não foi possivel obter o resultado");
		}

}
}