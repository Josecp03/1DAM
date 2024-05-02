package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Pedir dos números y decir cuál es mayor o si son iguales
		System.out.println("Este programa calcula que número es mayor o si son iguales");
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
		numeroValido=false;
		while (!numeroValido) {// Detectar si el valor introducido es un valor numérico
			System.out.println("Introduzca el segundo número: ");
			if (teclado.hasNextDouble()) {
				n2=teclado.nextDouble();
				numeroValido=true;
			} else {
				System.err.println("Error! Introduzca un número");
				teclado.next();
			}
		}
		if (n1>n2) {
			System.out.println(n1+" > "+n2);
			System.out.println("El número mayor es "+n1);
		} else if(n2>n1) {
			System.out.println(n2+" > "+n1);
			System.out.println("El número mayor es "+n2);
		}else {
			System.out.println(n2+" = "+n1);
			System.out.println("Los números son guales");
		}
		//Cerrar el Scanner
		teclado.close();
	}
}
