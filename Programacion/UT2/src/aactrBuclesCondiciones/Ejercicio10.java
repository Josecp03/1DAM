package aactrBuclesCondiciones;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*Pedir 15 números y escribir la suma total.*/
		Scanner sc=new Scanner (System.in);
		int suma=0;
		for(int i=1;i<=15;i++) {
			System.out.println("Introduzca el valor número "+i+":" );
			int n=sc.nextInt();
			suma+=n;
		}
		System.out.println("La suma total de los números introducidos es "+suma);
		sc.close();
	}

}
