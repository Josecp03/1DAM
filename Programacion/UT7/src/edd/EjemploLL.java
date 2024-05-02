package edd;

import java.util.LinkedList;

public class EjemploLL {
	public static void main(String[] args) {
		
		LinkedList<Integer> numeros=new LinkedList<Integer>();
		numeros.add(2);
		numeros.add(4);
		numeros.addFirst(0);
		
		for (Integer i : numeros) {
			System.out.println(i);
		}
		
		numeros.removeLast();
		
		System.out.println();
		for (Integer i : numeros) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println(numeros.getLast());
		numeros.clear();
	}
}
