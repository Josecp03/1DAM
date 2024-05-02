package buclesCondiciones;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
		Scanner teclado=new Scanner(System.in);
		int n=0;
		System.out.println("Introduzca un número: ");
		n=teclado.nextInt();
		while (n>=0) {
			System.out.println("El cuadrado de "+n+" es "+Math.pow(n, 2));
			System.out.println("Introduzca un número: ");
			n=teclado.nextInt();
		}
		System.out.println("Programa terminado");
		teclado.close();
	}
}
