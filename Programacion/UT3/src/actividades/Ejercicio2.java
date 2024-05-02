package actividades;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int opcion;
		do {
			System.out.println();
			System.out.println("1. Área del círculo");
			System.out.println("2. Área del cuadrado");
			System.out.println("3. Área del rectángulo");
			System.out.println("4. Salir");
			System.out.println("Elegir una opción: ");
			opcion=sc.nextInt();
			switch (opcion) {
			case 1: //Área del círculo
				System.out.println("Introduzca el radio del cículo: ");
				double radio=sc.nextDouble();
				System.out.println("El área dle círculo es "+(Math.pow(radio, 2)*Math.PI));
				break;
			case 2: //Área del cuadrado
				System.out.println("Introduzca el lado del cuadrado: ");
				int lado=sc.nextInt();
				System.out.println("El área dle círculo es "+lado*lado);
				break;
			case 3: //Área del rectángulo
				System.out.println("Introduzca la base del rectángulo: ");
				int base=sc.nextInt();
				System.out.println("Introduzca el lado del rectángulo: ");
				int ladoRectangulo=sc.nextInt();
				System.out.println("El área dle círculo es "+ladoRectangulo*base);
				break;
			}
		} while(opcion!=4);
		System.out.println("Progama terminado");
		sc.close();
	}

}
