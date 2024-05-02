package aactrBuclesCondiciones;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.*/
		Scanner sc=new Scanner (System.in);
		int contadorSueldosMayoresDeMil=0;
		int sumaSueldos=0;
		for (int i=1;i<=10;i++) {
			System.out.println("Introduzca el sueldo número "+i+": ");
			int sueldo=sc.nextInt();
			sumaSueldos+=sueldo;
			if (sueldo>1000)
				contadorSueldosMayoresDeMil++;
		}
		System.out.println("La suma de los sueldos es de "+sumaSueldos+"€");
		if (contadorSueldosMayoresDeMil==0)
			System.out.println("No se ha introducido ningún sueldo mayor de 1000");
		else
			System.out.println("Se han introducido "+contadorSueldosMayoresDeMil+" sueldos mayores de 1000€");
		sc.close();
	}

}
