package aactrCifras;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Realiza un programa que calcule la media de los dígitos que contiene un número entero
		introducido por teclado. También muestra cuál de sus cifras es la mayor y cuál la menor*/
		Scanner sc=new Scanner (System.in);
		int sumaCifras=0;
		int contadorCifras=0;
		int cifraMayor=0;
		int cifraMenor=Integer.MAX_VALUE;
		System.out.println("Introduzca un número: ");
		int n=sc.nextInt();
		while (n>0) {
			int cifra=n%10;
			sumaCifras+=cifra;
			contadorCifras++;
			if (cifra<cifraMenor)
				cifraMenor=cifra;
			if (cifra>cifraMayor)
				cifraMayor=cifra;
			n/=10;
		}
		System.out.println("La media de los dígitos es "+(float)sumaCifras/contadorCifras);
		System.out.println("La cifra mayor es "+cifraMayor);
		System.out.println("La cifra menor es "+cifraMenor);
		sc.close();
	}

}
