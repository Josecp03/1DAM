package aactrBuclesCondiciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número
		negativo.*/
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca un número:");
		int n=sc.nextInt();
		while(n>=0) {
			System.out.println("El cuadrado de "+n+" es "+(int)Math.pow(n, 2));
			System.out.println("Introduzca un número:");
			n=sc.nextInt();
		}
		System.out.println("Programa terminado por introducir un número negativo");
		sc.close();
	}

}
