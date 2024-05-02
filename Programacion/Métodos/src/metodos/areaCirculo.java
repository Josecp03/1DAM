package metodos;

import java.util.Scanner;

public class areaCirculo {

	public static void main(String[] args) {
		//Pedir el radio de un círculo y calcular su área
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el radio del círculo: ");
		double radio=sc.nextDouble();
		calcularAreaCirculo(radio);
		sc.close();

	}

	private static void calcularAreaCirculo(double radio) {
		double area=Math.PI*radio*radio;
		System.out.println("El área del círculo es: "+area);
		
	}

}
