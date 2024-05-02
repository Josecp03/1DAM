package aactrBuclesCondiciones;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.*/
		Scanner sc=new Scanner (System.in);
		int n;
		int suma=0;
		do {
			System.out.println("Introduzca un número: ");
			n=sc.nextInt();
			suma+=n;
		} while(n!=0);
		System.out.println("Programa terminado por introducir un 0");
		System.out.println("La suma de los números es: "+suma);
		sc.close();
	}

}
