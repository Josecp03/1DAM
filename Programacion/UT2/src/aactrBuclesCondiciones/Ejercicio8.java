package aactrBuclesCondiciones;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*Pedir un número N, y mostrar todos los números del 1 al N.*/
		Scanner sc=new Scanner (System.in);
		int n;
		do {
			System.out.println("Introduzca un número mayor que 0: ");
			n=sc.nextInt();
		}while (n<=0);
		for (int i=1;i<=n;i++)
			System.out.print(i+" ");
		sc.close();
	}

}
