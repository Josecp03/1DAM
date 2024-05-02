package Poo;

import java.util.Scanner;

public class AppPassword {

	public static void main(String[] args) {
		Password p1=new Password();
		Scanner sc=new Scanner(System.in);
		String palabra="";
		do {
			System.out.println("Introduzca una cadena de 6 caracteres: ");
			palabra=sc.nextLine();
		}while(palabra.length()!=6);
		p1.generarPassword(palabra);
		System.out.println(p1);
		if(p1.esCorrecta())
			System.out.println("Contraseña correcta");
		sc.close();
	}
	
}
