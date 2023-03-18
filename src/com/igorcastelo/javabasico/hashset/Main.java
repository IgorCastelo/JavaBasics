package com.igorcastelo.javabasico.hashset;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>();
		Set<String> set = hashSet;
		
		hashSet.add("Francisca Carneiro");
		hashSet.add("Francisco de Assis");
		hashSet.add("Igor Castelo");
		hashSet.add("Igor Castelo");
		hashSet.add("Francisca Carneiro");
		hashSet.add("Francisca Carneiro");
		hashSet.add("");
		
		for(String nome: hashSet) {
			System.out.println(nome);
		}

		}

	}

