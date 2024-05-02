package strings;

import java.util.Scanner;

public class ContieneCarcater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Por favor, ingrese su nombre: ");
        String nombre=sc.nextLine();
		contieneCaracter(nombre);
		sc.close();

	}

	private static void contieneCaracter(String nombre) {
		 boolean contieneEnie=nombre.contains("\u00F1") || nombre.contains("\u00D1");
	     if (contieneEnie)
	    	 System.out.println(nombre+" sí que contiene ñ o Ñ");
	     else
	    	 System.out.println(nombre+" no contiene ñ o Ñ");
	}

}
