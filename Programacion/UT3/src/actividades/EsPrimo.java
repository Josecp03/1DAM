package actividades;

import java.util.Scanner;

public class EsPrimo {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		int n=sc.nextInt();
		if (esprimo(n))
			System.out.println(n+" es primo");
		else
			System.out.println(n+" NO es primo");
		sc.close();
	}
	
	public static boolean esprimo(int n){
		for (int i=2;i<=n/2;i++){
		if (n%i==0)
			return false;
		}
		return true;	
	}

}

