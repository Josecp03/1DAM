package buclesCondiciones;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
		Scanner teclado=new Scanner(System.in);
		int n=0;
		int contadorNumeros=0;
		System.out.println("Introduzca un número: ");
		n=teclado.nextInt();
		while (n>0) {
			contadorNumeros++;
			System.out.println("Introduzca un número: ");
			n=teclado.nextInt();
		}
		System.out.println("Se han introducido "+contadorNumeros+" números");
		teclado.close();
	}
}
