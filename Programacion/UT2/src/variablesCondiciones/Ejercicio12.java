package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Pedir un número y mostrar si es de 0 a 4 suspenso, si es 5 aprobado, 6 bien, 7 y 8 notable y 9 y 10 sobresaliente
		System.out.println("Este programa pide un número y te dice la nota correspondiente");
		Scanner teclado=new Scanner(System.in);
		int n=0;
		boolean numeroValido=false;
		while (!numeroValido) {// Detectar si el valor introducido es un valor numérico
			System.out.println("Introduzca el número: ");
			if (teclado.hasNextInt()) {
				n=teclado.nextInt();
				if (n<0 || n>10) {// Detectar si n se encuentra entre 0 y 10
					System.err.println("Error! El número introducido debe ser un número del 1 al 10");
				} else {
					numeroValido=true;
				}
			} else {
				System.err.println("Error! Introduzca un número");
				teclado.next();
			}
		}
		//Calcular la nota
		switch(n) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.err.println("Suspenso");
				break;
			case 5:
				System.out.println("Aprobado");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
			case 10:
				System.out.println("Sobresaliente");
				break;
		}
		// Cerrar el Scanner
        teclado.close();
	}
}
