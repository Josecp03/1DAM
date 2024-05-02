package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
		Scanner teclado=new Scanner(System.in);
		int n=0;
		int sumaNumeros=0;
		System.out.println("Introduzca el número:");
		n=teclado.nextInt();
		while (n!=0) {
			sumaNumeros=n+sumaNumeros;
			System.out.println("Introduzca el número:");
			n=teclado.nextInt();
		}
		System.out.println("La suma de los números introducidos es: "+sumaNumeros);
		teclado.close();
	}
}
