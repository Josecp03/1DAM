package aactrDivisores;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Dado un número por teclado comprueba si es o no primo. Recuerda que un número primo es
		aquel que solo es divisible entre él mismo y la unidad.*/
		Scanner sc=new Scanner (System.in);
		boolean esPrimo=true;
		System.out.println("Introduzca un número: ");
		int n=sc.nextInt();
		if (n<=1)
			esPrimo=false;
		else {
			for (int i=2;i<n;i++) {
				if (n%i==0)
					esPrimo=false;
			}
		}
		if (esPrimo)
			System.out.println("El número "+n+" es primo");
		else
			System.out.println("El número "+n+" NO es primo");
		sc.close();
	}

}
