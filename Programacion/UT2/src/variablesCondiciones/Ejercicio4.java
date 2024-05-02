package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Pedir dos números e indicar si son iguales
		System.out.println("Este programa indica si los némeros introducidos son iguales o no");
		Scanner teclado=new Scanner(System.in);
		double n1=0;
		double n2=0;
		boolean numeroValido=false;
		while (!numeroValido) {// Detectar si el valor introducido es un valor numérico
			System.out.println("Introduzca un número: ");
			if (teclado.hasNextDouble()) {
				n1=teclado.nextDouble();
				numeroValido=true;
			} else {
				System.err.println("Error! Introduzca un número");
				teclado.nextLine();
			}
		}
		teclado.nextLine();
		numeroValido=false;
		while (!numeroValido) {// Detectar si el valor introducido es un valor numérico
			System.out.println("Introduzca el segundo número: ");
			if (teclado.hasNextDouble()) {
				n2=teclado.nextDouble();
				numeroValido=true;
			} else {
				System.err.println("Error! Introduzca un número");
				teclado.nextLine();
			}
		}
		//Comprobar si los números son iguales, y mostrar el resultado por pantalla
		if (n1==n2) {
			System.out.println("Los números "+n1+" y "+n2+" son iguales");
		} else {
			System.out.println("Los números "+n1+" y "+n2+" son distintos");
		}
		// Cerrar el Scanner
    	teclado.close(); 
	}
}
