package metodos;

import java.util.Scanner;

public class sonMultiplos {

	public static void main(String[] args) {
		// Pedir dos números y decir si uno es múltiplo de otro
		Scanner sc=new Scanner(System.in);
		System.out.println("Intoduzca el primer número: ");
		int n1=sc.nextInt();
		System.out.println("Intoduzca el segundo número: ");
		int n2=sc.nextInt();
		verificarMultiplos(n1,n2);
		sc.close();
	}

	private static void verificarMultiplos(int n1, int n2) {
		if (n1%n2==0 || n2%n1==0) 
			System.out.println(n1+" es múltiplo de "+n2);
		else
			System.out.println(n1+" NO es múltiplo de "+n2);
	}

}
