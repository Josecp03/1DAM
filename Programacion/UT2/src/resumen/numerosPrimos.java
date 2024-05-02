package resumen;

import java.util.Scanner;

public class numerosPrimos {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		boolean esPrimo=true;
		System.out.println("Introduzca un número: ");
		int n=sc.nextInt();
		if (n<=1)
			esPrimo=false;
		else {
			for (int i=2;i<n;i++) {
				if (n%i==0)
					esPrimo=false;
			}
		}
		if (esPrimo)
			System.out.println("El número "+n+" es primo");
		else
			System.out.println("El número "+n+" NO es primo");
		sc.close();	
	}

}
