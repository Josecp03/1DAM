package aactrBuclesCondiciones;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*Realizar un juego para adivinar un número. Para ello generar un número N aleatorio entre 1 y
		20, y luego ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con
		respecto a N. El proceso termina cuando el usuario acierta*/
		Scanner sc=new Scanner (System.in);
		int máximo=20;
		int nSecreto=(int)(Math.random()*máximo)+1; //Se multiplica el valor random por el máximo, y se suma 1 para que el mínimo sea 1 y no 0 
		int n;
		do {
			System.out.println("Introduzca un número: ");
			n=sc.nextInt();
			if (n<nSecreto)
				System.out.println("El número secreto es mayor");
			else if(n>nSecreto)
				System.out.println("El número secreto es menor");
		} while(n!=nSecreto);
		System.out.println("Has acertado el número!");
		sc.close();
	}

}
