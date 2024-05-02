package aactrDivisores;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Calcula si un número introducido por teclado es par*/
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int n=sc.nextInt();
		if (n%2==0)
			System.out.println("El número "+n+" es par");
		else
			System.out.println("El número "+n+" NO es par");
		sc.close();
	}

}
