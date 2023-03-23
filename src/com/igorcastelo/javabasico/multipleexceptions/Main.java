package com.igorcastelo.javabasico.multipleexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		
		int valor;
		
		try {
		System.out.println("Digite o numerador: ");
		valor = scanner.nextInt();
		
		int resultado = valor/3;
		System.out.println(valor);
		}
		catch(ArithmeticException e ) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException => " + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception => " + e.getMessage());
		}
		finally{
			System.out.println("Fim!");
		}
		}
	}


