package variablesCondiciones;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Pedir el radio de un círculo y calcular su área
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dame el radio del círculo");
		double radio=teclado.nextDouble();
		double area=Math.PI*radio*radio;//Una constante se representa en negrita, en maúsculas y en cursiva
		System.out.println("El área del círculo es: "+area);
		teclado.close();
	}
}
