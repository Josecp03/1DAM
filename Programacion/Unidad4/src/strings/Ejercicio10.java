package strings;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*Codifique un programa que permita cargar una oración por teclado, luego mostrar cada
		palabra ingresada en una línea distinta.
		Por ejemplo, si cargo:
			Talavera de la Reina
		 
		Deberá aparecer:
		
		Talavera
		de
		la
		Reina*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca una oración: ");
		String oracion=sc.nextLine();
		separarPalabras(oracion);
		sc.close();
	}
	
	private static void separarPalabras(String oracion) {
        String[] palabras=oracion.split(" ");
        for (int i=0;i<palabras.length;i++) 
            System.out.println(palabras[i]);
    }

}
