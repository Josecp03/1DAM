package resumen;

import java.util.Scanner;

public class numerosCapicua {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=0;
		System.out.println("Introduzca un número: ");
		int numeroIntroducido=sc.nextInt();
		int i=numeroIntroducido;
		while(i>0) {
			int cifra=i%10;
			n=n*10+cifra;
			i/=10;
		}
		if (numeroIntroducido==n) 
			System.out.println("El número "+numeroIntroducido+" es capicúa");
		else
			System.out.println("El número "+numeroIntroducido+" NO es capicúa");
		sc.close();
	}

}
