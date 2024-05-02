package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// Pedir un número y mostrar el mes correspondiente
		System.out.println("Este programa pide un número y te dice el mes correspondiente");
		Scanner teclado=new Scanner(System.in);
		int n=0;
		boolean numeroValido=false;
		while (!numeroValido) {// Detectar si el valor introducido es un valor numérico
			System.out.println("Introduzca el número: ");
			if (teclado.hasNextInt()) {
				n=teclado.nextInt();
				if (n<=0 || n>12) {// Detectar si n es positivo
					System.err.println("Error! El número introducido debe estar entre 1 y 12");
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
			System.out.println("Enero");
			break;
		case 2:	
			System.out.println("Febrero");
			break;
		case 3:	
			System.out.println("Marzo");
			break;
		case 4:	
			System.out.println("Abril");
			break;
		case 5:	
			System.out.println("Mayo");
			break;
		case 6:	
			System.out.println("Junio");
			break;
		case 7:	
			System.out.println("Julio");
			break;
		case 8:	
			System.out.println("Agosto");
			break;
		case 9:	
			System.out.println("Septiembre");
			break;
		case 10:	
			System.out.println("Octubre");
			break;
		case 11:	
			System.out.println("Noviembre");
			break;
		case 12:	
			System.out.println("Diciembre");
			break;
		}
		// Cerrar el Scanner
		teclado.close();

	}

}
