package actividades;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		int a,b;
		int opcion;
		Scanner sc=new Scanner (System.in);
		System.out.println("Dame el valor de a: ");
		a=sc.nextInt();
		System.out.println("Dame el valor de b: ");
		b=sc.nextInt();
		do {
			menu();
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println(suma(a,b));
				break;
			case 2:
				System.out.println(resta(a,b));
				break;
			case 3:
				System.out.println(producto(a,b));
				break;
			case 4:
				System.out.println(division(a,b));
				break;
			case 5:
				System.out.println("Adiós!!");
				break;
			}
		} while (opcion!=5);
		sc.close();
	}
	
	public static void menu() {
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Producto");
		System.out.println("4. División");
		System.out.println("Elija una opción: ");
	}

	private static int suma(int n1, int n2) {
		return (n1+n2);
	}
	
	private static int resta(int n1, int n2) {
		return (n1-n2);
	}
	
	private static int producto(int n1, int n2) {
		return (n1*n2);
	}
	
	private static float division(float n1, float n2) {
		return (n1/n2);
	}

}
