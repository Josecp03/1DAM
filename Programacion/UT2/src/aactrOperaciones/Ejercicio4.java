package aactrOperaciones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*Dados 11 números introducidos por teclado muestra la suma de los números que sean
		múltiplos de 3 y menores de 18. También indica qué número de esos múltiplos de 3 y
		menores de 18 es el menor.*/
		Scanner sc=new Scanner(System.in);
		int sumaMultiplosDeTresMenoresDe18=0;
		int menor=Integer.MAX_VALUE;
		for (int i=1;i<=11;i++) {
			System.out.println("Introduzca el valo número "+i+": ");
			int n=sc.nextInt();
			if (n%3==0 && n<18) {
				sumaMultiplosDeTresMenoresDe18+=n;
				if (n<menor)
					menor=n;
			}
		}
		System.out.println("La suma de los múltiplos de 3 y menores de 18 introducidos es "+sumaMultiplosDeTresMenoresDe18);
		System.out.println("El número menor de los múltiplos de 3 y menores de 18 introducidos es "+menor);
		sc.close();
	}

}
