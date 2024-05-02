package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
		Scanner teclado=new Scanner(System.in);
		int n=0;
		int sumaSueldos=0;
		int contadorSueldosAltos=0;
		for (int i=1;i<=10;i++) {
			System.out.println("Introduzca el sueldo número "+i+": ");
			n=teclado.nextInt();
			sumaSueldos+=n;
			if (n>1000)
				contadorSueldosAltos++;
		}
		System.out.println("La suma de los sueldos es: "+sumaSueldos);
		System.out.println("Hay "+contadorSueldosAltos+" sueldos mayores de 1000€");
		teclado.close();
	}
}
