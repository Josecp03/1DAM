package aactrBuclesCondiciones;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		/*Pedir 5 números e indicar si alguno es múltiplo de 3.*/
		Scanner sc=new Scanner (System.in);
		boolean multiploDeTresIntroducido=false;
		for (int i=1;i<=5;i++) {
			System.out.println("Introduzca el valor número "+i+": ");
			int n=sc.nextInt();
			if (n%3==0)
				multiploDeTresIntroducido=true;
		}
		if (multiploDeTresIntroducido)
			System.out.println("SÍ que se ha introducido algún múltiplo de 3");
		else
			System.out.println("NO que se ha introducido ningún múltiplo de 3");
		sc.close();
	}

}
