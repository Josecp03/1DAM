package aactrBuclesCondiciones;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se
		introduzca un 0*/
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int n=sc.nextInt();
		while(n!=0) {
			if(n>0)
				System.out.println("El número "+n+" es positivo");
			else
				System.out.println("El número "+n+" es negativo");
			System.out.println("Introduzca un número: ");
			n=sc.nextInt();
		}
		System.out.println("Programa terminado por introducir un 0");
		sc.close();
	}
	
}
