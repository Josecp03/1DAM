package EjerciciosBucles;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// Pedir 5 números e indicar si alguno es múltiplo de 3
		Scanner teclado=new Scanner(System.in);
		int n=0;
		boolean esMultiploDeTres=false;
		for (int i=1;i<=5;i++) {
			System.out.println("Introduzca el número "+i+": ");
			n=teclado.nextInt();
			if (n%3==0)
				esMultiploDeTres=true;
		}
		if (esMultiploDeTres==true)
			System.out.println("Sí que se ha introducido algún múltiplo de 3");
		else
			System.out.println("No se ha introducido ningún múltiplo de 3");
		teclado.close();
	}
}
