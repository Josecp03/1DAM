package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/* Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, 
		la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.*/
		Scanner teclado=new Scanner(System.in);
		int edad=0;
		float altura=0;
		int sumaEdades=0;
		int contadorEdades=0;
		float sumaAlturas=0;
		int contadorAlturas=0;
		for (int i=1;i<=5;i++) {
			System.out.println("Introduzca la edad del alumno número "+i+": ");
			edad=teclado.nextInt();
			sumaEdades+=edad;
			System.out.println("Introduzca la altura del alumno número "+i+": ");
			altura=teclado.nextFloat();
			sumaAlturas+=altura;
			if (edad>18)
				contadorEdades++;
			if (altura>1.75)
				contadorAlturas++;
		}
		System.out.println("La edad media es "+sumaEdades/5+" y hay un total de "+contadorEdades+" alumnos mayores de edad");
		System.out.println("La altura media es "+sumaAlturas/5+" y hay un total de "+contadorAlturas+" alumnos que miden más de 1.75");
		teclado.close();
	}

}
