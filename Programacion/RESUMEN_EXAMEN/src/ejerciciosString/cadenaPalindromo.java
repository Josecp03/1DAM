package ejerciciosString;

import java.util.Scanner;

public class cadenaPalindromo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean esPalindromo=true;
		System.out.println("Introduzca la cadena:");
		String cadena=sc.nextLine();
		for (int i = 0; i < cadena.length()/2; i++) {
            if (cadena.charAt(i) != cadena.charAt(cadena.length()-i-1)) {
                esPalindromo=false;
            }
        }
		System.out.println(esPalindromo);
	}

}
