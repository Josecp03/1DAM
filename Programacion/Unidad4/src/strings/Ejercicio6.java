package strings;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Realizar un programa en java que haga lo siguiente:
		El programa pedirá al usuario su nombre para mostrarle lo siguiente:
			Número de caracteres del nombre
			Carácter inicial y final
			Nombre e mayúsculas
			Indicación de si la lentra ñ o la Ñ forman parte de su nombre
		NOTA: la letra ñ es el carácter 164 de la tabla Unicode, la Ñ el 165.*/
		Scanner scanner = new Scanner(System.in);
        // Pedir al usuario que ingrese su nombre
        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = scanner.nextLine();
        // Calcular y mostrar el número de caracteres del nombre
        int longitud = nombre.length();
        System.out.println("Número de caracteres del nombre: " + longitud);
        // Mostrar el carácter inicial y final del nombre
        char primerCaracter = nombre.charAt(0);
        char ultimoCaracter = nombre.charAt(longitud - 1);
        System.out.println("Carácter inicial: " + primerCaracter);
        System.out.println("Carácter final: " + ultimoCaracter);
        // Mostrar el nombre en mayúsculas
        String nombreEnMayusculas = nombre.toUpperCase();
        System.out.println("Nombre en mayúsculas: " + nombreEnMayusculas);
        // Verificar si la letra ñ o la Ñ están presentes en el nombre
        boolean contieneEnie = nombre.contains("\u00F1") || nombre.contains("\u00D1");
        System.out.println("¿La letra ñ o Ñ forman parte de su nombre? " + (contieneEnie ? "Sí" : "No"));
        // Cerrar el objeto Scanner
        scanner.close();
	}
}
