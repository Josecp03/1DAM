package Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class MostrarOrdenIntroducido {

	public static void main(String[] args) {
		// Leer 5 números y mostrarlos en el mismo orden introducido.
		
		//Variables
		Scanner sc=new Scanner(System.in);
		int[]array=new int[5];
		
		//Programa
		for (int i=0;i<array.length;i++) {
			System.out.println("Introduce el valor "+(i+1)+": ");
			array[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(array));
		sc.close();
	}
	
}
