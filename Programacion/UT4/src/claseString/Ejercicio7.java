package claseString;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Verificar si la cadena de texto almacenada en la String nif, es un NIF correcto o no. Si lo es, se
		mostrará por consola su parte numérica; si no lo es se mostrará el mensaje "NIF no valido".
		Se tendrá en cuenta lo siguiente: Los NIFs tienen 8 dígitos y, a continuación, una letra (no
		importa que sea mayúscula o minúscula). */
		Scanner sc=new Scanner(System.in);
        System.out.print("Ingresa un número de NIF: ");
        String nif=sc.nextLine();
        if (validarNIF(nif)) {
        	String parteNumerica=nif.substring(0, 8);
            System.out.println("NIF válido, parte numérica: "+parteNumerica);
        } else 
            System.out.println("NIF no válido");
        sc.close();
	}
	
	public static boolean validarNIF(String nif) {
        // Comprobar que la longitud es 9 caracteres
        if (nif.length()!=9) 
            return false;
        // Comprobar que los primeros 8 caracteres son dígitos
        for (int i=0;i<8;i++) {
            if (!Character.isDigit(nif.charAt(i))) 
                return false;
        }
        // Comprobar que el último carácter es una letra (mayúscula o minúscula)
        char letra=nif.charAt(8);
        if (!Character.isLetter(letra)) 
            return false;
        return true;
    }

}
