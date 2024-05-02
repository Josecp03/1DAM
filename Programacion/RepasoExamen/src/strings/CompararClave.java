package strings;

import java.util.Scanner;

public class CompararClave {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca la clave:");
		String clave=sc.nextLine();
		imprimirClave(clave);
		sc.close();
	}
	
	private static void imprimirClave(String clave) {
		if (esCorrecta(clave))
			System.out.println("La clave es correcta");
		else
			System.out.println("La clave es incorrecta");
	}

	public static boolean esCorrecta(String clave) {
		if (clave.equals("123abc"))
			return true;
		else
			return false;
	}

}
