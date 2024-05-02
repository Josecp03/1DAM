package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Pedir números hasta que se introduzca uno negativo, y calcular la media
		Scanner teclado=new Scanner(System.in);
		int n=0;
		int contadorNumeros=0;
		int sumaNumeros=0;
		System.out.println("Introduzca el número:");
		n=teclado.nextInt();
		while (n>=0) {
			sumaNumeros= n+sumaNumeros;
			contadorNumeros++;
			System.out.println("Introduzca el número:");
			n=teclado.nextInt();
		}
		System.out.println("La media de los números introducidos es: "+(float)sumaNumeros/contadorNumeros);
		teclado.close();
	}
}
