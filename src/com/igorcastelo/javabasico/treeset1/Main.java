package com.igorcastelo.javabasico.treeset1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		Set<String> treeSet = new TreeSet<>();
		
		
		treeSet.add("Francisca Carneiro");
		treeSet.add("Francisco de Assis");
		treeSet.add("Igor Castelo");
		treeSet.add("Igor Castelo");
		treeSet.add("Francisca Carneiro");
		treeSet.add("Francisca Carneiro");
		treeSet.add("");
		
		Iterator<String> iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
