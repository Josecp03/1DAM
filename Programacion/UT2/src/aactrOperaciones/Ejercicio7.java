package aactrOperaciones;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Dados 8 números introducidos por teclado muestra la media de los impares y menores de
		20. También indica qué número de esos impares y menores de 20 es el mayor.*/
		Scanner sc=new Scanner(System.in);
		int sumaImparesMenoresDe20=0;
		int contadorImparesMenoresDe20=0;
		int mayor=0;
		for (int i=1;i<=8;i++) {
			System.out.println("Introduzca el valor número "+i+": ");
			int n=sc.nextInt();
			if (n%2!=0 && n<20) {
				sumaImparesMenoresDe20+=n;
				contadorImparesMenoresDe20++;
				if (n>mayor)
					mayor=n;
			}
		}
		System.out.println("La media de los impares menores de 20 introducidos es "+(float)sumaImparesMenoresDe20/contadorImparesMenoresDe20);
		System.out.println("El número mayor de los impares mayores de 20 introducidos es "+mayor);
		sc.close();
	}

}
