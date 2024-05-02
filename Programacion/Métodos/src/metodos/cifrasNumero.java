package metodos;

import java.util.Scanner;

public class cifrasNumero {

	public static void main(String[] args) {
		// Pedir un número y mostrar cuántas cifras tiene
		Scanner sc=new Scanner(System.in);
		System.out.println("Intoduzca un número: ");
		int n=sc.nextInt();
		cantidadCifrasNumero(n);
		sc.close();

	}

	private static void cantidadCifrasNumero(int n) {
		int contadorCifras=0;
		if (n==0)
			contadorCifras=1;
		else {
			while (n!=0) {
				n=n/10;
				contadorCifras++;
			}
		}
		System.out.println("El número ingresado tiene "+contadorCifras+" cifras");
	}

}
