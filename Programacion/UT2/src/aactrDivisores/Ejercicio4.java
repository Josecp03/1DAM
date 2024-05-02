package aactrDivisores;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*Dados dos números A y B se dice que son amigos cuando la suma de los divisores de A
		(excepto el mismo número) es igual a B y la suma de los divisores de B (excepto B) es A.
		Haz el programa Java para determinar si dos números introducidos por teclado son o no
		amigos*/
		Scanner sc=new Scanner (System.in);
		int sumaDivisoresA=0;
		int sumaDivisoresB=0;
		System.out.println("Introduzca el número A: ");
		int a=sc.nextInt();
		System.out.println("Introduzca el número B: ");
		int b=sc.nextInt();
		for (int i=1;i<a;i++) {
			if (a%i==0)
				sumaDivisoresA+=i;
		}
		for (int j=1;j<b;j++) {
			if (b%j==0)
				sumaDivisoresB+=j;
		}
		if (sumaDivisoresA==b && sumaDivisoresB==a)
			System.out.println("Los números "+a+" y "+b+" son amigos");
		else
			System.out.println("Los números "+a+" y "+b+" NO son amigos");
		sc.close();
	}

}
