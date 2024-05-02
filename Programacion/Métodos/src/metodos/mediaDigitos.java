package metodos;

import java.util.Scanner;

public class mediaDigitos {

	public static void main(String[] args) {
		// Realiza un programa que calcule la media de los dígitos que contiene un número entero introducido por teclado
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int n=sc.nextInt();
		mediaCifras(n);
		sc.close();
	}

	private static void mediaCifras(int n) {
		int suma=0;
        int cantidadDigitos=0;
        n=Math.abs(n); //Para también coger números negativos
        while (n>0) {
            int digito=n%10;
            suma+=digito;
            cantidadDigitos++;
            n=n/10;
        }
        if (cantidadDigitos==0)
            System.out.println("La media de los dígitos es: 0");
        else { 
            double media=(double)suma/cantidadDigitos;
            System.out.println("La media de los dígitos es: "+media);
        }
	}

}
