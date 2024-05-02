package aactrBuclesCondiciones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.*/
		Scanner sc=new Scanner (System.in);
		int n;
		int contador=0;
		do {
			System.out.println("Introduce un número: ");
			n=sc.nextInt();
			if (n>=0)
				contador++;
		} while(n>=0);
		System.out.println("Programa terminado por introducir un número negativo");
		System.out.println("Se han introducido "+contador+" números");
		sc.close();
	}

}
