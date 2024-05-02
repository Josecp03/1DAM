package prueba;

import java.util.Scanner;

public class EjercicioB {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		// Inicializo las variables
		int a,b;
		int contadorCifrasParesA=0;
		int contadorCifrasParesB=0;
		// Creo el bucle para que solo admita tres números de dos cifras cada uno
		do {
			System.out.println("Introduzca el número A de tres cifras: ");
			a=sc.nextInt();
			System.out.println("Introduzca un número B de tres cifras");
			b=sc.nextInt();
		}while ((a>999 || a<100) || (b>999 || b<100));
		// Calculo el número de cifras pares de A
		int auxA=a;
		while (auxA>0) {
			int cifraA=auxA%10;
			if (cifraA%2==0)
				contadorCifrasParesA++;
			auxA/=10;
		}
		// Calculo el número de cifras pares de B
		int auxB=b;
		while (auxB>0) {
			int cifraB=auxB%10;
			if (cifraB%2==0)
				contadorCifrasParesB++;
			auxB/=10;
		}
		// Muetsro los resultados por pantalla
		if (contadorCifrasParesA>contadorCifrasParesB)
			System.out.println("El número con más cifras pares es "+a);
		else if(contadorCifrasParesA<contadorCifrasParesB)
			System.out.println("El número con más cifras pares es "+b);
		else
			System.out.println(a+" y "+b+" empatan en el número de cifras pares");
		sc.close();
	}

}
