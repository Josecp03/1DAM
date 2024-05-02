package cadenas;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		/*Crea un programa Java que lea por teclado y muestre un mensaje con el número de veces
		que ha aparecido la letra A y la letra E*/
		Scanner sc=new Scanner(System.in);
		int contA=0;
		int contE=0;
		System.out.println("Introduzca una cadena: ");
		String palabra=sc.next();
		for (int i=0;i<palabra.length();i++) {
			if(palabra.charAt(i)=='a' || palabra.charAt(i)=='A')
				contA++;
			if(palabra.charAt(i)=='e' || palabra.charAt(i)=='E')
				contE++;
		}
		System.out.println("Número de letras A: "+contA);
		System.out.println("Número de letras E: "+contE);
		sc.close();
	}

}
