package strings;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*Realizar una clase, que permita cargar una dirección de mail en el constructor, luego en otro
		método mostrar un mensaje si contiene el caracter '@'.*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca la dirección de mail: ");
		String direccion=sc.nextLine();
		imprimirDireccion(direccion);
		sc.close();
		
	}

	public static boolean contieneArroba(String direccion) {
		if (direccion.contains("@"))
			return true;
		else
			return false;
	}
	
	private static void imprimirDireccion(String direccion) {
		if (contieneArroba(direccion))
			System.out.println(direccion+" sí que contiene @");
		else
			System.out.println(direccion+" no contienen @");
	}
	

	
}
