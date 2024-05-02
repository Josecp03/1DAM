package strings;

import java.util.Scanner;

public class StringMayusculas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Por favor, ingrese su nombre: ");
        String nombre=sc.nextLine();
        mayusculas(nombre);
        sc.close();

	}

	private static void mayusculas(String nombre) {
		 String nombreEnMayusculas=nombre.toUpperCase();
	     System.out.println(nombre+" en mayúsculas es "+nombreEnMayusculas);
	}

}
