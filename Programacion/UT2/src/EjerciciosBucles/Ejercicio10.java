package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Pedir 15 números y escribir la suma total.
		Scanner teclado=new Scanner(System.in);
		int n=0;
		int sumaNumeros=0;
		for (int i=1;i<=15;i++) {
			System.out.println("Introduzca el número "+i+": ");
			n=teclado.nextInt();
			sumaNumeros+=n;
		}
		System.out.println("La suma de los números es: "+sumaNumeros);
		teclado.close();
	}

}
