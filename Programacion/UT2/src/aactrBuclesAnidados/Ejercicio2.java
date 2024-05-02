package aactrBuclesAnidados;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Dibuja un cuadrado de n elementos de lado utilizando.*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el valor del lado del cuadrado: ");
		int lado=sc.nextInt();
		for (int i=1;i<=lado;i++){
			for (int j=1;j<=lado;j++) { 
				System.out.print("* ");
			}
			System.out.println();	
		}
		sc.close();
	}

}
