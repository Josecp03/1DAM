package edd;

import java.util.ArrayList;

public class EjemploAL {

	public static void main(String[] args) {
		ArrayList <Integer> numeros=new ArrayList<>();
		numeros.add(3);
		numeros.add(5);
		numeros.add(10);
		numeros.add(0,1);//añado en la posicion 0 el numero 1
		
		System.out.println(numeros);
		numeros.add(1,2);
		System.out.println(numeros);

		//Borrar un número de un AL
		numeros.remove(1);//Borra el elemento que está en la posición 1, en este caso el 2
		System.out.println(numeros);
		
		//Recorrer en AL
		for(int i=0;i<numeros.size();i++) {
			System.out.println(numeros.get(i));//numeros[i]
		}
		
		System.out.println();
		//Imprimo el AL con for each
		for (Integer i:numeros) {
			System.out.println(i);
		}
		System.out.println();
		//Borrar todo el AL
		numeros.clear();
		System.out.println(numeros);
	}

}
