package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Pedir dos números y decir si uno es múltiplo de otro.
		System.out.println("Este programa indica si los números introducidos son múltiplos el uno del otro");
		Scanner teclado=new Scanner(System.in);
		double n1=0;
		double n2=0;
		boolean numeroValido=false;
		while (!numeroValido) {// Detectar si el valor introducido es un valor numérico
			System.out.println("Introduzca el primer número: ");
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
		//Calcular si los números son múltiplos
		if (n1%n2==0 || n2%n1==0) {
			System.out.println(n1+" es múltiplo de "+n2);
		} else {
			System.out.println(n1+" NO es múltiplo de "+n2);
		}	
		// Cerrar el Scanner
    	teclado.close(); 
	}
}
