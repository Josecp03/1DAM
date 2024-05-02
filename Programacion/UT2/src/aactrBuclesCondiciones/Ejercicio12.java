package aactrBuclesCondiciones;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*Pedir 10 números. Mostrar la media de los números positivos, la media de los números
		negativos y la cantidad de ceros.*/
		Scanner sc=new Scanner (System.in);
		int sumaPositivos=0;
		int contadorPositivos=0;
		int sumaNegativos=0;
		int contadorNegativos=0;
		int contadorCeros=0;
		for(int i=1;i<=10;i++) {
			System.out.println("Introduzca el valor número "+i+": ");
			int n=sc.nextInt();
			if (n>0) {
				contadorPositivos++;
				sumaPositivos+=n;
			} else if (n<0) {
				contadorNegativos++;
				sumaNegativos+=n;
			} else
				contadorCeros++;			
		}
		if (contadorPositivos==0)
			System.out.println("No se han introducido números positivos");
		else
			System.out.println("La media de los números positivos es "+(float)sumaPositivos/contadorPositivos);
		if (contadorNegativos==0)
			System.out.println("No se han introducido números negativos");
		else
			System.out.println("La media de los números negativos es "+(float)sumaNegativos/contadorNegativos);
		System.out.println("Se han introducido un total de "+contadorCeros+" ceros");
		sc.close();
	}

}
