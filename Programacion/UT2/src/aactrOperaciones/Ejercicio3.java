package aactrOperaciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Dados 12 números introducidos por teclado muestra cuántos hay que sean impares y
		menores de 20. También indica qué número de esos impares y menores de 20 es el menor.*/
		Scanner sc=new Scanner(System.in);
		int contadorImparesMenoresDe20=0;
		int menor=Integer.MAX_VALUE;
		for (int i=1;i<=12;i++) {
			System.out.println("Introduzca el valo número "+i+": ");
			int n=sc.nextInt();
			if (n%2!=0 && n<20) {
				contadorImparesMenoresDe20++;
				if (n<menor)
					menor=n;
			}
		}
		System.out.println("Hay "+contadorImparesMenoresDe20+" números impares menores de 20");
		System.out.println("El número menor de los impares y menores de 20 introducidos es "+menor);
		sc.close();
	}

}
