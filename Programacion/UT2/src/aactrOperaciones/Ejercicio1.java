package aactrOperaciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Dados 10 números introducidos por teclado muestra la suma de los múltiplos de 3 que sean
		mayores que 6. También indica qué número de esos múltiplos de 3 que son mayores que 6 es
		el mayor.*/
		Scanner sc=new Scanner(System.in);
		int sumaMultiplosDeTresMayoresDe6=0;
		int mayor=0;
		for (int i=1;i<=10;i++) {
			System.out.println("Introduzca el valo número "+i+": ");
			int n=sc.nextInt();
			if (n%3==0 && n>6) {
				sumaMultiplosDeTresMayoresDe6+=n;
				if (n>mayor)
					mayor=n;
			}
		}
		System.out.println("La suma de los múltiplos de 3 y mayores de 6 introducidos es "+sumaMultiplosDeTresMayoresDe6);
		System.out.println("El número mayor de los múltiplos de 3 y mayores de 6 introducidos es "+mayor);
		sc.close();
	}

}
