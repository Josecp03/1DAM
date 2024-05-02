package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Pedir un número y mostrar el día de la semana correspondiente
		System.out.println("Este programa pide un número y te dice el día de la semana correspondiente");
		Scanner teclado=new Scanner(System.in);
		int n=0;
		boolean numeroValido=false;
		while (!numeroValido) {// Detectar si el valor introducido es un valor numérico
			System.out.println("Introduzca el número: ");
			if (teclado.hasNextInt()) {
				n=teclado.nextInt();
				if (n<=0 || n>7) {// Detectar si n es positivo
					System.err.println("Error! El número introducido debe estar entre 1 y 7");
				} else {
					numeroValido=true;
				}
			} else {
				System.err.println("Error! Introduzca un número");
				teclado.next();
			}
		}
		switch(n) {
		case 1:	
			System.out.println("Lunes");
			break;
		case 2:	
			System.out.println("Martes");
			break;
		case 3:	
			System.out.println("Miércoles");
			break;
		case 4:	
			System.out.println("Jueves");
			break;
		case 5:	
			System.out.println("Viernes");
			break;
		case 6:	
			System.out.println("Sábado");
			break;
		case 7:	
			System.out.println("Domingo");
			break;
		}
		// Cerrar el Scanner
		teclado.close();
	}
}
