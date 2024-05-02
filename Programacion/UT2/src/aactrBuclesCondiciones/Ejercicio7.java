package aactrBuclesCondiciones;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Pedir números hasta que se introduzca uno negativo, y calcular la media.*/
		Scanner sc=new Scanner (System.in);
		int n;
		int suma=0;
		int contador=0;
		do {
			System.out.println("Introduzca un número: ");
			n=sc.nextInt();
			if (n>=0) {
				suma+=n;
				contador++;
			}
		} while(n>=0);
		System.out.println("Programa terminado por introducir un número negativo");
		if (suma==0)
			System.out.println("La media de los números introducidos es 0");
		else
			System.out.println("La media de los números introducidos es "+suma/contador);
		sc.close();
	}

}
