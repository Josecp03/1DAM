package resumen;

import java.util.Scanner;

public class contadorPrimos {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int contadorPrimos=0;
		System.out.println("Introduzca un número: ");
		int n=sc.nextInt();
		for (int i=2;i<=n;i++) {
			boolean esPrimo=true;
			for (int j=2;j<i;j++) {
				if (i%j==0)
					esPrimo=false;
			}
			if (esPrimo)
				contadorPrimos++;
		}
		System.out.println("Hay "+contadorPrimos+" números primos entre 1 y "+n);
		sc.close();
	}

}
