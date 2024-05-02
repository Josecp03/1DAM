package Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class MostrarArrayOrdenadoMezclado {

	public static void main(String[] args) {
		/* Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º
		de B, el 2º de A, el 2º de B, etc.*/
		
		//Variables
		Scanner sc=new Scanner(System.in);
		int[]array1=new int[10];
		int[]array2=new int[10];
		int[]array3=new int[20];
		
		//Programa
		for(int i=0;i<array1.length;i++) {
			System.out.println("Introduza el valor número "+(i+1)+": ");
			array1[i]=sc.nextInt();
		}
		for(int i=0;i<array2.length;i++) {
			System.out.println("Introduza el valor número "+(i+1)+": ");
			array2[i]=sc.nextInt();
		}
		int j=0;
		for(int i=0;i<array3.length/2;i++) {
			array3[j]=array1[i];
			j++;
			array3[j]=array2[i];
			j++;
		}
		System.out.println(Arrays.toString(array3));
		sc.close();
		
	}

}
