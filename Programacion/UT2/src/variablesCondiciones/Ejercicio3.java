package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Pedir el radio de una circunferencia y calcular su longitud
		System.out.println("Este programa calcula la longitud de una circunferencia a través de su radio");
		Scanner teclado=new Scanner(System.in);
		double radio=0;
		boolean numeroValido=false;
		while (!numeroValido) {// Detectar si el valor introducido es un valor numérico
			System.out.println("Introduzca el radio de la circunferencia: ");
			if (teclado.hasNextDouble()) {
				radio=teclado.nextDouble();
				if (radio<0) {// Detectar si n2 es el mismo numero que n1
					System.err.println("Error! Introduzca un valor positivo");
					teclado.nextLine();
				} else {
					numeroValido=true;
				}
			} else {
				System.err.println("Error! Introduzca un número");
				teclado.nextLine();
			}
		}
    	// Calcular la longitud
    	double longitud=2*Math.PI*radio;
    	if (longitud==0) {
    		System.out.println("Si el radio de la circunferencia es 0, la circunferencia no tiene longitud");
    	}else {
    		System.out.println("La longitud de la circunferencia con radio "+radio+" es: "+longitud);
    	}
    	// Cerrar el Scanner
    	teclado.close(); 	
	}
}

