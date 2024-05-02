package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que son primos.
		Scanner teclado=new Scanner(System.in);
		int n=0;
		int contadorPrimos=0;
		System.out.println("Introduzca un número: ");
		n=teclado.nextInt();
		for (int i=2;i<=n;i++) {
            boolean esPrimo=true;
            for (int j=2;j<i; j++) {
                if (i%j==0) {
                    esPrimo=false;
                }
            }
            if (esPrimo) {
                contadorPrimos++;
            }
        }
        System.out.println("Hay "+contadorPrimos+" números primos entre 1 y "+n);
		teclado.close();
	}
}
