package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Pedir dos números y mostrarlos de menor a mayor
		System.out.println("Este programa indica cúal de los dos números introducidos es mayor");
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
		numeroValido=false;
		while (!numeroValido) {// Detectar si el valor introducido es un valor numérico
			System.out.println("Introduzca el segundo número: ");
			if (teclado.hasNextDouble()) {
				n2=teclado.nextDouble();
				if (n1==n2) {// Detectar si n2 es el mismo número que n1
					System.err.println("Error! Los números no pueden ser iguales");
				} else {
					numeroValido=true;
				}
			} else {
				System.err.println("Error! Introduzca un número");
				teclado.next();
			}
		}
		// Calcular que número es mayor y mostrar el resultado por pantalla
		if (n1<n2) {
            System.out.println(+n1+" < "+n2);
        } else {
        	System.out.println(+n2+" < "+n1);
        }
        // Cerrar el Scanner
        teclado.close();	
	}
}
