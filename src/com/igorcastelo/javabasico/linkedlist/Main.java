package com.igorcastelo.javabasico.linkedlist;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

	LinkedList<String> linkedList = new LinkedList<>();
	
	linkedList.add("Francisca Carneiro");
	linkedList.add("Francisco de Assis");
	linkedList.add("Igor Castelo");
	
	System.out.println("Antes: ");
	
	for(String nome: linkedList) {
		System.out.println(nome);
	}
		linkedList.set(0,"Matriarca");
		linkedList.set(1,"Patriarca");
		linkedList.set(2, "Neto");
		linkedList.add(0,"POSICOES:");
		System.out.println(" ");
		System.out.println("Depois: ");
		System.out.println(" ");
	for(String nome2: linkedList) {
		System.out.println(nome2);

	}
	}
	
	}
