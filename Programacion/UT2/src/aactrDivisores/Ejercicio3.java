package aactrDivisores;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n
		que son primos */
		Scanner sc=new Scanner (System.in);
		int contadorPrimos=0;
		System.out.println("Introduzca un número: ");
		int n=sc.nextInt();
		for (int i=2;i<=n;i++) {
			boolean esPrimo=true;
			for (int j=2;j<i;j++) {
				if (i%j==0)
					esPrimo=false;
			}
			if (esPrimo)
				contadorPrimos++;
		}
		System.out.println("Hay "+contadorPrimos+" números primos entre 1 y "+n);
		sc.close();
	}

}
