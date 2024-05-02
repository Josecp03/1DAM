package Tablas;

import java.util.Scanner;

public class MostrarOrdenExtremos {

	public static void main(String[] args) {
		/*Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el
		penúltimo, el tercero, etc.*/
		
		//Variables
		Scanner sc=new Scanner(System.in);
		int[]array=new int[10];
		
		//Programa
		for(int i=0;i<array.length;i++) {
			System.out.println("Introduza el valor número "+(i+1)+": ");
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length/2;i++) {
			System.out.print(array[i]+" ");
			System.out.print(array[(array.length-1)-i]+" ");
		}
		sc.close();
	}

}
