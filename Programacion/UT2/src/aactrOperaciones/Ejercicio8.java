package aactrOperaciones;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*Dados 11 números introducidos por teclado muestra la media de los números que sean
		múltiplos de 3 y menores de 18. También indica qué número de esos múltiplos de 3 y
		menores de 18 es el mayor*/
		Scanner sc=new Scanner(System.in);
		int sumaMultiplosDeTresMenoresDe18=0;
		int contadorMultiplosDeTresMenoresDe18=0;
		int mayor=0;
		for (int i=1;i<=11;i++) {
			System.out.println("Introduzca el valor número "+i+": ");
			int n=sc.nextInt();
			if (n%3==0 && n<18) {
				sumaMultiplosDeTresMenoresDe18+=n;
				contadorMultiplosDeTresMenoresDe18++;
				if (n>mayor)
					mayor=n;
			}
		}
		System.out.println("La media de los múltiplos de 3 menores de 18 introducidos es "+(float)sumaMultiplosDeTresMenoresDe18/contadorMultiplosDeTresMenoresDe18);
		System.out.println("El número mayor de los múltiplos de 3 menores de 18 introducidos es "+mayor);
		sc.close();
	}

}
