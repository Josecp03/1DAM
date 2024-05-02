package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar
		Scanner teclado=new Scanner(System.in);
		int n=0;
		System.out.println("Introduzca el número:");
		n=teclado.nextInt();
		while (n!=0) {
			if (n%2==0) 
				System.out.println("El número es par");
			else 
				System.out.println("El número es impar");
			
			System.out.println("Introduzca el número:");
			n=teclado.nextInt();
		}
		System.out.println("Programa terminado");
		teclado.close();
	}

}
