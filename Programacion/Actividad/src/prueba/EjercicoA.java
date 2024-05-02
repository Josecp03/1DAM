package prueba;

import java.util.Scanner;

public class EjercicoA {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		// Inicializo las variables
		int a,b;
		int sumaCifrasA=0;
		int sumaCifrasB=0;
		// Creo el bucle para que solo admita tres números de dos cifras cada uno
		do {
			System.out.println("Introduzca el número A de tres cifras: ");
			a=sc.nextInt();
			System.out.println("Introduzca un número B de tres cifras: ");
			b=sc.nextInt();
		}while ((a>999 || a<100) || (b>999 || b<100));
		// Calculo la suma de las cifras de A
		int auxA=a;
		while (auxA>0) {
			int cifraA=auxA%10;
			sumaCifrasA+=cifraA;
			auxA/=10;
		}
		// Calculo la suma de las cifras de B
		int auxB=b;
		while (auxB>0) {
			int cifraB=auxB%10;
			sumaCifrasB+=cifraB;
			auxB/=10;
		}
		// Muetsro los resultados por pantalla
		if (sumaCifrasA>sumaCifrasB)
			System.out.println("El número con la suma de cifras mayor es: "+a);
		else if(sumaCifrasA<sumaCifrasB)
			System.out.println("El número con la suma de cifras mayor es: "+b);
		else
			System.out.println(a+" y "+b+" empatan en la suma de cifras");
		sc.close();
	}

}
