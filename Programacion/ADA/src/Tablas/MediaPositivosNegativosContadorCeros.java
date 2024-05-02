package Tablas;

import java.util.Scanner;

public class MediaPositivosNegativosContadorCeros {

	public static void main(String[] args) {
		/* Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media
		de los negativos y contar el número de ceros.*/
		
		//Variables
		Scanner sc=new Scanner(System.in);
		int[]array=new int[5];
		int sumaPositivos=0;
		int contadorPositivos=0;
		int sumaNegativos=0;
		int contadorNegativos=0;
		int contadorCeros=0;
		
		//Programa
		for (int i=0;i<array.length;i++) {
			System.out.println("Introduce el valor número "+(i+1)+": ");
			array[i]=sc.nextInt();
			if(array[i]>0) {
				sumaPositivos+=array[i];
				contadorPositivos++;
			}
			if(array[i]<0) {
				sumaNegativos+=array[i];
				contadorNegativos++;
			}
			if(array[i]==0)
				contadorCeros++;
		}
		if(contadorPositivos==0)
			System.out.println("No se ha introducido ningún número poistivo");
		else
			System.out.println("La media de los números positivos introducidos es "+(double)sumaPositivos/contadorPositivos);
		if(contadorNegativos==0)
			System.out.println("No se ha introducido ningún número negativo");
		else
			System.out.println("La media de los números negativos introducidos es "+(double)sumaNegativos/contadorNegativos);
		if(contadorCeros==0)
			System.out.println("No se ha introducido ningún cero");
		else
			System.out.println("El número de ceros introducidos es "+contadorCeros);
		sc.close();
	}

}
