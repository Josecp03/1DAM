package aactrBuclesCondiciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.*/
		Scanner sc=new Scanner (System.in);
		int n;
		do {
			System.out.println("Introduzca un número: ");
			n=sc.nextInt();
			if (n!=0) {
				if (n%2==0)
					System.out.println("El número "+n+" es par");
				else
					System.out.println("El número "+n+" es impar");
			}
		} while(n!=0);
		System.out.println("Programa terminado por introducir un 0");
		sc.close();
	}

}
