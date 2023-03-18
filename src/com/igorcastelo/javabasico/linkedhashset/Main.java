package com.igorcastelo.javabasico.linkedhashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		List<Integer> numerosArrayList = new ArrayList<>();
		numerosArrayList.add(10);
		numerosArrayList.add(20);
		numerosArrayList.add(20);
		numerosArrayList.add(40);
		numerosArrayList.add(50);
		numerosArrayList.add(60);
		
		System.out.println("ArrayList: " + numerosArrayList);
		System.out.println(" ");
		
		//O HashSet entrega os numeros de forma desoganizada
		Set<Integer> numerosHashSet = new HashSet<>(numerosArrayList);
		System.out.println("HashSet: "+ numerosHashSet);
		System.out.println(" ");
		
		//O LinkedHashSet entrega os números organizados de acordo com a posiçãoem que foi inserido, mas sem repetições.
		LinkedHashSet<Integer> numerosLinkedHashSet = new LinkedHashSet<>(numerosArrayList);
		//ou numerosLinkedHashSet.addAll(numerosArrayList);
		System.out.println("LinkedhashSet: ");
		
		Iterator<Integer> iterator = numerosLinkedHashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());	
		}
		

		
		
		
		}

	}


