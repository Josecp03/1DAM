package aactrCifras;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*Realiza un programa que sea capaz de desplazar todos los dígitos de un número de izquierda
		a derecha una posición. El dígito de más a la derecha, pasaría a dar la vuelta y se colocaría a
		la izquierda. Si el número tiene un solo dígito, se queda igual*/
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
