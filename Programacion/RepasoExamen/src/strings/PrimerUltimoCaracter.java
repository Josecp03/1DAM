package strings;

import java.util.Scanner;

public class PrimerUltimoCaracter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Por favor, ingrese su nombre: ");
        String nombre=sc.nextLine();
        primerCaracter(nombre);
        ultimoCaracter(nombre);
        sc.close();

	}

	private static void primerCaracter(String nombre) {
		 char primerCaracter=nombre.charAt(0);
		 System.out.println("El primer cracater de "+nombre+" es "+primerCaracter);
	}

	private static void ultimoCaracter(String nombre) {
		int longitud=nombre.length();
		char ultimoCaracter=nombre.charAt(longitud - 1);
		System.out.println("El último cracater de "+nombre+" es "+ultimoCaracter);
		
	}

}
