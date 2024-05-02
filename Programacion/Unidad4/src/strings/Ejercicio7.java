package strings;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Verificar si la cadena de texto almacenada en la String nif, es un NIF correcto o no. Si lo es, se
		mostrará por consola su parte numérica; si no lo es se mostrará el mensaje "NIF no valido".
		Se tendrá en cuenta lo siguiente: Los NIFs tienen 8 dígitos y, a continuación, una letra (no
		importa que sea mayúscula o minúscula)*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Intorduzca su NIF: ");
		String NIF= sc.nextLine();
		imprimirNIF(NIF);
		sc.close();
	}

	private static boolean esNIF(String nif) {
        // Comprobamos que la longitud sea la correcta
        if (nif.length()!=9) 
            return false;
        // Comprobamos que los 8 pirmeros dígitos siguientes sean números
        for (int i=1;i<nif.length()-1;i++) {
            if (!Character.isDigit(nif.charAt(i))) 
                return false;
        }
        // Comprobamos que la última posición es una letra
        if (!Character.isLetter(nif.charAt(8))) 
            return false;
        return true;
    }
	
	private static void imprimirNIF(String nif) {
		if (esNIF(nif))
			System.out.println(nif.substring(0,8));
		else
			System.out.println("NIF no válido");
	}

}
