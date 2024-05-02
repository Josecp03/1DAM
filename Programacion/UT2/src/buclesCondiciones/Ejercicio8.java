package buclesCondiciones;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un 0
		Scanner teclado=new Scanner(System.in);
		int n=0;
		System.out.println("Introduzca un número: ");
		n=teclado.nextInt();
		while (n!=0) {
			if(n>0)
				System.out.println("El número es positivo");
			else
				System.out.println("El número es negativo");
			System.out.println("Introduzca un número: ");
			n=teclado.nextInt();
		}
		System.out.println("Programa terminado");
		teclado.close();
	}
}
