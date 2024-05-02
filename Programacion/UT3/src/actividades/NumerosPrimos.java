package actividades;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int contadorPrimos=0;
		System.out.println("Introduzca el primer número: ");
		int n1=sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		int n2=sc.nextInt();
		for (int i=n1;i<=n2;i++) {
			if (esprimo(i))
				contadorPrimos++;
		}
		System.out.println("Hay "+contadorPrimos+" números primos entre "+n1+" y "+n2);
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
