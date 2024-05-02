package prueba;

import java.util.Scanner;

public class EjercicioC {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		// Inicializo las variables
		int a,b;
		int sumaCifrasA=0;
		int sumaCifrasB=0;
		// Creo el bucle para que solo admita dos números de dos cifras cada uno
		do {
			System.out.println("Introduzca el número A de dos cifras: ");
			a=sc.nextInt();
			System.out.println("Introduzca un número B de dos cifras");
			b=sc.nextInt();
		}while ((a>99 || a<10) || (b>99 || b<10));
		// Calculo el número de cifras pares de A
		while (a>0) {
			int cifraA=a%10;
			sumaCifrasA+=cifraA;
			a/=10;
		}
		// Calculo el número de cifras pares de B
		while (b>0) {
			int cifraB=b%10;
			sumaCifrasB+=cifraB;
			b/=10;
		}
		// Muetsro los resultados por pantalla
		System.out.println("La suma de las cifras de A es "+sumaCifrasA);
		System.out.println("La suma de las cifras de B es "+sumaCifrasB);
		System.out.println("La suma de todas las cifras es "+(sumaCifrasA+sumaCifrasB));
		sc.close();
	}

}
