package metodos;

import java.util.Scanner;

public class areaTriangulo {

	public static void main(String[] args) {
		// Escriba un programa que calcule el área de un triángulo rectángulo, pidiendo al usuario la altura y la base
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame la altura del triángulo: ");
		double altura=sc.nextDouble();
		System.out.println("Dame la base del triángulo: ");
		double base=sc.nextDouble();
		calcularAreaTrianguloRectangulo(altura,base);
		sc.close();

	}

	private static void calcularAreaTrianguloRectangulo(double altura, double base) {
		double area=(base*altura)/2;
		System.out.println("Un triángulo rectángulo de altura "+altura+" y base "+base+" tiene un área de "+area);	
	}

}
