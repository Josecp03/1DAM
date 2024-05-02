package actividades;

import java.util.Scanner;

public class PotenciaRecursiva {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Dame el exponente");
		int n=sc.nextInt();
		System.out.println("Dame la base");
		int x=sc.nextInt();
		System.out.println(potencia(n,x));
		sc.close();

	}

	private static int potencia(int n, int x) {
		if (n==0) // Caso base
			return 1;
		else 
			return x*potencia(n-1,x);
	}
	
}