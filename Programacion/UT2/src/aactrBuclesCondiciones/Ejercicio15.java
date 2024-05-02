package aactrBuclesCondiciones;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*Pedir 10 números, y mostrar al final si se ha introducido alguno negativo.*/
		Scanner sc=new Scanner (System.in);
		boolean numeroNegativoIntroducido=false;
		for (int i=1;i<=10;i++) {
			System.out.println("Introduzca el valor número "+i+": ");
			int n=sc.nextInt();
			if (n<0)
				numeroNegativoIntroducido=true;
		}
		if (numeroNegativoIntroducido)
			System.out.println("SÍ que se ha introducido algún número negativo");
		else
			System.out.println("NO que se ha introducido ningún número negativo");
		sc.close();
	}

}
