package aactrCifras;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Crea un programa Java que muestre las cifras de un número al revés*/
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int n=sc.nextInt();
		while (n>0) {
			int cifra=n%10;
			System.out.print(cifra);
			n/=10;
		}
		sc.close();
	}

}


