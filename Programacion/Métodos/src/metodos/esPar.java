package metodos;

import java.util.Scanner;

public class esPar {

	public static void main(String[] args) {
		// Calcula si un número introducido por teclado es par
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int n=sc.nextInt();
		numeroPar(n);
		sc.close();

	}

	private static void numeroPar(int n) {
		if (n%2==0)
			System.out.println(n+" es par");
		else
			System.out.println(n+" NO es par");	
	}

}
