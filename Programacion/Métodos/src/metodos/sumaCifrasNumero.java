package metodos;

import java.util.Scanner;

public class sumaCifrasNumero {

	public static void main(String[] args) {
		// Sumar las cifras de un número introducido
		Scanner sc=new Scanner(System.in);
		System.out.println("Intoduzca un número: ");
		int n=sc.nextInt();
		sumacifras(n);
		sc.close();
	}
	
	private static void sumacifras(int n2) {
		int sumaCifrasN2=0;
		int auxN2=n2;
		while (auxN2>0) {
			int cifraN2=auxN2%10;
			sumaCifrasN2+=cifraN2;
			auxN2/=10;
		}
		System.out.println("La suma de cifras de "+n2+" es de "+sumaCifrasN2);
	}

}
