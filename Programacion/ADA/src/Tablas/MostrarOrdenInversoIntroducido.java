package Tablas;

import java.util.Scanner;

public class MostrarOrdenInversoIntroducido {

	public static void main(String[] args) {
		// Leer 5 números y mostrarlos en orden inverso al introducido.
		
		//Variables
		Scanner sc=new Scanner(System.in);
		int[]array=new int[5];
		
		//Programa
		for (int i=0;i<array.length;i++) {
			System.out.println("Introduce el valor número "+(i+1)+": ");
			array[i]=sc.nextInt();
		}
		System.out.println("El array ordenado es: ");
		for(int i=0;i<array.length;i++) 
			System.out.print(array[i]+" ");
		System.out.println("\nEl array en orden inverso es: ");
		for(int i=array.length-1;i>=0;i--) 
			System.out.print(array[i]+" ");
		sc.close();
	}

}
