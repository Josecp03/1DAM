package strings;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*Realizar programa en java en el cúal se defina una cadena de caracteres y mostrar esa cadena por
		pantalla con la primera letra en mayúsculas y las demás en minúsculas.*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca una cadena de caracteres: ");
		String cadenaOriginal=sc.nextLine();
		primeraLetraMayuscula(cadenaOriginal);
		sc.close();
	}

	private static void primeraLetraMayuscula(String cadenaOriginal) {
		// Obtener la primera letra de la cadena en mayúsculas
		String primeraLetra=cadenaOriginal.substring(0,1).toUpperCase();
		// Obtener el resto de la cadena en minúsculas
		String restoCadena=cadenaOriginal.substring(1).toLowerCase();
		// Juntar las dos cadenas
		String cadenaModificada=primeraLetra+restoCadena;
		// Imprimir por pantalla
		System.out.println("Cadena original: "+cadenaOriginal);
		System.out.println("CadenaModificada: "+cadenaModificada);
	}

}
