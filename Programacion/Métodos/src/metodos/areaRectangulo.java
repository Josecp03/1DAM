package metodos;

import java.util.Scanner;

public class areaRectangulo {

	public static void main(String[] args) {
		//Pedir la altura y la base de un rectángulo y calcular su área
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame la altura del rectángulo: ");
		double altura=sc.nextDouble();
		System.out.println("Dame la base del rectángulo: ");
		double base=sc.nextDouble();
		calcularAreaRectangulo(altura,base);
		sc.close();
	}

	private static void calcularAreaRectangulo(double altura, double base) {
		double area=base*altura;
		System.out.println("El área del rectángulo es: "+area);	
	}

}
