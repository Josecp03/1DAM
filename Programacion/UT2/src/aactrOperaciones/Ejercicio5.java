package aactrOperaciones;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*Dados 12 números introducidos por teclado muestra la suma de los múltiplos de 5 que sean
		mayores que 10. También indica la media de de esos múltiplos de 5 que son mayores que 10.*/
		Scanner sc=new Scanner(System.in);
		int sumaMultiplosDeCincoMayoresDe10=0;
		int contadorMultiplosDeCincoMayoresDe10=0;
		for (int i=1;i<=12;i++) {
			System.out.println("Introduzca el valor número "+i+": ");
			int n=sc.nextInt();
			if (n%5==0 && n>10) {
				sumaMultiplosDeCincoMayoresDe10+=n;
				contadorMultiplosDeCincoMayoresDe10++;
			}
		}
		System.out.println("La suma de los múltiplos de 5 mayores de 10 introducidos es "+sumaMultiplosDeCincoMayoresDe10);
		System.out.println("La media de los múltiplos de 5 mayores de 10 introducidos es "+(float)sumaMultiplosDeCincoMayoresDe10/contadorMultiplosDeCincoMayoresDe10);
		sc.close();
	}

}
