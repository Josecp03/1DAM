package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Pedir un número N, y mostrar todos los números del 1 al N.
		Scanner teclado=new Scanner(System.in);
		int n=0;
		System.out.println("Introduzca el número:");
		n=teclado.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.print(i+" ");
		}
		teclado.close();
	}
}
