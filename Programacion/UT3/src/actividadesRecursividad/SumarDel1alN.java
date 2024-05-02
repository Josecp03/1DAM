package actividadesRecursividad;

import java.util.Scanner;

public class SumarDel1alN {

	public static void main(String[] args) {
		// Sumar números naturales de 1 a N
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int n=sc.nextInt();
		sumanumeros(n);
		sc.close();

	}
	
	private static int sumanumeros(int n) {
		if (n==0)
			return 0;
		else
			return n+=n;
	}

}
