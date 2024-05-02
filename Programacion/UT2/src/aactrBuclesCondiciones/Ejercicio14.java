package aactrBuclesCondiciones;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de
		alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.*/
		Scanner sc=new Scanner (System.in);
		int sumaAlturas=0;
		int sumaEdades=0;
		int contadorAlumnosMayoresDe18=0;
		int contadorAlumnosMayoresDe175=0;
		for (int i=1;i<=5;i++) {
			System.out.println("Introduzca la edad del alumno "+i+": ");
			int edad=sc.nextInt();
			sumaEdades+=edad;
			System.out.println("Introduzca la altura del aluno "+i+": ");
			double altura=sc.nextDouble();
			sumaAlturas+=altura;
			if (edad>18)
				contadorAlumnosMayoresDe18++;
			if (altura>1.75)
				contadorAlumnosMayoresDe175++;
		}
		System.out.println("La media de las edades intoducidas es "+(float)sumaEdades/5);
		System.out.println("La media de las alturas intoducidas es "+(float)sumaAlturas/5);
		System.out.println("Se han introducido "+contadorAlumnosMayoresDe18+" alumnos mayores de 18 años");
		System.out.println("Se han introducido "+contadorAlumnosMayoresDe175+" alumnos que miden más de 1.75");
		sc.close();
	}

}
