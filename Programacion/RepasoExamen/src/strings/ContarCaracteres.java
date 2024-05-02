package strings;

import java.util.Scanner;

public class ContarCaracteres {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca una cadena de caracteres: ");
		String cadenaOriginal=sc.nextLine();
		// Contar las letras
		int contadorA=contarLetras(cadenaOriginal,'a');
        int contadorE=contarLetras(cadenaOriginal,'e');
        // Imprimir por pantalla
        System.out.println("La letra A aparece "+contadorA+" veces.");
        System.out.println("La letra E aparece "+contadorE+" veces.");
		sc.close();
	}

	public static int contarLetras(String cadena, char letra) {
        int contador=0;
        for (int i=0;i<cadena.length();i++) {
            if (cadena.charAt(i)==letra) {
                contador++;
            }
        }
        return contador;
    }
}
