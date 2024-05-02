package resumen;

import java.util.Scanner;

public class CambiarUltimaCifra {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int contadorCifras=0;
		System.out.println("Introduzca un número: ");
		int n=sc.nextInt();
		int ultimaCifra=n%10;
		int resto=n/10;
		while (n>=10) {
			n/=10;
			contadorCifras++;
		}
		double nuevo=ultimaCifra*Math.pow(10, contadorCifras)+resto;
		System.out.println("El nuevo número es "+(int)nuevo);
		sc.close();
	}

}
