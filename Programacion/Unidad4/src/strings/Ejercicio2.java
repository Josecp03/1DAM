package strings;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Crea un programa Java que defina una cadena de caracteres y los muestre con la posición
		de sus caracteres invertida */
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca una cadena de caracteres: ");
		String cadenaOriginal=sc.nextLine();
		invertirCadena(cadenaOriginal);
		sc.close();

	}

	private static void invertirCadena(String cadenaOriginal) {
		// Crear un array para almacenar la cadena invertida
        char[] cadenaInvertida=new char[cadenaOriginal.length()];
        // Recorrer la cadena original de atrás hacia adelante
        for (int i=cadenaOriginal.length()-1;i>=0;i--) 
            cadenaInvertida[cadenaOriginal.length()-i-1]=cadenaOriginal.charAt(i);
        // Imprimir por pantalla
        System.out.println("Cadena original: "+cadenaOriginal);
        System.out.println("Cadena invertida: "+new String(cadenaInvertida));
	}

}
