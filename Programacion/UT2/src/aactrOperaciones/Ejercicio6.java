package aactrOperaciones;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Dados 10 números introducidos por teclado muestra la media de los múltiplos de 5 que sean
		mayores que 10. También indica cuál de esos múltiplos de 5 y que son mayores que 10 es el
		mayor.*/
		Scanner sc=new Scanner(System.in);
		int sumaMultiplosDeCincoMayoresDe10=0;
		int contadorMultiplosDeCincoMayoresDe10=0;
		int mayor=0;
		for (int i=1;i<=10;i++) {
			System.out.println("Introduzca el valor número "+i+": ");
			int n=sc.nextInt();
			if (n%5==0 && n>10) {
				sumaMultiplosDeCincoMayoresDe10+=n;
				contadorMultiplosDeCincoMayoresDe10++;
				if (n>mayor)
					mayor=n;
			}
		}
		System.out.println("La media de los múltiplos de 5 mayores de 10 introducidos es "+(float)sumaMultiplosDeCincoMayoresDe10/contadorMultiplosDeCincoMayoresDe10);
		System.out.println("El número mayor de los múltiplos de 5 mayores de 10 introducidos es "+mayor);
		sc.close();
	}

}
