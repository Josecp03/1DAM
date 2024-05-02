package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Pedir tres números y mostrarlos ordenados de mayor a menor
		System.out.println("Este programa ordena de mayor a menor 3 números introducidos por el usuario");
		Scanner teclado=new Scanner(System.in);
		double n1=0;
		double n2=0;
		double n3=0;
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
				if (n1==n2) {// Detectar si n2 es el mismo numero que n1
					System.err.println("Error! Los números no pueden ser iguales");
				} else {
					numeroValido=true;
				}
			} else {
				System.err.println("Error! Introduzca un número");
				teclado.next();
			}
		}
		numeroValido=false;
		while (!numeroValido) {// Detectar si el valor introducido es un valor numérico
			System.out.println("Introduzca el segundo número: ");
			if (teclado.hasNextDouble()) {
				n3=teclado.nextDouble();
				if (n1==n3 || n2==n3) {// Detectar si n3 es el mismo número que n1 o n2
					System.err.println("Error! Los números no pueden ser iguales");
				} else {
					numeroValido=true;
				}
			} else {
				System.err.println("Error! Introduzca un número");
				teclado.next();
			}
		}
		//  Calcular que número es mayor y mostrar el resultado por pantalla
		if (n1>=n2 && n1>=n3) {
            if (n2>=n3) {
                System.out.println(n1+", "+n2 + ", "+n3);
            } else {
                System.out.println(n1+", "+n3+", "+n2);
            }
        } else if (n2>=n1 && n2>=n3) {
            if (n1>=n3) {
                System.out.println(n2+", "+n1+", "+n3);
            } else {
                System.out.println(n2+", "+n3 + ", "+n1);
            }
        } else {
            if (n1>=n2) {
                System.out.println(n3+", "+n1+", "+n2);
            } else {
                System.out.println(n3+", "+n2+", "+n1);
            }
        }
        // Cerrar el Scanner
        teclado.close();	
	}
}
