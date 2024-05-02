package metodos;

import java.util.Scanner;

public class areaCuadrado {

	public static void main(String[] args) {
		//Pedir el lado de un cuadrado y calcular su área
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el lado del cuadrado: ");
		double lado=sc.nextDouble();
		calcularAreaCuadrado(lado);
		sc.close();

	}

	private static void calcularAreaCuadrado(double lado) {
		double area=lado*lado;
		System.out.println("El área del cuadrado es: "+area);
		
	}

}
