package strings;

import java.util.Scanner;

public class NumeroCaracteres {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Por favor, ingrese su nombre: ");
        String nombre=sc.nextLine();
        numeroCarcateres(nombre);
        sc.close();
	}

	private static void numeroCarcateres(String nombre) {
		 int longitud = nombre.length();
		 System.out.println(nombre+" tiene "+longitud+" caracteres");
	}

}
