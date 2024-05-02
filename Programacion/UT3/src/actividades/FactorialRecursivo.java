package actividades;

import java.util.Scanner;

public class FactorialRecursivo {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Dame un número: ");
		int n=sc.nextInt();
		System.out.println(factorial(n));
		System.out.println(factorial2(n));
		sc.close();
	}

	private static int factorial(int n) {
		if (n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
	
	private static int factorial2(int n) {
		int fact=1;
		for (int i=n;i>=1;i--) {
			fact=fact*i;
			System.out.print(i);
			if (i!=1)
				System.out.print("·");
		}
		System.out.print("=");
		return fact;
	}
	
}
