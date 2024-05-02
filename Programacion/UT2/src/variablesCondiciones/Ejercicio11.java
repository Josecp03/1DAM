package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Pedir un número y mostrar cuántas cifras tiene
		System.out.println("Este programa muestra cuantas cifras tiene el número introducido por el usuario");
		Scanner teclado=new Scanner(System.in);
		int contadorCifras = 0;
		boolean numeroValido=false;
		while (!numeroValido) {// Detectar si el valor introducido es un valor numérico
			System.out.println("Introduzca el número: ");
			if (teclado.hasNextLong()) {
				long n=teclado.nextLong();
				numeroValido=true;
				if (n==0) {
					contadorCifras=1;
				} else {
					while (n!=0) {
						n=n/10;
						contadorCifras++;
					}
				}
				System.out.println("El número ingresado tiene "+contadorCifras+" cifras");
			} else {
				System.err.println("Error! Introduzca un número");
				teclado.nextLine();
			}
		}
		// Cerrar el Scanner
		teclado.close();
	}
}
