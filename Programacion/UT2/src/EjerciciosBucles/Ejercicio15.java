package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.
		Scanner teclado=new Scanner(System.in);
		int n=0;
		boolean esNegativo=false;
		for (int i=1;i<=5;i++) {
			System.out.println("Introduzca el número "+i+": ");
			n=teclado.nextInt();
			if (n<0)
				esNegativo=true;
		}
		if (esNegativo==true)
			System.out.println("Sí que se ha introducido algún número negativo");
		else
			System.out.println("No se ha introducido ningún número negativo");
		teclado.close();
	}
}
