package aactrCifras;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9. Los números
		de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un número es afortunado si
		contiene más números de la suerte que de la mala suerte. Realiza un programa que diga si un
		número introducido por el usuario es afortunado o no*/
		Scanner sc=new Scanner (System.in);
		int contadorCifrasSuerte=0;
		int contadorCifrasMalaSuerte=0;
		System.out.println("Introduzca un número: ");
		int n=sc.nextInt();
		while(n>0) {
			int cifra=n%10;
			if (cifra==3 || cifra==7 || cifra==8 || cifra==9)
				contadorCifrasSuerte++;
			else
				contadorCifrasMalaSuerte++;
			n/=10;
		}
		if (contadorCifrasSuerte>contadorCifrasMalaSuerte)
			System.out.println("El número introducido es afortunado");
		else
			System.out.println("El número introducido NO es afortunado");
		sc.close();
	}

}
