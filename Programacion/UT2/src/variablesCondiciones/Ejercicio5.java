package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Pedir un número por teclado e indicar si es positivo, negativo o cero
		System.out.println("Este programa indica si el némero introducido es positivo, negativo, o igual a 0");
		Scanner teclado=new Scanner(System.in);
		double n=0;
		boolean numeroValido=false;
		while (!numeroValido) {// Detectar si el valor introducido es un valor numérico
			System.out.println("Introduce un número: ");
			if (teclado.hasNextDouble()) {
				n=teclado.nextDouble();
				numeroValido=true;
			} else {
				System.err.println("Error! Ingresa un número");
				teclado.nextLine();
			}
		}
		//Clacular si el número es psitivo, negativo o igual a 0
		if(n>0) {
			System.out.println("El número "+n+" es positivo");
		} else if(n<0){
			System.out.println("El número "+n+" es negativo");
		} else {
			System.out.println("El número "+n+" es igual a 0");
		}
		// Cerrar el Scanner
    	teclado.close(); 
	}
}
