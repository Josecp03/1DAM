package strings;

import java.util.Scanner;

public class EsPalindromo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca una cadena de caracteres: ");
		String cadenaOriginal=sc.nextLine();
		imprimirPalindromo(cadenaOriginal);
		sc.close();
	}
	
	public static boolean esPalindromo(String cadena) {
		for (int i=0,j=cadena.length()-1;i< cadena.length()/2;i++,j--) {
			if (cadena.charAt(i)!=cadena.charAt(j)) 
				return false;
		}
		return true;
	}
	
	public static void imprimirPalindromo(String cadena) {
		if (esPalindromo(cadena))
			System.out.println(cadena+" es palíndromo");
		else
			System.out.println(cadena+" NO es palíndromo");
	}

}
